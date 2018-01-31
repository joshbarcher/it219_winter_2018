package loops_animation;

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class SequentialMovement extends GraphicsProgram
{
	public void init()
	{
		setSize(500, 500);
	}
	
	public void run()
	{
		RandomGenerator random = new RandomGenerator();
		
		//create a shape
		GOval ball = new GOval(100, 100, 100, 100);
		add(ball);
		ball.setFilled(true);
		ball.setFillColor(Color.BLUE);
		
		//record each of my ball attributes
		double x = ball.getX();
		double y = ball.getY();
		double width = ball.getWidth();
		double height = ball.getHeight();
		
		//animate!
		while (true)
		{
			//move the ball down and shrink
			for (int i = 1; i <= 100; i++)
			{
				//move the ball down
				y += 2;
				
				//shrink the ball
				width--;
				height--;
				
				//alter the ball dimensions
				ball.setBounds(x, y, width, height);
				
				pause(20);
			}
			
			//move the ball to the right and grow
			for (int i = 1; i <= 100; i++)
			{
				//move the ball to the right
				x += 2;
				
				//grow the ball
				width++;
				height++;
				
				//alter the ball dimensions
				ball.setBounds(x, y, width, height);
				
				pause(20);
			}
			
			//move the ball up and flicker
			for (int i = 1; i <= 100; i++)
			{
				//move the ball up
				y -= 2;
				
				//have the ball flicker
				ball.setFillColor(random.nextColor());
				
				//alter the ball dimensions
				ball.setBounds(x, y, width, height);
				
				pause(20);
			}
			
			//move the ball to the left
			for (int i = 1; i <= 100; i++)
			{
				//move the ball to the left
				x -= 2;
				
				//alter the ball dimensions
				ball.setBounds(x, y, width, height);
				
				pause(20);
			}
		}
	}
}













