import java.util.*;
class IntersectionOfArrays
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int i,j;
        HashSet<Integer> g=new HashSet<>();
        HashSet<Integer> h=new HashSet<>();
        for(i=0;i<m;i++)
        {
            g.add(scan.nextInt());
        }
        for(j=0;j<n;j++)
        {
            h.add(scan.nextInt());
        }
        for(int k:g)
        {
            if(h.contains(k))
            {
                System.out.println(k);
            }
        }
        
    }
}