import java.util.*;
class SquaredArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            int x=scan.nextInt();
            a[i]=x*x;
        }
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}