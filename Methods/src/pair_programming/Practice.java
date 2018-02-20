package pair_programming;

public class Practice 
{
	private int count = 0;
	
	public static void main(String[] args) 
	{
		Practice practice = new Practice();
		
		//number of numeric digits
		int result = practice.countDigits("Hello World, it's 1984!");
		System.out.println("Numeric digits: " + result);
		
		//does a string contain all vowels?
		System.out.println("All vowels? " + practice.containsAllVowels("Hello world!")); //false
		System.out.println("All vowels? " + practice.containsAllVowels("The bear is chasing you!")); //true
		
		//number of words
		System.out.println("Number of words: " + practice.numberOfWords("The beach was warm today!"));
	}
	
	public int countDigits(String input)
	{
		int count = 0;
		for (int i = 0; i < input.length(); i++)
		{
			char character = input.charAt(i);
			
			if (Character.isDigit(character))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public boolean containsAllVowels(String search)
	{
		return search.contains("a") && search.contains("e") && search.contains("i") && 
				  search.contains("o") && search.contains("u");
	}
	
	public boolean containsAllVowelsAlternative(String search)
	{
		boolean a = false, e = false, i = false, o = false, u = false;
		
		for (int j = 0; j < search.length(); j++)
		{
			char character = search.charAt(j);
			
			if (character == 'a')
			{
				a = true;
			}
			else if (character == 'e')
			{
				e = true;
			}
			else if (character == 'i')
			{
				i = true;
			}
			else if (character == 'o')
			{
				o = true;
			}
			else if (character == 'u')
			{
				u = true;
			}
		}
		
		return a && e && i && o && u;
	}
	
	public int numberOfWords(String sentence)
	{
		int count = 0;
		
		for (int i = 0; i < sentence.length(); i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				count++;
			}
		}
		
		return count + 1;
	}
}