import java.util.*;
import java.util.Map.Entry;
class StringCompression
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            l.put(c,l.containsKey(c)?l.get(c)+1:1);
        }
        for(Entry<Character,Integer> entry:l.entrySet())
        {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
        
    }
}