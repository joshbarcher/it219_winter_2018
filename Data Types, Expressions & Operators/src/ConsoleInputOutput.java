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
}






