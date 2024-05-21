import java.util.*;
class NoOfWords
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String a[]=s.split(" ");
        System.out.println(a.length);
    }
}