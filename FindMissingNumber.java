import java.util.*;
class FindMissingNumber
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        HashSet<Integer> h=new HashSet<>();
        while(scan.hasNext())
        {
            h.add(scan.nextInt());
        }
        for(int i=1;i<=n;i++)
        {
            if(!h.contains(i))
            {
                System.out.println(i);
            }
        }
    }
}