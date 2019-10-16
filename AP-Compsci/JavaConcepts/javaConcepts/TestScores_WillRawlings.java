package javaConcepts;
  
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestScores_WillRawlings 
{
	//Declare and initialize here the variables you want to use in all methods from this class
	int counter = 0;
	int[] testScores = new int[10];
	
	public void inputScores() 
	{
		while ( counter < 10)
		{
			
			int score= Integer.parseInt(JOptionPane.showInputDialog("Enter a Test Score (Enter 999 to End"));
			if (score == 999)
			{
				break;
			}
			testScores[counter] = score;
			counter++;
		}
	}
	

	public void processScores()
	{
		// Process the test scores per the instructions	
		System.out.print("Your Test Scores Are:");
		int value = 0;
		while (value<counter)
		{
			if (value>0)
			{
				System.out.print(",");
			}
			System.out.print(testScores[value]); 
			value++;
		}
		
	
		int lowest = testScores[0];
		for (int i=0; i<counter; i++)
		{
			lowest = Math.min(lowest, testScores[i]);
		}
		System.out.println(""); 
		System.out.print("Lowest Test Score: " + lowest);
		
		int highest = testScores[0];
		for (int j=0; j<counter; j++)
		{
			highest = Math.max(highest, testScores[j]);
		}
		System.out.println(""); 
		System.out.println("Highest Test Score: " + highest);
		
		double sum=0.0;
		
		for (int i= 0; i<counter; i++)
		{
			sum+= testScores[i];
		}
		
		double average= (sum/counter);
		
		System.out.println("Average Test Score:" + average);
	}
}