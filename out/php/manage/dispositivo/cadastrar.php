<?php
require_once(dirname(dirname(__FILE__)) . '/ZDispositivo.class.php');

if ($_POST) {
	$dispositivo = new ZDispositivo($_POST);
	try {
		$dispositivo->setID(null);
		$dispositivo = ZDispositivo::cadastrar($dispositivo);
		Thunder::success('Device "'.$dispositivo->getDescricao().'" cadastrado com sucesso!', true);
		redirect(WEB_ROOT . '/manage/dispositivo/');
	} catch (Exception $e) {
		Thunder::error($e->getMessage());
	}
} else {
	$dispositivo = new ZDispositivo();
}
$empresas = ZEmpresa::getTodas();
include('manage_dispositivo_cadastrar');