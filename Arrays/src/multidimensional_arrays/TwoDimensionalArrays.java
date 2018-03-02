package multidimensional_arrays;

public class TwoDimensionalArrays 
{
	public static void main(String[] args)
	{
		//store contact details - name (nickname), phone number(s), email(s)
		String[][] contact = new String[3][];
		
		//assign elements
		contact[0] = new String[2];
		contact[0][0] = "Fred Flintstone";
		contact[0][1] = "Freddy";
		
		contact[1] = new String[1];
		contact[1][0] = "360-444-7777";
		
		contact[2] = new String[3];
		contact[2][0] = "e@e.com";
		contact[2][1] = "me@gmail.com";
		contact[2][2] = "nobody@yahoo.com";
		
		contact = new String[][] {
			{"Fred Flintstone", "Freddy"},
			{"360-444-7777"},
			{"e@e.com", "me@gmail.com", "nobody@yahoo.com"}
		};
		
		for (int i = 0; i < contact.length; i++)
		{
			for (int j = 0; j < contact[i].length; j++)
			{
				System.out.print(contact[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void multiplicationTable()
	{
		//declare space for a multiplication table
		int[][] multTable = new int[10][10];
		
		//fill the table
		for (int i = 0; i < multTable.length; i++)
		{
			for (int j = 0; j < multTable[i].length; j++)
			{
				multTable[i][j] = (i + 1) * (j + 1);
			}
		}
		
		//print the table
		for (int i = 0; i < multTable.length; i++)
		{
			for (int j = 0; j < multTable[i].length; j++)
			{
				String space = " ";
				if (multTable[i][j] < 10)
				{
					space += " ";
				}
				
				System.out.print(multTable[i][j] + space);
			}
			System.out.println();
		}
	}
	
	public void test2DArrays()
	{
		//declare a multi-dimensional array
		int[][] tableOfNumbers = new int[5][4];
		
		//assign elements
		tableOfNumbers[0][1] = 25; //assume this assigns row 0, col 1
		tableOfNumbers[2][3] = 50;
		
		//retrieve elements
		System.out.println("row 0, col 1: " + tableOfNumbers[0][1]);
		System.out.println("row 3, col 3: " + tableOfNumbers[3][3]);
		
		//loop over and print out all elements
		for (int i = 0; i < tableOfNumbers.length; i++)
		{
			//loop over the array stored at index i 
			for (int j = 0; j < tableOfNumbers[i].length; j++)
			{
				System.out.print(tableOfNumbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
