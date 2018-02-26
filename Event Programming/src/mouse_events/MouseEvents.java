package mouse_events;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GRectangle;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MouseEvents extends GraphicsProgram
{
	private GLabel coordinates;
	private GRect rectOne;
	private GRect rectTwo;
	
	public void init()
	{
		setSize(500, 500);
		setTitle("Working with Mouse Events");
		
		addMouseListeners(); //set up our application to respond to mice
		addKeyListeners(); //for the keyboard as well
	}
	
	public void run()
	{
		rectOne = createRectangle(100, 100, 50, 100, Color.BLUE);
		rectTwo = createRectangle(300, 300, 100, 100, Color.YELLOW);
		
		GOval circle = createCircle(100, 300, 120, Color.PINK);
		
		//create a label to see our mouse position
		coordinates = new GLabel("x: ?, y: ?", 400, 30);
		add(coordinates);
	}
	
	public GOval createCircle(int x, int y, int diameter, Color color)
	{
		GOval newCircle = new GOval(x, y, diameter, diameter);
		add(newCircle);
		newCircle.setFillColor(color);
		newCircle.setFilled(true);
		
		return newCircle;
	}
	
	public GRect createRectangle(int x, int y, int width, int height, 
			                     Color color)
	{
		GRect newRectangle = new GRect(x, y, width, height);
		add(newRectangle);
		newRectangle.setFillColor(color);
		newRectangle.setFilled(true);
		
		return newRectangle;
	}
	
	//mouse events
	public void mousePressed(MouseEvent event)
	{
		RandomGenerator random = new RandomGenerator();
		
		int x = event.getX();
		int y = event.getY();
		
		coordinates.setLabel("x: " + x + ", y: " + y);
		
		//how do I determine if I clicked on an object
		GObject clickedOn = getElementAt(x, y);
		if (clickedOn != null)
		{
			clickedOn.setColor(Color.GREEN);
			
			//how do I identify the type of object clicked
			if (clickedOn instanceof GRect)
			{
				//I now know that I have a GRect object in my variable
				GRect rectangle = (GRect)clickedOn;
				rectangle.setFillColor(Color.RED);
			}
			else if (clickedOn instanceof GOval)
			{
				//move the circle randomly
				GOval circle = (GOval)clickedOn;
				circle.setLocation(random.nextInt(0, 380), 
                                   random.nextInt(0, 380));
				
				//make sure there is not collision with another object
				GRectangle circleBoundingBox = circle.getBounds();
				
				if (circleBoundingBox.intersects(rectOne.getBounds()) ||
					circleBoundingBox.intersects(rectTwo.getBounds()))
				{
					System.out.println("Shape collision!");
				}
			}
		}
	}
	
	public void mouseReleased(MouseEvent event)
	{
		
	}
	
	public void mouseClicked(MouseEvent event)
	{
		
	}
	
	//hovering
	public void mouseMoved(MouseEvent event)
	{
		
	}
	
	public void mouseEnter(MouseEvent event)
	{
		
	}
	
	public void mouseExit(MouseEvent event)
	{
		
	}
	
	public void mouseDragged(MouseEvent event)
	{
		
	}
}







