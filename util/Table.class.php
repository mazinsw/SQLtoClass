<?php
class Table
{
	public $table_name = null;
	public $pk_name = 'id';
	public $pk_value = null;
	public $strip_column = array();
	private $column_values = array();

	public function __get($k=null)
	{
		if ( isset($this->column_values[$k]) )
			return $this->column_values[$k];
		return null;
	}

	public function __set($k=null, $v=null)
	{
		$this->column_values[$k] = $v;
	}

	public function _set_values($vs=array())
	{
		$this->column_values = $vs;
		if ( isset($vs[$this->pk_name]))
		{
			$this->pk_value = $vs[$this->pk_name];
		}
	}

	public function __construct($n=null, $record=array(), $pre='')
	{
		if ( is_array($n) )
		{
			$this->_set_values($n);
			return;
		}

		$this->table_name = $n;
		if (strlen($pre)) {
			foreach($record AS $k=>$v) {
				if (0===strpos($k,$pre)) {
					$k = substr($k, strlen($pre));
					if ($k) $this->$k = $v;
					if ($k==$this->pk_name) {
						$this->pk_value = $v;
					}
				}
			}
		} else {
			$this->_set_values( $record );
		}
	}

	public function SetPk($k=null, $v=null)
	{
		if ( $k && $v )
		{
			$this->pk_name = $k;
			$this->pk_value = $v;
			$this->$k = $v;
		}
	}

	public function Get($k=null)
	{
		if (null==$k)
			return $this->column_values;
		return $this->__get($k);
	}

	public function Set($k, $v=null)
	{
		$this->column_values[$k] = $v;
	}

	public function Plus($k=null, $v=1)
	{
		if ( array_key_exists($k, $this->column_values) )
		{
			$this->column_values[$k] += $v;
		}
		else throw new Exception( 'Table ' .$this->table_name. ' no column '. $k );
	}

	public function SetStrip() {
		$fields = func_get_args();
		if ( empty($fields) )
			return true;
		if ( is_array($fields[0]) )
			$fields = $fields[0];
		$this->strip_column = $fields;
	}

	public function Insert()
	{
		$fields = func_get_args();
		if ( empty($fields) )
			return true;

		if ( is_array($fields[0]) )
			$fields = $fields[0];

		$up_array = array();
		foreach( $fields AS $f )
		{
			if ( array_key_exists($f, $this->column_values) )
			{
				$up_array[$f] = $this->BuildDBValue($this->column_values[$f], $f);
			}
		}
		if (empty($up_array) )
			return true;

		return DB::Insert($this->table_name, $up_array);
	}

	public function Update()
	{
		$fields = func_get_args();
		if ( empty($fields) )
			return true;

		if ( is_array($fields[0]) )
			$fields = $fields[0];

		$up_array = array();
		foreach( $fields AS $f )
		{
			if ( array_key_exists($f, $this->column_values) )
			{
				$up_array[$f] = $this->BuildDBValue($this->column_values[$f], $f);
			}
		}
		if (empty($up_array) )
			return true;

		if ($this->pk_value) {
			return DB::Update($this->table_name, $this->pk_value, $up_array);
		} else {
			return $this->pk_value = $this->id = DB::Insert($this->table_name, $up_array);
		}
	}

	private function BuildDBValue($v, $f=null) {
		if (is_array($v)) return ','. join(',', $v) . ',';
		global $striped_field;
		if (is_array($striped_field) && in_array($f, $striped_field)) {
			$v = strip_tags($v);
		}
		return in_array($f,$this->strip_column) ? stripslashes($v) : $v;
	}

	public static function Count($n=null, $condition=null, $sum=null, $join=null, $field='1')
	{
		$condition = DB::BuildCondition( $condition );
		$condition = null==$condition ? null : "WHERE $condition";
		$join = DB::BuildJoin( $join );
		$join = (null==$join) ? null : "$join";
		$zone = $sum ? "SUM({$sum})" : 'COUNT('.$field.')';
		$sql = "SELECT {$zone} AS count FROM `$n` $join $condition";
		$row = DB::GetQueryResult($sql, true);
		return $sum ? (0+$row['count']) : intval($row['count']);
	}

	public static function Delete($n=null, $id=null, $k='id')
	{
		settype( $id, 'array' );
		$idstring = join('\',\'', $id);
		$sql = "DELETE FROM `$n` WHERE `{$k}` IN('$idstring')";
		return DB::Query( $sql );
	}
}
