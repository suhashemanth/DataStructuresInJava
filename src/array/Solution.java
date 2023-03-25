package array;
//(){(})(())
//stack-
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')
        {
            return false;
        }
        stack.push(s.charAt(0));
        int i=1;
        while(!stack.isEmpty() && i<s.length())
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(s.charAt(i)==')')
                {
                   if(!stack.isEmpty() && stack.peek()=='(' )
                   {
                       stack.pop();
                   }
                   else
                   {
                       return false;
                   }
                }
               else if(s.charAt(i)=='}')
                {
                   if(!stack.isEmpty() && stack.peek()=='{' )
                   {
                       stack.pop();
                   }
                   else
                   {
                       return false;
                   }
                }
                else if(s.charAt(i)==']')
                {
                    if(!stack.isEmpty() && stack.peek()=='[' )
                   {
                       stack.pop();
                   }
                   else
                   {
                       return false;
                   }
                }
                else
                {
                    return false;
                }
            }
            i++;
        }
        if(stack.isEmpty())
        {
            //if(i==s.length())
            return true;

        }
        return false;
    }
    
    public static void main(String[] args) {
		
	}
}