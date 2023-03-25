package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class GenerateAllPermutations {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		boolean[] visited=new boolean[a.length];
		Arrays.fill(visited, false);
		generate(a, visited, new ArrayList<>());
	}

	public static void generate(int[] a,boolean[] visited,ArrayList<Integer> result) {
		
		if(result.size()==a.length)
		{
			for(int i=0;i<result.size();i++)
			{
				System.out.print(result.get(i)+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<a.length;i++)
		{
			if(!visited[i])
			{
				result.add(a[i]);
				visited[i]=true;
				generate(a, visited, result);
				result.remove(result.size()-1);
				visited[i]=false;
			}
		}
	}
}
