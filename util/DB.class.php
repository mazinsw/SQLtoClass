<?php
class DB {

	private static $mInstance = null;
	private static $mConnection = null;
	public static $mDebug = false;
	public static $mError = null;

	public static function &Instance() {
		if (null === self::$mInstance ) {
			self::$mInstance = new self();
		}
		return self::$mInstance;
	}
	
	private final function __clone() { }
	public final function __sleep() {
		throw new Exception('Serializing of Singletons is not allowed');
	}

	private final function __construct() {
		global $INI; // crie uma variável global com as informações da conexão
		
		$host = (string) $INI['db']['host'];
		$user = (string) $INI['db']['user'];
		$pass = (string) $INI['db']['pass'];
		$name = (string) $INI['db']['name'];
		self::$mConnection = mysql_connect( $host, $user, $pass );
		if ( mysql_errno() )
			throw new Exception("Connect failed: " . mysql_error());
		@mysql_select_db( $name, self::$mConnection );
		@mysql_query( "SET NAMES UTF8;", self::$mConnection );
	}

	static function GetLinkId() {
		return self::$mConnection;
	}

	function __destruct() {
		self::Close();
	}

	public static function Debug() {
		self::$mDebug = !self::$mDebug;
	}

	public static function Close() {
		if ( is_resource( self::$mConnection ) ) {
			@mysql_close( self::$mConnection );
		}
		self::$mConnection = null;
		self::$mInstance = null;
	}


	public static function EscapeString( $string ) {
		
		return @mysql_real_escape_string( $string, self::$mConnection );
	}

	public static function GetInsertId() {
		return intval( @mysql_insert_id(self::$mConnection) );
	}

	public static function Query( $sql ) {
		if ( self::$mDebug ) {
			echo $sql.'<br/>';
		}
		$result = @mysql_query( $sql, self::$mConnection );
		if ( $result ) {
			return $result;
		}
		else {
			self::$mError = mysql_error();
		}
		return false;
	}

	public static function NextRecord($query) {
		return array_change_key_case(mysql_fetch_assoc($query),CASE_LOWER);
	}

	public static function GetTableRow($table, $condition) {
		return self::LimitQuery($table, array(
					'condition' => $condition,
					'one' => true,
					));
	}

	public static function GetDbRowById($table, $ids=array()) { 
		$one = is_array($ids) ? false : true;
		settype($ids, 'array');
		$idstring = join('\',\'', $ids);
		$q = "SELECT * FROM `{$table}` WHERE id IN ('{$idstring}')";
		$r = self::GetQueryResult($q, $one);
		if ($one) return $r;
		return Utility::AssColumn($r, 'id');
	}

	public static function LimitQuery($table, $options=array()) {
		$condition = isset($options['condition']) ? $options['condition'] : null;
		$join = isset($options['join']) ? $options['join'] : null;
		$one = isset($options['one']) ? $options['one'] : false;
		$offset = isset($options['offset']) ? abs(intval($options['offset'])) : 0;
		if ( $one ) {
			$size = 1;
		} else {
			$size = isset($options['size']) ? abs(intval($options['size'])) : null;
		}
		$select = isset($options['select']) ? $options['select'] : '*';
		$order = isset($options['order']) ? $options['order'] : null;
		$cache = isset($options['cache'])?abs(intval($options['cache'])):0;
		$condition = self::BuildCondition( $condition );
		$condition = (null==$condition) ? null : "WHERE $condition";
		$join = self::BuildJoin( $join );
		$join = (null==$join) ? null : "$join";
		$limitation = $size ? "LIMIT $offset, $size" : null;
		$sql = "SELECT {$select} FROM `$table` $join $condition $order $limitation";
		return self::GetQueryResult( $sql, $one, $cache);
	}

	public static function GetQueryResult( $sql, $one=true, $cache=0 ) {
		$mkey = Cache::GetStringKey($sql);
		if ( $cache > 0 ) {
			$ret = Cache::Get($mkey);
			if ( $ret ) return $ret;
		}
		$ret = array();
		if ( $result = self::Query($sql) ) {
			while ( $row = mysql_fetch_assoc($result) ) {
				$row = array_change_key_case($row, CASE_LOWER);
				if ( $one ) {
					$ret = $row;
					break;
				}else{ 
					array_push( $ret, $row );
				}
			}
			@mysql_free_result( $result );
		}
		if ($cache > 0 && $ret) 
			Cache::Set($mkey, $ret, 0, $cache);
		return $ret;
	}

	public static function SaveTableRow($table, $condition) {
		return self::Insert($table, $condition);
	}

	public static function Insert( $table, $condition ) {
		$sql = "INSERT INTO `$table` SET ";
		$content = null;
		foreach ( $condition as $k => $v ) {
			$v_str = null;
			if ( is_numeric($v) )
				$v_str = "'{$v}'";
			else if ( is_null($v) )
				$v_str = 'NULL';
			else
				$v_str = "'" . self::EscapeString($v) . "'";

			$content .= "`$k`=$v_str,";
		}
		$content = trim($content, ',');
		$sql .= $content;
		$result = self::Query ($sql);
		if ( false==$result ) {
			
			return false;
		}
		($insert_id = self::GetInsertId()) || ($insert_id =  true) ;
		return $insert_id;
	}

	public static function DelTableRow($table=null, $condition=array()) {
		return self::Delete($table, $condition);
	}

	public static function Delete($table=null, $condition = array()) {
		if ( null==$table || empty($condition) )
			return false;
		$condition = self::BuildCondition($condition);
		$condition = (null==$condition) ? null : "WHERE $condition";
		$sql = "DELETE FROM `$table` $condition";
		return DB::Query( $sql );
	}

