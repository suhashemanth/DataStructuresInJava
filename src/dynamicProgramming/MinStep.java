package dynamicProgramming;

public class MinStep {
	static int[] dp;
	public static void main(String[] args) {
		int minStep = minStep(10);
		System.out.println(minStep);
	}
	
	public static int minStep(int n)
	{
		if(n<=1)
		{
			return 0;
		}
		int ans1=Integer.MAX_VALUE;
		int ans2=Integer.MAX_VALUE;
		int ans3=Integer.MAX_VALUE;
		if(n%3==0)
		{
			ans1=1+minStep(n/3);
		}
		if(n%2==0)
		{
			ans2=1+minStep(n/2);
		}
		
			ans3=1+minStep(n-1);
		
		return Math.min(ans1, Math.min(ans2, ans3));
	}

}
