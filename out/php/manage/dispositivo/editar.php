<?php
require_once(dirname(dirname(__FILE__)) . '/ZDispositivo.class.php');

$dispositivo = ZDispositivo::getPeloID($_GET['id']);
if(is_null($dispositivo->id) {
	Thunder::warning('O device de id "'.$_GET['id'].'" não existe!');
	redirect(WEB_ROOT . '/manage/dispositivo/');
}
$old_dispositivo = $dispositivo;
if ($_POST) {
	$dispositivo = new ZDispositivo($_POST);
	$dispositivo->setID($old_dispositivo->getID()());
	try {
		$dispositivo = ZDispositivo::atualizar($dispositivo);
		Thunder::success('Device "'.$dispositivo->getDescricao().'" atualizado com sucesso!', true);
		redirect(WEB_ROOT . '/manage/dispositivo/');
	} catch (Exception $e) {
		Thunder::error($e->getMessage());
	}
}

include('manage_dispositivo_editar');