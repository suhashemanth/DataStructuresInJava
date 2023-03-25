package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> letterCombinations = letterCombinations("23");
		System.out.println(letterCombinations);
	}
	
	public static List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        return letterCombinationsHelper(digits,map);
    }

    public static List<String> letterCombinationsHelper(String s,HashMap<Character,String> map)
    {
        if(s.length()==0)
        {
            List<String> list=new ArrayList<String>();
            list.add("");
            return list;
        }
        List<String> smallOutput=
                    letterCombinationsHelper(s.substring(1),map);
        List<String> output=new ArrayList<>();
        String str=map.get(s.charAt(0));
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<smallOutput.size();j++)
            {
            	String newStr="";
                newStr+=str.charAt(i)+smallOutput.get(j);
                output.add(newStr);
            }
            
        }
        return output;
    }
}
