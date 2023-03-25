package com.dsa.backtracking;

import java.util.HashMap;

public class NQueens {
	public static class Pair
	{
		int row;
		int col;
		public Pair(int row,int col) {
			this.row=row;
			this.col=col;
		}
		public Pair() {}
	}
	
	public static void main(String[] args) {
		int[][] board=new int[5][5];
		placeQueen(board, 0, 0, 5, new HashMap<>());
	}

	public static void placeQueen(int[][] board,int row,int col,int n,HashMap<Integer, Pair> map)
	{
		if(col==n)
		{
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board[i].length;j++)
				{
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++)
		{
			if(isPlacable(i,col,map))
			{
				board[i][col]=1;
				placeQueen(board, i, col+1, n,map);
				board[i][col]=0;
			}
		}
	}

	private static boolean isPlacable(int row, int col,HashMap<Integer, Pair> map) {
		
		if(col==0)
		{
			map.put(0,new Pair(row, col));
			return true;
		}
		for(int i=col-1;i>=0;i--)
		{
			Pair p=map.get(i);
			if(p.row==row
					||(Math.abs(p.col-col)/Math.abs(p.row-row))==1)
			{
				return false;
			}
			
		}
		map.put(col, new Pair(row,col));
		return true;
	}
}
