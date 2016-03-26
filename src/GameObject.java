import java.awt.Graphics;
import java.awt.*;
public class GameObject {

	 int x;
	 int y;
	 int width;
	 int height;
	 Color c;
	public GameObject(int x, int y, int w, int h, Color col)
	{
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		c = col;
	}
	
	public void draw(Graphics g)
	{
		g.fillOval(x, y, width, height);
		
	
	}
}
