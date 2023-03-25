package dynamicProgramming;

public class LootHouses {
	
	public static void main(String[] args) {
		int maxMoneyLooted = maxMoneyLooted(new int[] {5,5,10,100,10,5});
		System.out.println(maxMoneyLooted);
	}
	
	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
		return (int) lootMoney(houses, 0);
	}

	public static long lootMoney(int[] houses,int st)
	{
		if(st>houses.length-1)
		{
			return 0;
		}
		if(st==houses.length-2||st==houses.length-1)
		{
			
		}
		
		return houses[st]+Math.max(lootMoney(houses, st+2), lootMoney(houses, st+3));
		
	}

}
