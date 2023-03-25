package com.dsa.backtracking;

public class RatInAMaze {
	
	public static void main(String[] args) {
		int[][] maze= {{1,1,1},{1,0,1},{1,1,1}};
		int[][] visited=new int[maze.length][maze.length];
		path(maze, 0, 0, maze.length, visited);
	}
	
	public static void path(int[][] maze,int r,int c,int n,int[][] visited)
	{
		if(r<0||c<0||r>n-1||c>n-1||maze[r][c]==0||visited[r][c]==1)
		{
			return;
		}
		visited[r][c]=1;

		if(r==n-1 && c==n-1)
		{
			for(int i=0;i<visited.length;i++)
			{
				for(int j=0;j<visited.length;j++)
				{
					System.out.print(visited[i][j]+" ");
				}
				//System.out.println();
				visited[r][c]=0;
			}
			System.out.println();
			return;
		}
		path(maze, r-1, c, n, visited);
		path(maze, r+1, c, n, visited);
		path(maze, r, c-1, n, visited);
		path(maze, r, c+1, n, visited);
		visited[r][c]=0;
	}

}
