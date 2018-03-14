package colors;

import acm.util.RandomGenerator;

public class Color 
{
	private int red, green, blue;
	private double alpha;
	
	public Color()
	{
		RandomGenerator random = new RandomGenerator();
		
		red = random.nextInt(0, 255);
		green = random.nextInt(0, 255);
		blue = random.nextInt(0, 255);
		alpha = 1.0;
	}
	
	public Color(int newRed, int newGreen, 
			int newBlue, double newAlpha) 
	{
		red = newRed;
		green = newGreen;
		blue = newBlue;
		alpha = newAlpha;
	}
	
	//methods
	
	public void convertToGrayscale()
	{
		int average = (red + green + blue) / 3;
		
		red = green = blue = average;
	}
	
	public void alterColor(int newRed, int newGreen, int newBlue)
	{
		red = newRed;
		green = newGreen;
		blue = newBlue;
	}
	
	//getters/setters

	public int getRed() 
	{
		return red;
	}

	public int getGreen() 
	{
		return green;
	}

	public int getBlue() 
	{
		return blue;
	}

	public double getAlpha() 
	{
		return alpha;
	}

	public void setRed(int newRed) 
	{
		red = newRed;
	}

	public void setGreen(int newGreen) 
	{
		green = newGreen;
	}

	public void setBlue(int newBlue) 
	{
		blue = newBlue;
	}

	public void setAlpha(double newAlpha) 
	{
		alpha = newAlpha;
	}
	
	public String toString()
	{
		return "r: " + red + ", g: " + green + 
				", b: " + blue + ", a: " + alpha;
	}
}













