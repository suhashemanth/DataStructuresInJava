package com.dsa.backtracking;

import java.util.ArrayList;

public class PalindromePartition {
	
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
		partition("ababb", new ArrayList<String>(),list);
		System.out.println(list);
	}
	
	public static void partition(String s,ArrayList<String> list,ArrayList<ArrayList<String>> result)
	{
		if(s.length()==0)
		{
			ArrayList<String> li=new ArrayList<String>();
			li.addAll(list);
			result.add(li);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			if(checkPalindrome(s.substring(0,i+1)))
			{
				list.add(s.substring(0,i+1));
				partition(s.substring(i+1,s.length()), list,result);
				list.remove(list.size()-1);
			}
		}
	}

	private static boolean checkPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
