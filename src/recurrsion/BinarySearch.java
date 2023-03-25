package recurrsion;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a= {1,1,2,3,3,4,5,5,6,6,6,6};
		int val=bs(a,0,a.length-1,7);
		System.out.println(val);
	}
	
	public static int bs(int[] a,int s,int e,int ele)
	{
		if(s>e)
		{
			return e;
		}
		int mid=(s+e)/2;
		if(a[mid]==ele)
		{
			return bs(a,mid+1,e,ele);
			
		}
		else if(a[mid]>ele)
		{
			return bs(a,s,mid-1,ele);
		}
		else
		{
			return bs(a,mid+1,e,ele);
		}
	}

}
