import java.util.*;
class SumOfFirstLastDigit
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int last=n%10;
        String s=Integer.toString(n);
        int first=Character.getNumericValue(s.charAt(0));
        System.out.println(last+first);
    }
}