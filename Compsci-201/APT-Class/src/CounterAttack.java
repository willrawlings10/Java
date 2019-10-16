
public class CounterAttack 
{
	public int[] analyze(String str, String[] words) 
	{
       
		int [] delimited = new int[words.length];

		String[]  wordSplit = str.split(" ");
		
		for (int j=0;j<words.length;j++)
		{
			int count =0;
			for (int i=0; i<wordSplit.length; i++)
			{
				
			
			
				if (words[j].equals(wordSplit[i]))
				{
					count++;
				}
			
				delimited[j]=count;
			}
		}
		
		
        return delimited;
    }
}
