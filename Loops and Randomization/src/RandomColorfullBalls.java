import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

@SuppressWarnings("serial")
public class RandomColorfullBalls extends GraphicsProgram
{
	private static final int BALL_SIZE = 20;
	private static final int WIN_WIDTH = 500;
	private static final int WIN_HEIGHT = 500;
	
	public void init()
	{
		setSize(WIN_WIDTH, WIN_HEIGHT);
		setTitle("Display random objects!");
	}
	
	public void run()
	{
		//counting loop
		for (int i = 1; i <= 10; i++)
		{
			createRandomBall();
		}
		
		//animation loop
		while (true)
		{
			createRandomBall();
			
			pause(200);
		}
	}
	
	public void createRandomBall()
	{
		//get a random position for the ball
		RandomGenerator random = new RandomGenerator();
		
		int randomX = random.nextInt(0, WIN_WIDTH - BALL_SIZE);
		int randomY = random.nextInt(0, WIN_HEIGHT - BALL_SIZE);
		int randomSize = random.nextInt(1, BALL_SIZE);
		
		//create and add the ball
		GOval ball = new GOval(randomX, randomY, 
				               randomSize, randomSize);
		add(ball);
		
		boolean isFilled = random.nextBoolean();
		Color color = random.nextColor();
		if (isFilled == true)
		{
			ball.setFillColor(color);
			ball.setFilled(true);
		}
		else
		{
			ball.setColor(color);
		}
	}
}








