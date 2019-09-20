<?php
require_once(dirname(dirname(__FILE__)) . '/$[class.file]');

$$[table.unix] = $[class]::$[class.get]($_GET['$[table.pk]']);
if(is_null($$[table.unix]->$[table.pk]) {
	Thunder::warning('$[Table.gender] $[table.name] de $[table.pk] "'.$_GET['$[table.pk]'].'" não existe!');
	redirect(WEB_ROOT . '/manage/$[table.unix]/');
}
$old_$[table.unix] = $$[table.unix];
if ($_POST) {
	$$[table.unix] = new $[class]($_POST);
	$$[table.unix]->$[table.pk.set]$old_$[table.unix]->$[table.pk.get]());
	try {
		$$[table.unix] = $[class]::atualizar($$[table.unix]);
		Thunder::success('$[Table.name] "'.$$[table.unix]->$[table.desc.get].'" atualizad$[table.gender] com sucesso!', true);
		redirect(WEB_ROOT . '/manage/$[table.unix]/');
	} catch (Exception $e) {
		Thunder::error($e->getMessage());
	}
}

include('manage_$[table.unix]_editar');