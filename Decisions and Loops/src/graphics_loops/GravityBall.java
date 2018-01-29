package graphics_loops;
import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class GravityBall extends GraphicsProgram
{
	private static final int WIN_SIZE = 500;
	private static final int BALL_SIZE = WIN_SIZE / 10;
	
	public void init()
	{
		setSize(WIN_SIZE, WIN_SIZE);
		setTitle("Gravity Ball");
	}
	
	public void run()
	{
		RandomGenerator random = new RandomGenerator();
		
		//create the ball
		int xLocation = WIN_SIZE / 2 - BALL_SIZE / 2;
		int yLocation = WIN_SIZE - BALL_SIZE;
		
		GOval ball = new GOval(xLocation, yLocation, BALL_SIZE, BALL_SIZE);
		add(ball);
		ball.setFilled(true);
		ball.setFillColor(Color.CYAN);
		
		//animate!
		int gravity = 2;
		int dy = -20;
		int dx = random.nextInt(-10, 10);
		
		while (true)
		{
			ball.move(dx, dy);
			dy += gravity;
			
			//check for collision with a wall
			if (ball.getX() < 0 || ball.getX() + ball.getHeight() > WIN_SIZE)
			{
				dx = -dx;
			}
			
			//check for bouncing at the bottom of the screen?
			if (ball.getY() + ball.getHeight() >= WIN_SIZE)
			{
				dy = -20;
			}
			
			pause(20);
		}
	}
}









