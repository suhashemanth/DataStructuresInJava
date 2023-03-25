package com.dsa.backtracking;

public class GenerateParanthesis {
	
	public static void main(String[] args) {
		generate(4, 0, 0,"");
	}
	
	public static void generate(int A,int open,int close,String res)
	{
		if(open==A && close==A)
		{
			System.out.print(res+" ");
			return;
		}
		if(open>=close && open<A)
		{
			res=res+'(';
			generate(A, open+1 ,close, res);
			res=removeLastChar(res);
		}
		if(close<A)
		{
			res=res+')';
			generate(A, open,close+1, res);
			res=removeLastChar(res);
		}
	}

	private static String removeLastChar(String res) {
		// TODO Auto-generated method stub
		char[] ch=new char[res.length()-1];
		for(int i=0;i<res.length()-1;i++)
		{
			ch[i]=res.charAt(i);
		}
		return new String(ch);
		}

}
