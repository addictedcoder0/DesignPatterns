package com.pattern.InterpreterPattern.InfixToPostfix;

import java.util.Stack;
public class InterpreterPattern {

	public static void main(String[] args)
	{
		String tokenString = "4 3 2 - 1 +";
		Stack<IExpression> stack = new Stack<IExpression>();
		String[] tokenList = tokenString.split(" ");
		
		for(String s:tokenList)
		{
			if(isOperator(s))
			{
				IExpression right =  stack.pop();
				IExpression left = stack.pop();
				IExpression operator = getOperatorInstance(s, left, right);
				int result = operator.interpret();
				stack.push(new NumberExpression(result));
			}
			else
			{
				IExpression i= new NumberExpression(s);
				stack.push(i);
			}
		}
		System.out.println("Result :"+stack.pop().interpret());
	}
	
	public static boolean isOperator(String s)
	{
		if(s.equals("+")||s.equals("-")||s.equals("*"))
		{
			return true;
		}
		return false;
	}

	public static IExpression getOperatorInstance(String s,IExpression left,IExpression right)
	{
		switch(s)
		{
		case "+":	return new PlusExpression(left, right);
		case "-":	return new MinusExpression(left, right);
		case "*":	return new MultiplyExpression(left, right);
		}
		return null;
	}
}
