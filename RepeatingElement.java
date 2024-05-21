import java.util.*;
class RepeatingElement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        HashSet<Integer> g=new HashSet<>();
        HashSet<Integer> h=new HashSet<>();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(g.contains(a[i]))
            {
                h.add(a[i]);
            }
            else
            {
                g.add(a[i]);
            }
        }
        for(int c:h)
        {
            System.out.println(c);
        }
    }
}