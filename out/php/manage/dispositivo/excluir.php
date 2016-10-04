<?php
require_once(dirname(dirname(__FILE__)) . '/ZDispositivo.class.php');

$id = $_GET['id'];
$dispositivo = ZDispositivo::getPeloID($id);
if(is_null($dispositivo->getID())) {
	Thunder::warning('O device de id "'.$id.'" não existe!');
	redirect(WEB_ROOT . '/manage/dispositivo/');
}
try {
	ZDispositivo::excluir($id);
	Thunder::success('Device "' . $dispositivo->getDescricao() . '" excluído com sucesso!', true);
} catch (Exception $e) {
	Thunder::error('Não foi possível excluir o device "' . $dispositivo->getDescricao() . '"!');
}

redirect('/manage/dispositivo/');