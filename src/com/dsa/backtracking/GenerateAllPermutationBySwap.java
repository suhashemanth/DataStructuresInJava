package com.dsa.backtracking;

public class GenerateAllPermutationBySwap {
	
	public static void main(String[] args) {
		int[] a= {1,2,3};
		permutate(a, 0);
	}
	
	public static void permutate(int[] a,int st)
	{
		if(st==a.length)
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=st;i<a.length;i++)
		{
			swap(a, i, st);
			permutate(a, st+1);
		}
	}
	
	public static void swap(int[] a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
