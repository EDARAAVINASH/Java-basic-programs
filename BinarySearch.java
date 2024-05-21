import java.util.*;
class BinarySearch
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
        int search=scan.nextInt();
        Arrays.sort(a);
        binary(a,0,n-1,search);
    }
    public static void binary(int[] a,int low,int high,int search)
    {
        int count=0,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==search)
            {
                count=1;
                System.out.print("Element Found");
                break;
            }
            else if(a[mid]<search)
            {
                low=mid+1;
            }
            else if(a[mid]>search)
            {
                high=mid-1;
            }
        }
        if(count==0)
        {
            System.out.println("Element Not Found");
        }
    }
}