import java.text.DecimalFormat;

import acm.util.RandomGenerator;

public class ConsoleInputOutput 
{
	//creating an instance of the Console class
	private Console console = new Console();
	
	public void conversions()
	{
		//integer types - byte, short, int, long
		byte num1 = 100;
		//num1 = 10000; //not enough room in a byte
		
		int num2 = 96;
		long num3 = 5000000000L; //use L to define a long
		
		//floating point types - float, double
		float num4 = 0.5F;
		double num5 = 0.5;
		
		//how to convert between numeric types
		
		//widening conversion
		int num6 = num1;
		long num7 = num6;
		
		//narrowing conversion
		num1 = (byte)num2; //int --> byte, requires "casting"
		System.out.println("int --> byte: " + num1);
	}
	
	public void sayHi()
	{
		//ask the user for their name
		String fName = console.getString("Enter first name");
		String lName = console.getString("Enter last name");
		String middle = console.getString("Enter a middle initial");
		
		//print the name back for the user
		System.out.print(fName);
		System.out.print(" " + middle + ". ");
		System.out.println(lName); //adds a new line here
	}
	
	public void diceRolling()
	{
		//welcome the user
		System.out.println("Welcome to our dice game!");
		System.out.println("*************************");
		System.out.println(); //enter a new line
		
		//get the type of dice
		int numSides = console.getInt("Enter a number of dice sides");
		int numDice = console.getInt("Enter a number of dice");
		
		//roll the dice
		RandomGenerator random = new RandomGenerator();
		
		for (int i = 1; i <= numDice; i++)
		{
			//find the side of the die that is up
			int value = random.nextInt(1, numSides);
			System.out.println("You rolled a " + value + "!");
		}
	}
	
	public void divide()
	{
		//get user inputs
		int numerator = console.getInt("Enter a numerator");
		int denominator = console.getInt("Enter a denominator");
		
		//check for division by zero
		if (denominator == 0)
		{
			System.out.println("You cannot divide by zero!");
			return; //exit the method
		}
		
		//print the result of division and the remainder
		int results = numerator / denominator;
		int remainder = numerator % denominator;
		
		System.out.println("Results: " + results);
		System.out.println("Remainder: " + remainder);
	}
	
	public void leapYear()
	{
		//get user inputs
		int year = console.getInt("Enter a year");
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			System.out.println(year + " is a leap year!");
		}
		else
		{
			System.out.println(year + " is not a leap year!");
		}
	}
	
	public void payCalculator()
	{
		double price = console.getDouble("Enter a price");
		double quantity = console.getDouble("Enter a quantity");
		
		double subTotal = price * quantity;
		double tax = subTotal * 0.099;
		double total = subTotal + tax;
		
		System.out.println("Total: " + total);
		
		//formatted output
		DecimalFormat formatter = new DecimalFormat(".##");
		String output = formatter.format(total);
		
		System.out.println(output);
	}
}






