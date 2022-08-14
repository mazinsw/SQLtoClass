// Generated from /home/mazinsw/Development/SQLtoClass/src/parser/TemplateParser.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link TemplateParser#tableElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseIfStmt(TemplateParser.TableElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseIfStmt(TemplateParser.TableElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseExistsStmt(TemplateParser.TableElseExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseExistsStmt(TemplateParser.TableElseExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseEachStmt(TemplateParser.TableElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseEachStmt(TemplateParser.TableElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseEndStmt(TemplateParser.TableElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseEndStmt(TemplateParser.TableElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseStmt(TemplateParser.TableElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseStmt(TemplateParser.TableElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseCondEndStmt(TemplateParser.TableElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseCondEndStmt(TemplateParser.TableElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#tableElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void enterTableElseCondStmt(TemplateParser.TableElseCondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void exitTableElseCondStmt(TemplateParser.TableElseCondStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseIfStmt(TemplateParser.InheritedElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseIfStmt(TemplateParser.InheritedElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseExistsStmt(TemplateParser.InheritedElseExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseExistsStmt(TemplateParser.InheritedElseExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseEachStmt(TemplateParser.InheritedElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseEachStmt(TemplateParser.InheritedElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseEndStmt(TemplateParser.InheritedElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseEndStmt(TemplateParser.InheritedElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseStmt(TemplateParser.InheritedElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseStmt(TemplateParser.InheritedElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseCondEndStmt(TemplateParser.InheritedElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseCondEndStmt(TemplateParser.InheritedElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#inheritedElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void enterInheritedElseCondStmt(TemplateParser.InheritedElseCondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#inheritedElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void exitInheritedElseCondStmt(TemplateParser.InheritedElseCondStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseIfStmt(TemplateParser.ReferenceElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseIfStmt(TemplateParser.ReferenceElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseExistsStmt(TemplateParser.ReferenceElseExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseExistsStmt(TemplateParser.ReferenceElseExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseEachStmt(TemplateParser.ReferenceElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseEachStmt(TemplateParser.ReferenceElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseEndStmt(TemplateParser.ReferenceElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseEndStmt(TemplateParser.ReferenceElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseStmt(TemplateParser.ReferenceElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseStmt(TemplateParser.ReferenceElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseCondEndStmt(TemplateParser.ReferenceElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseCondEndStmt(TemplateParser.ReferenceElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#referenceElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void enterReferenceElseCondStmt(TemplateParser.ReferenceElseCondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#referenceElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void exitReferenceElseCondStmt(TemplateParser.ReferenceElseCondStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#fieldExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldExistsStmt(TemplateParser.FieldExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldExistsStmt(TemplateParser.FieldExistsStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseIfStmt(TemplateParser.FieldElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseIfStmt(TemplateParser.FieldElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseExistsStmt(TemplateParser.FieldElseExistsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseExistsStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseExistsStmt(TemplateParser.FieldElseExistsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseMatchStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseMatchStmt(TemplateParser.FieldElseMatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseMatchStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseMatchStmt(TemplateParser.FieldElseMatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseContainsStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseContainsStmt(TemplateParser.FieldElseContainsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseContainsStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseContainsStmt(TemplateParser.FieldElseContainsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseEachStmt(TemplateParser.FieldElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseEachStmt(TemplateParser.FieldElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseEndStmt(TemplateParser.FieldElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseEndStmt(TemplateParser.FieldElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseStmt(TemplateParser.FieldElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseStmt(TemplateParser.FieldElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseCondEndStmt(TemplateParser.FieldElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseCondEndStmt(TemplateParser.FieldElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldElseCondStmt(TemplateParser.FieldElseCondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldElseCondStmt(TemplateParser.FieldElseCondStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseIfStmt(TemplateParser.DescriptorElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseIfStmt(TemplateParser.DescriptorElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseMatchStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseMatchStmt(TemplateParser.DescriptorElseMatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseMatchStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseMatchStmt(TemplateParser.DescriptorElseMatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseContainsStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseContainsStmt(TemplateParser.DescriptorElseContainsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseContainsStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseContainsStmt(TemplateParser.DescriptorElseContainsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseEachStmt(TemplateParser.DescriptorElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseEachStmt(TemplateParser.DescriptorElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseEndStmt(TemplateParser.DescriptorElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseEndStmt(TemplateParser.DescriptorElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseStmt(TemplateParser.DescriptorElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseStmt(TemplateParser.DescriptorElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseCondEndStmt(TemplateParser.DescriptorElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseCondEndStmt(TemplateParser.DescriptorElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#descriptorElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescriptorElseCondStmt(TemplateParser.DescriptorElseCondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#descriptorElseCondStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescriptorElseCondStmt(TemplateParser.DescriptorElseCondStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexIfStmt(TemplateParser.IndexIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexIfStmt(TemplateParser.IndexIfStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#indexElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexElseIfStmt(TemplateParser.IndexElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexElseIfStmt(TemplateParser.IndexElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexElseEachStmt(TemplateParser.IndexElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexElseEachStmt(TemplateParser.IndexElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexElseEndStmt(TemplateParser.IndexElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexElseEndStmt(TemplateParser.IndexElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexElseStmt(TemplateParser.IndexElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexElseStmt(TemplateParser.IndexElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexElseCondEndStmt(TemplateParser.IndexElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexElseCondEndStmt(TemplateParser.IndexElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueIfStmt(TemplateParser.UniqueIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueIfStmt(TemplateParser.UniqueIfStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#uniqueElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueElseIfStmt(TemplateParser.UniqueElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueElseIfStmt(TemplateParser.UniqueElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueElseEachStmt(TemplateParser.UniqueElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueElseEachStmt(TemplateParser.UniqueElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueElseEndStmt(TemplateParser.UniqueElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueElseEndStmt(TemplateParser.UniqueElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueElseStmt(TemplateParser.UniqueElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueElseStmt(TemplateParser.UniqueElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#uniqueElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueElseCondEndStmt(TemplateParser.UniqueElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#uniqueElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueElseCondEndStmt(TemplateParser.UniqueElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryIfStmt(TemplateParser.PrimaryIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryIfStmt(TemplateParser.PrimaryIfStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#primaryElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryElseIfStmt(TemplateParser.PrimaryElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryElseIfStmt(TemplateParser.PrimaryElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryElseEachStmt(TemplateParser.PrimaryElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryElseEachStmt(TemplateParser.PrimaryElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryElseEndStmt(TemplateParser.PrimaryElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryElseEndStmt(TemplateParser.PrimaryElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryElseStmt(TemplateParser.PrimaryElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryElseStmt(TemplateParser.PrimaryElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#primaryElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryElseCondEndStmt(TemplateParser.PrimaryElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#primaryElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryElseCondEndStmt(TemplateParser.PrimaryElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintIfStmt(TemplateParser.ConstraintIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintIfStmt(TemplateParser.ConstraintIfStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#constraintElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElseIfStmt(TemplateParser.ConstraintElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElseIfStmt(TemplateParser.ConstraintElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElseEachStmt(TemplateParser.ConstraintElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElseEachStmt(TemplateParser.ConstraintElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElseEndStmt(TemplateParser.ConstraintElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElseEndStmt(TemplateParser.ConstraintElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElseStmt(TemplateParser.ConstraintElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElseStmt(TemplateParser.ConstraintElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintElseCondEndStmt(TemplateParser.ConstraintElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintElseCondEndStmt(TemplateParser.ConstraintElseCondEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignIfStmt(TemplateParser.ForeignIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignIfStmt(TemplateParser.ForeignIfStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#foreignElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignElseIfStmt(TemplateParser.ForeignElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignElseIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignElseIfStmt(TemplateParser.ForeignElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignElseEachStmt(TemplateParser.ForeignElseEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignElseEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignElseEachStmt(TemplateParser.ForeignElseEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignElseEndStmt(TemplateParser.ForeignElseEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignElseEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignElseEndStmt(TemplateParser.ForeignElseEndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignElseStmt(TemplateParser.ForeignElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignElseStmt(TemplateParser.ForeignElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#foreignElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignElseCondEndStmt(TemplateParser.ForeignElseCondEndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#foreignElseCondEndStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignElseCondEndStmt(TemplateParser.ForeignElseCondEndStmtContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(TemplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(TemplateParser.TextContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#tableCondition}.
	 * @param ctx the parse tree
	 */
	void enterTableCondition(TemplateParser.TableConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#tableCondition}.
	 * @param ctx the parse tree
	 */
	void exitTableCondition(TemplateParser.TableConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#fieldCondition}.
	 * @param ctx the parse tree
	 */
	void enterFieldCondition(TemplateParser.FieldConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#fieldCondition}.
	 * @param ctx the parse tree
	 */
	void exitFieldCondition(TemplateParser.FieldConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#indexCondition}.
	 * @param ctx the parse tree
	 */
	void enterIndexCondition(TemplateParser.IndexConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#indexCondition}.
	 * @param ctx the parse tree
	 */
	void exitIndexCondition(TemplateParser.IndexConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TemplateParser#constraintCondition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintCondition(TemplateParser.ConstraintConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#constraintCondition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintCondition(TemplateParser.ConstraintConditionContext ctx);
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
	 * Enter a parse tree produced by {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TemplateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TemplateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TemplateParser.ExpressionContext ctx);
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