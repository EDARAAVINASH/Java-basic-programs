import java.util.*;
class ReverseNumbers
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Stack<Integer> s=new Stack();
        int i;
        for(i=0;i<n;i++)
        {
            s.push(scan.nextInt());
        }
        for(i=0;i<n;i++)
        {
            System.out.println(s.pop());
        }
    }
}