import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	
	Timer time;
	private int height, width;
	private int x,y;
	private int speedx, speedy;
	
	public GamePanel()
	{
		time = new Timer(100, this);
		time.start();
		x = 1;
		y = 1;
		speedx = 50;
		speedy = 50;
		width = 100;
		height = 100;
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);
		
		
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("+");
		repaint();
		if(x<300)
			x += speedx;
		if(x>=300)
		{
			speedx = 0;
			y += speedy;
		}
		if(y<300 && x >=300)
			y += speedy;
	    if(y>=300)
	    {
	    	speedx = 100;
	    	x+=speedx;
	    }
		
		
	}
}
