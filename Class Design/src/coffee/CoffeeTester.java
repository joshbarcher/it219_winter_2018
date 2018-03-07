package coffee;

public class CoffeeTester 
{
	public static void main(String[] args) 
	{
		Coffee cupOfJoe = new Coffee("light roast", 
				new String[] {"cinnamon", "eggnog"}, true, 0);
		
		//change the values in my cupOfJoe
		cupOfJoe.setType("dark roast");
		cupOfJoe.setDecaf(false);
		cupOfJoe.setFlavors(
				new String[] {"chocolate", "vanilla", "spice"});
		cupOfJoe.setSpoonsOfSugar(4); //oops!
		
		System.out.println("Is this cup decaf? " + cupOfJoe.getDecaf());
		
		Coffee coldCoffee = new Coffee("", new String[] {}, false, 0);
		coldCoffee.setDecaf(false);

		System.out.println("Is this cup decaf? " + coldCoffee.getDecaf());
		
		Coffee defaultCup = new Coffee();
		System.out.println(defaultCup);
		System.out.println(cupOfJoe);

		Coffee anotherCup = defaultCup;
		System.out.println(anotherCup);
	}
}
