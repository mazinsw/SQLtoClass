// Generated from /home/mazinsw/Development/SQLtoClass/src/parser/SQL.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SQLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SQLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SQLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SQLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void enterDropSchema(SQLParser.DropSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void exitDropSchema(SQLParser.DropSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(SQLParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(SQLParser.CreateSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateSpecification(SQLParser.CreateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateSpecification(SQLParser.CreateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void enterTableComment(SQLParser.TableCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void exitTableComment(SQLParser.TableCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(SQLParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(SQLParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setOption}.
	 * @param ctx the parse tree
	 */
	void enterSetOption(SQLParser.SetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setOption}.
	 * @param ctx the parse tree
	 */
	void exitSetOption(SQLParser.SetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultValue(SQLParser.SetDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultValue(SQLParser.SetDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseStmt(SQLParser.UseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseStmt(SQLParser.UseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropTableName}.
	 * @param ctx the parse tree
	 */
	void enterDropTableName(SQLParser.DropTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropTableName}.
	 * @param ctx the parse tree
	 */
	void exitDropTableName(SQLParser.DropTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(SQLParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(SQLParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldStmt(SQLParser.FieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldStmt(SQLParser.FieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyStmt(SQLParser.PrimaryKeyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyStmt(SQLParser.PrimaryKeyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexStmt(SQLParser.IndexStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexStmt(SQLParser.IndexStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUniqueStmt(SQLParser.UniqueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUniqueStmt(SQLParser.UniqueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterForeignStmt(SQLParser.ForeignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignStmt}
	 * labeled alternative in {@link SQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitForeignStmt(SQLParser.ForeignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(SQLParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(SQLParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constraintTable}.
	 * @param ctx the parse tree
	 */
	void enterConstraintTable(SQLParser.ConstraintTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraintTable}.
	 * @param ctx the parse tree
	 */
	void exitConstraintTable(SQLParser.ConstraintTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#autoIncrement}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrement(SQLParser.AutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#autoIncrement}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrement(SQLParser.AutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefaultValue(SQLParser.ColumnDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefaultValue(SQLParser.ColumnDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnNull}.
	 * @param ctx the parse tree
	 */
	void enterColumnNull(SQLParser.ColumnNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnNull}.
	 * @param ctx the parse tree
	 */
	void exitColumnNull(SQLParser.ColumnNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnNotNull}.
	 * @param ctx the parse tree
	 */
	void enterColumnNotNull(SQLParser.ColumnNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnNotNull}.
	 * @param ctx the parse tree
	 */
	void exitColumnNotNull(SQLParser.ColumnNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fieldComment}.
	 * @param ctx the parse tree
	 */
	void enterFieldComment(SQLParser.FieldCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fieldComment}.
	 * @param ctx the parse tree
	 */
	void exitFieldComment(SQLParser.FieldCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(SQLParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(SQLParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceDeleteOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDeleteOption(SQLParser.ReferenceDeleteOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceDeleteOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDeleteOption(SQLParser.ReferenceDeleteOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceUpdateOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceUpdateOption(SQLParser.ReferenceUpdateOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceUpdateOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceUpdateOption(SQLParser.ReferenceUpdateOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceTable}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTable(SQLParser.ReferenceTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceTable}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTable(SQLParser.ReferenceTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexColName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColName(SQLParser.IndexColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexColName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColName(SQLParser.IndexColNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBitStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeBitStmt(SQLParser.TypeBitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBitStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeBitStmt(SQLParser.TypeBitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTinyIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeTinyIntStmt(SQLParser.TypeTinyIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTinyIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeTinyIntStmt(SQLParser.TypeTinyIntStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSmallIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeSmallIntStmt(SQLParser.TypeSmallIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSmallIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeSmallIntStmt(SQLParser.TypeSmallIntStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMediumIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeMediumIntStmt(SQLParser.TypeMediumIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMediumIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeMediumIntStmt(SQLParser.TypeMediumIntStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeIntStmt(SQLParser.TypeIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeIntStmt(SQLParser.TypeIntStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeIntegerStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeIntegerStmt(SQLParser.TypeIntegerStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIntegerStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeIntegerStmt(SQLParser.TypeIntegerStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBigIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeBigIntStmt(SQLParser.TypeBigIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBigIntStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeBigIntStmt(SQLParser.TypeBigIntStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeRealStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeRealStmt(SQLParser.TypeRealStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeRealStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeRealStmt(SQLParser.TypeRealStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDoubleStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeDoubleStmt(SQLParser.TypeDoubleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDoubleStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeDoubleStmt(SQLParser.TypeDoubleStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeFloatStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloatStmt(SQLParser.TypeFloatStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeFloatStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloatStmt(SQLParser.TypeFloatStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDecimalStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecimalStmt(SQLParser.TypeDecimalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDecimalStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecimalStmt(SQLParser.TypeDecimalStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNumericStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeNumericStmt(SQLParser.TypeNumericStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNumericStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeNumericStmt(SQLParser.TypeNumericStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBooleanStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeBooleanStmt(SQLParser.TypeBooleanStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBooleanStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeBooleanStmt(SQLParser.TypeBooleanStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDateStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeDateStmt(SQLParser.TypeDateStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDateStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeDateStmt(SQLParser.TypeDateStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTimeStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeTimeStmt(SQLParser.TypeTimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTimeStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeTimeStmt(SQLParser.TypeTimeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTimeStampStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeTimeStampStmt(SQLParser.TypeTimeStampStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTimeStampStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeTimeStampStmt(SQLParser.TypeTimeStampStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDateTimeStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeDateTimeStmt(SQLParser.TypeDateTimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDateTimeStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeDateTimeStmt(SQLParser.TypeDateTimeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeYearStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeYearStmt(SQLParser.TypeYearStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeYearStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeYearStmt(SQLParser.TypeYearStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCharStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeCharStmt(SQLParser.TypeCharStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCharStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeCharStmt(SQLParser.TypeCharStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeVarCharStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarCharStmt(SQLParser.TypeVarCharStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeVarCharStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarCharStmt(SQLParser.TypeVarCharStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBinaryStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeBinaryStmt(SQLParser.TypeBinaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBinaryStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeBinaryStmt(SQLParser.TypeBinaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeVarBinaryStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarBinaryStmt(SQLParser.TypeVarBinaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeVarBinaryStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarBinaryStmt(SQLParser.TypeVarBinaryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTinyBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeTinyBlobStmt(SQLParser.TypeTinyBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTinyBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeTinyBlobStmt(SQLParser.TypeTinyBlobStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeBlobStmt(SQLParser.TypeBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeBlobStmt(SQLParser.TypeBlobStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMediumBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeMediumBlobStmt(SQLParser.TypeMediumBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMediumBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeMediumBlobStmt(SQLParser.TypeMediumBlobStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeLongBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeLongBlobStmt(SQLParser.TypeLongBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeLongBlobStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeLongBlobStmt(SQLParser.TypeLongBlobStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeJsonStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeJsonStmt(SQLParser.TypeJsonStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeJsonStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeJsonStmt(SQLParser.TypeJsonStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTinyTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeTinyTextStmt(SQLParser.TypeTinyTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTinyTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeTinyTextStmt(SQLParser.TypeTinyTextStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeTextStmt(SQLParser.TypeTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeTextStmt(SQLParser.TypeTextStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeMediumTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeMediumTextStmt(SQLParser.TypeMediumTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeMediumTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeMediumTextStmt(SQLParser.TypeMediumTextStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeLongTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeLongTextStmt(SQLParser.TypeLongTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeLongTextStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeLongTextStmt(SQLParser.TypeLongTextStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeEnumStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeEnumStmt(SQLParser.TypeEnumStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeEnumStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeEnumStmt(SQLParser.TypeEnumStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSetStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeSetStmt(SQLParser.TypeSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSetStmt}
	 * labeled alternative in {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeSetStmt(SQLParser.TypeSetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stringItem}.
	 * @param ctx the parse tree
	 */
	void enterStringItem(SQLParser.StringItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stringItem}.
	 * @param ctx the parse tree
	 */
	void exitStringItem(SQLParser.StringItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(SQLParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(SQLParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collateName}.
	 * @param ctx the parse tree
	 */
	void enterCollateName(SQLParser.CollateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collateName}.
	 * @param ctx the parse tree
	 */
	void exitCollateName(SQLParser.CollateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption(SQLParser.ReferenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption(SQLParser.ReferenceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SQLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SQLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(SQLParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(SQLParser.TableOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(SQLParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(SQLParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#idName}.
	 * @param ctx the parse tree
	 */
	void enterIdName(SQLParser.IdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#idName}.
	 * @param ctx the parse tree
	 */
	void exitIdName(SQLParser.IdNameContext ctx);
}