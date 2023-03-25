package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
    	 int arr[][]=new int [][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    	    List<Integer> spiralOrder = spiralOrder(arr);
    	    System.out.println(spiralOrder);
    }
    
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
            int n=Math.max(arr1.length,arr2.length);
            output=new int[n+1];
            int r1=arr1.length-1;
            int r2=arr2.length-1;
            int carry=0;
            int r3=output.length-1;
            int i=n-1;
            while((r1>=0||r2>=0))
            {
                int sum=0;
                if(r1>=0 && r2>=0)
                sum=arr1[r1--]+arr2[r2--]+carry;
                else if(r2>0 && r1<0)
                sum=0+arr2[r2--]+carry;
                else 
                sum=arr1[r1--]+0+carry;
                output[r3--]=sum%10;
                i--;
                if(sum>9)
                {
                    carry=1;
                }
                else
                {
                    carry=0;
                }
            }
            output[0]=carry;

        }
    
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if(matrix.length==0)
		{
            return list;
		}
		else
		{
		int n=0;
		if(matrix.length%2==1)
		{
			n=(matrix.length/2)+1;
		}
		else
		{
			n=matrix.length;
		}
		// n=(matrix.length/2);
		for(int k=0;k<n;k++)
		{
			int i=k;
			int j=k;
			while(j<matrix[0].length-k)
			{
				list.add(matrix[i][j]);
				j++;
			}
			j=j-1;
			i=i+1;
			while(i<matrix.length-k)
			{
				list.add(matrix[i][j]);
				i++;
			}
			i=i-1;
			j=j-1;
			while(j>=k)
			{
				list.add(matrix[i][j]);
				j--;
			}
			j=j+1;
			i=i-1;
			while(i>k)
			{
				list.add(matrix[i][j]);
				i--;
			}
		}
		}
        return list;
    }
    
    public static void printSubstrings(String str) {
		//Your code goes here
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.println(str.substring(i,j+1));
			}
		}
	}
}