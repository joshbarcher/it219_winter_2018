package console_loops;

public class WhileLoopsPractice 
{
	//ask the user for numbers until their sum >= 50
	public void askForSum()
	{
		Console console = new Console();
		int sum = 0;
		int lastSum = 0;
		
		//warn the user how the program works...
		System.out.println("Enter numbers until the sum >= 50");
		
		while (sum < 50)
		{
			int number = console.getInt("Enter a number");
			
			//save the last sum
			lastSum = sum;
			
			//change my sum
			sum += number;
		}
		
		System.out.println("The last sum was: " + lastSum);
		System.out.println("The sum is now: " + sum);
	}
	
	public void askForSumWithDoWhile()
	{
		Console console = new Console();
		int sum = 0;
		int lastSum = 0;
		
		//warn the user how the program works...
		System.out.println("Enter numbers until the sum >= 50");
		
		do
		{
			int number = console.getInt("Enter a number");
			
			//save the last sum
			lastSum = sum;
			
			//change my sum
			sum += number;
		} while (sum < 50);
		
		System.out.println("The last sum was: " + lastSum);
		System.out.println("The sum is now: " + sum);
	}
}










