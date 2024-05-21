import java.util.*;
class EvenLengthWordInString
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        for(String c:s.split(" "))
        {
            if(c.length()%2==0)
            {
                System.out.println(c);
            }
        }
    }
}