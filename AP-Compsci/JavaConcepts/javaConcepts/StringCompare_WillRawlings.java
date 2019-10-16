package javaConcepts;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class StringCompare_WillRawlings 
{
	Scanner in = new Scanner(System.in);
	public void compare()
	{
		String sentence = JOptionPane.showInputDialog("What Sentence Would You Like To Enter?:");
		int sentLength = sentence.length();
		String searchValue = JOptionPane.showInputDialog("What Search Value Would You Like To Use?:");
		searchValue = searchValue.toLowerCase();
		int seaValLength = searchValue.length();
		int location = sentence.indexOf (searchValue);
		System.out.println("Length Of Sentence: " + sentLength );
		System.out.println("Length Of Search Value: " + seaValLength);
		System.out.println("Location of Search Value in Sentence:" + location);
		
		if (sentence.equalsIgnoreCase(searchValue))
			{
			System.out.println("Are Your Strings Equal?: ");	
			System.out.println("Amazing! Your Sentence and Search Value are Equal!");
				System.out.println(" ");
			}
		else 
			{
				System.out.print("Are Your Strings Equal?: ");
				System.out.println(" Unfortunately, Your Sentence and Search Value are Not Equal. ");
				
			}
		
		int firstWordLocation = sentence.indexOf (" ");
		if (firstWordLocation == -1)
		{
			System.out.println("There Is Only One Word In This Sentence.");
		}
		else
			{
			String firstWord = sentence.substring(0, firstWordLocation);
			System.out.println("First Word of Sentence: " + firstWord);
			}
	}
}


