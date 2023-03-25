package dynamicProgramming;

public class CoinChange {
	
	public static void main(String[] args) {
		int countWaysToMakeChange = countWaysToMakeChange(new int[] {1,2,3,4,5,6},200,0);
		System.out.println(countWaysToMakeChange);
	}
	
	public static int countWaysToMakeChange(int denominations[], int value,int st){
        // Write your code here
		if(value<0||st>denominations.length-1)
		{
			return 0;
		}
		if(value==0)
		{
			return 1;
		}
		int pick=countWaysToMakeChange(denominations, value-denominations[st], st);
		value=value+denominations[st];
		int donotPick=countWaysToMakeChange(denominations, value, st+1);
		return pick+donotPick;
	}

}
