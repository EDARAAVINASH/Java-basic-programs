import java.util.*;
class InsertAtSpecificArrayIndex
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int pos=scan.nextInt();
        int insert=scan.nextInt();
        for(int i=n;i>pos;i--)
        {
            a[i]=a[i-1];  
        }
        a[pos]=insert;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}