import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame
{
	 public int points(String[] player, 
             String[] dictionary)
	 {
		 int score =0;
		 HashSet<String> playerNoDup = new HashSet<>(Arrays.asList(player));
		 HashSet<String> dictNoDup = new HashSet<>(Arrays.asList(dictionary));
		 
		 
		 for (String s: playerNoDup)
		 {
			 if (dictNoDup.contains(s)==true)
			{
				 score += s.length()*s.length();
			}
			 
		 }
		 
		 
		 return score;
	 }
}
