<?php
require_once(dirname(dirname(__FILE__)) . '/$[class.file]');

if ($_POST) {
	$$[table.unix] = new $[class]($_POST);
	try {
		$$[table.unix]->$[table.pk.set](null);
		$$[table.unix] = $[class]::cadastrar($$[table.unix]);
		Thunder::success('$[Table.name] "'.$$[table.unix]->$[table.desc.get]().'" cadastrad$[table.gender] com sucesso!', true);
		redirect(WEB_ROOT . '/manage/$[table.unix]/');
	} catch (Exception $e) {
		Thunder::error($e->getMessage());
	}
} else {
	$$[table.unix] = new $[class]();
}
$[field.each(reference)]
$$[reference.unix.plural] = $[reference.class]::$[reference.class.get.all]();
$[field.end]
include('manage_$[table.unix]_cadastrar');