package com.pattern.InterpreterPattern.InfixToPostfix;

public class NumberExpression implements IExpression {
	int number;

	public NumberExpression(int number) {
		
		this.number = number;
	}
	public NumberExpression(String number) {
		
		this.number = Integer.parseInt(number);
	}
	public int interpret() {
		return number;
	}
}
