import java.util.HashMap;

public class Anonymous 
{
	public int howMany(String[] headlines, String[] messages) 
	{
		int counts[] = new int[256];
			for (String str : headlines)
			{
				for (char ch : str.toLowerCase().toCharArray())
				{
					if (ch == ' ') continue;
					counts [ch] = counts[ch] + 1;

				}
			}
			
		int counter =0;
		int charCounter=0;
		
		for (String str : headlines)
		{
			int[] messenger = new int[256];
			for (char ch : str.toLowerCase().toCharArray())
			{
				if (ch == ' ') continue;
				messenger[ch] = messenger[ch] + 1;
				if (messenger[ch]==(counts[ch]))
				{
					charCounter++;
				}

			}
			if (charCounter == str.length())
			{
				counter++;
			}
			
		}
		return counter;
	}

}