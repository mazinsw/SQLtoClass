// Generated from D:\Projetos\SQLtoClass\src\parser\SQL.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#typeTinyBlobStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeTinyBlobStmt(@NotNull SQLParser.TypeTinyBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeTinyBlobStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeTinyBlobStmt(@NotNull SQLParser.TypeTinyBlobStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(@NotNull SQLParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(@NotNull SQLParser.CharsetNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#indexStmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexStmt(@NotNull SQLParser.IndexStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexStmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexStmt(@NotNull SQLParser.IndexStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(@NotNull SQLParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(@NotNull SQLParser.ReferenceDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#idName}.
	 * @param ctx the parse tree
	 */
	void enterIdName(@NotNull SQLParser.IdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#idName}.
	 * @param ctx the parse tree
	 */
	void exitIdName(@NotNull SQLParser.IdNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#stringItem}.
	 * @param ctx the parse tree
	 */
	void enterStringItem(@NotNull SQLParser.StringItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stringItem}.
	 * @param ctx the parse tree
	 */
	void exitStringItem(@NotNull SQLParser.StringItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeLongTextStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeLongTextStmt(@NotNull SQLParser.TypeLongTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeLongTextStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeLongTextStmt(@NotNull SQLParser.TypeLongTextStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeNumericStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeNumericStmt(@NotNull SQLParser.TypeNumericStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeNumericStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeNumericStmt(@NotNull SQLParser.TypeNumericStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#uniqueStmt}.
	 * @param ctx the parse tree
	 */
	void enterUniqueStmt(@NotNull SQLParser.UniqueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#uniqueStmt}.
	 * @param ctx the parse tree
	 */
	void exitUniqueStmt(@NotNull SQLParser.UniqueStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchema(@NotNull SQLParser.CreateSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSchema}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchema(@NotNull SQLParser.CreateSchemaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeMediumTextStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeMediumTextStmt(@NotNull SQLParser.TypeMediumTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeMediumTextStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeMediumTextStmt(@NotNull SQLParser.TypeMediumTextStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#defaultNotNull}.
	 * @param ctx the parse tree
	 */
	void enterDefaultNotNull(@NotNull SQLParser.DefaultNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defaultNotNull}.
	 * @param ctx the parse tree
	 */
	void exitDefaultNotNull(@NotNull SQLParser.DefaultNotNullContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeRealStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeRealStmt(@NotNull SQLParser.TypeRealStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeRealStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeRealStmt(@NotNull SQLParser.TypeRealStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeIntStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeIntStmt(@NotNull SQLParser.TypeIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeIntStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeIntStmt(@NotNull SQLParser.TypeIntStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeBitStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeBitStmt(@NotNull SQLParser.TypeBitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeBitStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeBitStmt(@NotNull SQLParser.TypeBitStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeMediumIntStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeMediumIntStmt(@NotNull SQLParser.TypeMediumIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeMediumIntStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeMediumIntStmt(@NotNull SQLParser.TypeMediumIntStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void enterTableComment(@NotNull SQLParser.TableCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void exitTableComment(@NotNull SQLParser.TableCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#setOption}.
	 * @param ctx the parse tree
	 */
	void enterSetOption(@NotNull SQLParser.SetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setOption}.
	 * @param ctx the parse tree
	 */
	void exitSetOption(@NotNull SQLParser.SetOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeLongBlobStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeLongBlobStmt(@NotNull SQLParser.TypeLongBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeLongBlobStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeLongBlobStmt(@NotNull SQLParser.TypeLongBlobStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull SQLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull SQLParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(@NotNull SQLParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(@NotNull SQLParser.OptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(@NotNull SQLParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(@NotNull SQLParser.ConstraintNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#setDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterSetDefaultValue(@NotNull SQLParser.SetDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitSetDefaultValue(@NotNull SQLParser.SetDefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeIntegerStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeIntegerStmt(@NotNull SQLParser.TypeIntegerStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeIntegerStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeIntegerStmt(@NotNull SQLParser.TypeIntegerStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeTextStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeTextStmt(@NotNull SQLParser.TypeTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeTextStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeTextStmt(@NotNull SQLParser.TypeTextStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeYearStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeYearStmt(@NotNull SQLParser.TypeYearStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeYearStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeYearStmt(@NotNull SQLParser.TypeYearStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#foreignStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeignStmt(@NotNull SQLParser.ForeignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreignStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeignStmt(@NotNull SQLParser.ForeignStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeFloatStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeFloatStmt(@NotNull SQLParser.TypeFloatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeFloatStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeFloatStmt(@NotNull SQLParser.TypeFloatStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull SQLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull SQLParser.ScriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeCharStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeCharStmt(@NotNull SQLParser.TypeCharStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeCharStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeCharStmt(@NotNull SQLParser.TypeCharStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeTimeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeTimeStmt(@NotNull SQLParser.TypeTimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeTimeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeTimeStmt(@NotNull SQLParser.TypeTimeStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(@NotNull SQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(@NotNull SQLParser.DropTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeDateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeDateStmt(@NotNull SQLParser.TypeDateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeDateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeDateStmt(@NotNull SQLParser.TypeDateStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeVarCharStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarCharStmt(@NotNull SQLParser.TypeVarCharStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeVarCharStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarCharStmt(@NotNull SQLParser.TypeVarCharStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(@NotNull SQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(@NotNull SQLParser.ColumnDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeTimeStampStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeTimeStampStmt(@NotNull SQLParser.TypeTimeStampStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeTimeStampStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeTimeStampStmt(@NotNull SQLParser.TypeTimeStampStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeBinaryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeBinaryStmt(@NotNull SQLParser.TypeBinaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeBinaryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeBinaryStmt(@NotNull SQLParser.TypeBinaryStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeBigIntStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeBigIntStmt(@NotNull SQLParser.TypeBigIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeBigIntStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeBigIntStmt(@NotNull SQLParser.TypeBigIntStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeTinyTextStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeTinyTextStmt(@NotNull SQLParser.TypeTinyTextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeTinyTextStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeTinyTextStmt(@NotNull SQLParser.TypeTinyTextStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#dropTableName}.
	 * @param ctx the parse tree
	 */
	void enterDropTableName(@NotNull SQLParser.DropTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropTableName}.
	 * @param ctx the parse tree
	 */
	void exitDropTableName(@NotNull SQLParser.DropTableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeEnumStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeEnumStmt(@NotNull SQLParser.TypeEnumStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeEnumStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeEnumStmt(@NotNull SQLParser.TypeEnumStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#primaryKeyStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyStmt(@NotNull SQLParser.PrimaryKeyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#primaryKeyStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyStmt(@NotNull SQLParser.PrimaryKeyStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void enterTableOptions(@NotNull SQLParser.TableOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableOptions}.
	 * @param ctx the parse tree
	 */
	void exitTableOptions(@NotNull SQLParser.TableOptionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(@NotNull SQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(@NotNull SQLParser.CreateTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeSetStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeSetStmt(@NotNull SQLParser.TypeSetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeSetStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeSetStmt(@NotNull SQLParser.TypeSetStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(@NotNull SQLParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(@NotNull SQLParser.SetStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(@NotNull SQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(@NotNull SQLParser.TableNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeTinyIntStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeTinyIntStmt(@NotNull SQLParser.TypeTinyIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeTinyIntStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeTinyIntStmt(@NotNull SQLParser.TypeTinyIntStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(@NotNull SQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(@NotNull SQLParser.ColumnNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#defaultNull}.
	 * @param ctx the parse tree
	 */
	void enterDefaultNull(@NotNull SQLParser.DefaultNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defaultNull}.
	 * @param ctx the parse tree
	 */
	void exitDefaultNull(@NotNull SQLParser.DefaultNullContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#createSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCreateSpecification(@NotNull SQLParser.CreateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCreateSpecification(@NotNull SQLParser.CreateSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeMediumBlobStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeMediumBlobStmt(@NotNull SQLParser.TypeMediumBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeMediumBlobStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeMediumBlobStmt(@NotNull SQLParser.TypeMediumBlobStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeSmallIntStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeSmallIntStmt(@NotNull SQLParser.TypeSmallIntStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeSmallIntStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeSmallIntStmt(@NotNull SQLParser.TypeSmallIntStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceTable}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTable(@NotNull SQLParser.ReferenceTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceTable}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTable(@NotNull SQLParser.ReferenceTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#constraintTable}.
	 * @param ctx the parse tree
	 */
	void enterConstraintTable(@NotNull SQLParser.ConstraintTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraintTable}.
	 * @param ctx the parse tree
	 */
	void exitConstraintTable(@NotNull SQLParser.ConstraintTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeDoubleStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeDoubleStmt(@NotNull SQLParser.TypeDoubleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeDoubleStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeDoubleStmt(@NotNull SQLParser.TypeDoubleStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterFieldStmt(@NotNull SQLParser.FieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitFieldStmt(@NotNull SQLParser.FieldStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#indexColName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColName(@NotNull SQLParser.IndexColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexColName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColName(@NotNull SQLParser.IndexColNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeDateTimeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeDateTimeStmt(@NotNull SQLParser.TypeDateTimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeDateTimeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeDateTimeStmt(@NotNull SQLParser.TypeDateTimeStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#autoIncrement}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrement(@NotNull SQLParser.AutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#autoIncrement}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrement(@NotNull SQLParser.AutoIncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull SQLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull SQLParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#columnDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefaultValue(@NotNull SQLParser.ColumnDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefaultValue(@NotNull SQLParser.ColumnDefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#fieldComment}.
	 * @param ctx the parse tree
	 */
	void enterFieldComment(@NotNull SQLParser.FieldCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fieldComment}.
	 * @param ctx the parse tree
	 */
	void exitFieldComment(@NotNull SQLParser.FieldCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#collateName}.
	 * @param ctx the parse tree
	 */
	void enterCollateName(@NotNull SQLParser.CollateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collateName}.
	 * @param ctx the parse tree
	 */
	void exitCollateName(@NotNull SQLParser.CollateNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeBlobStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeBlobStmt(@NotNull SQLParser.TypeBlobStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeBlobStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeBlobStmt(@NotNull SQLParser.TypeBlobStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void enterReferenceOption(@NotNull SQLParser.ReferenceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#referenceOption}.
	 * @param ctx the parse tree
	 */
	void exitReferenceOption(@NotNull SQLParser.ReferenceOptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeDecimalStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecimalStmt(@NotNull SQLParser.TypeDecimalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeDecimalStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecimalStmt(@NotNull SQLParser.TypeDecimalStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseStmt(@NotNull SQLParser.UseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseStmt(@NotNull SQLParser.UseStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#typeVarBinaryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarBinaryStmt(@NotNull SQLParser.TypeVarBinaryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeVarBinaryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarBinaryStmt(@NotNull SQLParser.TypeVarBinaryStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link SQLParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void enterDropSchema(@NotNull SQLParser.DropSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropSchema}.
	 * @param ctx the parse tree
	 */
	void exitDropSchema(@NotNull SQLParser.DropSchemaContext ctx);
}