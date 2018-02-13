package method_basics;
import java.awt.Point;

public class MethodFundamentals 
{
	/*
	 * Why create methods?
	 * 
	 * - reusable code
	 * - abstractions, write the functionality and forget about it!
	 * - methods represent actions in our code
	 */
	
	//what does a method look like?
	public void foo() //method header - visibility, return type, name, parameters
	{
		//method body
	}
	
	//TERM: Method signature - the name and parameters for a method
	
	//how do I pass inputs to a function?
	public void addAndPrint(int first, int second, int third)
	{
		int result = first + second + third;
		
		//do something with the result
		System.out.println("Result: " + result);
	}
	
	//mixed parameter types
	public void repetition(String message, int times, boolean inCaps)
	{
		//loop the requested number of times and print the message
		for (int i = 1; i <= times; i++)
		{
			//print in caps?
			if (inCaps)
			{
				System.out.println(message.toUpperCase());
			}
			else
			{
				System.out.println(message);
			}
		}
	}
	
	//how do we return results from a function
	public boolean isNegative(int number)
	{
		if (number < 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		//it is not possible to reach this line of code
		//System.out.println("This cannot occur!");
	}
	
	//return value - complex
	public double calculatePay(double hoursWorked, double rate, boolean salaried)
	{
		if (salaried)
		{
			//assume rate is yearly pay
			return rate; 
		}
		else
		{
			//assume rate is per hour
			double pay = hoursWorked * rate;
			
			//overtime?
			if (hoursWorked > 40)
			{
				double overtimeHours = hoursWorked - 40;
				pay += 0.5 * rate * overtimeHours;
			}
			
			return pay;
		}
	}
	
	//another use of the return keyword
	public void printDivision(int numerator, int denominator)
	{
		//check for division by zero
		if (denominator == 0)
		{
			//stop and not continue below
			return; //exit the method!
		}
		
		//print out the quotient and the remainder
		int quotient = numerator / denominator;
		int remainder = numerator % denominator;
		
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}
	
	//once this function is invoked, then value = 101, number = 100
	public void increment(int value)
	{
		value = value + 1;
	}
	
	public int incrementAndReturn(int value)
	{
		return value + 1;
	}
	
	public void movePoint(Point point) //point has the memory address of a point object
	{
		//change the position of the point
		point.setLocation(20, 30);
	}
	
	//overloaded methods in a class
	public int add(int first, int second)
	{
		return first + second;
	}
	
	//Java allows you to overload if the parameters of a method are "different"
	
	//different number of parameters
	public int add(int first, int second, int third)
	{
		return first + second + third;
	}
	
	//different types of parameters
	public double add(double first, double second)
	{
		return first + second;
	}
	
	//order of parameters must be different
	public double add(int first, double second)
	{
		return first + second;
	}
	
	public double add(double first, int second)
	{
		return first + second;
	}
}















