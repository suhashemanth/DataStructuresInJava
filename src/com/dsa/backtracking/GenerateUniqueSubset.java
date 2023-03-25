package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.HashSet;

public class GenerateUniqueSubset {
	
	public static void main(String[] args) {
		int[] a= {1,2,2,1};
		generate(a, 0, new ArrayList<Integer>(), new HashSet<>());
	}
	
	public static void generate(int[] a,int st,ArrayList<Integer> list,HashSet<ArrayList<Integer>> set)
	{
		if(st>a.length-1)
		{
			if(set.contains(list))
			{
				
			}
			else
			{
				for(int i=0;i<list.size();i++)
				{
					System.out.print(list.get(i)+" ");
				}
				System.out.println();
				set.add(list);
			}
			return;
		}
		list.add(a[st]);
		generate(a, st+1, list, set);
		list.remove(list.size()-1);
		generate(a, st+1, list, set);
	}

}
