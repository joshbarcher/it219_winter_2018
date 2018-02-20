package apis;

public class MathPractice 
{
	public static void main(String[] args)
	{
		MathPractice mathPractice = new MathPractice();
		mathPractice.practice();
	}
	
	public void practice()
	{
		//interact with the Math class here...
		
		//cannot instantiate the Math class
		//Math math = new Math();
		
		//absolute values
		int value = Math.abs(-10);
		System.out.println(value);
		
		//exponents
		value = (int) Math.pow(2, 5); //calculate 2^5
		System.out.println(value);
		value = (int) Math.pow(2, 7);
		System.out.println(value);
		
		//trig functions
		double degrees = 90;
		double radians = Math.toRadians(degrees);
		double sine = Math.sin(radians);
		System.out.println(sine);
		
		//logs
		double result = Math.log10(1000);
		System.out.println(result);
		result = Math.log(Math.E);
		System.out.println(result);
		
		//converting to another base using the "change of base" formula
		System.out.println(Math.log(8) / Math.log(2));
		
		//rounding
		double rounded = Math.floor(2.7);
		System.out.println(rounded);
		
		rounded = Math.ceil(2.3);
		System.out.println(rounded);
		
		long roundedResult = Math.round(2.6);
		System.out.println(roundedResult);
		
		//sqrt()
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(-16));
		
		//min(), max()
		System.out.println(Math.min(10, -10));
		
		double first = 2;
		double second = 3;
		double third = 4;
		
		//largest of the three values above?
		System.out.println(Math.max(first, Math.max(second, third)));
	}
}