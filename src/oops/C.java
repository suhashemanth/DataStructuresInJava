package oops;

public class C {
	
	static String s="suhas";
	static String s1="himanshu";
	static String s2="suhashimanshu";
	static String s3=s+s1;
	public static void main(String[] args) {
		String a=new String(s2);
		String b=new String(s3);
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
			System.out.println(a.equals(b));
			System.out.println(a==b);
		}
}
