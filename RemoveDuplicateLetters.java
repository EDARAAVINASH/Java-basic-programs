import java.util.*;
class ReverseWords
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String s1="";
        LinkedHashSet<Character> l=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!l.contains(c))
            {
                l.add(c);
                s1=s1+c;
            }
        }
        System.out.print(s1);
    }
}