package util;

public class ParseComment {

	public static String parse(String comment) {
		return comment.substring(1, comment.length() - 1);
	}

}
