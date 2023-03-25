package dynamicProgramming;

import java.util.ArrayList;

public class MaxAdjacentElements {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,1,3,5,8,1,9};
		int[] dp=new int[a.length];   
        dp[0]=a[0];
        int first=a[0];
        dp[1]=Math.max(a[0],a[1]);
        for(int i=2;i<a.length;i++)
        {
            dp[i]=Math.max(a[i]+dp[i-2],dp[i-1]);
        }
		System.out.println(dp[dp.length-1]);
	}
	
	public static int getMaxAdjacentElements(int[] a,int i)
	{
		if(i<0)
		{
			return 0;
		}
		if(i==0)
		{
			return a[0];
		}
		int pick=a[i]+getMaxAdjacentElements(a, i-2);
		int dontPick=0+getMaxAdjacentElements(a, i-1);
		return Math.max(pick, dontPick);
	}

}
