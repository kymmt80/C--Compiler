// Generated from /home/kimiya/Programming/Uni/PLC/Phase1/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmm(CmmParser.CmmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#funcReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturnType(CmmParser.FuncReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclare(CmmParser.FunctionDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CmmParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclare(CmmParser.VarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#setgetVarDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetgetVarDec(CmmParser.SetgetVarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVars(CmmParser.StructVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#gsbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGsbody(CmmParser.GsbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#getterSetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterSetter(CmmParser.GetterSetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVar(CmmParser.StructVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(CmmParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#stateFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateFunctionCall(CmmParser.StateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CmmParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#argumentsDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDec(CmmParser.ArgumentsDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CmmParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#returner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturner(CmmParser.ReturnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(CmmParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditions(CmmParser.IfConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#matchedIfBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedIfBody(CmmParser.MatchedIfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#matchedIfScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedIfScope(CmmParser.MatchedIfScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#matchedElseScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedElseScope(CmmParser.MatchedElseScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#unmatchedIfScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmatchedIfScope(CmmParser.UnmatchedIfScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#factorIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorIf(CmmParser.FactorIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#matchedIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedIf(CmmParser.MatchedIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#unmatchedIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmatchedIf(CmmParser.UnmatchedIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_(CmmParser.Expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(CmmParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#orExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression_(CmmParser.OrExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CmmParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#andExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression_(CmmParser.AndExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arithmeticExpressionP2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionP2(CmmParser.ArithmeticExpressionP2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arithmeticExpressionP2_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionP2_(CmmParser.ArithmeticExpressionP2_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arithmeticExpressionP1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionP1(CmmParser.ArithmeticExpressionP1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#arithmeticExpressionP1_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionP1_(CmmParser.ArithmeticExpressionP1_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(CmmParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#equalExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression_(CmmParser.EqualExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#inequalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequalityExpression(CmmParser.InequalityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#inequalityExpression_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequalityExpression_(CmmParser.InequalityExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#factor0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor0(CmmParser.Factor0Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor1(CmmParser.Factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CmmParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CmmParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(CmmParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#endLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLine(CmmParser.EndLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#listElementCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElementCall(CmmParser.ListElementCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(CmmParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#listFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFormat(CmmParser.ListFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#fptrFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptrFormat(CmmParser.FptrFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#semicolonScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonScope(CmmParser.SemicolonScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(CmmParser.ScopeContext ctx);
}