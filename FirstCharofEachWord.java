import java.util.*;
class FirstCharofEachWord
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[] a=s.split(" ");
        for(String c:a)
        {
            System.out.print(c.charAt(0)+" ");
        }
    }
}