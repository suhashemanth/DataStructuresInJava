package recurrsion;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterPhone {
	//012345
	public static void main(String[] args) {
		
		ArrayList<String> letterCombinations = letterCombinations("23");
		System.out.println(letterCombinations);
		
	}
	
	 public static ArrayList<String> letterCombinations(String A) {
	        HashMap<Integer,String> map=new HashMap<>();
	        map.put(0,"0");
	        map.put(1,"1");
	        map.put(2,"abc");  
	        map.put(3,"def");
	        map.put(4,"ghi");
	        map.put(5,"jkl");
	        map.put(6,"mno");
	        map.put(7,"pqrs");
	        map.put(8,"tuv");
	        map.put(9,"wxyz"); 
	        return letterCombinationsHelper(A,map);
	    }   

	    public static ArrayList<String> letterCombinationsHelper(String A,HashMap<Integer,String> map)
	    {
	        if(A.length()==0)
	        {
	            ArrayList<String> list=new ArrayList<>();
	            list.add("");
	            return list;
	        }
	        ArrayList<String> output=new ArrayList<>();
	        ArrayList<String> smallOutput=letterCombinationsHelper(A.substring(1),map);//a,b,c
	        String s=map.get(A.charAt(0));
	        for(int i=0;i<s.length();i++)
	        {
	            String s1="";
	            for(int j=0;j<smallOutput.size();j++)
	            {
	                s1=s1+smallOutput.get(j)+s.charAt(i);
	                output.add(s1);
	            }
	        }
	        return output;
	    }

}
