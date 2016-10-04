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
	}

	public function getEmpresaID() {
		return $this->empresa_id;
	}

	public function setEmpresaID($empresa_id) {
		$this->empresa_id = $empresa_id;
	}

	public function getDeviceID() {
		return $this->device_id;
	}

	public function setDeviceID($device_id) {
		$this->device_id = $device_id;
	}

	/**
	 * Tipo de dispositivo
	 */
	public function getType() {
		return $this->type;
	}

	public function setType($type) {
		$this->type = $type;
	}

	public function getDescricao() {
		return $this->descricao;
	}

	public function setDescricao($descricao) {
		$this->descricao = $descricao;
	}

	public function getModelo() {
		return $this->modelo;
	}

	public function setModelo($modelo) {
		$this->modelo = $modelo;
	}

	public function getDataCadastro() {
		return $this->data_cadastro;
	}

	public function setDataCadastro($data_cadastro) {
		$this->data_cadastro = $data_cadastro;
	}

	public function getDataAtualizacao() {
		return $this->data_atualizacao;
	}

	public function setDataAtualizacao($data_atualizacao) {
		$this->data_atualizacao = $data_atualizacao;
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
		if(!is_array($dispositivo))
			return $this;
		$this->setID($dispositivo['id']);
		$this->setEmpresaID($dispositivo['empresaid']);
		$this->setDeviceID($dispositivo['deviceid']);
		$this->setType($dispositivo['type']);
		$this->setDescricao($dispositivo['descricao']);
		$this->setModelo($dispositivo['modelo']);
		$this->setDataCadastro($dispositivo['datacadastro']);
		$this->setDataAtualizacao($dispositivo['dataatualizacao']);
	}

	public static function getPeloID($id) {
		$query = DB::$pdo->from('TDispositivos')
		                 ->where(array('id' => $id));
		return new ZDispositivo($query->fetch());
	}

	public static function getPelaEmpresaIDDeviceID($empresa_id, $device_id) {
		$query = DB::$pdo->from('TDispositivos')
		                 ->where(array('empresaid' => $empresa_id, 'deviceid' => $device_id));
		return new ZDispositivo($query->fetch());
	}

	private static function validarCampos(&$dispositivo) {
		$erros = array();
		if(!is_numeric($dispositivo['empresaid']))
			$erros['empresaid'] = 'A empresaid não foi informada';
		$dispositivo['deviceid'] = strip_tags(trim($dispositivo['deviceid']));
		if(strlen($dispositivo['deviceid']) == 0)
			$erros['deviceid'] = 'O deviceid não pode ser vazio';
		$dispositivo['type'] = strval($dispositivo['type']);
		if(!in_array($dispositivo['type'], array('Computer', 'Tablet')))
			$erros['type'] = 'O type of device informado não é válido';
		$dispositivo['descricao'] = strip_tags(trim($dispositivo['descricao']));
		if(strlen($dispositivo['descricao']) == 0)
			$erros['descricao'] = 'A descrição não pode ser vazia';
		$dispositivo['modelo'] = strip_tags(trim($dispositivo['modelo']));
		if(strlen($dispositivo['modelo']) == 0)
			$erros['modelo'] = 'O modelo não pode ser vazio';
		$dispositivo['datacadastro'] = date('Y-m-d H:i:s');
		$dispositivo['dataatualizacao'] = date('Y-m-d H:i:s');
		if(!empty($erros))
			throw new ValidationException($erros);
	}

	private static function handleException(&$e) {
		if(stripos($e->getMessage(), 'PRIMARY') !== false)
			throw new ValidationException(array('id' => 'O ID informado já está cadastrado'));
		if(stripos($e->getMessage(), 'UK_Dispositivo') !== false)
			throw new ValidationException(array('deviceid' => 'O deviceid informado já está cadastrado'));
	}

	public static function cadastrar($dispositivo) {
		$_dispositivo = $dispositivo->toArray();
		self::validarCampos($_dispositivo);
		try {
			$_dispositivo['id'] = DB::$pdo->insertInto('TDispositivos')->values($_dispositivo)->execute();
		} catch (Exception $e) {
			self::handleException($e);
			throw $e;
		}
		return self::getPeloID($_dispositivo['id']);
	}

	public static function atualizar($dispositivo) {
		$_dispositivo = $dispositivo->toArray();
		if(!$_dispositivo['id'])
			throw new ValidationException(array('id' => 'O id do dispositivo não foi informado'));
		self::validarCampos($_dispositivo);
		$campos = array(
			'empresaid',
			'deviceid',
			'type',
			'descricao',
			'modelo',
			'dataatualizacao',
		);
		try {
			$query = DB::$pdo->update('TDispositivos');
			$query = $query->set(array_intersect_key($_dispositivo, array_flip($campos)));
			$query = $query->where('id', $_dispositivo['id']);
			$query->execute();
		} catch (Exception $e) {
			self::handleException($e);
			throw $e;
		}
		return self::getPeloID($_dispositivo['id']);
	}

	public static function excluir($id) {
		if(!$id)
			throw new Exception('Não foi possível excluir o dispositivo, o id do dispositivo não foi informado');
		$query = DB::$pdo->deleteFrom('TDispositivos')
		                 ->where(array('id' => $id));
		return $query->execute();
	}

	private static function initSearch() {
		return   DB::$pdo->from('TDispositivos')
		                 ->orderBy('id ASC');
	}

	public static function getTodos($inicio = null, $quantidade = null) {
		$query = self::initSearch();
		if(!is_null($inicio) && !is_null($quantidade)) {
			$query = $query->limit($quantidade)->offset($inicio);
		}
		$_dispositivos = $query->fetchAll();
		$dispositivos = array();
		foreach($_dispositivos as $dispositivo)
			$dispositivos[] = new ZDispositivo($dispositivo);
		return $dispositivos;
	}

	public static function getCount() {
		$query = self::initSearch();
		return $query->count();
	}

	private static function initSearchDaEmpresaID($empresa_id) {
		return   DB::$pdo->from('TDispositivos')
		                 ->where(array('empresaid' => $empresa_id))
		                 ->orderBy('id ASC');
	}

	public static function getTodosDaEmpresaID($empresa_id, $inicio = null, $quantidade = null) {
		$query = self::initSearchDaEmpresaID($empresa_id);
		if(!is_null($inicio) && !is_null($quantidade)) {
			$query = $query->limit($quantidade)->offset($inicio);
		}
		$_dispositivos = $query->fetchAll();
		$dispositivos = array();
		foreach($_dispositivos as $dispositivo)
			$dispositivos[] = new ZDispositivo($dispositivo);
		return $dispositivos;
	}

	public static function getCountDaEmpresaID($empresa_id) {
		$query = self::initSearchDaEmpresaID($empresa_id);
		return $query->count();
	}

}
