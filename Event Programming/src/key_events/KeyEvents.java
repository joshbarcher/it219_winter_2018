package key_events;

import java.awt.event.KeyEvent;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class KeyEvents extends GraphicsProgram
{
	private GImage image;
	
	public void init()
	{
		setSize(500, 500);
		
		addKeyListeners();
	}
	
	public void run()
	{
		image = new GImage("../pokemon.png");
		add(image);
		image.setBounds(0, 0, 100, 100);
	}
	
	public void keyPressed(KeyEvent event)
	{
		int keyCode = event.getKeyCode();
		
		/*if (keyCode == KeyEvent.VK_UP)
		{
			image.move(0, -5);
		}
		else if (keyCode == KeyEvent.VK_DOWN)
		{
			image.move(0, 5);
		}
		else if (keyCode == KeyEvent.VK_LEFT)
		{
			image.move(-5, 0);
		}
		else if (keyCode == KeyEvent.VK_RIGHT)
		{
			image.move(5, 0);
		}*/
		
		//alternative with a switch
		switch (keyCode)
		{
			case KeyEvent.VK_UP:
				image.move(0, -5);
				break;
			case KeyEvent.VK_DOWN:
				image.move(0, 5);
				break;
			case KeyEvent.VK_LEFT:
				image.move(-5, 0);
				break;
			case KeyEvent.VK_RIGHT:
				image.move(5, 0);
				break;	
		}
	}
	
	public void keyReleased(KeyEvent event)
	{
		
	}
	
	public void keyTyped(KeyEvent event)
	{
		
	}
}






