package coffee;
import java.util.Arrays;

public class Coffee 
{
	//fields
	private String type;
	private String[] flavors;
	private boolean decaf;
	private int spoonsOfSugar;
	
	//constructors
	public Coffee()
	{
		//pick some defaults for a basic cup of coffee
		type = "dark roast";
		flavors = new String[] {};
		decaf = false;
		spoonsOfSugar = 0;
	}
	
	public Coffee(String newType, String[] newFlavors, 
			      boolean newDecaf, int newSpoonsOfSugar)
	{
		//assign the fields in my class with my parameter values
		type = newType;
		flavors = newFlavors;
		decaf = newDecaf;
		spoonsOfSugar = newSpoonsOfSugar;
	}
	
	//methods
	
	//we use "setters" to assign values to our fields
	public void setType(String newType)
	{
		type = newType;
	}
	
	public void setFlavors(String[] newFlavors)
	{
		flavors = newFlavors;
	}
	
	public void setDecaf(boolean newDecaf)
	{
		decaf = newDecaf;
	}
	
	public void setSpoonsOfSugar(int newSpoonsOfSugar)
	{
		spoonsOfSugar = newSpoonsOfSugar;
	}

	//we use "getters" to retrieve values from our fields
	public String getType()
	{
		return type;
	}
	
	public String[] getFlavors()
	{
		return flavors;
	}
	
	public boolean getDecaf() //you can also use isDecaf()
	{
		return decaf;
	}
	
	public int getSpoonsOfSugar()
	{
		return spoonsOfSugar;
	}
	
	public String toString()
	{
		return "Type: " + type + ", Flavors: " + 
	           Arrays.toString(flavors) + ", Decaf: " + decaf +
	           ", Spoons of sugar: " + spoonsOfSugar;
	}
}










