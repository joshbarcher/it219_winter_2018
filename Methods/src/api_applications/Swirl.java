package api_applications;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Swirl extends GraphicsProgram
{
	private static final int WIN_SIZE = 450;
	private static final int BALL_SIZE = 20;

	public void init()
	{
		setSize(WIN_SIZE, WIN_SIZE);
	}
	
	public void run()
	{
		RandomGenerator random = new RandomGenerator();
		double center = (WIN_SIZE - BALL_SIZE) / 2;
		
		for (int i = 1; i <= 10000; i += 7)
		{
			int degrees = i;
			double radians = Math.toRadians(degrees);
			
			//keep the length of the line to be the same as the angle
			double x = (i / 10) * Math.cos(radians);
			double y = -(i / 10) * Math.sin(radians);
			
			GOval ball = new GOval(center + x, center + y, BALL_SIZE, BALL_SIZE);
			add(ball);
			ball.setFilled(true);
			ball.setFillColor(random.nextColor());
		}
	}
}