	public static function Update( $table=null, $id=1, $updaterow=array(), $pkname='id' ) {
		if ( null==$table || empty($updaterow) || null==$id)
			return false;
		if ( is_array($id) ) $condition = self::BuildCondition($id);
		else $condition = "`$pkname`='".self::EscapeString($id)."'";
		$sql = "UPDATE `$table` SET ";
		$content = null;
		foreach ( $updaterow as $k => $v ) {
			$v_str = null;
			if ( is_numeric($v) )
				$v_str = "'{$v}'";
			else if ( is_null($v) )
				$v_str = 'NULL';
			else if ( is_array($v) )
				$v_str = $v[0]; //for plus/sub/multi; 
			else
				$v_str = "'" . self::EscapeString($v) . "'";

			$content .= "`$k`=$v_str,";
		}
		$content = trim($content, ',');
		$sql .= $content;
		$sql .= " WHERE $condition";
		$result = self::Query ($sql);
		if ( false==$result ) {
			return false;
		}
		return true;
	}


	public static function GetField($table, $select_map = array()) {
		$fields = array();
		$q = self::Query( "DESC `$table`" );

		while($r=mysql_fetch_assoc($q) ) {
			$Field = $r['Field'];
			$Type = $r['Type'];

			$type = 'varchar';
			$cate = 'other';
			$extra = null;

			if ( preg_match( '/^id$/i', $Field ) )
				$cate = 'id';
			else if ( preg_match( '/^_time/i', $Field ) )
				$cate = 'integer';
			else if ( preg_match( '/^_number/i', $Field ) )
				$cate = 'integer';
			else if ( preg_match ( '/_id$/i', $Field ) )
				$cate = 'fkey';


			if ( preg_match('/text/i', $Type ) ) {
				$type = 'text';
				$cate = 'text';
			}
			if ( preg_match('/date/i', $Type ) ) {
				$type = 'date';
				$cate = 'time';
			}
			else if ( preg_match( '/int/i', $Type) ) {
				$type = 'int';
			}
			else if ( preg_match( '/(enum|set)\((.+)\)/i', $Type, $matches ) ) {
				$type = strtolower($matches[1]);
				eval("\$extra=array($matches[2]);");
				$extra = array_combine($extra, $extra);

				foreach( $extra AS $k=>$v) {
					$extra[$k] = isset($select_map[$k]) ? $select_map[$k] : $v;
				}
				$cate = 'select';
			}

			$fields[] = array(
					'name' => $Field,
					'type' => $type,
					'extra' => $extra,
					'cate' => $cate,
					);
		}
		return $fields;
	}

	public static function Exist($table, $condition=array()) {
		$row = self::LimitQuery($table, array(
					'condition' => $condition,
					'one' => true,
					));
		return empty($row) ? false : (isset($row['id']) ? $row['id'] : true);
	}

	public static function BuildCondition($condition=array(), $logic='AND') {
		if ( is_string( $condition ) || is_null($condition) )
			return $condition;
		$logic = strtoupper( $logic );
		$content = null;
		foreach ( $condition as $k => $v ) {
			$v_str = null;
			$v_connect = '=';

			if ( is_numeric($k) ) {
				$content .= $logic . ' (' . self::BuildCondition( $v, $logic ) . ')';
				continue;
			}
			$maybe_logic = strtoupper($k);
			if ( in_array($maybe_logic, array('AND','OR'))) {
				$content .= $logic . ' (' . self::BuildCondition( $v, $maybe_logic ) . ')';
				continue;
			}
			if ( is_numeric($v) ) {
				$v_str = "'{$v}'";
			}
			else if ( is_null($v) ) {
				$v_connect = ' IS ';
				$v_str = ' NULL';
			}
			else if ( is_array($v) ) {
				if ( isset($v[0]) ) {
					$v_str = null;
					foreach($v AS $one) {
						if (is_numeric($one)) {
							$v_str .= ','.$one;
						} else {
							$v_str .= ',\''.self::EscapeString($one).'\'';
						}
					}
					$v_str = '(' . trim($v_str, ',') .')';
					$v_connect = 'IN';
				} else if ( empty($v) ) {
					$v_str = $k;
					$v_connect = '<>';
				} else {
					$v_keys = array_keys($v);
					$v_connect = array_shift($v_keys);
					$v_val = array_values($v);
					$v_s = array_shift($v_val);
					$v_str = "'".self::EscapeString($v_s)."'";
					$v_str = is_numeric($v_s) ? "{$v_s}" : $v_str;
				}
			} 
			else {
				$v_str = "'".self::EscapeString($v)."'";
			}
			if(strpos($k, '.') === false && strpos($k, '(') === false)
				$content .= " $logic `$k` $v_connect $v_str ";
			else
				$content .= " $logic $k $v_connect $v_str ";
		}
		$content = preg_replace( '/^\s*'.$logic.'\s*/', '', $content );
		$content = preg_replace( '/\s*'.$logic.'\s*$/', '', $content );
		$content = trim($content);
		return $content;
	}


	public static function BuildJoin($join=array()) {
		if ( is_string( $join ) || is_null($join) )
			return $join;
		$content = null;
		$space = '';
		foreach ( $join as $k => $v ) {
			$content .= $space.'LEFT JOIN `'.$k.'` ON '.self::BuildCondition($v);
			$space = ' ';
		}
		return $content;
	}

	public static function CheckInt($id) {
		$id = intval($id);
		if ( 0>=$id )
			throw new Exception('must int!');
		return $id;
	}
}
