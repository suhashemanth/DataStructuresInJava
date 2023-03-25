package recurrsion;

import java.util.ArrayList;

public class SubSetsArray {
	
	public static void main(String[] args) {
		int[] a= {15,20,12};
		ArrayList<ArrayList<String>> findSubSet = findSubSet(a, 0);
		//findSubSet.remove(0);
		int[][] subsets = subsets(a);
		for(int i=0;i<subsets.length;i++)
		{
			for(int j=0;j<subsets[i].length;j++)
			{
				System.out.print(subsets[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(findSubSet);
	}
	
	public static int[][] subsets(int input[]) {
		// Write your code here
		ArrayList<ArrayList<String>> list=findSubSet(input,0);

		ArrayList<ArrayList<String>> list2=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			ArrayList<String> list1=new ArrayList<>();
			String s="";
			for(int j=0;j<list.get(i).size();j++)
			{
				s=list.get(i).get(j);
			}
			String[] s1=s.split(" ");
			for(int j=0;j<s1.length;j++)
			{
				list1.add(s1[j]);
			}
			list2.add(list1);
		}
		int[][] res=new int[list2.size()-1][];
		for(int i=0;i<list2.size()-1;i++)
		{
			res[i]=new int[list2.get(i+1).size()];
		}
		
		for(int i=1;i<list2.size();i++)
		{
			for(int j=0;j<list2.get(i).size();j++)
			{
					res[i-1][j]=Integer.parseInt(list2.get(i).get(j));
			}
		}
		return res;
	}
	
	public static ArrayList<ArrayList<String>> findSubSet(int[] a,int si)
	{
		if(si>=a.length)
		{
			ArrayList<String> list=new ArrayList<String>();
			list.add("");
			ArrayList<ArrayList<String>> list1=new ArrayList<ArrayList<String>>();
			list1.add(list);
			return list1;
		}

		ArrayList<ArrayList<String>> list1=new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> smallOutput = findSubSet(a, si+1);
		list1.addAll(smallOutput);
		for(int i=0;i<smallOutput.size();i++)
		{
			ArrayList<String> list=new ArrayList<String>();
			for(int j=0;j<smallOutput.get(i).size();j++)
			{
				String val=smallOutput.get(i).get(j);
				if(val.isEmpty())
				{
					list.add(a[si]+"");
				}
				else
				{
					list.add(a[si]+" "+val);
				}
				//int mul=findMul(val);
			}
			list1.add(list);
		}
		return list1;
	}
	
//	public static int[][] findSubSet(int[] a,int si)
//	{
//		if(si>a.length-1)
//		{
//			int[][] arr=new int[1][1];
//			arr[0][0]=0;
//		}
//	}

	private static int findMul(int sum) {
		int mul=1;
		while(sum!=0)
		{
			mul=10*mul;
			sum=sum/10;
		}
		return mul;
	}

}
