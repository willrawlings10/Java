package kareltherobot;
public class DrawHello_WillRawlings implements Directions
{
    public static void main(String args[])  
    {
    	World.setVisible(true);
    	World.showSpeedControl(true);
    	World.setSize(25,25);

    	UrRobot karel = new UrRobot(1, 1, North, infinity); 
    	karel.putBeeper(); karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.move(); karel.move(); karel.putBeeper(); 
    	karel.move(); karel.move(); karel.putBeeper();  
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); 
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); 
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.turnLeft(); karel.move();
    	karel.putBeeper(); karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft(); 
    	karel.move(); karel.move(); karel.move(); karel.move();
    	karel.move(); karel.putBeeper(); 
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper();  karel.move(); karel.putBeeper(); 
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper(); 
    	karel.move(); karel.putBeeper(); karel.turnLeft();
    	karel.move(); karel.move(); karel.move(); karel.move();
    	karel.move(); karel.putBeeper(); 
    	karel.turnLeft(); karel.move(); karel.putBeeper();  karel.move(); karel.putBeeper(); 
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper(); 
    	karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.move(); karel.move(); karel.move();
    	karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper(); 
    	karel.move(); karel.putBeeper(); karel.turnLeft();
    	karel.move(); karel.move(); karel.move(); karel.putBeeper(); karel.turnLeft();
    	karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); 
    	karel.turnLeft();  karel.move(); karel.putBeeper(); karel.move(); karel.putBeeper();
    	
    	
    	
    	
    	
    	
    	
    	
    	karel.turnOff();
    }
}