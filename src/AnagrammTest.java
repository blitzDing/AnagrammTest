import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AnagrammTest
{

    public static void main(String ...args)
    {

        if(args.length!=2)
        {
            System.out.println("Zu viele oder zu wenige Argumente!");
            System.exit(0);
        }

        String word1 = args[0];
        String word2 = args[1];

        if(isAnagramOf(word1, word2))System.out.println("Die beiden worte sind Anagramme!");
        else System.out.println("Die beiden worte sind keine Anagramme!");
    }

    public static boolean isAnagramOf(String word1, String word2)
    {


        List<Character> charList1 = fromStringToCharList(word1);
        List<Character> charList2 = fromStringToCharList(word2);

        Collections.sort(charList1);
        Collections.sort(charList2);

        return charList1.equals(charList2);
    }

    public static List<Character> fromStringToCharList(String word)
    {

        List<Character> charList = new ArrayList<>();
        for(int n=0;n<word.length();n++)charList.add(word.charAt(n));

        return charList;
    }
}
