import java.awt.Graphics;

import javax.swing.JFrame;

public class GameWindow {
	JFrame frame;
	GamePanel panel;
	public static void main (String[] args)
	{
		new GameWindow();
	}
	
	GameWindow()
	{
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new GamePanel();
		frame.add(panel);
		
		
		
	    
		
	}
	
	
}
