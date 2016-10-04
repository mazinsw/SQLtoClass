<?php

class DispositivoType {
	const COMPUTER = 'Computer';
	const TABLET = 'Tablet';
}

class ZDispositivo {

	private $id;
	private $empresa_id;
	private $device_id;
	private $type;
	private $descricao;
	private $modelo;
	private $data_cadastro;
	private $data_atualizacao;

	public function __construct($dispositivo = array()) {
		$this->fromArray($dispositivo);
	}

	public function getID() {
		return $this->id;
	}

	public function setID($id) {
		$this->id = $id;
		return $this;
	}

	public function getEmpresaID() {
		return $this->empresa_id;
	}

	public function setEmpresaID($empresa_id) {
		$this->empresa_id = $empresa_id;
		return $this;
	}

	public function getDeviceID() {
		return $this->device_id;
	}

	public function setDeviceID($device_id) {
		$this->device_id = $device_id;
		return $this;
	}

	/**
	 * Tipo de dispositivo
	 */
	public function getType() {
		return $this->type;
	}

	public function setType($type) {
		$this->type = $type;
		return $this;
	}

	public function getDescricao() {
		return $this->descricao;
	}

	public function setDescricao($descricao) {
		$this->descricao = $descricao;
		return $this;
	}

	public function getModelo() {
		return $this->modelo;
	}

	public function setModelo($modelo) {
		$this->modelo = $modelo;
		return $this;
	}

	public function getDataCadastro() {
		return $this->data_cadastro;
	}

	public function setDataCadastro($data_cadastro) {
		$this->data_cadastro = $data_cadastro;
		return $this;
	}

	public function getDataAtualizacao() {
		return $this->data_atualizacao;
	}

	public function setDataAtualizacao($data_atualizacao) {
		$this->data_atualizacao = $data_atualizacao;
		return $this;
	}

	public function toArray() {
		$dispositivo = array();
		$dispositivo['id'] = $this->getID();
		$dispositivo['empresaid'] = $this->getEmpresaID();
		$dispositivo['deviceid'] = $this->getDeviceID();
		$dispositivo['type'] = $this->getType();
		$dispositivo['descricao'] = $this->getDescricao();
		$dispositivo['modelo'] = $this->getModelo();
		$dispositivo['datacadastro'] = $this->getDataCadastro();
		$dispositivo['dataatualizacao'] = $this->getDataAtualizacao();
		return $dispositivo;
	}

	public function fromArray($dispositivo = array()) {
		if($dispositivo instanceof ZDispositivo)
			$dispositivo = $dispositivo->toArray();
		else if(!is_array($dispositivo))
			return $this;
		$this->setID($dispositivo['id']);
		$this->setEmpresaID($dispositivo['empresaid']);
		$this->setDeviceID($dispositivo['deviceid']);
		$this->setType($dispositivo['type']);
		$this->setDescricao($dispositivo['descricao']);
		$this->setModelo($dispositivo['modelo']);
		$this->setDataCadastro($dispositivo['datacadastro']);
		$this->setDataAtualizacao($dispositivo['dataatualizacao']);
		return $this;
	}

	public function validate() {
		$errors = array();
		$this->setID(intval($this->getID()));
		$this->setEmpresaID(intval($this->getEmpresaID()));
		$this->setDeviceID(strip_tags(trim($this->getDeviceID())));
		$this->setDescricao(strip_tags(trim($this->getDescricao())));
		$this->setModelo(strip_tags(trim($this->getModelo())));
		if($this->getDataAtualizacao() == '')
			$this->setDataAtualizacao(null);
		else
			$this->setDataAtualizacao($this->getDataAtualizacao());
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
			$id = DB::$pdo->insertInto('TDispositivos')->values($values)->execute();
			$this->setID($id);
		} catch (Exception $e) {
			throw self::translate($e);
		}
		$dispositivo = self::getPeloID($this->getID());
		$this->fromArray($dispositivo->toArray());
		return $this;
	}

	public function update() {
		$values = $this->validate();
		if(!is_numeric($this->getID()))
			throw new ValidationException(array('id' => 'O id do device não foi informado'));
		$fields = array(
			'id',
			'empresaid',
			'deviceid',
			'type',
			'descricao',
			'modelo',
			'datacadastro',
			'dataatualizacao',
		);
		try {
			$query = DB::$pdo->update('TDispositivos')
							 ->set(array_intersect_key($values, array_flip($fields)))
							 ->where('id', $this->getID())
							 ->execute();
		} catch (Exception $e) {
			throw self::translate($e);
		}
		$dispositivo = self::getPeloID($this->getID());
		$this->fromArray($dispositivo->toArray());
		return $this;
	}

	public function delete() {
		if(!is_numeric($this->getID()))
			throw new Exception('Não foi possível excluir o device, o id não foi informado');
		return DB::$pdo->deleteFrom('TDispositivos')
					   ->where('id', $this->getID())
					   ->execute();
	}

}