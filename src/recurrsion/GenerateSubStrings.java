package recurrsion;

import java.util.ArrayList;
import java.util.HashMap;

public class GenerateSubStrings {
	
	public static void main(String[] args) {
		ArrayList<String> permutate = permutate("abcd");
		System.out.println(permutate);
		//ArrayList<String> captureString = captureString(permutate);
		//System.out.println(captureString);
	}
	//
	
	public static ArrayList<String> permutate(String s)
	{
		if(s.length()==0)
		{
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		ArrayList<String> smallOutput = permutate(s.substring(1));
		ArrayList<String> output=new ArrayList<String>();
		for(int i=0;i<smallOutput.size();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				String s1=smallOutput.get(i);//"bc"
				String s2=s1.substring(0,j)+s.charAt(0)+s1.substring(j);
				output.add(s2);
			}
		}
		return output;
	}
	
	public static ArrayList<String> captureString(ArrayList<String> list)
	{
		ArrayList<String> duplicate=new ArrayList<>();
		HashMap<String, Integer> map=new HashMap<>();
		for(int i=0;i<list.size();i++)
		{
			if(map.containsKey(list.get(i)))
			{
				map.put(list.get(i), map.get(list.get(i))+1);
			}
			else
			{
				map.put(list.get(i),1);
			}
		}
		for(String s:map.keySet())
		{
			if(map.get(s)>1)
			{
				duplicate.add(s);
			}
		}
		
		return duplicate;
	}

}
