<?php
require_once(dirname(dirname(__FILE__)) . '/$[class.file]');

$$[table.pk.unix] = $_GET['$[table.pk]'];
$$[table.unix] = $[class]::$[class.get]($$[table.pk.unix]);
if(is_null($$[table.unix]->$[table.pk.get])) {
	Thunder::warning('$[Table.gender] $[table.name] de $[table.pk] "'.$$[table.pk.unix].'" não existe!');
	redirect(WEB_ROOT . '/manage/$[table.unix]/');
}
try {
	$[class]::excluir($$[table.pk.unix]);
	Thunder::success('$[Table.name] "' . $$[table.unix]->$[table.desc.get] . '" excluíd$[table.gender] com sucesso!', true);
} catch (Exception $e) {
	Thunder::error('Não foi possível excluir $[table.gender] $[table.name] "' . $$[table.unix]->$[table.desc.get] . '"!');
}

redirect('/manage/$[table.unix]/');