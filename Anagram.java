import java.util.*;
class Anagram
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        String s2=scan.next();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
    }
}