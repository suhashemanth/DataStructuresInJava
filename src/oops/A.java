package oops;

 class A {
	
	 static int x=10;
	 int y=5;
	 public static void main(String[] args) {
		System.out.println(x);
		System.out.println(x);
		A a =new A();
		System.out.println(a.x);
		a.x=20;
		System.out.println(a.y);
		A b=new A();
		System.out.println(b.y);
		b.y=15;
		System.out.println(a.y);//5
		System.out.println(b.y);
		System.out.println();
		System.out.println(b.x);
		System.out.println(C.r);
	}
	 
	 static class C{
		static int r=25; 
		 public int x()
		 {
			return 10;
			 
		 }
	 }
	 
}
