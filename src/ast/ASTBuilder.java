package ast;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.SQLBaseListener;
import parser.SQLLexer;
import parser.SQLParser;
import parser.SQLParser.AutoIncrementContext;
import parser.SQLParser.CharsetNameContext;
import parser.SQLParser.CollateNameContext;
import parser.SQLParser.ColumnDefaultValueContext;
import parser.SQLParser.ColumnNameContext;
import parser.SQLParser.ConstraintNameContext;
import parser.SQLParser.ConstraintTableContext;
import parser.SQLParser.CreateSchemaContext;
import parser.SQLParser.CreateTableContext;
import parser.SQLParser.DefaultNotNullContext;
import parser.SQLParser.DefaultNullContext;
import parser.SQLParser.DefaultValueContext;
import parser.SQLParser.DropSchemaContext;
import parser.SQLParser.DropTableNameContext;
import parser.SQLParser.FieldCommentContext;
import parser.SQLParser.FieldStmtContext;
import parser.SQLParser.ForeignStmtContext;
import parser.SQLParser.IdNameContext;
import parser.SQLParser.IndexColNameContext;
import parser.SQLParser.IndexStmtContext;
import parser.SQLParser.PrimaryKeyStmtContext;
import parser.SQLParser.ReferenceDefinitionContext;
import parser.SQLParser.ReferenceDeleteOptionContext;
import parser.SQLParser.ReferenceTableContext;
import parser.SQLParser.ReferenceUpdateOptionContext;
import parser.SQLParser.SetDefaultValueContext;
import parser.SQLParser.StringItemContext;
import parser.SQLParser.TableCommentContext;
import parser.SQLParser.TableNameContext;
import parser.SQLParser.TypeBigIntStmtContext;
import parser.SQLParser.TypeBlobStmtContext;
import parser.SQLParser.TypeCharStmtContext;
import parser.SQLParser.TypeDateStmtContext;
import parser.SQLParser.TypeDateTimeStmtContext;
import parser.SQLParser.TypeDecimalStmtContext;
import parser.SQLParser.TypeDoubleStmtContext;
import parser.SQLParser.TypeEnumStmtContext;
import parser.SQLParser.TypeFloatStmtContext;
import parser.SQLParser.TypeIntStmtContext;
import parser.SQLParser.TypeIntegerStmtContext;
import parser.SQLParser.TypeLongBlobStmtContext;
import parser.SQLParser.TypeLongTextStmtContext;
import parser.SQLParser.TypeMediumBlobStmtContext;
import parser.SQLParser.TypeMediumTextStmtContext;
import parser.SQLParser.TypeNumericStmtContext;
import parser.SQLParser.TypeTextStmtContext;
import parser.SQLParser.TypeTimeStmtContext;
import parser.SQLParser.TypeTinyBlobStmtContext;
import parser.SQLParser.TypeTinyIntStmtContext;
import parser.SQLParser.TypeTinyTextStmtContext;
import parser.SQLParser.TypeVarCharStmtContext;
import parser.SQLParser.UniqueStmtContext;
import parser.SQLParser.UseStmtContext;
import util.ParseComment;

public class ASTBuilder extends SQLBaseListener {
	private Stack<Node> stack;
	private ScriptNode script;
	private List<String> errors;

	public ASTBuilder() {
		script = new ScriptNode();
		errors = new ArrayList<>();
		stack = new Stack<>();
	}

