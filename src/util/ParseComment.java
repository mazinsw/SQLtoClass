package util;

import java.nio.charset.StandardCharsets;

public class ParseComment {

	public static String parse(String comment) {
		String content = comment.substring(1, comment.length() - 1);
		byte ptext[] = content.getBytes(StandardCharsets.ISO_8859_1); 
		String value = new String(ptext, StandardCharsets.UTF_8);
		return value;
	}

}
