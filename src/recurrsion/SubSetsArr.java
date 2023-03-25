package recurrsion;

import java.util.ArrayList;

public class SubSetsArr {
	
	public static void main(String[] args) {
		int[] a= {1,2,3};//{},{1},{2},{3},{1,2},{2,3},{1,3},{1,2,3}
		ArrayList<ArrayList<Integer>> subSet = subSet(a, a.length-1);
		System.out.println(subSet);
	}
	//{}
	//{2,3},{2},{3},{}
	
	//principle of mathematical equation
	//1+2+3..n=n*n+1/2
	//prove for base case n=1
	//Assume n=k it is true=k*k+1/2=k2+k/2
	//prove that n=k+1 it is true
	//k2+3k+2/2//k2+k/2+2k+2
	
	//{{1}{2}{3}} {1,2}{2,3}{3,1}
	
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
}
