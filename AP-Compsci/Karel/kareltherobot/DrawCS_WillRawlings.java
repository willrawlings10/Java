package kareltherobot;
public class DrawCS_WillRawlings implements Directions
{
    public static void main(String args[])  
    {
    	World.setVisible(true);
    	World.showSpeedControl(true);

    	UrRobot karel = new UrRobot(1, 1, North, infinity);  
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.move(); karel.move();
    	karel.turnLeft(); karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper(); 
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.move(); karel.turnLeft();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	 karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper();
    	karel.move(); karel.putBeeper();
    	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    	karel.move(); karel.putBeeper();
    karel.move(); karel.putBeeper();
    karel.turnLeft(); karel.move();
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    karel.move(); karel.move();karel.move();
    karel.move(); karel.move(); 
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft();  
    karel.move();  	karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    karel.move(); karel.pickBeeper();karel.move(); karel.pickBeeper();
    karel.move(); karel.pickBeeper(); karel.move(); karel.move(); karel.pickBeeper();
    karel.move(); karel.pickBeeper(); karel.move(); karel.pickBeeper();
    karel.turnLeft(); karel.move(); karel.pickBeeper();
    karel.turnLeft(); karel.move(); karel.move();
    karel.move(); karel.move(); karel.move();
    karel.move(); karel.pickBeeper(); 
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    karel.move(); karel.pickBeeper();  
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft(); 
    karel.move();  karel.move();  karel.move();  karel.move();
    karel.pickBeeper(); karel.move(); karel.pickBeeper(); 
    karel.move(); karel.pickBeeper(); 
    karel.turnLeft();  karel.move(); karel.turnLeft();
    karel.move(); karel.move(); karel.pickBeeper(); karel.move(); karel.move();  
    karel.move(); karel.move(); karel.pickBeeper();
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    karel.move(); karel.pickBeeper();
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft();
    karel.move(); karel.pickBeeper(); karel.move(); karel.pickBeeper();
    karel.move(); karel.move(); karel.pickBeeper(); 
    karel.move(); karel.pickBeeper(); karel.move(); karel.pickBeeper();
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft(); 
    karel.move(); karel.move(); 
    karel.move(); karel.move(); 
    karel.move(); 
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft(); 
    karel.move(); karel.move(); karel.move(); karel.move(); 
    karel.move(); karel.move(); karel.move(); 
    karel.turnLeft(); karel.turnLeft(); karel.turnLeft();




        karel.turnOff();
    } 
}