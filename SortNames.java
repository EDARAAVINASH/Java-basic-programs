import java.util.*;
class SortNames
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i;
        TreeSet<String> t=new TreeSet<>();
        for(i=0;i<n;i++)
        {
            t.add(scan.next());
        }
        Iterator it=t.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}