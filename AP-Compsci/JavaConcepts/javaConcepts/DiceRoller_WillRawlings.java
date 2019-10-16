package javaConcepts;
 
import java.util.Random;

import java.util.Scanner;

// DiceRoller allows the user to roll 5 dice and decide how many dice to roll again.  
// The dice can be rolled 3 times.
public class DiceRoller_WillRawlings 
{
	public DiceRoller_WillRawlings()  //Constructor 
	{	
		// Nothing needed in this constructor
	}
	
	public void rePlay()
	{
		while (true)
		{
			Scanner out =new Scanner(System.in);
			playGame();
			System.out.println("   ");
			System.out.println("Do you want to play again? (yes=1/no=0)");
			int play = out.nextInt();
			if (play!=1)
				{
				System.out.println("Game Over. Great Job!");
				break;
				}
		}
		
	}
	public void playGame()
	{
		rollFirst(5);
		
		Random reroll = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.print( "How Many Dice Do You Want to ReRoll?: "); 
		double reRoll= in.nextDouble();
		
		
		
		if (reRoll ==0)
			{
				System.out.println("Congratulations! Your Yahtzee Turn Is Over.");
			
			}
		
		else
			{
			int i=0;
			
		
		
			if (reRoll>5)
			{
				System.out.print("Error: Not Enough Dice in Yahtzee to Play The Game");
				System.out.println("  ");
				
			}
			else 
			{
				System.out.println("Your Second Dice Roll:" );
				
				while (i <reRoll)
				{
		
					System.out.print( reroll.nextInt(6)+1 + " " );
					i++;
				}
				System.out.println("   ");
			
			
			
			
			Random fella = new Random();
			Scanner input = new Scanner(System.in);
			
			System.out.print( "How Many Dice Do You Want to ReRoll?: "); 
			double fella2 = input.nextDouble();
			
			if (fella2 ==0)
			{
				System.out.println("Congratulations! Your Yahtzee Turn Is Over.");
			
			}
			
			else
				{
				int j=0;
				
				if (fella2 >5)
				{
					System.out.print("Error: Not Enough Dice in Yahtzee to Play The Game7");
				}
				else 
				{
					
					System.out.println("Your Third Dice Roll:" );
					
					while (j <fella2)
					{
			
						System.out.print( fella.nextInt(6)+1 + " " );
						j++;
					}
				
					//System.out.println("  ");
					//System.out.println("  ");
					//System.out.print("YAHTZEE?");
				}
				}
			}
			}
		}
	
	
	

	
	public void rollFirst(int numbers)
	{
		Random roll = new Random();
		
		int i=0;
		System.out.print("Your First Dice Roll:" );
		
			while (i <numbers)
			{
		
				System.out.print( roll.nextInt(6)+1 + " " );
				
				i++;
			}
			
			System.out.println(" ");
	}

		
}

