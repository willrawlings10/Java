package tanktrouble;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Bullet extends SpaceShip {
	
    private int dx;
    private int dy;
    private int x = 40;
    private int y = 60;
    private int w;
    private int h;
    private Image image;

	public Bullet() 
	{
		loadImage();
	}
	
	private void loadImage() 
	{
        
        ImageIcon ii = new ImageIcon("I:/2017-2018/AP Comp Sci/Upadhya, Suraj/workspace/TankTrouble/tanktrouble/bullet.jpg");
        image = ii.getImage(); 
        
        w = image.getWidth(null);
        h = image.getHeight(null);
    }


}
