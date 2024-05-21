import java.util.*;
class NoofOccurancesOfCharacter
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char c=scan.next().charAt(0);
        String s1=s.replaceAll(String.valueOf(c),"");
        System.out.println(s.length()-s1.length());
    }
}