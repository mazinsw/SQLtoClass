<?php
class Session
{
	private static $_instance = null;

	public static function Init()
	{
		self::$_instance = new Session();
		session_start();
	}

	public static function Set($name, $v) 
	{
		$_SESSION[$name] = $v;
	}

	public static function Get($name, $once=false)
	{
		$v = null;
		if ( isset($_SESSION[$name]) )
		{
			$v = $_SESSION[$name];
			if ( $once ) unset( $_SESSION[$name] );
		}
		return $v;
	}
}
