import java.util.*;
class PrintEvenIndexedElements
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
            if(i%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}