	public boolean build(String fileName) {
		CharStream input;
		InputStreamReader fr;
		try {
			fr = new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8);
			input = CharStreams.fromReader(fr);
		} catch (IOException e) {
			errors.add("can't load SQL source file");
			return false;
		}
		ListErrorListener errorListener = new ListErrorListener();
		SQLLexer lexer = new SQLLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(errorListener);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		errors.addAll(errorListener.getNotificationList());
		if (errors.size() > 0)
			return false;
		SQLParser parser = new SQLParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListener);
		ParseTree tree = parser.script();
		errors.addAll(errorListener.getNotificationList());
		if (errors.size() > 0)
			return false;
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, tree);
		return true;
	}

	@Override
	public void enterCreateTable(CreateTableContext ctx) {
		super.enterCreateTable(ctx);
		Table table = new Table("[Undefined]");
		stack.push(table);
	}

	@Override
	public void exitTableName(TableNameContext ctx) {
		super.exitTableName(ctx);
		NamedNode node = (NamedNode) stack.pop(); // pop Name
		Table table = (Table) stack.peek();
		table.setName(node.getName());
	}

	@Override
	public void exitCreateTable(CreateTableContext ctx) {
		super.exitCreateTable(ctx);
		script.addStatement(stack.pop());
	}

	@Override
	public void enterFieldStmt(FieldStmtContext ctx) {
		super.enterFieldStmt(ctx);
		Field field = new Field("");
		Table table = (Table) stack.peek();
		table.addField(field);
		stack.push(field);
	}

	@Override
	public void exitColumnName(ColumnNameContext ctx) {
		super.exitColumnName(ctx);
		NamedNode node = (NamedNode) stack.pop(); // pop Name
		Field field = (Field) stack.peek();
		field.setName(node.getName());
	}

	@Override
	public void enterTypeIntegerStmt(TypeIntegerStmtContext ctx) {
		super.enterTypeIntegerStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.INTEGER);
		field.setType(type);
	}

	@Override
	public void enterTypeIntStmt(TypeIntStmtContext ctx) {
		super.enterTypeIntStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.INTEGER);
		field.setType(type);
	}

	@Override
	public void enterTypeDoubleStmt(TypeDoubleStmtContext ctx) {
		super.enterTypeDoubleStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.DOUBLE);
		field.setType(type);
	}
	
	@Override
	public void enterTypeMediumBlobStmt(TypeMediumBlobStmtContext ctx) {
		super.enterTypeMediumBlobStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.BLOB);
		field.setType(type);
	}
	
	@Override
	public void enterTypeBlobStmt(TypeBlobStmtContext ctx) {
		super.enterTypeBlobStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.BLOB);
		field.setType(type);
	}
	
	@Override
	public void enterTypeLongBlobStmt(TypeLongBlobStmtContext ctx) {
		super.enterTypeLongBlobStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.BLOB);
		field.setType(type);
	}
	
	@Override
	public void enterTypeTinyBlobStmt(TypeTinyBlobStmtContext ctx) {
		super.enterTypeTinyBlobStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.BLOB);
		field.setType(type);
	}

	@Override
	public void enterTypeFloatStmt(TypeFloatStmtContext ctx) {
		super.enterTypeFloatStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.FLOAT);
		field.setType(type);
	}

	@Override
	public void enterTypeDecimalStmt(TypeDecimalStmtContext ctx) {
		super.enterTypeDecimalStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.DECIMAL);
		field.setType(type);
	}
	
	@Override
	public void enterTypeNumericStmt(TypeNumericStmtContext ctx) {
		super.enterTypeNumericStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.DECIMAL);
		field.setType(type);
	}

	@Override
	public void enterTypeDateTimeStmt(TypeDateTimeStmtContext ctx) {
		super.enterTypeDateTimeStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.DATETIME);
		field.setType(type);
	}

	@Override
	public void enterTypeDateStmt(TypeDateStmtContext ctx) {
		super.enterTypeDateStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.DATE);
		field.setType(type);
	}
	
	@Override
	public void enterTypeTimeStmt(TypeTimeStmtContext ctx) {
		super.enterTypeTimeStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.TIME);
		field.setType(type);
	}
	
	@Override
	public void enterTypeVarCharStmt(TypeVarCharStmtContext ctx) {
		super.enterTypeVarCharStmt(ctx);
		Field field = (Field) stack.peek();
		StringType type = new StringType(DataType.STRING);
		type.setLength(Long.valueOf(ctx.INT().getText()));
		field.setType(type);
	}

	@Override
	public void enterTypeBigIntStmt(TypeBigIntStmtContext ctx) {
		super.enterTypeBigIntStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.BIGINT);
		field.setType(type);
	}

	@Override
	public void enterTypeTinyIntStmt(TypeTinyIntStmtContext ctx) {
		super.enterTypeTinyIntStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.TINYINT);
		field.setType(type);
	}

	@Override
	public void enterTypeTextStmt(TypeTextStmtContext ctx) {
		super.enterTypeTextStmt(ctx);
		Field field = (Field) stack.peek();
		StringType type = new StringType(DataType.TEXT);
		type.setLength(65535);
		field.setType(type);
	}
	
	@Override
	public void enterTypeLongTextStmt(TypeLongTextStmtContext ctx) {
		super.enterTypeLongTextStmt(ctx);
		Field field = (Field) stack.peek();
		StringType type = new StringType(DataType.TEXT);
		type.setLength(4294967295L);
		field.setType(type);
	}
	
	@Override
	public void enterTypeMediumTextStmt(TypeMediumTextStmtContext ctx) {
		super.enterTypeMediumTextStmt(ctx);
		Field field = (Field) stack.peek();
		StringType type = new StringType(DataType.TEXT);
		type.setLength(16777215);
		field.setType(type);
	}
	
	@Override
	public void enterTypeTinyTextStmt(TypeTinyTextStmtContext ctx) {
		super.enterTypeTinyTextStmt(ctx);
		Field field = (Field) stack.peek();
		StringType type = new StringType(DataType.TEXT);
		type.setLength(255);
		field.setType(type);
	}

	@Override
	public void enterTypeCharStmt(TypeCharStmtContext ctx) {
		super.enterTypeCharStmt(ctx);
		Field field = (Field) stack.peek();
		DataType type = new DataType(DataType.CHAR);
		field.setType(type);
	}

	@Override
	public void enterTypeEnumStmt(TypeEnumStmtContext ctx) {
		super.enterTypeEnumStmt(ctx);
		Field field = (Field) stack.peek();
		EnumType type = new EnumType(DataType.ENUM);
		field.setType(type);
	}

	@Override
	public void enterDefaultNotNull(DefaultNotNullContext ctx) {
		super.enterDefaultNotNull(ctx);
		Field field = (Field) stack.peek();
		field.setNotNull(true);
	}

	@Override
	public void enterDefaultNull(DefaultNullContext ctx) {
		super.enterDefaultNull(ctx);
		Field field = (Field) stack.peek();
		field.setNotNull(false);
	}

	@Override
	public void enterDefaultValue(DefaultValueContext ctx) {
		super.enterDefaultValue(ctx);
		Value value = null;
		if (ctx.STRING() != null)
			value = new StringValue(ctx.STRING().getText());
		else if (ctx.INT() != null)
			value = new IntegerValue(ctx.INT().getText());
		else if (ctx.FLOAT() != null)
			value = new FloatValue(ctx.FLOAT().getText());
		stack.push(value);
	}
	
	@Override
	public void exitColumnDefaultValue(ColumnDefaultValueContext ctx) {
		super.exitColumnDefaultValue(ctx);
		Value value = (Value)stack.pop();
		Field field = (Field) stack.peek();
		field.setValue(value);
	}
	
	@Override
	public void exitSetDefaultValue(SetDefaultValueContext ctx) {
		super.exitSetDefaultValue(ctx);
		stack.pop();
	}

	@Override
	public void exitStringItem(StringItemContext ctx) {
		super.exitStringItem(ctx);
		Field field = (Field) stack.peek();
		EnumType type = (EnumType) field.getType();
		String elem = ctx.STRING().getText();
		elem = elem.substring(1, elem.length() - 1);
		type.addElement(elem);
	}

	@Override
	public void exitFieldStmt(FieldStmtContext ctx) {
		super.exitFieldStmt(ctx);
		stack.pop();
	}

	@Override
	public void enterPrimaryKeyStmt(PrimaryKeyStmtContext ctx) {
		super.enterPrimaryKeyStmt(ctx);
		PrimaryKey pk = new PrimaryKey();
		pk.setName("PRIMARY");
		Table table = (Table) stack.peek();
		table.addConstraint(pk);
		stack.push(pk);
	}

	@Override
	public void exitPrimaryKeyStmt(PrimaryKeyStmtContext ctx) {
		super.exitPrimaryKeyStmt(ctx);
		stack.pop();
	}

	@Override
	public void enterIndexStmt(IndexStmtContext ctx) {
		super.enterIndexStmt(ctx);
		Index index = new Index();
		Table table = (Table) stack.peek();
		table.addIndex(index);
		stack.push(index);
	}
	
	@Override
	public void enterAutoIncrement(AutoIncrementContext ctx) {
		super.enterAutoIncrement(ctx);
		Field field = (Field) stack.peek();
		field.setAutoIncrement(true);
	}
	
	@Override
	public void enterFieldComment(FieldCommentContext ctx) {
		super.enterFieldComment(ctx);
		Field field = (Field) stack.peek();
		field.setComment(ParseComment.parse(ctx.STRING().getText()));
	}

	@Override
	public void exitIndexStmt(IndexStmtContext ctx) {
		super.exitIndexStmt(ctx);
		stack.pop();
	}

	@Override
	public void enterUniqueStmt(UniqueStmtContext ctx) {
		super.enterUniqueStmt(ctx);
		UniqueKey uk = new UniqueKey();
		Table table = (Table) stack.peek();
		table.addConstraint(uk);
		stack.push(uk);
	}

	@Override
	public void exitUniqueStmt(UniqueStmtContext ctx) {
		super.exitUniqueStmt(ctx);
		stack.pop();
	}

	@Override
	public void enterForeignStmt(ForeignStmtContext ctx) {
		super.enterForeignStmt(ctx);
		ForeignKey fk = new ForeignKey("[Unknow]");
		Table table = (Table) stack.peek();
		table.addConstraint(fk);
		stack.push(fk);
	}

	@Override
	public void exitForeignStmt(ForeignStmtContext ctx) {
		super.exitForeignStmt(ctx);
		stack.pop();
	}

	@Override
	public void enterReferenceDefinition(ReferenceDefinitionContext ctx) {
		super.enterReferenceDefinition(ctx);
		ForeignKey fk = (ForeignKey) stack.peek();
		stack.push(fk.getReferences());
	}

	@Override
	public void exitReferenceDefinition(ReferenceDefinitionContext ctx) {
		super.exitReferenceDefinition(ctx);
		stack.pop();
	}
	
	@Override
	public void enterReferenceUpdateOption(ReferenceUpdateOptionContext ctx) {
		super.enterReferenceUpdateOption(ctx);
		Index index = (Index) stack.pop();
		ForeignKey fk = (ForeignKey) stack.peek();
		fk.setUpdateAction(ctx.getText());
		stack.push(index);
	}
	
	@Override
	public void enterReferenceDeleteOption(ReferenceDeleteOptionContext ctx) {
		super.enterReferenceDeleteOption(ctx);
		Index index = (Index) stack.pop();
		ForeignKey fk = (ForeignKey) stack.peek();
		fk.setDeleteAction(ctx.getText());
		stack.push(index);
	}

	@Override
	public void exitCreateSchema(CreateSchemaContext ctx) {
		super.exitCreateSchema(ctx);
		discard(stack.pop()); // pop Name
	}
	
	@Override
	public void enterTableComment(TableCommentContext ctx) {
		super.enterTableComment(ctx);
		Table table = (Table) stack.peek();
		table.setComment(ParseComment.parse(ctx.STRING().getText()));
	}

	@Override
	public void exitUseStmt(UseStmtContext ctx) {
		super.exitUseStmt(ctx);
		discard(stack.pop()); // pop Name
	}
	
	@Override
	public void exitDropSchema(DropSchemaContext ctx) {
		super.exitDropSchema(ctx);
		discard(stack.pop()); // pop Name
	}

	@Override
	public void exitDropTableName(DropTableNameContext ctx) {
		super.exitDropTableName(ctx);
		discard(stack.pop()); // pop Name
	}

	@Override
	public void exitCharsetName(CharsetNameContext ctx) {
		super.exitCharsetName(ctx);
		discard(stack.pop()); // pop Name
	}

	@Override
	public void exitCollateName(CollateNameContext ctx) {
		super.exitCollateName(ctx);
		discard(stack.pop()); // pop Name
	}

	@Override
	public void exitConstraintName(ConstraintNameContext ctx) {
		super.exitConstraintName(ctx);
		NamedNode namedNode = (NamedNode) stack.pop();
		Index index = (Index) stack.peek();
		index.setName(namedNode.getName());
	}

	@Override
	public void exitConstraintTable(ConstraintTableContext ctx) {
		super.exitConstraintTable(ctx);
		NamedNode namedNode = (NamedNode) stack.pop();
		Index index = (Index) stack.peek();
		index.setName(namedNode.getName());
	}

	@Override
	public void exitIndexColName(IndexColNameContext ctx) {
		super.exitIndexColName(ctx);
		NamedNode namedNode = (NamedNode) stack.pop();
		Index index = (Index) stack.peek();
		int type = OrderField.ASCENDENT;
		if (ctx.Type != null && ctx.Type.getText().equals("DESC"))
			type = OrderField.DESCENDENT;
		index.addField(new OrderField(namedNode.getName(), type));
	}

	@Override
	public void exitReferenceTable(ReferenceTableContext ctx) {
		super.exitReferenceTable(ctx);
		NamedNode namedNode = (NamedNode) stack.pop();
		Index index = (Index) stack.pop();
		ForeignKey fk = (ForeignKey) stack.peek();
		fk.setTableName(namedNode.getName());
		stack.push(index);
	}

	private void discard(Node node) {
//		System.out.print("Discarding: " + node.getClass().getName());
//		if (node instanceof NamedNode)
//			System.out.println(" = " + ((NamedNode) node).getName());
//		else
//			System.out.println();
	}

	@Override
	public void enterIdName(IdNameContext ctx) {
		super.enterIdName(ctx);
		stack.push(new NamedNode(ctx.NAME().getText()));
	}

	public ScriptNode getScript() {
		return script;
	}

	public List<String> getErrors() {
		return errors;
	}
}
