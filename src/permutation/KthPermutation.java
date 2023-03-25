package permutation;

import java.util.ArrayList;

public class KthPermutation {
	
	public static void main(String[] args) {
		int[] a= {300, 259, 359, 639, 268, 271, 565, 113, 322, 293, 994, 357, 178, 986, 101, 70, 554, 119, 508, 671, 111, 120, 169, 505, 709, 206, 625, 933, 865, 536, 647, 150, 412, 481, 796, 365, 721, 334, 221, 339, 544, 136, 332, 672, 781, 317, 529, 729, 874, 983, 296, 973, 563, 244, 802, 104, 179, 556, 782, 315, 278, 542, 252, 369, 917, 233, 58, 245, 627, 833, 424, 444, 658, 373, 859, 985, 471, 846, 511, 521, 673, 20, 299, 476};
		int k=1;
		ArrayList<Integer> list=new ArrayList<Integer>();
		kthPermuation(a, k,list);
		System.out.println(list);
	}
	
	public static void kthPermuation(int[] a,int k,ArrayList<Integer> list)
	{
		if(k<0|| a.length<=0)
		{
			return;
		}
		int[] b=new int[a.length-1];
		long val=fact(a.length-1)*1l;//6
		long ratio=k*1l/val*1l;
		int r=0;
		list.add(a[(int)ratio]);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[(int)ratio])
			{
				b[r++]=a[i];
			}
		}
		long factor=val*ratio;
		kthPermuation(b, k-(int)factor, list);
	}
	
	public static long fact(int n)
	{
		if(n==1||n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}

}
