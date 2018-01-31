package loops_animation;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class MovingALine extends GraphicsProgram
{
	public void init()
	{
		setSize(500, 500);
	}
	
	public void run()
	{
		RandomGenerator random = new RandomGenerator();
		
		GLine line = new GLine(100, 100, 200, 200);
		add(line);
		
		GLine anotherLine = new GLine(200, 100, 300, 100);
		add(anotherLine);
		
		int x = 200, y = 200;
		int dx = 1;
		
		while (true)
		{
			//moving our first line
			x += dx;
			y += random.nextInt(-1, 1);
			line.setEndPoint(x, y);
			
			if (x >= 250)
			{
				//reverse the leg
				dx = -dx;
			}
			
			//moving our second line
			anotherLine.move(0, 1);
			
			pause(20);
		}
	}
}
