import java.util.*;
import java.util.regex.*;
class NoOfVowelsConsonants
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine().toLowerCase();
        int vowelCount=0;
        int consonant=0;
        Pattern p1=Pattern.compile("[aeiou]");
        Matcher m1=p1.matcher(s);
        Pattern p2=Pattern.compile("[a-z&&[^aeiou]]");
        Matcher m2=p2.matcher(s);
        while(m1.find())
        {
            vowelCount++;
        }
        while(m2.find())
        {
            consonant++;
        }
        System.out.println(vowelCount+" "+consonant);
        
    }
}