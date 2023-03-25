package recurrsion;

public class RecurruingString {
	
	public static void main(String[] args) {
		StringBuilder findRecurr = findRecurr("AAABCCCCAAAA", 4);
		System.out.println(findRecurr);
		
	}
	
	//abcd
	//
	
	
	public static StringBuilder findRecurr(String s,int k)
	{
		StringBuilder s1=new StringBuilder();
		char ch=s.charAt(0);
		int i=1;
		while(i<s.length())
		{
			String s2="";
			int count=1;
			while(i<s.length() && s.charAt(i)==ch)
			{
				count++;
				i++;
			}
			if(count>=k)
			{
			 for(int j=0;j<k;j++)
			 {
				 s1.append(s.charAt(i-1));
			 }
			}
			if(i<s.length())
			{
				ch=s.charAt(i);
			}
			i=i+1;
		}
		return s1;
	}

}
