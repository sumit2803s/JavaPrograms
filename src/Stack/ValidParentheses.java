//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.print(isValid(s));
    }
    public static boolean isValid(String s)
    {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                st.push(')');
            }
            else if(ch=='[')
            {
                st.push(']');
            }
            else if(ch=='{')
            {
                st.push('}');
            }
            else if(st.isEmpty() || st.pop()!=ch)
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}
