import java.awt.Color;
import java.awt.Font;

import acm.graphics.GArc;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsClasses extends GraphicsProgram
{
	//this runs first and sets up our application
	public void init()
	{
		setSize(500, 500);
		setTitle("Practice with Graphics Classes!");
		setBackground(Color.LIGHT_GRAY);
	}
	
	//this will execute the application
	public void run()
	{
		//call our custom methods here...
		addRectangles();
		addCirclesAndOvals();
		addLabels();
		createArcsAndPolygons();
		
		//draw a few pixels
		createSquareAt(60, 60);
		createSquareAt(120, 60);
		createSquareAt(40, 40);
	}
	
	//this is a custom method that adds rectangles
	public void addRectangles()
	{
		//a new rectangle with x, y, width, height
		GRect rectangleOne = new GRect(50, 50, 100, 200);
		add(rectangleOne);
		
		//add some color
		rectangleOne.setColor(Color.BLUE);
		rectangleOne.setFillColor(Color.YELLOW);
		rectangleOne.setFilled(true);
		
		GRect rectangleTwo = new GRect(70, 70, 100, 200);
		add(rectangleTwo);
		
		//add some color
		rectangleTwo.setColor(Color.GREEN);
		rectangleTwo.setFillColor(Color.RED);
		rectangleTwo.setFilled(true);
	}
	
	//this will add circles or ovals
	public void addCirclesAndOvals()
	{
		//an oval is defined by its BOUNDING BOX
		GOval oval = new GOval(300, 300, 50, 100);
		add(oval);
		
		oval.setFillColor(Color.PINK);
		oval.setFilled(true);
	}
	
	//this will add text to the window
	public void addLabels()
	{
		//create some text
		GLabel message = new GLabel("Hello, good morning!");
		add(message);
		
		//move the text somewhere else on the screen
		message.setLocation(300, 100);
		
		//set new styles for the font of the text
		Font myFont = new Font("Lucida Blackletter", Font.BOLD, 24);
		message.setFont(myFont);
	}

	public void createSquareAt(int x, int y)
	{
		//place a new rectangle at the given (x, y) coordinate
		GRect pixel = new GRect(x, y, 20, 20);
		add(pixel);
	}

	//create some complex shapes
	public void createArcsAndPolygons()
	{
		//add a pizza slice - x, y, width, height, start, sweep
		GArc pizza = new GArc(350, 350, 100, 100, 240, 60);
		add(pizza);
		
		//add some color
		pizza.setFillColor(Color.ORANGE);
		pizza.setFilled(true);
		
		//add pacman!
		GArc pacman = new GArc(100, 400, 100, 100, 45, 270);
		add(pacman);
		pacman.setFillColor(Color.YELLOW);
		pacman.setFilled(true);
	}
}









