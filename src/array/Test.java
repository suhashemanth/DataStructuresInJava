package array;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static class Pair
	{
		int x;
		int y;
		public Pair(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
		List<Pair> list=new ArrayList<>(); 
		
		Pair p=new Pair(10, 20);
		Pair p1=new Pair(20, 30);
		Pair p2=new Pair(30, 40);
		Pair p3=new Pair(40, 50);
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		for (Pair x:list) {
			System.out.println(x.x+" "+x.y);
		}
	}

}
