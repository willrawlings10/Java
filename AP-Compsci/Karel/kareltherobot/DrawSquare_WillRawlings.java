
package kareltherobot;
  
public class DrawSquare_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);

				BetterRobot_WillRawlings bob;
				bob = new MoveRightRobot_WillRawlings(2, 2, North, 5);
				bob.draw5BeeperLine();
				bob.turnOff();

	
				bob = new MoveLeftRobot_WillRawlings (6, 6, North, 5); 
				bob.draw5BeeperLine();
				bob.turnOff();
				
				bob = new DiagonalRightRobot_WillRawlings(2, 2, North, 5);
				bob.draw5BeeperLine();
				bob.turnOff();

				bob = new DiagonalLeftRobot_WillRawlings(2, 6, North, 5);
				bob.draw5BeeperLine();
				bob.turnOff();

				
				bob = new MoveLeftRobot_WillRawlings(2, 6, East, 5);
				bob.draw5BeeperLine();
				bob.turnOff();

				bob = new MoveRightRobot_WillRawlings (6, 2, East, 5); 
				bob.draw5BeeperLine();
				bob.turnOff();
				

	}
}