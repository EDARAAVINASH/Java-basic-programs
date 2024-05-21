import java.util.*;
import java.util.Map.Entry;
class FirstNonRepeatingCharacter
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
        for(char c:s.toCharArray())
        {
            l.put(c,l.containsKey(c) ? l.get(c)+1:1);
        }
        for(Entry<Character,Integer> entry:l.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.print(entry.getKey());
                break;
            }
        }
    }
}