import java.util.*;
class StockBuySell
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int max=0;
        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            {
                max+=a[i]-a[i-1];
            }
        }
        System.out.println(max);
    }
}