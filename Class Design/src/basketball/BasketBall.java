package basketball;

import acm.util.RandomGenerator;
import colors.Color;

public class BasketBall 
{
	private String type; //college, womens bb, nba
	private String material; //synthetic, leather
	private boolean inflated;
	
	private Color primaryColor;
	private Color secondaryColor;
	
	//default constructor - create a random ball
	public BasketBall()
	{
		RandomGenerator random = new RandomGenerator();
		
		//pick a random type
		int typeOfBall = random.nextInt(1, 3);
		switch (typeOfBall)
		{
			case 1:
				type = "college";
				break;
			case 2:
				type = "womens";
				break;
			case 3:
				type = "nba";
				break;
		}
		
		//pick a random material
		if (random.nextBoolean())
		{
			material = "synthetic";
		}
		else
		{
			material = "leather";
		}
		
		//other random values
		inflated = random.nextBoolean();
		primaryColor = new Color();
		secondaryColor = new Color();
	}
	
	public String toString()
	{
		return "Type: " + type + ", primary: " + primaryColor.toString();
	}
}









