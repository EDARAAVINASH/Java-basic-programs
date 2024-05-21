import java.util.*;
class AllSubStringsOfString
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
    }
}