import java.util.*;
class RotatedSubString
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String string=scan.next();
        String rotated=scan.next();
        String string2=string+string;
        if(string2.contains(rotated) && string.length()==rotated.length())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}