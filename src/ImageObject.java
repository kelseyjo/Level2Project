import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject {

	BufferedImage image;
	
	public ImageObject(int x, int y, int width, int height, BufferedImage image, Color col)
	{
		super(x,y,width,height, col);
		this.image = image;
	}
	public void draw(Graphics g, Color c)
	{
		g.fillRect(x, y, width, height);
		g.setColor(c);
		g.drawImage(image, x, y, width, height, null);
	}
	
}
