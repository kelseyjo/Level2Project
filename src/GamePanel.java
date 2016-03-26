import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	
	Timer time;
	 int height, width;
	 int x,y;
	private int speedx, speedy;
	GameObject ob1;
	Color col;
	ImageObject myImageObject;
	
	     

	
	
	
	public GamePanel()
	{
		time = new Timer(100, this);
		time.start();
		x = 30;
		y = 30;
		speedx = 50;
		speedy = 50;
		width = 100;
		height = 100;
		col = null;
		ob1 = new GameObject(x,y,width,height, col);
		
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(this.getClass().getResourceAsStream("pacManG.png"));
		}
		catch(Exception e)
		{
			System.err.println("There was an error loading your image.");
		}   
		myImageObject = new ImageObject(10,10,100,100,image, null);

		

	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, width, height);
		ob1.draw(g);
		myImageObject.draw(g, null);
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("&");
		repaint();
		
		
		
	}
}
