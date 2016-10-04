<?php
require_once(dirname(dirname(__FILE__)) . '/ZEmpresa.class.php');

if ($_POST) {
	$empresa = new ZEmpresa($_POST);
	try {
		$empresa->setID(null);
		$empresa = ZEmpresa::cadastrar($empresa);
		Thunder::success('Ámpresa "'.$empresa->getFantasia().'" cadastrada com sucesso!', true);
		redirect(WEB_ROOT . '/manage/empresa/');
	} catch (Exception $e) {
		Thunder::error($e->getMessage());
	}
} else {
	$empresa = new ZEmpresa();
}
include('manage_empresa_cadastrar');