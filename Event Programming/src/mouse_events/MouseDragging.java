package mouse_events;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MouseDragging extends GraphicsProgram
{
	private GRect draggedObject;
	
	//fields for the graphics objects on our window
	private GRect grayRect;
	private GRect greenRect;
	
	private double mouseDx;
	private double mouseDy;
	
	public void init()
	{
		setSize(500, 500);
		setTitle("Working with Mouse Dragging");
		
		addMouseListeners(); //set up our application to respond to mice
		addKeyListeners(); //for the keyboard as well
	}
	
	public void run()
	{
		grayRect = createRectangle(50, 50, 100, 100, Color.DARK_GRAY);
		greenRect = createRectangle(250, 250, 50, 50, Color.GREEN);
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
	
	public void mousePressed(MouseEvent event)
	{
		//determine if I clicked on an object, and then "register" it
		GObject clicked = getElementAt(event.getX(), event.getY());
		
		if (clicked != null)
		{
			draggedObject = (GRect)clicked;
			
			//record the location of the mouse
			mouseDx = event.getX() - draggedObject.getX();
			mouseDy = event.getY() - draggedObject.getY();
		}
	}
	
	public void mouseReleased(MouseEvent event)
	{
		//de-register the dragged object
		draggedObject = null;
	}
	
	public void mouseDragged(MouseEvent event)
	{
		//double check that we are actually dragging an object
		if (draggedObject != null)
		{
			//adjust for them mouse location
			draggedObject.setLocation(event.getX() - mouseDx, 
					                  event.getY() - mouseDy);
			
			//draggedObject.setLocation(event.getX(), event.getY());
			
			//check for collision...
			if (draggedObject == grayRect &&
				draggedObject.getBounds().intersects(greenRect.getBounds()))
			{
				RandomGenerator random = new RandomGenerator();
				
				//change the color of the green rectangle
				greenRect.setFillColor(random.nextColor());
			}
			
			if (draggedObject == greenRect &&
				draggedObject.getBounds().intersects(grayRect.getBounds()))
			{
				RandomGenerator random = new RandomGenerator();
				
				//move the gray rectangle randomly
				grayRect.setLocation(random.nextInt(0, 400), 
						             random.nextInt(0, 400));
			}
		}
	}
}








