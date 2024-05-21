import java.util.*;
class NextLargeInArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int next=-1;
            for(j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    next=a[j];
                    break;
                }
            }
            System.out.println(next);
        }
    }
}