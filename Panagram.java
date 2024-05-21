import java.util.*;
class Panagram
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine().toLowerCase();
        s=s.replaceAll(" ","");
        HashSet<Character> h=new HashSet();
        for(int i=0;i<s.length();i++)
        {
            h.add(s.charAt(i));
        }
        if(h.size()==26)
        {
            System.out.println("Panagram");
        }
        else
        {
            System.out.println("Not Panagram");
        }
    }
}