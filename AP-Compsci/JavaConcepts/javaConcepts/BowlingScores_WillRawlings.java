package javaConcepts;

// BowlingScores is used to practice using parallel arrays and 2-dimensional arrays

public class BowlingScores_WillRawlings 
{
	String[] bowlers = { "Slick Rick", "Randy", "Erg Handwerk", "Yiannie V.", "Rocket Raj", "Dapper Dave"};

	int scores[][]= { { 190, 44, 36,297},
			         { 33, 27, 9, 67},
			         { 56, 299, 299, 11},
			         {44, 44, 56, 2 },
			         {276, 299, 298, 284},
			         {288, 299, 299, 300}};
	
	public void printScores() 
	{
		int biggest = scores[0][0];
		int maxBowler=0;
		int minBowler=0;
		int lowest = scores[0][0];
		double totalSum=0;
		for (int row= 0; row<bowlers.length; row++)
		{ 
			double sum=0;
			
			System.out.println(bowlers[row] + " bowled scores of:");
			for (int column=0; column< scores[0].length; column++)
			{
				int tempMax=biggest;
				int tempMin=lowest;
				System.out.println(scores[row][column]);
				sum += scores[row][column];
				totalSum += scores[row][column];
			  biggest= 	Math.max(biggest, scores[row][column]);
			  lowest= 	Math.min(lowest, scores[row][column]);
			  if (tempMax != biggest)
			  {
				  maxBowler=row;
			  }
			  if (tempMin != lowest)
			  {
				  minBowler=row;
			  }
			}
			
			sum= sum/4;
			totalSum= totalSum/24;
			System.out.println("The Average Bowling Score Is: " + sum);
			System.out.println("");
		}
		System.out.println("The Highest Score Was " + biggest + " bowled by " + bowlers[maxBowler]);
		System.out.println("The Lowest Score Was " + lowest + " bowled by " + bowlers[minBowler]);
		System.out.println("The Average Bowling Score For All Bowlers Is:" + totalSum);
		
		
	
		

	}
}
