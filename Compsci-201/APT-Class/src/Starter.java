import java.util.Arrays;
import java.util.HashSet;

public class Starter 
{
	public int begins(String[] words, String first) 
	{
        int letter = 0;
        
        HashSet<String> worduniq = new HashSet<>(Arrays.asList(words));
        
        for (String word: worduniq)
        {
        	if (word.substring(0,1).equals(first))
        	{
        		letter+=1;
        	}
        }
        
        return letter;
    }

}
