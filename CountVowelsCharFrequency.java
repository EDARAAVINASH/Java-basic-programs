import java.util.*;
import java.util.regex.*;
import java.util.Map.Entry;
class CountVowelsCharFrequency
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String string=scan.nextLine();
        vowelCount(string);
        frequencyCount(string);
    }
    public static void vowelCount(String string)
    {
        Pattern p=Pattern.compile("[aeiouAEIOU]");
        Matcher m=p.matcher(string);
        int count=0;
        while(m.find())
        {
            count++;
        }
        System.out.println(count);
    }
    public static void frequencyCount(String string)
    {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<string.length();i++)
        {
            char c=string.charAt(i);
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
        }
        for(Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}