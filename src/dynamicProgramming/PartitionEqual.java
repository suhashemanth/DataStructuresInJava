package dynamicProgramming;

import java.util.Arrays;

public class PartitionEqual {
	
	
	public static void main(String[] args) {
		
	}
	static int[][] dp;
	static boolean[][] dp1;
	public static boolean part(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		if(sum%2==1)
		{
			return false;
		}
		int k=sum/2;
		dp=new int[a.length][k+1];
		dp1=new boolean[a.length][k+1];
		Arrays.asList(dp).forEach(ab->Arrays.fill(ab, -1));
		return partition(a, 0, sum/2);
	}
	
	public static boolean partition(int[] a,int i,int k)
	{
		if(k==0)
		{
			return true;
		}
		if(i>a.length-1||k<0)
		{
			return false;
		}
		if(dp[i][k]!=-1)
		{
			return dp1[i][k];
		}
		boolean pick=partition(a, i+1, k-a[i]);
		boolean doNotPick=partition(a, i+1, k);
		dp1[i][k]=pick|doNotPick;
		dp[i][k]=1;
		return dp1[i][k];
	}

}
