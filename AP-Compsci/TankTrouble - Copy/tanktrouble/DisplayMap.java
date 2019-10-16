package tanktrouble;


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

import tanktrouble.Board.TAdapter;

import javax.imageio.*;

import javax.imageio.ImageIO;
	
	public class DisplayMap  extends JPanel implements ActionListener{
		private BufferedImage img; 
	    private Timer timer;
	    private SpaceShip spaceShip;
	    private final int DELAY = 10;
		
	    public DisplayMap(int level){
	        addKeyListener(new TAdapter());
	        setFocusable(true);
	        //setBackground(Color.black);
	        setDoubleBuffered(true);
			try{
				if(level==1)
					img = ImageIO.read(new File("I:/2017-2018/AP Comp Sci/Upadhya, Suraj/workspace/TankTrouble/tanktrouble/map1.gif"));
				if(level==2)
					img = ImageIO.read(new File("I:/2017-2018/AP Comp Sci/Upadhya, Suraj/workspace/TankTrouble/tanktrouble/map2.gif"));
				if(level==3)
					img = ImageIO.read(new File("I:/2017-2018/AP Comp Sci/Upadhya, Suraj/workspace/TankTrouble/tanktrouble/map3.gif"));
			}catch (IOException e){
				e.printStackTrace();
			}
			spaceShip = new SpaceShip();

		    timer = new Timer(DELAY, this);
		    timer.start();
		}

		public void paint(Graphics g){
			g.drawImage(img, 0,0,null);
		}
		 public void paintComponent(Graphics g) {
		        super.paintComponent(g);

		        doDrawing(g);
		        
		        Toolkit.getDefaultToolkit().sync();
		    }
		    
		    private void doDrawing(Graphics g) {
		        
		        Graphics2D g2d = (Graphics2D) g;

		        g2d.drawImage(spaceShip.getImage(), spaceShip.getX(), 
		            spaceShip.getY(), this);
		    }
		    
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        step();
		    }
		    
		    private void step() {
		        
		        spaceShip.move();
		        
		        repaint();     
		    }    

		    private class TAdapter extends KeyAdapter {

		        @Override
		        public void keyReleased(KeyEvent e) {
		            spaceShip.keyReleased(e);
		        }

		        @Override
		        public void keyPressed(KeyEvent e) {
		            spaceShip.keyPressed(e);
		        }
		    }
		
	
//	public static void main(String [] args)
//	{
//		JFrame frame = new JFrame();	//Instantiate new frame	
//		int nLevel =1;
//		if(nLevel ==1)
//			frame.setSize(1170, 688);		//Set frame size map 1
//		if(nLevel==2)
//			frame.setSize(943, 700);		//Set frame size map 2
//		if(nLevel==3)
//			frame.setSize(1205, 909);		//Set frame size map 3
////		frame.setTitle("Solar System");	
//		frame.getContentPane().setBackground(Color.WHITE);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		DisplayMap component = new DisplayMap(nLevel);  //Instantiate component
//		frame.add(component);		//Add component to frame
//		frame.setVisible(true);		//Set frame visible
//	}
	}
	
	
