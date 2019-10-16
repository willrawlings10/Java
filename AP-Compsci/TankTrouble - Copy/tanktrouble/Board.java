package tanktrouble;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private SpaceShip spaceShip;
    private final int DELAY = 10;

    public Board() {

        initBoard();
        
	
		
    }

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        //setBackground(Color.black);
        setDoubleBuffered(true);

    	int nLevel =1;
		if(nLevel ==1)
			setSize(1170, 688);		//Set frame size map 1
		if(nLevel==2)
			setSize(943, 700);		//Set frame size map 2
		if(nLevel==3)
			setSize(1205, 909);
		add(new DisplayMap(nLevel));
		setVisible(true);
	
        spaceShip = new SpaceShip();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
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

    public class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            spaceShip.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            spaceShip.keyPressed(e);
        }
    }
}