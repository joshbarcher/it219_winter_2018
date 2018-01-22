import java.awt.Color;

import acm.graphics.GImage;
import acm.graphics.GLine;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;

public class MoreGraphicsClasses extends GraphicsProgram
{
	private static final double WIN_WIDTH = 500;
	private static final double WIN_HEIGHT = 500;
	
	public void init()
	{
		setSize(500, 500);
		setTitle("Practice with Graphics Classes!");
		setBackground(Color.LIGHT_GRAY);
	}
	
	public void run()
	{
		createLines();
		createPolygons();
		createImages();
	}

	//create and alter lines
	public void createLines()
	{
		//defined as two endpoints
		GLine line = new GLine(400, 100, 350, 150);
		line.setColor(Color.WHITE);
		add(line);
		
		//alter the object
		line.setStartPoint(0, 0);
		line.setEndPoint(350, 400);
	}
	
	//create complex shapes
	public void createPolygons()
	{
		//create a polygon
		GPolygon hexagon = new GPolygon(200, 100);
		hexagon.addEdge(50, -50);
		hexagon.addEdge(50, 50);
		hexagon.addEdge(-33, 50);
		hexagon.addEdge(-33, 0);
		hexagon.addEdge(-34, -50);
		
		hexagon.setColor(Color.BLACK);
		hexagon.setFillColor(Color.BLACK);
		hexagon.setFilled(true);
		
		add(hexagon);
	}
	
	//create images
	public void createImages()
	{
		//images are expected to be in the src folder by default?!?!
		//instead this loads them from an images folder located
		//in the top folder of your project
		GImage image = new GImage("../images/pattern.jpg");
		
		//resize the image - x, y, width, height
		image.setBounds(0, 0, WIN_WIDTH, WIN_HEIGHT);
		
		add(image);
	}
}
