package com.pattern.InterpreterPattern.InfixToPostfix;

public class PlusExpression implements IExpression {

	IExpression leftExpression;
	IExpression rightExpression;
	
	public PlusExpression(IExpression leftExpression,IExpression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExpression.interpret()+rightExpression.interpret();
	}

}
