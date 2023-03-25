package dynamicProgramming;

import java.util.Arrays;

public class FrogJump {
	
	public static void main(String[] args) {
		
		int[] a= {40,10,20,70,80,10,20,70,80,60};
		int frogJumpKBottomUp = frogJumpKBottomUp(a, 4);
		System.out.println(frogJumpK(a,4,a.length-1));
	}
	
	public static int frogJump(int[] a,int i)
	{
		if(i==0)
		{
			return 0;
		}
		int output1 = 0;
		int output2 = 0;
			output1=Math.abs((a[i]-a[i-1]))+frogJump(a, i-1);
		
		if(i>1)
			output2=Math.abs(a[i]-a[i-2])+frogJump(a, i-2);
		
		

		return Math.min(output1,output2);
	}
	
	public static int frogJumpK(int[] a,int k,int st)
	{
		if(st==0)
		{
			return 0;
		}
		int min=Integer.MAX_VALUE;
		for(int i=1;i<=k;i++)
		{
			if(st-i>=0)
			{
				int l=((int)Math.abs(a[st]-a[st-i]))+frogJumpK(a,k, st-i);
				min=Math.min(min,l);
			}
			
		}
		return min;
	}
	
	public static int frogJumpKBottomUp(int[] a,int k)
	{
		int[] dp=new int[a.length];
		dp[0]=0;
		for(int i=1;i<a.length;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=1;j<=k;j++)
			{
				if(i-j>=0)
				{
					min=Math.min(min,(int)Math.abs(a[i]-a[i-j])+dp[i-j]);
				}
			}
			dp[i]=min;
		}
		return dp[dp.length-1];
	}

}