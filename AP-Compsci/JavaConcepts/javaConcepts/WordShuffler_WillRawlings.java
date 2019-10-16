package javaConcepts;

public class WordShuffler_WillRawlings 
{
	// Use this method signature
	// The parameter is a 2-dim array of words
	// The method will return a 2-dim array of shuffled words

	
	
	public String[][] shuffleWords(String[][] words) 
	{
		int rowCounter=0;
		for (int row= 0; row<words.length; row++)
		{ 
			
				for (int column=0; column< words[0].length; column++)
					{
				if( words[row][column].substring(0,1).equals("a" ) || words[row][column].substring(0,1).equals("e" ) || words[row][column].substring(0,1).equals("i" ) || words[row][column].substring(0,1).equals("o" ) || words[row][column].substring(0,1).equals("u" ))
					{
						if (column !=0)
							{String a= words[row][column];
						String b= words[row][column-1];
						words[row][column]=b;
						words[row][column-1]=a;
						
							}
						if (column==0 && row!=0 )
						{
							String c= words[row][column];
							String d= words[row-1][column];
							words[row][column]=d;
							words[row-1][column]=c;
							
						}
						
					}
				else
				{
					String word=words[row][column];
					word= word.substring(word.length()-1) + word.substring(1, word.length()-1) + word.substring(0,1);
					words[row][column]=word;
					
				}
					
					
					}
			
				
		}
		return words;
					
	}
			
	
	
}