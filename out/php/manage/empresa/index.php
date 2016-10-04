<?php
require_once(dirname(dirname(__FILE__)) . '/ZEmpresa.class.php');

$empresas = ZEmpresa::getTodas();
include('manage_empresa_index.html');