package dynamicProgramming;

import java.util.Arrays;

public class SubSetSumK {
	
	public static void main(String[] args) {
		int[] a= {6,1,2,1};
//		boolean[] dp=new boolean[a.length];
//		Arrays.fill(dp,false);
		int k=4;
//		System.out.println(subSetSum(a, k, 0,dp));
		boolean subsetSumToK = subsetSumToK(a.length, k, a);
		System.out.println(subsetSumToK);
	}
	
	public static boolean subSetSum(int[] a,int k,int i,boolean[] dp)
	{
		if(i>a.length-1||k<0)
		{
			return false;
		}
		if(k==0)
		{
			return true;
		}
		if(dp[i]!=false)
		{
			return dp[i];
		}
		boolean pick=subSetSum(a, k-a[i], i+1,dp);
		boolean doNotPick=subSetSum(a, k, i+1,dp);
		return pick|doNotPick;
	}
	
	static int[][] dp;
    static boolean[][] dp1;
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        dp=new int[n][k+1];
        dp1=new boolean[n][k+1];
        Arrays.asList(dp).forEach(a->Arrays.fill(a,-1));
        return subsetSumToKHelper(arr, k, 0);
    }

    public static boolean subsetSumToKHelper(int[] a,int k,int i)
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
        dp1[i][k]=subsetSumToKHelper(a, k-a[i], i+1)|subsetSumToKHelper(a, k, i+1);
        dp[i][k]=1;
        return dp1[i][k];
    }

}
