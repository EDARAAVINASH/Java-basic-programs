import java.util.*;
class MoveZerosToEnd
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
        int count=0;
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[count++]=a[i];
            }
        }
        while(count<n)
        {
            a[count++]=0;
        }
        for(int j:a)
        {
            System.out.print(j+" ");
        }
    }
}