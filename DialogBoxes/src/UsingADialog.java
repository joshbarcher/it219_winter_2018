import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.io.IODialog;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class UsingADialog extends GraphicsProgram
{
	public void init()
	{
		setSize(500, 500);
	}
	
	public void run()
	{
		RandomGenerator random = new RandomGenerator();
		
		IODialog dialog = new IODialog();
		int number = dialog.readInt("Enter a number of shapes");
		
		for (int i = 1; i <= number; i++)
		{
			int x = random.nextInt(0, 450);
			int y = random.nextInt(0, 450); 
            int width = random.nextInt(50);
            int height = random.nextInt(50);
            
			if (random.nextBoolean()) //create a square
			{
				GRect rect = new GRect(x, y, width, height);
				add(rect);
				rect.setFilled(true);
				rect.setFillColor(random.nextColor());
			}
			else //create a circle
			{
				GOval oval = new GOval(x, y, width, height);
				add(oval);
				oval.setFilled(true);
				oval.setFillColor(random.nextColor());
			}
		}
	}
}
