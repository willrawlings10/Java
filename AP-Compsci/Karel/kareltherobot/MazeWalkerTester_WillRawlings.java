package kareltherobot;

import java.awt.Color; 

public class MazeWalkerTester_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("maze2.txt");

	   	MazeWalker_WillRawlings bob;
	   	bob = new MazeWalker_WillRawlings(2, 2, North, 0);
		while(true)
			{
			bob.runMaze();
			}
	   	
	   	
	   //	bob = new MazeWalker_WillRawlings(7, 2, North, 0);
		//bob.followWallRight();
	 

	  // 	bob = new MazeWalker_WillRawlings(7, 7, North, 0);
		//bob.followWallRight();
	   

	  // 	bob = new MazeWalker_WillRawlings(2, 7, North, 0);
	//	bob.followWallRight();
	  
	   	
	}	
}

