package ast;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ListErrorListener extends BaseErrorListener {
	private List<String> errorList;
	
	public ListErrorListener() {
		super();
		errorList = new ArrayList<>();
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		errorList.add(line + ":" + charPositionInLine + ": " + msg);
	}	
	
	public List<String> getNotificationList() {
		return errorList;
	}
}
