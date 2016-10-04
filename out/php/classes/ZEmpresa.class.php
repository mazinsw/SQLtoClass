<?php

/**
 * Informações da empresa Informações da empresa Informações da empresa
 * Informações da empresa Informações da empresa
 */
class ZEmpresa {

	private $id;
	private $fantasia;
	private $razao_social;
	private $email;
	private $senha;
	private $cnpj;
	private $estado_id;
	private $cidade_id;
	private $endereco;
	private $fone;
	private $fone;
	private $site;
	private $guid;
	private $data_cadastro;
	private $data_atualizacao;

	public function __construct($empresa = array()) {
		$this->fromArray($empresa);
	}

	public function getID() {
		return $this->id;
	}

	public function setID($id) {
		$this->id = $id;
		return $this;
	}

	public function getFantasia() {
		return $this->fantasia;
	}

	public function setFantasia($fantasia) {
		$this->fantasia = $fantasia;
		return $this;
	}

	public function getRazaoSocial() {
		return $this->razao_social;
	}

	public function setRazaoSocial($razao_social) {
		$this->razao_social = $razao_social;
		return $this;
	}

	public function getEmail() {
		return $this->email;
	}

	public function setEmail($email) {
		$this->email = $email;
		return $this;
	}

	public function getSenha() {
		return $this->senha;
	}

	public function setSenha($senha) {
		$this->senha = $senha;
		return $this;
	}

	public function getCNPJ() {
		return $this->cnpj;
	}

	public function setCNPJ($cnpj) {
		$this->cnpj = $cnpj;
		return $this;
	}

	public function getEstadoID() {
		return $this->estado_id;
	}

	public function setEstadoID($estado_id) {
		$this->estado_id = $estado_id;
		return $this;
	}

	public function getCidadeID() {
		return $this->cidade_id;
	}

	public function setCidadeID($cidade_id) {
		$this->cidade_id = $cidade_id;
		return $this;
	}

	public function getEndereco() {
		return $this->endereco;
	}

	public function setEndereco($endereco) {
		$this->endereco = $endereco;
		return $this;
	}

	public function getFone() {
		return $this->fone;
	}

	public function setFone($fone) {
		$this->fone = $fone;
		return $this;
	}

	public function getFone() {
		return $this->fone;
	}

	public function setFone($fone) {
		$this->fone = $fone;
		return $this;
	}

	public function getSite() {
		return $this->site;
	}

	public function setSite($site) {
		$this->site = $site;
		return $this;
	}

	public function getGUID() {
		return $this->guid;
	}

	public function setGUID($guid) {
		$this->guid = $guid;
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
		$empresa = array();
		$empresa['id'] = $this->getID();
		$empresa['fantasia'] = $this->getFantasia();
		$empresa['razaosocial'] = $this->getRazaoSocial();
		$empresa['email'] = $this->getEmail();
		$empresa['senha'] = $this->getSenha();
		$empresa['cnpj'] = $this->getCNPJ();
		$empresa['estadoid'] = $this->getEstadoID();
		$empresa['cidadeid'] = $this->getCidadeID();
		$empresa['endereco'] = $this->getEndereco();
		$empresa['fone1'] = $this->getFone();
		$empresa['fone2'] = $this->getFone();
		$empresa['site'] = $this->getSite();
		$empresa['guid'] = $this->getGUID();
		$empresa['datacadastro'] = $this->getDataCadastro();
		$empresa['dataatualizacao'] = $this->getDataAtualizacao();
		return $empresa;
	}

	public function fromArray($empresa = array()) {
		if($empresa instanceof ZEmpresa)
			$empresa = $empresa->toArray();
		else if(!is_array($empresa))
			return $this;
		$this->setID($empresa['id']);
		$this->setFantasia($empresa['fantasia']);
		$this->setRazaoSocial($empresa['razaosocial']);
		$this->setEmail($empresa['email']);
		$this->setSenha($empresa['senha']);
		$this->setCNPJ($empresa['cnpj']);
		$this->setEstadoID($empresa['estadoid']);
		$this->setCidadeID($empresa['cidadeid']);
		$this->setEndereco($empresa['endereco']);
		$this->setFone($empresa['fone1']);
		$this->setFone($empresa['fone2']);
		$this->setSite($empresa['site']);
		$this->setGUID($empresa['guid']);
		$this->setDataCadastro($empresa['datacadastro']);
		$this->setDataAtualizacao($empresa['dataatualizacao']);
		return $this;
	}

	public function validate() {
		$errors = array();
		$this->setID(intval($this->getID()));
		$this->setFantasia(strip_tags(trim($this->getFantasia())));
		$this->setRazaoSocial(strip_tags(trim($this->getRazaoSocial())));
		if($this->getRazaoSocial() == '')
			$this->setRazaoSocial(null);
		else
			$this->setRazaoSocial($this->getRazaoSocial());
		$this->setEmail(strip_tags(trim($this->getEmail())));
		$this->setSenha(strip_tags(trim($this->getSenha())));
		$this->setCNPJ(strip_tags(trim($this->getCNPJ())));
		if($this->getCNPJ() == '')
			$this->setCNPJ(null);
		else
			$this->setCNPJ($this->getCNPJ());
		$this->setEstadoID(intval($this->getEstadoID()));
		$this->setCidadeID(intval($this->getCidadeID()));
		$this->setEndereco(strip_tags(trim($this->getEndereco())));
		if($this->getEndereco() == '')
			$this->setEndereco(null);
		else
			$this->setEndereco($this->getEndereco());
		$this->setFone(strip_tags(trim($this->getFone())));
		$this->setFone(strip_tags(trim($this->getFone())));
		if($this->getFone() == '')
			$this->setFone(null);
		else
			$this->setFone($this->getFone());
		$this->setSite(strip_tags(trim($this->getSite())));
		if($this->getSite() == '')
			$this->setSite(null);
		else
			$this->setSite($this->getSite());
		$this->setGUID(strip_tags(trim($this->getGUID())));
		if($this->getGUID() == '')
			$this->setGUID(null);
		else
			$this->setGUID($this->getGUID());
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
			$id = DB::$pdo->insertInto('TEmpresas')->values($values)->execute();
			$this->setID($id);
		} catch (Exception $e) {
			throw self::translate($e);
		}
		$empresa = self::getPeloID($this->getID());
		$this->fromArray($empresa->toArray());
		return $this;
	}

	public function update() {
		$values = $this->validate();
		if(!is_numeric($this->getID()))
			throw new ValidationException(array('id' => 'O id da ámpresa não foi informado'));
		$fields = array(
			'id',
			'fantasia',
			'razaosocial',
			'email',
			'senha',
			'cnpj',
			'estadoid',
			'cidadeid',
			'endereco',
			'fone1',
			'fone2',
			'site',
			'guid',
			'datacadastro',
			'dataatualizacao',
		);
		try {
			$query = DB::$pdo->update('TEmpresas')
							 ->set(array_intersect_key($values, array_flip($fields)))
							 ->where('id', $this->getID())
							 ->execute();
		} catch (Exception $e) {
			throw self::translate($e);
		}
		$empresa = self::getPeloID($this->getID());
		$this->fromArray($empresa->toArray());
		return $this;
	}

	public function delete() {
		if(!is_numeric($this->getID()))
			throw new Exception('Não foi possível excluir a ámpresa, o id não foi informado');
		return DB::$pdo->deleteFrom('TEmpresas')
					   ->where('id', $this->getID())
					   ->execute();
	}

}