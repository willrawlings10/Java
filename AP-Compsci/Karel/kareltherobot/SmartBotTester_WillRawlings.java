package kareltherobot;
import kareltherobot.*;

// The following client class will turn a robot off if there is a problem with one of your methods.
// All robots should be positioned on the same corner where they were originally instantiated.
public class SmartBotTester_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("smartbotWorld.txt");

	   	// There is NO beeper to the left, so robot should not turn off
		SmartBot_WillRawlings einstein = new SmartBot_WillRawlings(2, 2, North, 0);
		if (einstein.beeperIsToLeft())
		{
			einstein.turnOff();
		}

	   	// There is a beeper to the left, so robot should not turn off
		einstein = new SmartBot_WillRawlings(2, 4, North, 0);
		if (!einstein.beeperIsToLeft())
		{
			einstein.turnOff();
		}

	   	// There is a beeper to the right, so robot should not turn off
		einstein = new SmartBot_WillRawlings(3, 4, North, 0);
		if (!einstein.beeperIsToRight())
		{
			einstein.turnOff();
		}

	   	// There is NO beeper to the right, so robot should not turn off
		einstein = new SmartBot_WillRawlings(3, 6, North, 0);
		if (einstein.beeperIsToRight())
		{
			einstein.turnOff();
		}

	   	// There is only 1 beeper on the corner, so robot should not turn off
		einstein = new SmartBot_WillRawlings(2, 7, North, 0);
		if (einstein.twoBeepersOrMoreOnCorner())
		{
			einstein.turnOff();
		}
		if (einstein.anyBeepersInBeeperBag())
		{
			einstein.turnOff();
		}


	   	// There are 2 beepers on the corner, so robot should not turn off
		einstein = new SmartBot_WillRawlings(2, 8, North, 0);
		if (!einstein.twoBeepersOrMoreOnCorner())
		{
			einstein.turnOff();
		}
		if (einstein.anyBeepersInBeeperBag())
		{
			einstein.turnOff();
		}

	   	// There is more than one 1 beeper on the corner, so robot should not turn off
		einstein = new SmartBot_WillRawlings(2, 9, North, 0);
		if (!einstein.twoBeepersOrMoreOnCorner())
		{
			einstein.turnOff();
		}
		if (einstein.anyBeepersInBeeperBag())
		{
			einstein.turnOff();
		}

	   	// Robot should face north
		einstein = new SmartBot_WillRawlings(6, 2, East, 0);
		einstein.faceNorth();
		if (!einstein.facingNorth())
		{
			einstein.turnOff();
		}

	   	// Robot should face west
		einstein = new SmartBot_WillRawlings(6, 4, North, 0);
		einstein.faceWest();
		if (!einstein.facingWest())
		{
			einstein.turnOff();
		}

	   	// Robot should face south
		einstein = new SmartBot_WillRawlings(6, 6, North, 0);
		einstein.faceSouth();
		if (!einstein.facingSouth())
		{
			einstein.turnOff();
		}

	   	// Robot should face east
		einstein = new SmartBot_WillRawlings(6, 8, North, 0);
		einstein.faceEast();
		if (!einstein.facingEast())
		{
			einstein.turnOff();
		}
	
	}
}

