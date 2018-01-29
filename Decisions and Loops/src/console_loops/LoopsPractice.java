package console_loops;

public class LoopsPractice 
{
	public void sequences()
	{
		//1, 2, 3, ... , 7, 8, 9, 10
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println(); //new line
		
		//print multiples of 3, from 1-100: 3, 6, 9, 12, ... , 93, 96, 99
		for (int i = 3; i <= 100; i += 3)
		{
			System.out.print(i + " ");
		}
		System.out.println(); //new line
		
		//print numbers from 1-100 divisible by 3, 5 or 15
		for (int i = 1; i <= 100; i++)
		{
			//divisible by 3
			if (i % 3 == 0)
			{
				System.out.println(i + " is divisible by 3");
			}
			
			//divisible by 5
			if (i % 5 == 0)
			{
				System.out.println(i + " is divisible by 5");
			}
			
			//divisible by 15
			if (i % 15 == 0)
			{
				System.out.println(i + " is divisible by 15");
			}
		}
		
		//5, 4, 3, 2, 1, 0
		for (int i = 5; i >= 0; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println(); //new line
	}
	
	public void moreSequences()
	{
		//3, 4, 5, 6, 7, 8
		for (int i = 3; i <= 8; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println(); //new line
		
		//2, 4, 8, 16, 32, 64, 128
		for (int i = 2; i <= 128; i *= 2)
		{
			System.out.print(i + " ");
		}
		System.out.println(); //new line
		
		//5, 8, 13, 20, 29, 40, 53, 68, 85
		int tally = 5;
		for (int i = 3; i <= 19; i += 2)
		{
			System.out.print(tally + " ");
			tally += i;
		}
		System.out.println(); //new line
		
		//15, 13, 11, 9, 7, 5, 3, 1
		for (int i = 15; i <= 15; i -= 2)
		{
			System.out.print(i + " ");
		}
		System.out.println(); //new line
		
		//infinite loop with for-loop
		/*for(;;)
		{
			
		}*/
	}
	
	//accept a positive number n
	public void sumFirstN(int n)
	{
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}
	
	public void averageFirstN(int n)
	{
		//add all elements together
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		
		//divide by the number of elements
		double average = sum * 1.0 / n;
		System.out.println("Avg: " + average);
	}
	
	public void printRGB()
	{
		//print r values
		for (int i = 0; i <= 255; i++)
		{
			//print g values
			for (int j = 0; j <= 255; j++)
			{
				//print b values
				for (int k = 0; k <= 255; k++)
				{
					System.out.println("r: " + i + ", g: " + j + ", b: " + k);
				}
			}
		}
	}
}






