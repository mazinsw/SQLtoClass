<?php

class ZDispositivo {
	private $id;
	private $empresa_id;
	private $device_id;
	private $descricao;
	private $modelo;
	private $data_cadastro;
	private $data_atualizacao;

	public function __construct($dispositivo = array()) {
		if(is_array($dispositivo)) {
			$this->setID($dispositivo['id']);
			$this->setEmpresaID($dispositivo['empresaid']);
			$this->setDeviceID($dispositivo['deviceid']);
			$this->setDescricao($dispositivo['descricao']);
			$this->setModelo($dispositivo['modelo']);
			$this->setDataCadastro($dispositivo['datacadastro']);
			$this->setDataAtualizacao($dispositivo['dataatualizacao']);
		}
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
		$dispositivo['descricao'] = $this->getDescricao();
		$dispositivo['modelo'] = $this->getModelo();
		$dispositivo['datacadastro'] = $this->getDataCadastro();
		$dispositivo['dataatualizacao'] = $this->getDataAtualizacao();
		return $dispositivo;
	}

	public static function getPeloID($id) {
		return new ZDispositivo(DB::GetTableRow('TDispositivos', array('id' => $id)));
	}

	public static function getPelaEmpresaIDDeviceID($empresa_id, $device_id) {
		return new ZDispositivo(DB::GetTableRow('TDispositivos', array('empresaid' => $empresa_id, 'deviceid' => $device_id)));
	}

	private static function validarCampos(&$dispositivo) {
		$erros = array();
		if(!is_numeric($dispositivo['empresaid']))
			$erros['empresaid'] = 'A EmpresaID não é um número';
		$dispositivo['deviceid'] = strip_tags(trim($dispositivo['deviceid']));
		if(strlen($dispositivo['deviceid']) == 0)
			$erros['deviceid'] = 'O DeviceID não pode ser vazio';
		$dispositivo['descricao'] = strip_tags(trim($dispositivo['descricao']));
		if(strlen($dispositivo['descricao']) == 0)
			$erros['descricao'] = 'A Descricao não pode ser vazia';
		$dispositivo['modelo'] = strip_tags(trim($dispositivo['modelo']));
		if(strlen($dispositivo['modelo']) == 0)
			$erros['modelo'] = 'O Modelo não pode ser vazio';
		$dispositivo['datacadastro'] = date('Y-m-d H:i:s');
		$dispositivo['dataatualizacao'] = date('Y-m-d H:i:s');
		if(!empty($erros))
			throw new ValidationException($erros);
	}

	private static function handleException(&$e) {
		if(stripos($e->getMessage(), 'PRIMARY') !== false)
			throw new ValidationException(array('id' => 'O ID informado já está cadastrado'));
		if(stripos($e->getMessage(), 'UK_Dispositivo') !== false)
			throw new ValidationException(array('deviceid' => 'O DeviceID informado já está cadastrado'));
	}

	public static function cadastrar($dispositivo) {
		$_dispositivo = $dispositivo->toArray();
		self::validarCampos($_dispositivo);
		try {
		$_dispositivo['id'] = DB::Insert('TDispositivos', $_dispositivo);
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
			'descricao',
			'modelo',
			'dataatualizacao',
		);
		try {
		$table = new Table('TDispositivos', $_dispositivo);
		$table->SetPk('id', $_dispositivo['id']);
		if(!$table->Update($campos))
			throw new Exception('Falha ao atualizar a dispositivo');
		} catch (Exception $e) {
			self::handleException($e);
			throw $e;
		}
		return self::getPeloID($_dispositivo['id']);
	}

	public static function excluir($id) {
		if(!$id)
			throw new Exception('Não foi possível excluir o dispositivo, o id do dispositivo não foi informado');
		return DB::Delete('TDispositivos', array('id' => $id));
	}

	private static function initSearch() {
		$query = array();
		$query['order'] = 'ORDER BY id ASC';
		return $query;
	}

	public static function getTodos($inicio = null, $quantidade = null) {
		$query = self::initSearch();
		if(!is_null($inicio) && !is_null($quantidade)) {
			$query['size'] = $quantidade;
			$query['offset'] = $inicio;
		}
		$_dispositivos = DB::LimitQuery('TDispositivos', $query);
		$dispositivos = array();
		foreach($_dispositivos as $dispositivo)
			$dispositivos[] = new ZDispositivo($dispositivo);
		return $dispositivos;
	}

	public static function getCount() {
		$query = self::initSearch();
		return Table::Count('TDispositivos', $query['condition']);
	}

	private static function initSearchDaEmpresaID($empresa_id) {
		$query = array();
		$query['condition'] = array('empresaid' => $empresa_id);
		$query['order'] = 'ORDER BY id ASC';
		return $query;
	}

	public static function getTodosDaEmpresaID($empresa_id, $inicio = null, $quantidade = null) {
		$query = self::initSearchDaEmpresaID($empresa_id);
		if(!is_null($inicio) && !is_null($quantidade)) {
			$query['size'] = $quantidade;
			$query['offset'] = $inicio;
		}
		$_dispositivos = DB::LimitQuery('TDispositivos', $query);
		$dispositivos = array();
		foreach($_dispositivos as $dispositivo)
			$dispositivos[] = new ZDispositivo($dispositivo);
		return $dispositivos;
	}

	public static function getCountDaEmpresaID($empresa_id) {
		$query = self::initSearchDaEmpresaID($empresa_id);
		return Table::Count('TDispositivos', $query['condition']);
	}

}
