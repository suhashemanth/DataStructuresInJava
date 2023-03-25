package array;

public class CountInversion {
	
	
	static int inversionCount;
	public static void main(String[] args) {
		int[] a= {5,3,2,4,1};
		mergeSort(a);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		System.out.println(inversionCount);
	}
	
	public static void mergeSort(int[] a)
	{
		if(a.length==1)
		{
			return;
		}
		int mid=a.length/2;
		int[] b=new int[mid];
		int[] c=new int[a.length-b.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=b.length;i<a.length;i++)
		{
			c[i-b.length]=a[i];
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}

	public static void merge(int[] b, int[] c, int[] a) {
		int i=0;
		int j=0;
		//a=new int[b.length+c.length];
		int k=0;
		while(i<b.length && j<c.length)
		{
			if(b[i]<c[j])
			{
				a[k++]=b[i++];
			}
			else
			{
				inversionCount+=(b.length-i);
				a[k++]=c[j++];
			}
		}
		while(i<b.length)
		{
			a[k++]=b[i++];
		}
		while(j<c.length)
		{
			a[k++]=c[j++];
		}
		
	}

}
