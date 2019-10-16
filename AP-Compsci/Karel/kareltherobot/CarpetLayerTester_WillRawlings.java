package kareltherobot;

// Ch5 ex. 11 (pages 133-134) - Carpet small rooms
public class CarpetLayerTester_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("carpetLayerWorld.txt");

	   	CarpetLayer_WillRawlings bob;
	   	bob = new CarpetLayer_WillRawlings(1, 1, East, infinity);
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.turnOff();
	}	
}
