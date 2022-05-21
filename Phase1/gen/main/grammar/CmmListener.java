// Generated from /home/kimiya/Programming/Uni/PLC/Phase1/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void enterCmm(CmmParser.CmmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void exitCmm(CmmParser.CmmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CmmParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CmmParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#funcReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturnType(CmmParser.FuncReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#funcReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturnType(CmmParser.FuncReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclare(CmmParser.FunctionDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclare(CmmParser.FunctionDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CmmParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CmmParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CmmParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclare(CmmParser.VarDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDeclare}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclare(CmmParser.VarDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#setgetVarDec}.
	 * @param ctx the parse tree
	 */
	void enterSetgetVarDec(CmmParser.SetgetVarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#setgetVarDec}.
	 * @param ctx the parse tree
	 */
	void exitSetgetVarDec(CmmParser.SetgetVarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structVars}.
	 * @param ctx the parse tree
	 */
	void enterStructVars(CmmParser.StructVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structVars}.
	 * @param ctx the parse tree
	 */
	void exitStructVars(CmmParser.StructVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#gsbody}.
	 * @param ctx the parse tree
	 */
	void enterGsbody(CmmParser.GsbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#gsbody}.
	 * @param ctx the parse tree
	 */
	void exitGsbody(CmmParser.GsbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#getterSetter}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetter(CmmParser.GetterSetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#getterSetter}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetter(CmmParser.GetterSetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structVar}.
	 * @param ctx the parse tree
	 */
	void enterStructVar(CmmParser.StructVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structVar}.
	 * @param ctx the parse tree
	 */
	void exitStructVar(CmmParser.StructVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CmmParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CmmParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#stateFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterStateFunctionCall(CmmParser.StateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#stateFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitStateFunctionCall(CmmParser.StateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#argumentsDec}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDec(CmmParser.ArgumentsDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#argumentsDec}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDec(CmmParser.ArgumentsDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CmmParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CmmParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#returner}.
	 * @param ctx the parse tree
	 */
	void enterReturner(CmmParser.ReturnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#returner}.
	 * @param ctx the parse tree
	 */
	void exitReturner(CmmParser.ReturnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(CmmParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(CmmParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifConditions}.
	 * @param ctx the parse tree
	 */
	void enterIfConditions(CmmParser.IfConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifConditions}.
	 * @param ctx the parse tree
	 */
	void exitIfConditions(CmmParser.IfConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#matchedIfBody}.
	 * @param ctx the parse tree
	 */
	void enterMatchedIfBody(CmmParser.MatchedIfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#matchedIfBody}.
	 * @param ctx the parse tree
	 */
	void exitMatchedIfBody(CmmParser.MatchedIfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#matchedIfScope}.
	 * @param ctx the parse tree
	 */
	void enterMatchedIfScope(CmmParser.MatchedIfScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#matchedIfScope}.
	 * @param ctx the parse tree
	 */
	void exitMatchedIfScope(CmmParser.MatchedIfScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#matchedElseScope}.
	 * @param ctx the parse tree
	 */
	void enterMatchedElseScope(CmmParser.MatchedElseScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#matchedElseScope}.
	 * @param ctx the parse tree
	 */
	void exitMatchedElseScope(CmmParser.MatchedElseScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#unmatchedIfScope}.
	 * @param ctx the parse tree
	 */
	void enterUnmatchedIfScope(CmmParser.UnmatchedIfScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#unmatchedIfScope}.
	 * @param ctx the parse tree
	 */
	void exitUnmatchedIfScope(CmmParser.UnmatchedIfScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#factorIf}.
	 * @param ctx the parse tree
	 */
	void enterFactorIf(CmmParser.FactorIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#factorIf}.
	 * @param ctx the parse tree
	 */
	void exitFactorIf(CmmParser.FactorIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#matchedIf}.
	 * @param ctx the parse tree
	 */
	void enterMatchedIf(CmmParser.MatchedIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#matchedIf}.
	 * @param ctx the parse tree
	 */
	void exitMatchedIf(CmmParser.MatchedIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#unmatchedIf}.
	 * @param ctx the parse tree
	 */
	void enterUnmatchedIf(CmmParser.UnmatchedIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#unmatchedIf}.
	 * @param ctx the parse tree
	 */
	void exitUnmatchedIf(CmmParser.UnmatchedIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression_}.
	 * @param ctx the parse tree
	 */
	void enterExpression_(CmmParser.Expression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression_}.
	 * @param ctx the parse tree
	 */
	void exitExpression_(CmmParser.Expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(CmmParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(CmmParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#orExpression_}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression_(CmmParser.OrExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#orExpression_}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression_(CmmParser.OrExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CmmParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CmmParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#andExpression_}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression_(CmmParser.AndExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#andExpression_}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression_(CmmParser.AndExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arithmeticExpressionP2}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionP2(CmmParser.ArithmeticExpressionP2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arithmeticExpressionP2}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionP2(CmmParser.ArithmeticExpressionP2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arithmeticExpressionP2_}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionP2_(CmmParser.ArithmeticExpressionP2_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arithmeticExpressionP2_}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionP2_(CmmParser.ArithmeticExpressionP2_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arithmeticExpressionP1}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionP1(CmmParser.ArithmeticExpressionP1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arithmeticExpressionP1}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionP1(CmmParser.ArithmeticExpressionP1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#arithmeticExpressionP1_}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionP1_(CmmParser.ArithmeticExpressionP1_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#arithmeticExpressionP1_}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionP1_(CmmParser.ArithmeticExpressionP1_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(CmmParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(CmmParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#equalExpression_}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression_(CmmParser.EqualExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#equalExpression_}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression_(CmmParser.EqualExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#inequalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterInequalityExpression(CmmParser.InequalityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#inequalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitInequalityExpression(CmmParser.InequalityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#inequalityExpression_}.
	 * @param ctx the parse tree
	 */
	void enterInequalityExpression_(CmmParser.InequalityExpression_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#inequalityExpression_}.
	 * @param ctx the parse tree
	 */
	void exitInequalityExpression_(CmmParser.InequalityExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#factor0}.
	 * @param ctx the parse tree
	 */
	void enterFactor0(CmmParser.Factor0Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#factor0}.
	 * @param ctx the parse tree
	 */
	void exitFactor0(CmmParser.Factor0Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#factor1}.
	 * @param ctx the parse tree
	 */
	void enterFactor1(CmmParser.Factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#factor1}.
	 * @param ctx the parse tree
	 */
	void exitFactor1(CmmParser.Factor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CmmParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CmmParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CmmParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CmmParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CmmParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CmmParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#endLine}.
	 * @param ctx the parse tree
	 */
	void enterEndLine(CmmParser.EndLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#endLine}.
	 * @param ctx the parse tree
	 */
	void exitEndLine(CmmParser.EndLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#listElementCall}.
	 * @param ctx the parse tree
	 */
	void enterListElementCall(CmmParser.ListElementCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#listElementCall}.
	 * @param ctx the parse tree
	 */
	void exitListElementCall(CmmParser.ListElementCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(CmmParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(CmmParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void enterListFormat(CmmParser.ListFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#listFormat}.
	 * @param ctx the parse tree
	 */
	void exitListFormat(CmmParser.ListFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#fptrFormat}.
	 * @param ctx the parse tree
	 */
	void enterFptrFormat(CmmParser.FptrFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#fptrFormat}.
	 * @param ctx the parse tree
	 */
	void exitFptrFormat(CmmParser.FptrFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#semicolonScope}.
	 * @param ctx the parse tree
	 */
	void enterSemicolonScope(CmmParser.SemicolonScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#semicolonScope}.
	 * @param ctx the parse tree
	 */
	void exitSemicolonScope(CmmParser.SemicolonScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(CmmParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(CmmParser.ScopeContext ctx);
}