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
			for($i = 1; $i <= 2; $i++)
				$this->setFone($i, $empresa['fone'.$i]);
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
			throw new Exception('Índice '.$index.' inválido, aceito somente de 1 até 2');
		return $this->fone[$index];
	}

	public function setFone($index, $value) {
		if ($index < 1 || $index > 2)
			throw new Exception('Índice '.$index.' inválido, aceito somente de 1 até 2');
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
		$empresa['site'] = $this->getSite();
		$empresa['guid'] = $this->getGUID();
		$empresa['datacadastro'] = $this->getDataCadastro();
		$empresa['dataatualizacao'] = $this->getDataAtualizacao();
		for($i = 1; $i <= 2; $i++)
			$empresa['fone'.$i] = $this->getFone($i);
		return $empresa;
	}

	public static function getPeloID($id) {
		return new ZEmpresa(DB::GetTableRow('TEmpresas', array('id' => $id)));
	}

	public static function getPelaFantasia($fantasia) {
		return new ZEmpresa(DB::GetTableRow('TEmpresas', array('fantasia' => $fantasia)));
	}

	public static function getPeloCNPJ($cnpj) {
		return new ZEmpresa(DB::GetTableRow('TEmpresas', array('cnpj' => $cnpj)));
	}

	public static function getPeloEmail($email) {
		return new ZEmpresa(DB::GetTableRow('TEmpresas', array('email' => $email)));
	}

	public static function getPelaGUID($guid) {
		return new ZEmpresa(DB::GetTableRow('TEmpresas', array('guid' => $guid)));
	}

	private static function validarCampos(&$empresa) {
		$erros = array();
		$empresa['fantasia'] = strip_tags(trim($empresa['fantasia']));
		if(strlen($empresa['fantasia']) == 0)
			$erros['fantasia'] = 'A Fantasia não pode ser vazia';
		$empresa['razaosocial'] = strip_tags(trim($empresa['razaosocial']));
		if(strlen($empresa['razaosocial']) == 0)
			$empresa['razaosocial'] = null;
		$empresa['email'] = strip_tags(trim($empresa['email']));
		if(!check_email($empresa['email']))
			$erros['email'] = 'Email inválido';
		$empresa['cnpj'] = number_only($empresa['cnpj']);
		if(strlen($empresa['cnpj']) == 0)
			$empresa['cnpj'] = null;
		else if(!check_cnpj($empresa['cnpj']))
			$erros['cnpj'] = 'CNPJ inválido';
		if(!is_numeric($empresa['estadoid']))
			$erros['estadoid'] = 'O EstadoID não é um número';
		if(!is_numeric($empresa['cidadeid']))
			$erros['cidadeid'] = 'A CidadeID não é um número';
		$empresa['endereco'] = strip_tags(trim($empresa['endereco']));
		if(strlen($empresa['endereco']) == 0)
			$empresa['endereco'] = null;
		for($i = 1; $i <= 2; $i++) {
			$empresa['fone'.$i] = number_only($empresa['fone'.$i]);
			if(!check_fone($empresa['fone'.$i]))
				$erros['fone'.$i] = 'Fone1 inválido';
		}
		$empresa['site'] = strip_tags(trim($empresa['site']));
		if(strlen($empresa['site']) == 0)
			$empresa['site'] = null;
		$empresa['guid'] = strip_tags(trim($empresa['guid']));
		if(strlen($empresa['guid']) == 0)
			$empresa['guid'] = null;
		$empresa['datacadastro'] = date('Y-m-d H:i:s');
		$empresa['dataatualizacao'] = date('Y-m-d H:i:s');
		if(!empty($erros))
			throw new ValidationException($erros);
	}

	private static function handleException(&$e) {
		if(stripos($e->getMessage(), 'PRIMARY') !== false)
			throw new ValidationException(array('id' => 'O ID informado já está cadastrado'));
		if(stripos($e->getMessage(), 'Fantasia_UNIQUE') !== false)
			throw new ValidationException(array('fantasia' => 'A Fantasia informada já está cadastrada'));
		if(stripos($e->getMessage(), 'CNPJ_UNIQUE') !== false)
			throw new ValidationException(array('cnpj' => 'O CNPJ informado já está cadastrado'));
		if(stripos($e->getMessage(), 'Email_UNIQUE') !== false)
			throw new ValidationException(array('email' => 'O Email informado já está cadastrado'));
		if(stripos($e->getMessage(), 'GUID_UNIQUE') !== false)
			throw new ValidationException(array('guid' => 'A GUID informada já está cadastrada'));
	}

	public static function cadastrar($empresa) {
		$_empresa = $empresa->toArray();
		self::validarCampos($_empresa);
		try {
		$_empresa['id'] = DB::Insert('TEmpresas', $_empresa);
		} catch (Exception $e) {
			self::handleException($e);
			throw $e;
		}
		return self::getPeloID($_empresa['id']);
	}

	public static function atualizar($empresa) {
		$_empresa = $empresa->toArray();
		if(!$_empresa['id'])
			throw new ValidationException(array('id' => 'O id da empresa não foi informado'));
		self::validarCampos($_empresa);
		$campos = array(
			'fantasia',
			'razaosocial',
			'email',
			'cnpj',
			'estadoid',
			'cidadeid',
			'endereco',
			'site',
			'guid',
			'dataatualizacao',
		);
		for($i = 1; $i <= 2; $i++)
			$campos[] = 'fone'.$i;
		try {
		$table = new Table('TEmpresas', $_empresa);
		$table->SetPk('id', $_empresa['id']);
		if(!$table->Update($campos))
			throw new Exception('Falha ao atualizar a empresa');
		} catch (Exception $e) {
			self::handleException($e);
			throw $e;
		}
		return self::getPeloID($_empresa['id']);
	}

	public static function excluir($id) {
		if(!$id)
			throw new Exception('Não foi possível excluir a empresa, o id da empresa não foi informado');
		return DB::Delete('TEmpresas', array('id' => $id));
	}

	private static function initSearch() {
		$query = array();
		$query['order'] = 'ORDER BY id ASC';
		return $query;
	}

	public static function getTodas($inicio = null, $quantidade = null) {
		$query = self::initSearch();
		if(!is_null($inicio) && !is_null($quantidade)) {
			$query['size'] = $quantidade;
			$query['offset'] = $inicio;
		}
		$_empresas = DB::LimitQuery('TEmpresas', $query);
		$empresas = array();
		foreach($_empresas as $empresa)
			$empresas[] = new ZEmpresa($empresa);
		return $empresas;
	}

	public static function getCount() {
		$query = self::initSearch();
		return Table::Count('TEmpresas', $query['condition']);
	}

}
