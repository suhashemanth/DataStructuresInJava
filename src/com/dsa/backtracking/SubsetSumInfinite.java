package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumInfinite {
	
	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		ArrayList<Integer> res=new ArrayList<>();
		int[] a= {2,3,6,7};
		combinations(a, 7, res, list);
		Collections.sort(list,(c,b)->
		{
			if(c.size()<b.size())
			{
				return 1;
			}
			else if(c.size()==b.size())
			{
				int i=0;
				while(c.get(i)!=b.get(i))
				{
					i++;
				}
				if(i!=c.size())
				{
					if(c.get(i)>b.get(i))
					{
						return 1;
					}
				}
			}
			return -1;
		});
		ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<list.size();i++)
		{
			ArrayList<Integer> li=new ArrayList<Integer>();
			li.addAll(list.get(i));
			output.add(li);
		}
		System.out.println(list);
	}
	
	public static void combinations(int[] a,int B,ArrayList<Integer> list,List<List<Integer>> res)
	{
		if(B<0)
		{
			return;
		}
		if(B==0)
		{
			ArrayList<Integer> li=new ArrayList<>();
			boolean flag=true;
			for(int i=1;i<list.size();i++)
			{
				if(list.get(i-1)>list.get(i))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				li.addAll(list);
				res.add(li);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
			combinations(a, B-a[i], list, res);
			list.remove(list.size()-1);
		}
	}

}
