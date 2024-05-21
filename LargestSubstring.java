import java.util.*;
class LargestSubstring
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String longtillnow="";
        String longest="";
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(h.contains(c))
            {
                longtillnow="";
                h.clear();
            }
            else
            {
                longtillnow+=c;
                h.add(c);
            }
            if(longest.length() < longtillnow.length())
            {
                longest=longtillnow;
            }
        }
        System.out.println(longest);
    }
}