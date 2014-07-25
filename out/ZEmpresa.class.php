<?php

class ZEmpresa {
	private $id;
	private $fantasia;
	private $razao_social;
	private $email;
	private $cnpj;
	private $estado_id;
	private $cidade_id;
	private $endereco;
	private $fone = array();
	private $site;
	private $guid;
	private $data_cadastro;
	private $data_atualizacao;

	public function __construct($empresa = array()) {
		if(is_array($empresa)) {
			$this->setID($empresa['id']);
			$this->setFantasia($empresa['fantasia']);
			$this->setRazaoSocial($empresa['razaosocial']);
			$this->setEmail($empresa['email']);
			$this->setCNPJ($empresa['cnpj']);
			$this->setEstadoID($empresa['estadoid']);
			$this->setCidadeID($empresa['cidadeid']);
			$this->setEndereco($empresa['endereco']);
			// TODO: assign array field Fone[1:2]
			$this->setSite($empresa['site']);
			$this->setGUID($empresa['guid']);
			$this->setDataCadastro($empresa['datacadastro']);
			$this->setDataAtualizacao($empresa['dataatualizacao']);
		}
	}

	public function getID() {
		return $this->id;
	}

	public function setID($id) {
		$this->id = $id;
	}

	public function getFantasia() {
		return $this->fantasia;
	}

	public function setFantasia($fantasia) {
		$this->fantasia = $fantasia;
	}

	public function getRazaoSocial() {
		return $this->razao_social;
	}

	public function setRazaoSocial($razao_social) {
		$this->razao_social = $razao_social;
	}

	public function getEmail() {
		return $this->email;
	}

	public function setEmail($email) {
		$this->email = $email;
	}

	public function getCNPJ() {
		return $this->cnpj;
	}

	public function setCNPJ($cnpj) {
		$this->cnpj = $cnpj;
	}

	public function getEstadoID() {
		return $this->estado_id;
	}

	public function setEstadoID($estado_id) {
		$this->estado_id = $estado_id;
	}

	public function getCidadeID() {
		return $this->cidade_id;
	}

	public function setCidadeID($cidade_id) {
		$this->cidade_id = $cidade_id;
	}

	public function getEndereco() {
		return $this->endereco;
	}

	public function setEndereco($endereco) {
		$this->endereco = $endereco;
	}

	public function getFone($index) {
		if ($index < 1 || $index > 2)
			return null;
		return $this->fone[$index];
	}

	public function setFone($index, $value) {
		if ($index < 1 || $index > 2)
			return;
		$this->fone[$index] = $value;
	}

	public function getSite() {
		return $this->site;
	}

	public function setSite($site) {
		$this->site = $site;
	}

	public function getGUID() {
		return $this->guid;
	}

	public function setGUID($guid) {
		$this->guid = $guid;
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
		$empresa = array();
		$empresa['id'] = $this->getID();
		$empresa['fantasia'] = $this->getFantasia();
		$empresa['razaosocial'] = $this->getRazaoSocial();
		$empresa['email'] = $this->getEmail();
		$empresa['cnpj'] = $this->getCNPJ();
		$empresa['estadoid'] = $this->getEstadoID();
		$empresa['cidadeid'] = $this->getCidadeID();
		$empresa['endereco'] = $this->getEndereco();
		// TODO: assign array field Fone[1:2]
		$empresa['site'] = $this->getSite();
		$empresa['guid'] = $this->getGUID();
		$empresa['datacadastro'] = $this->getDataCadastro();
		$empresa['dataatualizacao'] = $this->getDataAtualizacao();
		return array_filter($empresa);
	}

	public static function getPeloID($id, $igonore_id = null) {
		if ( !$id )
			return new ZEmpresa();
		$condition = array('ID' => $id);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZEmpresa(DB::GetTableRow('TEmpresas', $condition));
	}

	public static function excluir($id) {
		if ( !$id )
			return false;
		return DB::Delete('TEmpresas', array('ID' => $id));
	}

