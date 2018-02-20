package method_basics;
import java.awt.Point;

public class ProgramStart 
{
	public static void main(String[] args)
	{
		MethodFundamentals fundamentals = new MethodFundamentals();
		
		fundamentals.addAndPrint(10, 20, 30);
		fundamentals.addAndPrint(100, 200, 300);
		fundamentals.addAndPrint(-60, 10, -30);
		
		//values that you send into a function are called arguments
		fundamentals.repetition("Hello", 3, true);
		fundamentals.repetition("world", 5, false);
		
		//store the result in a local variable called negative
		boolean negative = fundamentals.isNegative(60);
		System.out.println("Is -60 negative? " + negative);
		
		//test the results from my pay calculation
		double hourlyPay = fundamentals.calculatePay(55, 25.00, false);
		System.out.println("You are paid: $" + hourlyPay);
		
		double salariedPay = fundamentals.calculatePay(0, 30000, true);
		System.out.println("You are paid: $" + salariedPay);
		
		//test passing by-value
		int number = 100;
		fundamentals.increment(number);
		System.out.println("number after calling increment(): " + number);
		
		number = fundamentals.incrementAndReturn(number);
		System.out.println("number after calling incrementAndReturn(): " + number);
		
		//test passing by-reference
		Point myPoint = new Point(10, 10); //the memory address of an object is in myPoint
		fundamentals.movePoint(myPoint);
		System.out.println("Coordinate: (" + myPoint.getX() + ", " + myPoint.getY() + ")");
		
		//test calling overloaded methods
		int result = fundamentals.add(10, 1);
		result = fundamentals.add(10, 1, 3);
		
		double results = fundamentals.add(1.35, 2.67);
		
		System.out.println();
		FunctionalDecomposition examples = new FunctionalDecomposition();
		examples.composeMessage();
	}
}