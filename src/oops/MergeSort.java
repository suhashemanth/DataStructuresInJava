package oops;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] a= {3,1,2,0,6,4,7,2};
		//sort(a);
		quickSort1(a, 0, a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sort(int[] c)
	{
		if(c.length<=1)
		{
			return;
		}
		int mid=c.length/2;
		int[] a=new int[mid];
		int[] b=new int[c.length-mid];
		for(int i=0;i<mid;i++)
		{
			a[i]=c[i];
		}
		for(int i=mid;i<c.length;i++)
		{
			b[i-mid]=c[i];
		}
		sort(a);
		sort(b);
		merge(a,b,c);
	}
	
	public static void merge(int[] a,int[] b,int[] c)
	{
		int k=0;
		int i=0;
		int j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
	}
	
	//5,4,11,7,8,1,0
	//counter=3
	//7,4,11,5,8,1,0
	//
	//comparable-student(id,age,name)
	
	//compareTo(o1,o2)
	//{
		
	//}
	public static void quickSort(int[] a,int st,int end)
	{
		if(st>=end)
		{
			return;
		}
		int val=a[st];
		int index=0;
		for(int i=st;i<=end;i++)
		{
			if(a[i]<val)
			{
				index++;
			}
		}
		a[st]=a[index];
		a[index]=val;
		
		int i=st;
		int j=end;
		while(i<index && j>index)
		{
			if(a[i]>=val && a[j]<val)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			else if(a[i]>=val && a[j]>val)
			{
				j--;
			}
			else if(a[i]<val)
			{
				i++;
			}
			else
			{
				i++;
				j--;
			}
			
		}
		
		quickSort(a, st, index-1);
		quickSort(a, index+1, end);
	}
	
	public static void quickSort1(int[] input,int st,int end) {
		
		if(st>=end)
    	{
    		return;
    	}
    	int start=input[st];//3
    	int count=0;
    	for(int i=st+1;i<=end;i++)
    	{
    		if(input[i]<start)
    		{
    			count++;//2
    		}
    	}
    	int appendedValue=st+count;//2
    	int temp=input[appendedValue];//2
    	input[appendedValue]=start;
    	input[st]=temp;
    	int i=st;
    	int j=end;
    	while(i<appendedValue && j>appendedValue)
    	{
    		while(i<appendedValue && j>appendedValue)
    	{
			 while(i<appendedValue && input[i] <= input[appendedValue]){
                i++;
            }
            while(j>appendedValue && input[j] > input[appendedValue]){
                j--;
            }
            temp=input[i];
            input[i]=input[j];
            input[j]=temp;
    	}
    	}
    	quickSort1(input, st, appendedValue-1);
    	quickSort1(input, appendedValue+1, end);
	}

}
