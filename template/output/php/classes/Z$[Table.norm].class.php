<?php
$[field.each(all)]
$[field.if(enum)]

class $[Table.norm]$[Field.norm] {
$[field.each(option)]
	const $[FIELD.option.norm] = '$[field.option]';
$[field.end]
}
$[field.end]
$[field.end]

$[table.if(comment)]
/**
$[table.each(comment)]
 * $[Table.comment]
$[table.end]
 */
$[table.end]
class Z$[Table.norm] {

$[field.each(all)]
	private $$[field.unix];
$[field.end]

	public function __construct($$[table.unix] = array()) {
		$this->fromArray($$[table.unix]);
	}
$[field.each(all)]

$[field.if(comment)]
	/**
$[field.each(comment)]
	 * $[Field.comment]
$[field.end]
	 */
$[field.end]
	public function get$[Field.norm]() {
		return $this->$[field.unix];
	}
$[field.if(boolean)]

$[field.if(comment)]
	/**
$[field.each(comment)]
	 * $[Field.comment]
$[field.end]
	 */
$[field.end]
	public function is$[Field.norm]() {
		return $this->$[field.unix] == 'Y';
	}
$[field.end]

	public function set$[Field.norm]($$[field.unix]) {
		$this->$[field.unix] = $$[field.unix];
		return $this;
	}
$[field.end]

	public function toArray() {
		$$[table.unix] = array();
$[field.each(all)]
		$$[table.unix]['$[field]'] = $this->get$[Field.norm]();
$[field.end]
		return $$[table.unix];
	}

	public function fromArray($$[table.unix] = array()) {
		if($$[table.unix] instanceof Z$[Table.norm])
			$$[table.unix] = $$[table.unix]->toArray();
		else if(!is_array($$[table.unix]))
			return $this;
$[field.each(all)]
		$this->set$[Field.norm]($$[table.unix]['$[field]']);
$[field.end]
		return $this;
	}

	public function validate() {
		$errors = array();
$[field.each(all)]
$[field.if(string)]
		$this->set$[Field.norm](strip_tags(trim($this->get$[Field.norm]())));
$[field.end]
$[field.if(null)]
		if($this->get$[Field.norm]() == '')
			$this->set$[Field.norm](null);
		else
	$[field.end]$[field.if(integer|bigint)]		$this->set$[Field.norm](intval($this->get$[Field.norm]()));
$[field.else.if(reference)]		$this->set$[Field.norm](intval($this->get$[Field.norm]()));
$[field.else.if(float|double|currency)]		$this->set$[Field.norm](floatval($this->get$[Field.norm]()));
$[field.else]
$[field.if(null)]		$this->set$[Field.norm]($this->get$[Field.norm]());
$[field.end]
$[field.end]
$[field.end]
		if(!empty($errors))
			throw new ValidationException($errors);
		return $this->toArray();
	}

	private static function translate($e) {
		if(stripos($e->getMessage(), 'PRIMARY') !== false)
			return new ValidationException(array('id' => 'O ID informado já está cadastrado'));
		return $e;
	}

	public function insert() {
		$values = $this->validate();
		try {
			$$[table.pk.unix] = DB::$pdo->insertInto('$[Table]')->values($values)->execute();
			$this->set$[Table.pk.norm]($$[table.pk.unix]);
		} catch (Exception $e) {
			throw self::translate($e);
		}
		$$[table.unix] = self::getPel$[table.pk.gender]$[Table.pk.norm]($this->get$[Table.pk.norm]());
		$this->fromArray($$[table.unix]->toArray());
		return $this;
	}

	public function update() {
		$values = $this->validate();
		if(!is_numeric($this->get$[Table.pk.norm]()))
			throw new ValidationException(array('$[table.pk]' => '$[Table.pk.gender] $[table.pk] d$[table.gender] $[table.name] não foi informad$[table.pk.gender]'));
		$fields = array(
$[field.each(all)]
			'$[field]',
$[field.end]
		);
		try {
			$query = DB::$pdo->update('$[Table]')
							 ->set(array_intersect_key($values, array_flip($fields)))
							 ->where('$[table.pk]', $this->get$[Table.pk.norm]())
							 ->execute();
		} catch (Exception $e) {
			throw self::translate($e);
		}
		$$[table.unix] = self::getPel$[table.pk.gender]$[Table.pk.norm]($this->get$[Table.pk.norm]());
		$this->fromArray($$[table.unix]->toArray());
		return $this;
	}

	public function delete() {
		if(!is_numeric($this->get$[Table.pk.norm]()))
			throw new Exception('Não foi possível excluir $[table.gender] $[table.name], $[table.pk.gender] $[table.pk] não foi informad$[table.pk.gender]');
		return DB::$pdo->deleteFrom('$[Table]')
					   ->where('$[table.pk]', $this->get$[Table.pk.norm]())
					   ->execute();
	}

}