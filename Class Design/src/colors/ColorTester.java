package colors;

import acm.util.RandomGenerator;

public class ColorTester 
{
	public static void main(String[] args)
	{
		Color color = new Color(10, 30, 120, 1.0);
		System.out.println(color.toString());
		
		Color random = new Color();
		System.out.println(random.toString());
		
		/*for (int i = 1; i <= 1000; i++)
		{
			random = new Color();
			System.out.println(random.toString());
		}*/
		
		/*RandomGenerator randomGen = new RandomGenerator();
		Color reusedColor = new Color();
		for (int i = 1; i <= 1000; i++)
		{
			//print the color
			System.out.println(reusedColor.toString());
			
			//change it to another random color
			reusedColor.setRed(randomGen.nextInt(0, 255));
			reusedColor.setGreen(randomGen.nextInt(0, 255));
			reusedColor.setBlue(randomGen.nextInt(0, 255));
		}
		
		final int MAX_RGB = 256;
		for (int i = 0; i < MAX_RGB; i++)
		{
			for (int j = 0; j < MAX_RGB; j++)
			{
				for (int k = 0; k < MAX_RGB; k++)
				{
					//alter my red, green and blue values
					reusedColor.alterColor(i, j, k);
					
					//print the color
					System.out.println("r: " + reusedColor.getRed() + 
							", g: " + reusedColor.getGreen() + 
							", b: " + reusedColor.getBlue());
				}
			}
		}*/
		
		//create an array of instances of our class
		Color[] colors = new Color[100];
		
		for (int i = 0; i < colors.length; i++)
		{
			colors[i] = new Color();
		}
		
		//print them all out
		for (int i = 0; i < colors.length; i++)
		{
			System.out.println(colors[i].toString());
		}
		
		//change them
		for (int i = 0; i < colors.length; i++)
		{
			colors[i].convertToGrayscale();
		}
		
		//print them all out
		for (int i = 0; i < colors.length; i++)
		{
			System.out.println(colors[i].toString());
		}
	}
}









