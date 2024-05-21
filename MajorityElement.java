import java.util.*;
import java.util.Map.Entry;
class MajorityElement
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=scan.nextInt();
            h.put(p,h.containsKey(p)?h.get(p)+1:1);
        }
        int count=0;
        for(Entry<Integer,Integer> entry:h.entrySet())
        {
            if(entry.getValue()>n/2)
            {
                System.out.println(entry.getKey());
                count=1;
            }
        }
        if(count==0)
        {
            System.out.println("No Majority Element");
        }
    }
}