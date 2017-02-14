package com.pattern.InterpreterPattern.Expression;

public class InterpreterPatternDemo {

	//Rule : Robert and john are male 
	public static Expression getMaleExpression()
	{
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	//Rule : Julie is a married women
	public static Expression getMarriedWomenExpression()
	{
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
	
	public static void main(String[] args)
	{
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomenExpression();
		
		System.out.println("john is male ?"+isMale.interpret("John"));
		System.out.println("Julie is a married women ?"+isMarriedWoman.interpret("Married Julie"));
	}
}
 