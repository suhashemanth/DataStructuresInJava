package com.dsa.backtracking;

import java.util.ArrayList;

public class GenerateArray {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> generate = generate(3);
		System.out.println(generate);
		generateArray(3,new ArrayList<Integer>());
	}
	
	public static ArrayList<ArrayList<Integer>> generate(int n)
	{
		if(n==0)
		{
			ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list1=new ArrayList<>();
			list.add(list1);
			return list;
		}
		ArrayList<ArrayList<Integer>> output =new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> smallOutput = generate(n-1);
		for(int i=0;i<smallOutput.size();i++)
		{
			ArrayList<Integer> list=smallOutput.get(i);
			for(int j=0;j<2;j++)
			{
				ArrayList<Integer> li=new ArrayList<Integer>();
				li.addAll(list);
				li.add(j);
				output.add(li);
			}
		}
		return output;
	}
	
	public static void generateArray(int n,ArrayList<Integer> list)
	{
		if(n==0)
		{
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			return;
		}
		list.add(0);
		generateArray(n-1,list);
		list.remove(list.size()-1);
		list.add(1);
		generateArray(n-1, list);
		list.remove(list.size()-1);
	}
}
