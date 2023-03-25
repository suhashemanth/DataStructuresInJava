package com.multiThread;

import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) {
		boolean checkRedundantBrackets = checkRedundantBrackets("((x*y))");
		System.out.println(checkRedundantBrackets);
	}

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack<Character> stack=new Stack<>();

		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)==')')
			{
				int count=0;
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					stack.pop();
					count++;
				}
				if(count==0)
				{
					return true;
				}
				if(stack.isEmpty())
				{
					return true;
				}
				stack.pop();
			}
			else
			{
				stack.push(expression.charAt(i));
			}
		}
		if(stack.isEmpty())
		{
			return false;
		}
		return true;
	}
}