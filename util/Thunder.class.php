<?php
/**
 * @author: mazin@gmail.com
 */
class Thunder {
	private static $refCount = 0;
	private static $idRefMap = array();
	
	private static function ShowMessage($type, $msg, $auto_close, $execute) {
		if(self::$refCount == 0) {
			echo '<link rel="stylesheet" type="text/css" href="/static/css/jquery.thunder.css" />'."\r\n";
			echo '<script src="/static/js/jquery.thunder.js"></script>'."\r\n";
			self::$refCount++;
		}
		$div_id = '';
		if(isset(self::$idRefMap[$type]) && self::$idRefMap[$type] > 0)
			$div_id = '_'.self::$idRefMap[$type];
		else
			self::$idRefMap[$type] = 0;
		echo '<div id="thunder-'.$type.$div_id.'" class="thunder-notify"></div>'."\r\n";
		if(!$execute)
			return;
		echo '<script type="text/javascript">$(function () { $("#thunder-'.$type.$div_id.'").message("'.$type.'", "'.$msg.'"';
		if($auto_close)
			echo ', { autoClose: { enable: true } }';
		echo ');});</script>'."\r\n";
		self::$idRefMap[$type]++;
	}
	
	private static function message($type, $msg, $auto_close) {
		$messages = array();
		if(Session::Get('thunder') != null)
			$messages = unserialize(Session::Get('thunder', true));
		$msg = str_replace('\\', '\\\\', $msg);
		$msg = str_replace('"', '\"', $msg);
		$messages[] = array('type' => $type, 'data' => array('message' => $msg, 'auto_close' => $auto_close));
		Session::Set('thunder', serialize($messages));
	}
	
	public static function warning($msg, $auto_close = false) {
		self::message('attention', $msg, $auto_close);
	}
	
	public static function success($msg, $auto_close = false) {
		self::message('success', $msg, $auto_close);
	}
	
	public static function error($msg, $auto_close = false) {
		self::message('error', $msg, $auto_close);
	}
	
	public static function information($msg, $auto_close = false) {
		self::message('information', $msg, $auto_close);
	}

	public static function Execute() {
		$messages = array();
		if(Session::Get('thunder') != null)
			$messages = unserialize(Session::Get('thunder', true));
		foreach($messages as $type => $value) {
			self::ShowMessage($value['type'], $value['data']['message'], $value['data']['auto_close'], true);
		}
		if(count($messages) == 0)
			self::ShowMessage('information', null, false, false);
		self::$refCount = 0;
		self::$idRefMap = array();
	}
}
