package recurrsion;

import java.util.ArrayList;

public class SubSetSumK {
	
	public static void main(String[] args) {
		int[] a =new int[] {5,12,3,17,1,18,15,3,17};
		ArrayList<ArrayList<Integer>> subSet = subSet(a, 0, 6);
		System.out.println(subSet);
	}
	
	public static ArrayList<ArrayList<Integer>> subSet(int[] a,int i,int k)
	{
		if(i>a.length-1)
		{
			ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list1=new ArrayList<Integer>();
			list.add(list1);
			return list;
		}
		ArrayList<ArrayList<Integer>> with0 = subSet(a, i+1, k-a[i]);
		ArrayList<ArrayList<Integer>> withOut0 = subSet(a, i+1, k);
		ArrayList<ArrayList<Integer>> output=new ArrayList<ArrayList<Integer>>();
		for(int j=0;j<with0.size();j++)
		{
			ArrayList<Integer> list1=new ArrayList<Integer>();
			list1.add(a[i]);
			for(int r=0;r<with0.get(j).size();r++)
			{
				list1.add(with0.get(j).get(r));
			}
			boolean isAddable=findSubSetSum(list1, k);
			if(isAddable==true)
			{
				output.add(list1);
			}
		}
		for(int j=0;j<withOut0.size();j++)
		{
			ArrayList<Integer> list1=new ArrayList<Integer>();
			for(int r=0;r<withOut0.get(j).size();r++)
			{
				list1.add(withOut0.get(j).get(r));
			}
			boolean isAddable=findSubSetSum(list1, k);
			if(isAddable==true)
			{
				output.add(list1);
			}
		}
		return output;
	}
	
	private static boolean findSubSetSum(ArrayList<Integer> list,int k) {
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			sum=sum+list.get(i);
		}
		if(sum==k)
		{
			return true;
		}
		return false;
	}
	
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		ArrayList<ArrayList<Integer>> list=subSet(input,0,k);
		int[][] a=new int[list.size()][];
		for(int i=0;i<list.size();i++)
		{
			a[i]=new int[list.get(i).size()];
		}
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.get(i).size();j++)
			{
				a[i][j]=list.get(i).get(j);
			}
		}
		return a;
	}
	

}
