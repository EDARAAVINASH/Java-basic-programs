import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        if(s.equals(s1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}