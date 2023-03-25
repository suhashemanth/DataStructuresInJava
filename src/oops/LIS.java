package oops;

public class LIS {
	
	public static void main(String[] args) {
		lengthOfLIS(new int[] {1,3,6,7,9,4,10,5,6});
	}
	
	static int[] dp=null;
	    public static int lengthOfLIS(int[] nums) {
	    	 dp=new int[nums.length];
	         dp[0]=1;
	         for(int i=1;i<nums.length;i++)
	         {
	             int max=0;
	             for(int j=i-1;j>=0;j--)
	             {
	                 if(nums[j]<nums[i])
	                 {
	                     max=Math.max(max,dp[j]+1);
	                 }
	             }
	             if(max==0)
	             {
	                 dp[i]=1;
	             }
	             else
	             dp[i]=max;
	         }
	         return dp[nums.length-1];
	    }

}
