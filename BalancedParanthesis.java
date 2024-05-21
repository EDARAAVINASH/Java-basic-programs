import java.util.*;
class BalancedParanthesis
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='{' || c=='[' || c=='(')
            {
                st.push(c);
            }
            else if(!st.isEmpty() && c=='}' && st.peek()=='{')
            {
                st.pop();
            }
            else if(!st.isEmpty() && c==')' && st.peek()=='(')
            {
                st.pop();
            }
            else if(!st.isEmpty() && c==']' && st.peek()=='[')
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        System.out.println(st);
        if(st.isEmpty())
        {
            System.out.print("Balanced Paranthesis");
        }
        else
        {
            System.out.print("Not Balanced Paranthesis");
        }
    }
}