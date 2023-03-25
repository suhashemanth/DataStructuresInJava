package array;

import java.util.ArrayList;

public class GenerateArray {
	
	public static void main(String[] args) {
	   int[] a= {1,2,3,4};	
	   generate(a, 0, new ArrayList<>());
	}
	
	public static void generate(int[] a,int i,ArrayList<Integer> list)
	{
		if(i>a.length-1)
		{
			for(int j=0;j<list.size();j++)
			{
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
			return;
		}
		//pick
		list.add(a[i]);
		generate(a, i+1, list);
		list.remove(list.size()-1);
		generate(a, i+1, list);
	}

}
