import java.util.*;
class NegativeToStartOfArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        j=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                b[j]=a[i];
                j++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                b[j]=a[i];
                j++;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}