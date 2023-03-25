package dynamicProgramming;

public class CherryPick2 {
	
	public static void main(String[] args) {
		
	}
	
	public static int robot2(int[][] a,int i,int j1,int j2)
	{
		if(j1<0||j2<0||j1>a[0].length-1||j2>a[0].length-1)
		{
			return -10000000;
		}
		if(i==a.length-1)
		{
			if(a[i][j1]==a[i][j2])
			{
				return a[i][j1];
			}
			else
			{
				return a[i][j1]+a[i][j2];
			}
		}
		if(j1==j2)
		{
			int robot1=Math.max(Math.max(robot2(a, i+1, j1-1, j2),robot2(a, i+1, j1, j2)),robot2(a, i+1, j1+1, j2));
			//int robot2=Math.max(Math.max(robot2(a, i+1, j1, j2-1),robot2(a, i+1, j1, j2)),robot2(a, i+1, j1, j2+1));
			return robot1;
		}
		else
		{
			int robot1=Math.max(Math.max(robot2(a, i+1, j1-1, j2),robot2(a, i+1, j1, j2)),robot2(a, i+1, j1+1, j2));
			int robot2=Math.max(Math.max(robot2(a, i+1, j1, j2-1),robot2(a, i+1, j1, j2)),robot2(a, i+1, j1, j2+1));
			return robot1+robot2;
		}
	}

}
