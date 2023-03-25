package array;

public class ReversePairs {

	//1,3,2,3,1
	//2,4,3,5,1
	static int reversePairs=0;
	public static void main(String[] args) {
		
		mergeSort(new int[] {2,4,3,5,1});
		System.out.println(reversePairs);
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
		reversePairs+=merge(b,c,a);
	}

	private static int merge(int[] b, int[] c, int[] a) {
		
		int i=0;
		int j=0;
		int inversionCount=0;
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
				if(b[i]>=2*c[j])
				{
					inversionCount++;
				}
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
		return inversionCount;
	}
}
