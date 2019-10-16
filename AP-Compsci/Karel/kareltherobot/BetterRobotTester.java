package kareltherobot;
import kareltherobot.*;



public class BetterRobotTester implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
        
        
	
	
	BetterRobot_WillRawlings will = new BetterRobot_WillRawlings (10, 10, North, infinity);
	
	
	will.turnRight();
	will.moveBackward();
	will.turnAround();
	will.turnAround();
	will.moveMile();
	will.moveDecaMile();
	
	}
}
