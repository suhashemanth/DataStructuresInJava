package dynamicProgramming;

public class CoinTower {
	
	public static void main(String[] args) {
		
		System.out.println(coinTower(9, 3, 4));
	}
	
	// if false a looses
	public static boolean coinTower(int n,int x,int y)
	{
		if(n<0)
		{
			return false;
		}
		if(n==0)
		{
			return false;
		}
		boolean ans1=false;
		if(coinTower(n-1, x, y)==false && n-1>=0)
		{
			ans1=true;
		}
		boolean ans2=false;
		if(coinTower(n-x, x, y)==false && n-x>=0)
		{
			ans2=true;
		}
		boolean ans3=false;
		if(coinTower(n-y, x, y)==false && n-y>=0)
		{
			ans3=true;
		}
		return ans1|ans2|ans3;
	}

}
