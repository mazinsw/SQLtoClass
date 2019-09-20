<?php
$[table.if(package)]
namespace $[table.package];
$[table.end]

$[table.if(comment)]
/**
$[table.each(comment)]
 * $[Table.comment]
$[table.end]
 */
$[table.end]
class $[tAble.norm]$[table.if(inherited)] extends $[table.inherited]$[table.end]

{
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]

$[field.if(comment)]
    /**
$[field.each(comment)]
     * $[Field.comment]
$[field.end]
     */
$[field.end]
$[field.each(option)]
    const $[FIELD.unix]_$[FIELD.option.norm] = '$[field.option]';
$[field.end]
$[field.end]
$[field.end]

$[field.each(all)]
$[field.if(repeated)]
$[field.else]
$[field.if(comment)]
    /**
$[field.each(comment)]
     * $[Field.comment]
$[field.end]
     */
$[field.end]
    private $$[field.unix]$[field.if(array)] = array()$[field.end];
$[field.end]
$[field.end]

    /**
     * Constructor for a new empty instance of $[tAble.norm]
     * @param array $$[table.unix] All field and values to fill the instance
     */
    public function __construct($$[table.unix] = array())
    {
$[table.if(inherited)]
        parent::__construct($$[table.unix]);
$[table.else]
        $this->fromArray($$[table.unix]);
$[table.end]
    }
$[field.each(all)]
$[field.if(repeated)]
$[field.else]

$[field.if(comment)]
    /**
$[field.each(comment)]
     * $[Field.comment]
$[field.end]
$[field.if(array)]
     * @param  integer $index index to get $[fIeld.norm]
$[field.end]
     * @return mixed $[fIeld.name] of $[tAble.norm]
     */
$[field.end]
    public function get$[fIeld.norm]($[field.if(array)]$index$[field.end])
    {
$[field.if(array)]
        if ($index < 1 || $index > $[field.array.count]) {
            throw new \Exception(_t('outrange.$[table.unix].$[field.unix]', $index, 1, $[field.array.count]), 500);
        }
$[field.end]
        return $this->$[field.unix]$[field.if(array)][$index]$[field.end];
    }
$[field.if(boolean)]

$[field.if(comment)]
    /**
$[field.each(comment)]
     * $[Field.comment]
$[field.end]
     * @return boolean Check if $[field.gender] of $[fIeld.norm] is selected or checked
     */
$[field.end]
    public function is$[fIeld.norm]()
    {
        return $this->$[field.unix] == 'Y';
    }
$[field.end]

    /**
     * Set $[fIeld.norm] value to new on param
$[field.if(array)]
     * @param  integer $index index for set $[fIeld.norm]
$[field.end]
     * @param  mixed $$[field.unix] new value for $[fIeld.norm]
     * @return $[tAble.norm] Self instance
     */
    public function set$[fIeld.norm]($[field.if(array)]$index, $[field.end]$$[field.unix])
    {
$[field.if(array)]
        if ($index < 1 || $index > $[field.array.count]) {
            throw new \Exception(_t('outrange.$[table.unix].$[field.unix]', $index, 1, $[field.array.count]), 500);
        }
$[field.end]
        $this->$[field.unix]$[field.if(array)][$index]$[field.end] = $$[field.unix];
        return $this;
    }
$[field.end]
$[field.end]

    /**
     * Convert this instance to array associated key -> value
     * @param  boolean $recursive Allow rescursive conversion of fields
     * @return array All field and values into array format
     */
    public function toArray($recursive = false)
    {
        $$[table.unix] = array();
$[field.each(all)]
        $$[table.unix]['$[field]'] = $this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end]);
$[field.end]
        return $$[table.unix];
    }

    /**
     * Fill this instance with from array values, you can pass instance to
     * @param  mixed $$[table.unix] Associated key -> value to assign into this instance
     * @return $[tAble.norm] Self instance
     */
    public function fromArray($$[table.unix] = array())
    {
        if ($$[table.unix] instanceof $[tAble.norm]) {
            $$[table.unix] = $$[table.unix]->toArray();
        } elseif (!is_array($$[table.unix])) {
            return $this;
        }
$[table.if(inherited)]
        parent::fromArray($$[table.unix]);
$[table.end]
$[field.each(all)]
$[field.if(null)]
        if (!array_key_exists('$[field]', $$[table.unix])) {
$[field.else]
        if (!isset($$[table.unix]['$[field]'])) {
$[field.end]
$[field.if(default)]
            $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]$[fIeld.info]);
$[field.else]
            $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]null);
$[field.end]
        } else {
            $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]$$[table.unix]['$[field]']);
        }
$[field.end]
        return $this;
    }

    /**
     * Validate fields updating them and throw exception when invalid data has found
     * @param  boolean $filter remove unwanted fields
     * @return array All field of $[tAble.norm] in array format
     */
    public function validate($filter = false)
    {
        $errors = array();
$[field.each(all)]
$[field.if(string)]
        $$[field.unix] = strip_tags(trim($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end])));
$[field.if(null)]
        if ($$[field.unix] == '') {
            $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]null);
        } else {
$[field.end]
        $[field.if(null)]    $[field.end]$this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]$$[field.unix]);
$[field.if(null)]
        }
$[field.end]
$[field.match(CNPJ)]
        if (!check_cnpj($$[field.unix])) {
            $errors['$[field.unix]'] = 'Invalid CNPJ field';
        }
$[field.end]
$[field.contains(Fone)]
        if (!check_fone($$[field.unix])) {
            $errors['$[field.unix]'] = 'Invalid Fone field';
        }
$[field.end]
$[field.else.if(integer|bigint)]
        $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]intval($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end])));
$[field.else.if(reference)]
        $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]intval($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end])));
$[field.else.if(float|double|currency)]
        $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]floatval($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end])));
$[field.else.if(blob)]
        if ($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end]) === '') {
            $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]null);
        }
$[field.else]
        $this->set$[fIeld.norm]($[field.if(array)]$[field.array.number], $[field.end]strval($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end])));
$[field.end]
$[field.end]
        if (!empty($errors)) {
            throw new \ValidationException($errors);
        }
        $result = $this->toArray();
        if (!$filter) {
            return $result;
        }
$[field.each(all)]
$[field.if(blob)]
        if ($this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end]) === true) {
            unset($result['$[field]']);
        }
$[field.else.if(datetime)]
$[field.if(default)]
        unset($result['$[field]']);
$[field.end]
$[field.end]
$[field.end]
        return $result;
    }

    /**
     * Translate SQL exception into application exception
     * @param  Exception $e exception to translate into a readable error
     * @return Exception new exception translated
     */
    protected function translate($e)
    {
$[table.each(unique)]
$[unique.if(primary)]
$[unique.else]
        if (stripos($e->getMessage(), '$[uNique.name]') !== false) {
            return new \ValidationException(array(
$[unique.each(all)]
                '$[field]' => _t('duplicated.$[table.unix].$[field.unix]', $this->get$[fIeld.norm]($[field.if(array)]$[field.array.number]$[field.end])),
$[unique.end]
            ));
        }
$[unique.end]
$[table.end]
$[table.if(inherited)]
        return parent::translate($e);
$[table.else]
        return $e;
$[table.end]
    }

	public function insert() {
		$values = $this->validate();
		try {
			$$[table.pk.unix] = DB::$pdo->insertInto('$[Table]')->values($values)->execute();
			$this->set$[Table.pk.norm]($$[table.pk.unix]);
		} catch (Exception $e) {
			throw $this->translate($e);
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
			throw $this->translate($e);
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