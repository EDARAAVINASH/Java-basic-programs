import java.util.*;
class ReverseWordsOfArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                while(!st.isEmpty())
                {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
            else
            {
                st.push(c);
            }
        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop());
        }
    }
}