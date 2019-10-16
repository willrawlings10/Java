// This assignment will give you practice with printing text to the console.  You will need to know
// how to use the System.out.print() and println() methods.
package javaConcepts;

public class JavaConceptsCh1_WillRawlings 
{

	// Print out YOUR answers to the following review exercises on page 28 of the Java Concepts book:
	// R1.2, R1.4, R1.7, R1.12 
	public static void answersToReviewExercises()
	{
		System.out.println("R1.2: What distinquishes a computer from a typical household appliance?");
		System.out.println("Answer: A computer can be programmed to do multiple tasks.");
		System.out.println(" ");
		System.out.println("R1.4: What is a Java Virtual Machine?");
		System.out.println("Answer: Idealized CPU that is simulated by a program run on actual CPU.");
		System.out.println(" ");
		System.out.println("R1.7: What is a console window?");
		System.out.println("Answer: Shows you what code is running and what errors, if any, are occurring.");
		System.out.println(" ");
		System.out.println("R1.12: What do the following programs print?  Don't guess.  Write a program to find out.");
		System.out.println("a) Answer: 3 + 4.");
		System.out.println("b) Answer: 7.");
		System.out.println("c) Answer: 34.");
		System.out.println(" ");
	}
	
	// Exercise P1.2 facePainter method (page 29 in Java Concepts book)
	// Write a method that prints a face using text characters, hopefully looking better than the one in the textbook 
	public static void facePainter()
	{
		System.out.println("   / / / / / / ");
		System.out.println("  |   O  O   | ");
		System.out.println("( |     ^    | )");
		System.out.println("  |   [__]   | ");
		System.out.println("  |__________| ");
	
	
	}
	

	// Exercise P1.3 ticTacToeBoard method (page 29 in Java Concepts book)
	// Write a method that prints the tic-tac-toe board.  Use looping to get full credit.
	public static void ticTacToeBoard()
	{
		for (int i=0; i<3; i++)
		{
		System.out.println("+---+---+---+ ");
		System.out.println("|   |   |   | ");
		}
		System.out.println("+---+---+---+ ");
	}

}
