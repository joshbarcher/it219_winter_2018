package arrays;
import acm.util.RandomGenerator;

public class ArraysPractice 
{
	public static void main(String[] args)
	{
		String[] movies = new String[6];
		
		movies[0] = "Back to the Future";
		movies[1] = "Rocky";
		movies[2] = "Too Wong Foo";
		movies[3] = "Jurassic Park";
		movies[4] = "American History X";
		movies[5] = "Eternal Sunshine of the Spotless Mind";
		
		for (int i = 0; i < movies.length; i++)
		{
			System.out.println(movies[i].replace("e", "eee").
					                     replace("E", "EEE"));
		}
		
		String[] hobbies = {"watching movies", "", "coding", "hiking", "video games"};
		for (int i = 0; i < hobbies.length; i++)
		{
			System.out.println(hobbies[i]);
		}
	}
	
	public void randomArray()
	{
		//create a random array of numbers
		RandomGenerator random = new RandomGenerator();
		double[] randomNumbers = new double[1000000];
		
		//assign the elements in my array using a loop
		for (int i = 0; i < randomNumbers.length; i++)
		{
			randomNumbers[i] = random.nextDouble(1, 1000000);
		}
		
		//print the values in my array using a loop
		for (int i = 0; i < randomNumbers.length; i++)
		{
			System.out.println(i + ": " + randomNumbers[i]);
		}
		
		//calculate the average of all elements in the randomNumbers array
		double total = 0;

		for (int i = 0; i < randomNumbers.length; i++)
		{
			total += randomNumbers[i];
		}
		System.out.println();
		System.out.println("Average: " + total / randomNumbers.length);
	}
	
	public void creatingArrays()
	{
		//step #1 - allocate memory for the array
		int[] numbers = new int[5];
		
		//step #2 - assign spaces in the array
		numbers[0] = 10;
		numbers[4] = 20;
		//numbers[-1] = 30; //this will result in an index-out-of-bounds
		
		//step #3 - retrieve elements at an index
		System.out.println("First element: " + numbers[0]);
		
		//search for an element
		for (int i = 0; i < numbers.length; i++)
		{
			int element = numbers[i];
			
			if (element == 20)
			{
				System.out.println("Found the number 20!");
			}
		}
	}
}









