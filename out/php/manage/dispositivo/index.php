<?php
require_once(dirname(dirname(__FILE__)) . '/ZDispositivo.class.php');

$devices = ZDispositivo::getTodos();
include('manage_dispositivo_index.html');