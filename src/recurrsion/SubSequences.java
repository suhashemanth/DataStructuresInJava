package recurrsion;

import java.util.ArrayList;
import java.util.HashMap;

public class SubSequences {
	
	public static void main(String[] args) {
		ArrayList<String> list= subSeq("abcd");
		//System.out.println(list);
		HashMap<Integer,String> map=new HashMap<>();
		map.put(2,"abc");
		map.put(3,"def");
		map.put(4,"ghi");
		map.put(5,"jkl");
		map.put(6,"mno");
		map.put(7,"pqrs");
		map.put(8,"tuv");
		map.put(9,"wxyz");
		ArrayList<String> generateSeq = generateSeq(234, map);
		System.out.println(generateSeq);
	}
	
	public static ArrayList<String> subSeq(String s)
	{
		if(s.length()==0)
		{
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		ArrayList<String> list=new ArrayList<>();
		ArrayList<String> smallOutput=subSeq(s.substring(1));
		list.addAll(smallOutput);
		for(String i:smallOutput)
		{
			list.add(s.charAt(0)+i);
		}
		return list;
	}
	
	public static ArrayList<String> generateSeq(int num,HashMap<Integer, String> map)
	{
		if(num==0)
		{
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		ArrayList<String> smallOutput=generateSeq(num/10, map);
		ArrayList<String> list=new ArrayList<>();
		String s=map.get(num%10);
		for(int i=0;i<smallOutput.size();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				list.add(s.charAt(j)+smallOutput.get(i));
			}
		}
		return list;
	}

}
