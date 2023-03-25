package recurrsion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubSetArrSizeK {
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int k=3;
		int i=a.length-1;
		List<ArrayList<Integer>> subset = subSet(a, i);
		List<List<Integer>> output= new ArrayList<List<Integer>>();
		
        for(int j=0;j<subset.size();j++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            if(subset.get(j).size()==k)
            {
                list.addAll(subset.get(j));
            }
            if(list.size()!=0)
            output.add(list);
        }
        
//        Collections.sort(output,(c,d)->
//        {
//        	int min = Math.min(c.size(),d.size());
//            for(int j=0;j<min;j++)
//            {
//                 if(c.get(j)!=d.get(i))
//                 {
//                     return c.get(j).compareTo(d.get(j));
//                 }
//            }
//            return (c.size()<=d.size())? -1:1;       
//        });
 
		System.out.println(output);
		
		ArrayList<ArrayList<Integer>> helper = helper(a, k);
		System.out.println(helper);
	}
	//2,3
	public static ArrayList<ArrayList<Integer>> generate(int[] a,int i,int k,int sz)
	{
		if(i<0)
		{
			ArrayList<ArrayList<Integer>> list=new ArrayList<>();
			ArrayList<Integer> list1=new ArrayList<Integer>();
			list.add(list1);
		}
		ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> smallOutput = generate(a, i-1, k, sz+1);
		output.addAll(smallOutput);
		for(int j=0;j<smallOutput.size();j++)
		{
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.addAll(smallOutput.get(j));
			list.add(a[i]);
			output.add(list);
		}
		return output;
	}
	
	public static ArrayList<ArrayList<Integer>> subSet(int[] a,int i)
	{
		if(i<0)
		{
			ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list1=new ArrayList<>();
			list.add(list1);
			return list;
		}
		ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> smallOutput = subSet(a, i-1);
		output.addAll(smallOutput);
		
		for(int j=0;j<smallOutput.size();j++)
		{
			ArrayList<Integer> list=new ArrayList<Integer>();
			list.addAll(smallOutput.get(j));
			list.add(a[i]);
			output.add(list);
		}
		return output;
	}
	
	public static ArrayList<ArrayList<Integer>> helper(int[] a,int k)
	{
		if(k==0)
		{
			ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list1=new ArrayList<Integer>();
			list.add(list1);
			return list;
		}
		if(k==1)
		{
			ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<a.length;i++)
			{
				ArrayList<Integer> list1=new ArrayList<Integer>();
				list1.add(a[i]);
				list.add(list1);
			}
			return list;
		}
		ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> smallOutput = helper(a, k-1);
		for(int i=0;i<smallOutput.size();i++)
		{
			ArrayList<Integer> li=smallOutput.get(i);
			int limit=li.get(li.size()-1);
			for(int j=limit;j<a.length;j++)
			{
				ArrayList<Integer> lis=new ArrayList<Integer>();
					lis.addAll(li);
				lis.add(a[j]);
				output.add(lis);
			}
		}
		return output;
	}

}
