package com.dsa.backtracking;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int[] a= {3,1,2,2,8,4,6,3};
		quickSort(a, 0, 7);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	//3,1,2,8,4,6
    public static void quickSort(int[] input,int st,int end)
    {
    	if(st>=end)
    	{
    		return;
    	}
    	int start=input[st];//3
    	int count=0;
    	for(int i=st+1;i<=end;i++)
    	{
    		if(input[i]<start)
    		{
    			count++;//2
    		}
    	}
    	int appendedValue=st+count;//2
    	int temp=input[appendedValue];//2
    	input[appendedValue]=start;
    	input[st]=temp;
    	int i=st;
    	int j=end;
    	while(i<appendedValue && j>appendedValue)
    	{
    		if(input[i]>=start && input[j]<start)
    		{
    			int temp1=input[i];
    			input[i]=input[j];
    			input[j]=temp1;
    		}
    		else if(input[i]>=start && input[j]>start)
    		{
    			j--;
    		}
    		else if(input[i]<start && input[j]<start)
    		{
    			i++;
    		}
    		else
    		{
    			i++;
    			j--;
    		}
    	}
    	quickSort(input, st, appendedValue-1);
    	quickSort(input, appendedValue+1, end);
    }
}