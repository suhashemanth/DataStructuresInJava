package dynamicProgramming;

import java.util.Arrays;

public class Knapsack01 {
	
	static int[] dp;
	public static void main(String[] args) {
		int[] weights= {5,4,6,3};
		int[] values= {10,40,30,50};
		int maxWeight=10;
		dp=new int[weights.length];
		Arrays.fill(dp, -1);
		int knapsack = knapsack(weights, values, maxWeight, 0);
		System.out.println(knapsack);
	}
	
	public static int knapsack(int[] weights,int[] values,int maxWeight,int index)
	{
		if(index>weights.length-1)
		{
			return 0;
		}
//		if(dp[index]!=-1)
//		{
//			return dp[index];
//		}
		if(maxWeight<weights[index])
		{
			dp[index]= knapsack(weights, values, maxWeight, index+1);
			return dp[index];
		}
		int pick=knapsack(weights, values, maxWeight-weights[index], index+1)+values[index];
		int dontPick=knapsack(weights, values, maxWeight, index+1);
		dp[index]=Math.max(pick, dontPick);
		return dp[index];
	}
	
	public static int knapsack1(int[] weights, int[] values, int maxWeight, int index) {
		if (index > weights.length - 1) {
			return 0;
		}
		if(dp[index]!=-1)
		{
			return dp[index];
		}
		if (maxWeight < weights[index]) {
			dp[index] = knapsack1(weights, values, maxWeight, index + 1);
			return dp[index];
		}
		int pick = knapsack1(weights, values, maxWeight - weights[index], index + 1) + values[index];
		int dontPick = knapsack1(weights, values, maxWeight, index + 1);
		dp[index] = Math.max(pick, dontPick);
		return dp[index];
	}

}

