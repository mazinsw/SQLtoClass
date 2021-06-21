// Generated from SQLtoClass/src/parser/TemplateParser.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TemplateParser}.
 */
public interface TemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TemplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TemplateParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TemplateParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TemplateParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TemplateParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableIfStmt(TemplateParser.TableIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableIfStmt(TemplateParser.TableIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableExistsStmt(TemplateParser.TableExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableExistsStmt(TemplateParser.TableExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableEachStmt(TemplateParser.TableEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableEachStmt(TemplateParser.TableEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedIfStmt(TemplateParser.InheritedIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedIfStmt(TemplateParser.InheritedIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedExistsStmt(TemplateParser.InheritedExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedExistsStmt(TemplateParser.InheritedExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedEachStmt(TemplateParser.InheritedEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedEachStmt(TemplateParser.InheritedEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceIfStmt(TemplateParser.ReferenceIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceIfStmt(TemplateParser.ReferenceIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExistsStmt(TemplateParser.ReferenceExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExistsStmt(TemplateParser.ReferenceExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceEachStmt(TemplateParser.ReferenceEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceEachStmt(TemplateParser.ReferenceEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldIfStmt(TemplateParser.FieldIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldIfStmt(TemplateParser.FieldIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldEachStmt(TemplateParser.FieldEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldEachStmt(TemplateParser.FieldEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldMatchStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldMatchStmt(TemplateParser.FieldMatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldMatchStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldMatchStmt(TemplateParser.FieldMatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldContainsStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldContainsStmt(TemplateParser.FieldContainsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldContainsStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldContainsStmt(TemplateParser.FieldContainsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorIfStmt(TemplateParser.DescriptorIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorIfStmt(TemplateParser.DescriptorIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorEachStmt(TemplateParser.DescriptorEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorEachStmt(TemplateParser.DescriptorEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorMatchStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorMatchStmt(TemplateParser.DescriptorMatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorMatchStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorMatchStmt(TemplateParser.DescriptorMatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorContainsStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorContainsStmt(TemplateParser.DescriptorContainsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorContainsStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorContainsStmt(TemplateParser.DescriptorContainsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexEachStmt(TemplateParser.IndexEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexEachStmt(TemplateParser.IndexEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueEachStmt(TemplateParser.UniqueEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueEachStmt(TemplateParser.UniqueEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryEachStmt(TemplateParser.PrimaryEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryEachStmt(TemplateParser.PrimaryEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintEachStmt(TemplateParser.ConstraintEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintEachStmt(TemplateParser.ConstraintEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignEachStmt(TemplateParser.ForeignEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignEachStmt(TemplateParser.ForeignEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TemplateParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TemplateParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableStmt(TemplateParser.TableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableStmt(TemplateParser.TableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableProps}.
	 * @param ctx the parse tree
	 */
	void enterTableProps(TemplateParser.TablePropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableProps}.
	 * @param ctx the parse tree
	 */
	void exitTableProps(TemplateParser.TablePropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableProp}.
	 * @param ctx the parse tree
	 */
	void enterTableProp(TemplateParser.TablePropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableProp}.
	 * @param ctx the parse tree
	 */
	void exitTableProp(TemplateParser.TablePropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldStmt(TemplateParser.FieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldStmt(TemplateParser.FieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldProps}.
	 * @param ctx the parse tree
	 */
	void enterFieldProps(TemplateParser.FieldPropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldProps}.
	 * @param ctx the parse tree
	 */
	void exitFieldProps(TemplateParser.FieldPropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldProp}.
	 * @param ctx the parse tree
	 */
	void enterFieldProp(TemplateParser.FieldPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldProp}.
	 * @param ctx the parse tree
	 */
	void exitFieldProp(TemplateParser.FieldPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexNameStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexNameStmt(TemplateParser.IndexNameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexNameStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexNameStmt(TemplateParser.IndexNameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueNameStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueNameStmt(TemplateParser.UniqueNameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueNameStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueNameStmt(TemplateParser.UniqueNameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryNameStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNameStmt(TemplateParser.PrimaryNameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryNameStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNameStmt(TemplateParser.PrimaryNameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintNameStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintNameStmt(TemplateParser.ConstraintNameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintNameStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintNameStmt(TemplateParser.ConstraintNameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignNameStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignNameStmt(TemplateParser.ForeignNameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignNameStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignNameStmt(TemplateParser.ForeignNameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableLevel}.
	 * @param ctx the parse tree
	 */
	void enterTableLevel(TemplateParser.TableLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableLevel}.
	 * @param ctx the parse tree
	 */
	void exitTableLevel(TemplateParser.TableLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldLevel}.
	 * @param ctx the parse tree
	 */
	void enterFieldLevel(TemplateParser.FieldLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldLevel}.
	 * @param ctx the parse tree
	 */
	void exitFieldLevel(TemplateParser.FieldLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(TemplateParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(TemplateParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(TemplateParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(TemplateParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TemplateParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TemplateParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(TemplateParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(TemplateParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(TemplateParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(TemplateParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TemplateParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TemplateParser.TypeContext ctx);
}