package kareltherobot;

public class MoveChoreographer_WillRawlings extends UrRobot
{
	private UrRobot friendA;
	private UrRobot friendB;
	private UrRobot friendC;

	public MoveChoreographer_WillRawlings (	int st, 		//Street
								int av,			//Avenue
								Direction dir,  //Directions
								int numBeepers,	//Number of beepers
								UrRobot botA,	//First robot
								UrRobot botB,	//Second robot
								UrRobot botC )	//Third robot
	{
		super (st, av, dir, numBeepers);  // must come first in method
		friendA = botA;
		friendB = botB;
		friendC = botC;
	}
	
	public void moveFriends()
	{
		friendA.move();
		friendB.move();
		friendC.move();
	}

}
