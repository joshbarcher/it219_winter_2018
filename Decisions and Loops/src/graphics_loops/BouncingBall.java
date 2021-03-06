package graphics_loops;
import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class BouncingBall extends GraphicsProgram
{
	private static final int WIN_SIZE = 500;
	private static final int BALL_SIZE = WIN_SIZE / 10;
	
	public void init()
	{
		setSize(WIN_SIZE, WIN_SIZE);
		setTitle("Bouncing Ball");
	}
	
	public void run()
	{
		//create the ball
		int location = WIN_SIZE / 2 - BALL_SIZE / 2;
		GOval ball = new GOval(location, location, BALL_SIZE, BALL_SIZE);
		add(ball);
		ball.setFilled(true);
		ball.setFillColor(Color.CYAN);
		
		//point it in a random direction
		RandomGenerator random = new RandomGenerator();
		int dx = random.nextInt(-6, 6);
		int dy = random.nextInt(-6, 6);
		
		//move the ball
		while (true)
		{
			
			//move it
			ball.move(dx, dy);
			
			//check for a wall collision on top, bottom
			if (ball.getY() <= 0 || ball.getY() + ball.getHeight() >= WIN_SIZE)
			{
				dy = -dy;

				//if moving to the top now
				if (dy < 0)
				{
					dy -= 1;
				}
				else if (dy > 0) //to the bottom
				{
					dy += 1;
				}
			}
			
			//check left
			if (ball.getX() <= 0 || ball.getX() + ball.getWidth() >= WIN_SIZE)
			{
				dx = -dx;
				
				//if moving to the left now
				if (dx < 0)
				{
					dx -= 1;
				}
				else if (dx > 0) //to the right
				{
					dx += 1;
				}
			}
			
			pause(20);
		}
	}
}











