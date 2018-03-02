package arrays;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class BouncingBalls extends GraphicsProgram
{
	private static final int MOVEMENT = 1;
	private static final int ANIMATION_PAUSE = 20;
	private static final int BALL_SIZE = 5;
	private static final int NUM_BALLS = 1000;
	private static final int WIN_SIZE = 400;

	public void init()
	{
		setSize(WIN_SIZE, WIN_SIZE);
		setTitle("Bouncing Balls!");
	}
	
	public void run()
	{
		RandomGenerator random = new RandomGenerator();
		
		//make space for 100 balls
		GOval[] balls = new GOval[NUM_BALLS];
		int[] dxs = new int[NUM_BALLS];
		int[] dys = new int[NUM_BALLS];
		
		//create the 100 balls
		for (int i = 0; i < balls.length; i++)
		{
			//create a random position
			int x = random.nextInt(0, WIN_SIZE - BALL_SIZE);
			int y = random.nextInt(0, WIN_SIZE - BALL_SIZE);
			
			//assign a random dx and dy value for the associated ball at index i
			while (dxs[i] == 0 && dys[i] == 0)
			{
				dxs[i] = random.nextInt(-MOVEMENT, MOVEMENT);
				dys[i] = random.nextInt(-MOVEMENT, MOVEMENT);
			}
			
			//create the ball
			GOval ball = new GOval(x, y, BALL_SIZE, BALL_SIZE);
			ball.setFilled(true);
			ball.setFillColor(random.nextColor());
			
			//save the ball and add it to our array
			add(ball);
			balls[i] = ball;
		}
		
		//animate
		while (true)
		{
			//update the position of each ball!
			for (int i = 0; i < balls.length; i++)
			{
				GOval ball = balls[i];
				int dx = dxs[i];
				int dy = dys[i];
				
				ball.move(dx, dy);
				
				//check whether the ball hit the edge of the window
				if (ball.getX() <= 0 || ball.getX() + ball.getWidth() >= WIN_SIZE)
				{
					dxs[i] = -dx;
				}
				
				if (ball.getY() <= 0 || ball.getY() + ball.getHeight() >= WIN_SIZE)
				{
					dys[i] = -dy;
				}
			}
			pause(ANIMATION_PAUSE);
		}
	}
}






