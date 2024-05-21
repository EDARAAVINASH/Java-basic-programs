import java.util.*;
class LeftRotateArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int r=scan.nextInt();
        while(r>0)
        {
            int temp=a[0];
            for(int i=0;i<n-1;i++)
            {
                a[i]=a[i+1];
            }
            a[n-1]=temp;
            r--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}