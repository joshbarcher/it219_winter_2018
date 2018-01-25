import java.awt.Color;
import acm.graphics.GPen;
import acm.program.GraphicsProgram;

public class GPenPractice extends GraphicsProgram
{
	//this pen is declared as a field so all methods have access
	//to the pen
	private GPen pen = new GPen();
	
	public void run()
	{
		setSize(300, 300);
		
		//create an object
		add(pen);
		
		//use an object!
		pen.showPen();
		pen.move(50, 50);
		
		//fill a region with color
		Color customColor = new Color(46, 107, 40);
		pen.setColor(customColor);
		
		pen.startFilledRegion();
		pen.drawLine(100, 0); //move right
		pen.drawLine(0, 100); //move down
		pen.drawLine(-100, 0); //move left
		pen.drawLine(0, -100); //move up
		pen.endFilledRegion();
		
		//fill a region with color
		pen.setColor(Color.GREEN);
		
		pen.startFilledRegion();
		pen.drawLine(50, -50); //move up-right
		pen.drawLine(100, 0); //move right
		pen.drawLine(-50, 50); //move down-left
		pen.drawLine(-100, 0); //move left
		pen.endFilledRegion();
		
		//move to the right
		pen.drawLine(100, 0);

		//fill a region with color
		pen.setColor(Color.RED);
		
		pen.startFilledRegion();
		pen.drawLine(50, -50); //move up-right
		pen.drawLine(0, 100); //move down
		pen.drawLine(-50, 50); //move down-left
		pen.drawLine(0, -100); //move up
		pen.endFilledRegion();
		
		//create a few pixels
		createPixelAt(240, 240, Color.BLACK);
		createPixelAt(220, 220, Color.BLUE);
		createPixelAt(240, 220, Color.GREEN);
	}
	
	public void createPixelAt(int x, int y, Color color)
	{
		//pick up the pen and move it, then set the color
		pen.setLocation(x, y);
		pen.setColor(color);
		
		//draw the pixel
		pen.startFilledRegion();
		pen.drawLine(20, 0);
		pen.drawLine(0, 20);
		pen.drawLine(-20, 0);
		pen.drawLine(0, -20);
		pen.endFilledRegion();
	}
}



