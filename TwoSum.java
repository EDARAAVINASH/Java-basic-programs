import java.util.*;
class TwoSum
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}