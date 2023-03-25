package bst;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//s=reverse(s);
		System.out.println(s+" kothi");
		
		
	}

	private static String reverse(String s) {
		StringBuilder str=new StringBuilder(s);
		StringBuilder reverse = str.reverse();
		s=new String(reverse);
		return s;
	}

}
