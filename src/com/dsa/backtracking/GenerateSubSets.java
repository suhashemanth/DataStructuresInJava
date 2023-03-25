package com.dsa.backtracking;

import java.util.ArrayList;

public class GenerateSubSets {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		gen(a, 0, new ArrayList<Integer>());
	}
	
	public static void gen(int[] a,int st,ArrayList<Integer> list)
	{
		if(st>a.length-1)
		{
			if(list.size()==2)
			{
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			}
			return;
		}
		list.add(a[st]);
		gen(a, st+1, list);
		list.remove(list.size()-1);
		gen(a, st+1, list);
	}

}
