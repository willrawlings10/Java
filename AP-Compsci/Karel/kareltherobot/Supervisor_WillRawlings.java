package kareltherobot;
import kareltherobot.*;

public class Supervisor_WillRawlings extends Gardener_WillRawlings
{
	private Gardener_WillRawlings gardenerA;
	private Gardener_WillRawlings gardenerB;
	private Gardener_WillRawlings gardenerC;

	public Supervisor_WillRawlings (	int st, 	
						int av,			
						Direction dir, 
						int numBeepers,	
						Gardener_WillRawlings botA,	
						Gardener_WillRawlings botB,	
						Gardener_WillRawlings botC )	
	{
		super (st, av, dir, numBeepers);  
		gardenerA = botA;
		gardenerB = botB;
		gardenerC = botC;

	}
	
	public void gardenTime()
	{
		gardenerA.timeToGarden();
		gardenerB.timeToGarden();
		gardenerC.timeToGarden();
	}
	
	
	
	
	
	public void superGarden()
	{
		moveFourPlantFour();
		turnLeft();
		moveFourPlantThree();
		
		
	}
	
	
	
	public void moveFourPlantFour()
	{
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
	}

	public void moveFourPlantThree()
	{
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		
		
		
	}
}
