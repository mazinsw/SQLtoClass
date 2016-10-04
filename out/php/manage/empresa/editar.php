<?php
require_once(dirname(dirname(__FILE__)) . '/ZEmpresa.class.php');

$empresa = ZEmpresa::getPeloID($_GET['id']);
if(is_null($empresa->id) {
	Thunder::warning('A ámpresa de id "'.$_GET['id'].'" não existe!');
	redirect(WEB_ROOT . '/manage/empresa/');
}
$old_empresa = $empresa;
if ($_POST) {
	$empresa = new ZEmpresa($_POST);
	$empresa->setID($old_empresa->getID()());
	try {
		$empresa = ZEmpresa::atualizar($empresa);
		Thunder::success('Ámpresa "'.$empresa->getFantasia().'" atualizada com sucesso!', true);
		redirect(WEB_ROOT . '/manage/empresa/');
	} catch (Exception $e) {
		Thunder::error($e->getMessage());
	}
}

include('manage_empresa_editar');