	public static function getPelaFantasia($fantasia, $igonore_id = null) {
		if ( !$fantasia )
			return new ZEmpresa();
		$condition = array('Fantasia' => $fantasia);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZEmpresa(DB::GetTableRow('TEmpresas', $condition));
	}

	public static function getPeloCNPJ($cnpj, $igonore_id = null) {
		if ( !$cnpj )
			return new ZEmpresa();
		$condition = array('CNPJ' => $cnpj);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZEmpresa(DB::GetTableRow('TEmpresas', $condition));
	}

	public static function getPeloEmail($email, $igonore_id = null) {
		if ( !$email )
			return new ZEmpresa();
		$condition = array('Email' => $email);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZEmpresa(DB::GetTableRow('TEmpresas', $condition));
	}

	public static function getPelaGUID($guid, $igonore_id = null) {
		if ( !$guid )
			return new ZEmpresa();
		$condition = array('GUID' => $guid);
		if(!is_null($igonore_id))
			$condition[] = 'ID <> '.intval($igonore_id);
		return new ZEmpresa(DB::GetTableRow('TEmpresas', $condition));
	}

	public static function validarCampos(&$empresa) {
		$empresa['fantasia'] = trim($empresa['fantasia']);
		if(strlen($empresa['fantasia']) == 0)
			return false;
		$empresa['razaosocial'] = trim($empresa['razaosocial']);
		if(strlen($empresa['razaosocial']) == 0)
			$empresa['razaosocial'] = null;
		$empresa['email'] = strval($empresa['email']);
		if(!check_email($empresa['email']))
			return false;
		$empresa['cnpj'] = strval($empresa['cnpj']);
		if(strlen($empresa['cnpj']) == 0)
			$empresa['cnpj'] = null;
		else if(!check_cnpj($empresa['cnpj']))
			return false;
		if(!is_numeric($empresa['estadoid']))
			return false;
		if(!is_numeric($empresa['cidadeid']))
			return false;
		$empresa['endereco'] = trim($empresa['endereco']);
		if(strlen($empresa['endereco']) == 0)
			$empresa['endereco'] = null;
		// TODO: assign array field Fone[1:2]
		$empresa['site'] = trim($empresa['site']);
		if(strlen($empresa['site']) == 0)
			$empresa['site'] = null;
		$empresa['guid'] = trim($empresa['guid']);
		if(strlen($empresa['guid']) == 0)
			$empresa['guid'] = null;
		$empresa['datacadastro'] = date('Y-m-d H:i:s');
		$empresa['dataatualizacao'] = date('Y-m-d H:i:s');
		return true;
	}

	public static function cadastrar($empresa) {
		$_empresa = $empresa->toArray();
		if(!self::validarCampos($_empresa))
			return new ZEmpresa();
		$_empresa['id'] = DB::Insert('TEmpresas', $_empresa);
		return self::getPeloId($_empresa['id']);
	}

	public static function atualizar($empresa) {
		$_empresa = $empresa->toArray();
		if(!$_empresa['id'])
			return false;
		if(!self::validarCampos($_empresa))
			return false;
		$campos = array(
			'fantasia',
			'razaosocial',
			'email',
			'cnpj',
			'estadoid',
			'cidadeid',
			'endereco',
			// TODO: assign array field Fone[1:2]
			'site',
			'guid',
			'datacadastro',
			'dataatualizacao',
		);
		$table = new Table('TEmpresas', $_empresa);
		$table->SetPk('id', $_empresa['id']);
		return $table->Update($campos);
	}

	public static function getTodas($inicio = null, $quantidade = null) {
		$condition = array();
		if(!is_null($inicio) && !is_null($quantidade)) {
			$condition['order'] = 'ORDER BY id DESC';
			$condition['size'] = $quantidade;
			$condition['offset'] = $inicio;
		}
		$_empresas = DB::LimitQuery('TEmpresas', $condition);
		$empresas = array();
		foreach($_empresas as $empresa)
			$empresas[] = new ZEmpresa($empresa);
		return $empresas;
	}

}
