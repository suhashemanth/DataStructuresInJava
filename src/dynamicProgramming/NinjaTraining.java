package dynamicProgramming;

public class NinjaTraining {
	
	
	public static void main(String[] args) {
		int[][] a= {{10,40,70},{20,50,80},{30,60,90}};
		int ans=Math.max(Math.max(ninja(a, 0, 0),ninja(a, 0, 1)),ninja(a, 0, 2));
		System.out.println(ans);
	}
	
	public static int ninja(int[][] a,int i,int j)
	{
		if(i>a.length-1||j>2)
		{
			return 0;
		}
		int ans=0;
		if(j==0)
		{
			int training1=ninja(a, i+1, j+1);
			int training2=ninja(a, i+1, j+2);
			ans=a[i][j]+Math.max(training1, training2);
		}
		else if(j==1)
		{
			int training1=ninja(a, i+1, j-1);
			int training2=ninja(a, i+1, j+1);
			ans=a[i][j]+Math.max(training1, training2);
		}
		else if(j==2)
		{
			int training1=ninja(a, i+1, j-1);
			int training2=ninja(a, i+1, j-2);
			ans=a[i][j]+Math.max(training1, training2);
		}
		return ans;
	}
	
}
