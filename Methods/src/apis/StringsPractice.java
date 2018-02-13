package apis;

import acm.graphics.GPen;

public class StringsPractice 
{
	public static void main(String[] args)
	{
		StringsPractice practice = new StringsPractice();
		practice.manipulateStrings();
	}
	
	public void manipulateStrings()
	{
		String saying = "Don't put the cart before the horse";
		String anotherSaying = new String("Life is like a box of chocalates");
		
		//perform an action on the object, print the results
		saying.toUpperCase();
		System.out.println(saying); //no change, the string class is "immutable"
		
		//three ways to retrieve results from a method call in String
		
		//#1
		String allInCaps = saying.toUpperCase();
		System.out.println(allInCaps);
		
		//#2
		System.out.println("Results: " + saying.toUpperCase());
		
		//#3
		saying = saying.toUpperCase();
		System.out.println(saying);
		
		//search through strings
		String choice = "Login";
		
		//never use == with strings, instead use the equals() method
		if (choice == "Login")
		{
			//this will not always work
			System.out.println("Equal strings according to ==");
		}
		
		if (choice.equals("Login"))
		{
			//this will work
			System.out.println("Equal strings according to equals()");
		}
		
		//length()
		System.out.println("length(): " + saying.length());
		
		//contains()
		System.out.println(saying);
		System.out.println("contains(): " + saying.contains("cart"));
		System.out.println("contains(): " + saying.contains("Cart"));
		System.out.println("contains(): " + saying.contains("CART"));
		
		//indexOf()
		System.out.println("charAt(e): " + saying.indexOf("E"));
		System.out.println("charAt(e): " + saying.indexOf("HORSE"));
		
		//toCharArray()
		char[] characters = saying.toCharArray();
		
		//charAt()
		char first = saying.charAt(0);
		char last = saying.charAt(saying.length() - 1);
		System.out.println("First char: " + first + ", last char: " + last);
		
		//substring()
		String partOf = saying.substring(6, 9); //give us characters from 6-8
		System.out.println(partOf);
		
		partOf = saying.substring(30);
		System.out.println(partOf);
		
		//replace()
		saying = saying.replace("HORSE", "horse");
		System.out.println(saying);
		saying = saying.replace("E", "e");
		System.out.println(saying);
		
		//valueOf()
		
		//how to convert primitives to strings
		int number = 100;
		String stringVersionOfNumber = "" + 100;
		
		stringVersionOfNumber = String.valueOf(number);
		
		//converting strings to primitives
		int myNumber = Integer.parseInt("1000000");
		double anotherNumber = Double.parseDouble("100.07");
		boolean flag = Boolean.parseBoolean("true");
	}
}














