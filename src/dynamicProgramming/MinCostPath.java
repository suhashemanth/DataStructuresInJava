package dynamicProgramming;

import java.util.Arrays;

public class MinCostPath {
	
	static int[][] dp;
	public static void main(String[] args) {
		int[][] a= {{1,7,9,2},{8,6,3,2},{1,6,7,8},{2,9,8,2}};
		dp=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				int minCost1=20000;
				int minCost2=20000;
				int minCost3=20000;
				if(i==0 && j==0)
				{
					dp[i][j]=a[i][j];
				}
				else
				{
				if(i-1>=0)
				{
					minCost1=a[i][j]+dp[i-1][j];
				}
				if(j-1>=0)
				{
					minCost2=a[i][j]+dp[i][j-1];
				}
				if(i-1>=0 && j-1>=0)
				{
					minCost3=a[i][j]+dp[i-1][j-1];
				}
				dp[i][j]=Math.min(minCost1, Math.min(minCost2, minCost3));
				}
			}
		}
		System.out.println(dp[a.length-1][a[0].length-1]);
	}
	
	public static int minCostPath(int[][] input) {
		return path(input, 0, 0, input.length, input[0].length);
	}

	public static int path(int[][] a,int i,int j,int m,int n)
	{
		if(i==m-1 && j==n-1)
		{
			return a[i][j];
		}
		if(i==m||j==n)
		{
			return 20000;
		}
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		int cost1=a[i][j]+path(a,i+1,j,m,n);
		int cost2 = a[i][j]+path(a, i, j+1, m, n);
		int cost3 = a[i][j]+path(a, i + 1, j+1, m, n);
		dp[i][j]=Math.min(cost1, Math.min(cost2, cost3));
		return dp[i][j];
	}

}
