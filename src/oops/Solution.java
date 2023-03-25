package oops;

import java.util.HashSet;

class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        return findVows(s.substring(0,mid),s.substring(mid,s.length()));
    }

    public boolean findVows(String s1,String s2)
    {
        HashSet<Character> set=new HashSet<>();
        Character[] ch={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<ch.length;i++)
        {
            
        }
        int count1=0;
        for(int i=0;i<s1.length();i++)
        {
            if(set.contains(s1.charAt(i)))
            {
                count1++;
            }
        }
        int count2=0;
        for(int i=0;i<s2.length();i++)
        {
            if(set.contains(s2.charAt(i)))
            {
                count2++;
            }
        }
        if(count1==count2)
        {
            return true;
        }
        return false;
    }
}