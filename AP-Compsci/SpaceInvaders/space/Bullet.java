package space;

import info.gridworld.actor.Actor;

public abstract class Bullet extends Actor
{
//we created an abstract class so that if we wanted to add another type of bullet, we could easily do so. 
	public Bullet()
	{
		
	}
	
	public void act()
	{
		move();
	}
	//to be coded in subclasses
	public abstract void move();
}
