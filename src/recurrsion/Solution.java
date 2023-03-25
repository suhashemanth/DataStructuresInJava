package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Solution {
	
	 static class MaxDiscountedSystem
	 {
		 private int numberOfOutlets;
		 private int[][] arr;
	 	public MaxDiscountedSystem() {
			// TODO Auto-generated constructor stub
		}
	 	MaxDiscountedSystem(int numberOfOutlets,int[][] arr)
	 	{
	 		this.numberOfOutlets=numberOfOutlets;
	 		this.arr=arr;
	 	}
	 	public int[] search(int n)
	 	{
	 		ArrayList<Integer> list=new ArrayList<>();
	 		for(int i=0;i<arr.length;i++)
	 		{
	 			if(arr[i][1]==1)
	 			{
	 				list.add(arr[i][0]);
	 			}
	 		}
	 		int[] a=new int[list.size()];
	 		for(int i=0;i<list.size();i++)
	 		{
	 			a[i]=list.get(i);
	 		}
	 		return a;
	 	}
	 	public int[][] report()
	 	{
	 		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	 		
	 		
	 		Arrays.sort(arr,(a,b)->
	 		{
	 			if(a[2]>b[2])
	 			{
	 				return 1;
	 			}
	 			return -1;
	 		});
	 		
	 		for(int i=0;i<arr.length;i++)
	 		{
	 			ArrayList<Integer> li=new ArrayList<Integer>();
	 			li.add(arr[i][0]);
	 			li.add(arr[i][1]);
	 			list.add(li);
	 		}
	 		int[][] a=new int[arr.length][2];
	 		for(int i=0;i<arr.length;i++)
	 		{
	 			for(int j=0;j<2;j++)
	 			{
	 				a[i][j]=list.get(i).get(j);
	 			}
	 		}
	 		return a;
	 	}
	 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Number of oulets
		int n=sc.nextInt();
		int[][] arr=new int[n*2][3];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		MaxDiscountedSystem maxDiscountedSystem=new MaxDiscountedSystem(n, arr);
		int[] search = maxDiscountedSystem.search(1);
		for(int i=0;i<search.length;i++)
		{
			System.out.print(search[i]+" ");
		}
		System.out.println();
		int[][] report = maxDiscountedSystem.report();
		for(int i=0;i<report.length;i++)
		{
			System.out.println(report[i][0]+" "+report[i][1]);
		}
		maxDiscountedSystem.search(2);
	}
}

