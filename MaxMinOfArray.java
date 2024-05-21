import java.util.*;
class MaxMinOfArray
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
        int min=a[0];
        int max=a[0];
        for(i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Maximum = "+max+"\n"+"Minimum = "+min);
    }
}