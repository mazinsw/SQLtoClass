<?php
include_once (dirname(__FILE__) . '/FluentPDO/FluentPDO.php');

class DB
{
	private static $mInstance = null;
	public static $pdo = null;

	protected static $transactionCounter = 0;

	function __construct() {
		global $INI; // crie uma variável global com as informações da conexão
		
		$config = $INI;
		$host = (string) $config['db']['host'];
		$user = (string) $config['db']['user'];
		$pass = (string) $config['db']['pass'];
		$name = (string) $config['db']['name'];
		$_pdo = new PDO("mysql:dbname={$name};host={$host};charset=utf8", $user, $pass);
		$_pdo->setAttribute(PDO::ATTR_CASE, PDO::CASE_LOWER);
		$_pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
		self::$pdo = new FluentPDO($_pdo);
	}

	function __destruct() {
		self::Close();
	}

	public static function BeginTransaction() {
		self::$transactionCounter++;
		if(self::$transactionCounter == 1)
			return self::$pdo->getPdo()->beginTransaction();
		return self::$transactionCounter == 1;
	}

	public static function Commit() {
		if(self::$transactionCounter <= 0)
			throw new Exception('No transaction active');
		self::$transactionCounter--;
		if(self::$transactionCounter == 0)
			return self::$pdo->getPdo()->commit();
		return self::$transactionCounter == 0;
	}

	public static function RollBack() {
		if(self::$transactionCounter <= 0)
			throw new Exception('No transaction active');
		self::$transactionCounter--;
		if(self::$transactionCounter == 0)
			return self::$pdo->getPdo()->rollBack();
		return self::$transactionCounter == 0;
	}

	public static function &Instance() {
		if (self::$mInstance == null)
			self::$mInstance = new self();
		return self::$mInstance;
	}

	public static function Close() {
		self::$pdo = null;
		self::$mInstance = null;
	}
}
