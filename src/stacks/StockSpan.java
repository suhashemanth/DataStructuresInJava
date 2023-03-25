package stacks;

import java.util.Stack;

public class StockSpan {
	
	public static void main(String[] args) {
		int[] a= {60,70,80,100,90,75,80,120};
		int[] span = span(a);
		for(int i=0;i<span.length;i++)
		{
			System.out.print(span[i]+" ");
		}
	}
	
	public static int[] span(int[] a)
	{
		int[] stock=new int[a.length];
		stock[0]=1;
		Stack<Integer> stack=new Stack<>();
		stack.push(0);
		for(int i=1;i<a.length;i++)
		{
			int count=1;
			while(!stack.isEmpty() && a[i]>a[stack.peek()])
			{
				count+=stock[stack.peek()];
				stack.pop();
			}
			stack.push(i);
			stock[i]=count;
		}
		return stock;
	}
}
