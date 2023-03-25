package array;
//)()())
import java.util.function.BiFunction;

public class Test1 {
	public static void main(String[] args) {
		//generate("(()", "");
		int maxBalance=0;
		checkBalance("(()", 0, 0, 0,maxBalance);
		System.out.println(maxBalance);
	}
	
	public static void checkBalance(String s,int open,int close,int counter,int maxBalance)
	{
		if(s.length()==0)
		{
			maxBalance=Math.max(maxBalance,counter);
			open=0;
			close=0;
			return;
		}
		if(open==close)
		{
			counter=counter+2;
		}
		if(s.charAt(0)=='{')
		{
			open++;
		}
		else
		{
			close++;
		}
		checkBalance(s.substring(1), open, close, counter,maxBalance);
		//checkBalance(s.substring(1), open, close, counter,maxBalance);
	}
	
	//pick it 
	//s1="" s=")()())"
	public static void generate(String s,String s1)
	{
		if(s.length()==0)
		{
			for(int i=0;i<s1.length();i++)
			{
				System.out.print(s1.charAt(i)+" ");
			}
			System.out.println();
			return;
		}
		//pick it 
		s1=s1+s.charAt(0);
		generate(s.substring(1), s1);
		char[] ch=s1.toCharArray();
		String s2="";
		for(int i=0;i<s1.length()-1;i++)
		{
			s2=ch[i]+s2;
		}
		s1=new String(s2);
		generate(s.substring(1), s1);
	}
}
