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
		return array_filter($dispositivo);
	}

	public static function getPeloID($id, $igonore_id = null) {
		if ( !$id )
			return new ZDispositivo();
		$condition = array('ID' => $id);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZDispositivo(DB::GetTableRow('TDispositivos', $condition));
	}

	public static function excluir($id) {
		if ( !$id )
			return false;
		return DB::Delete('TDispositivos', array('ID' => $id));
	}

	public static function getPelaEmpresaIDDeviceID($empresa_id, $device_id, $igonore_id = null) {
		if ( !$empresa_id || !$device_id )
			return new ZDispositivo();
		$condition = array('EmpresaID' => $empresa_id, 'DeviceID' => $device_id);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZDispositivo(DB::GetTableRow('TDispositivos', $condition));
	}

	public static function validarCampos(&$dispositivo) {
		if(!is_numeric($dispositivo['empresaid']))
			return false;
		$dispositivo['deviceid'] = trim($dispositivo['deviceid']);
		if(strlen($dispositivo['deviceid']) == 0)
			return false;
		$dispositivo['descricao'] = trim($dispositivo['descricao']);
		if(strlen($dispositivo['descricao']) == 0)
			return false;
		$dispositivo['modelo'] = trim($dispositivo['modelo']);
		if(strlen($dispositivo['modelo']) == 0)
			return false;
		$dispositivo['datacadastro'] = date('Y-m-d H:i:s');
		$dispositivo['dataatualizacao'] = date('Y-m-d H:i:s');
		return true;
	}

	public static function cadastrar($dispositivo) {
		$_dispositivo = $dispositivo->toArray();
		if(!self::validarCampos($_dispositivo))
			return new ZDispositivo();
		$_dispositivo['id'] = DB::Insert('TDispositivos', $_dispositivo);
		return self::getPeloId($_dispositivo['id']);
	}

	public static function atualizar($dispositivo) {
		$_dispositivo = $dispositivo->toArray();
		if(!$_dispositivo['id'])
			return false;
		if(!self::validarCampos($_dispositivo))
			return false;
		$campos = array(
			'empresaid',
			'deviceid',
			'descricao',
			'modelo',
			'datacadastro',
			'dataatualizacao',
		);
		$table = new Table('TDispositivos', $_dispositivo);
		$table->SetPk('id', $_dispositivo['id']);
		return $table->Update($campos);
	}

	public static function getTodos($inicio = null, $quantidade = null) {
		$condition = array();
		if(!is_null($inicio) && !is_null($quantidade)) {
			$condition['order'] = 'ORDER BY id DESC';
			$condition['size'] = $quantidade;
			$condition['offset'] = $inicio;
		}
		$_dispositivos = DB::LimitQuery('TDispositivos', $condition);
		$dispositivos = array();
		foreach($_dispositivos as $dispositivo)
			$dispositivos[] = new ZDispositivo($dispositivo);
		return $dispositivos;
	}

}
