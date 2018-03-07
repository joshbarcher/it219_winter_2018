package hw_help;

public class MethodsHW 
{

	public static void main(String[] args)
	{
		MethodsHW homework = new MethodsHW();
		
		int[] input = {1, 2, 3};
		int[] printMe = homework.getSumAndAverage(input);
		
		System.out.println(printMe);
		
		input = new int[] {4, 5};
		printMe = homework.getSumAndAverage(input);
		
		System.out.println(printMe);
	}
	
	public int[] getSumAndAverage(int[] inputs)
	{
		int sum = 0;
		int average = 0;
		
		//loop and calculate the average and sum
		
		int[] results = {sum, average};
		return results;
	}
}
