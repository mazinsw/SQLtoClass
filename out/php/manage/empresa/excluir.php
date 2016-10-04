<?php
require_once(dirname(dirname(__FILE__)) . '/ZEmpresa.class.php');

$id = $_GET['id'];
$empresa = ZEmpresa::getPeloID($id);
if(is_null($empresa->getID())) {
	Thunder::warning('A ámpresa de id "'.$id.'" não existe!');
	redirect(WEB_ROOT . '/manage/empresa/');
}
try {
	ZEmpresa::excluir($id);
	Thunder::success('Ámpresa "' . $empresa->getFantasia() . '" excluída com sucesso!', true);
} catch (Exception $e) {
	Thunder::error('Não foi possível excluir a ámpresa "' . $empresa->getFantasia() . '"!');
}

redirect('/manage/empresa/');