package coffee;

public class CoffeeVerbose 
{
	//fields
	private String type;
	private String[] flavors;
	private boolean decaf;
	private int spoonsOfSugar;
	
	//constructors
	public CoffeeVerbose()
	{
		
	}
	
	public CoffeeVerbose(String newType, String[] newFlavors, 
			      boolean newDecaf, int newSpoonsOfSugar)
	{
		//assign the fields in my class with my parameter values
		if (isValidType(newType))
		{
			type = newType;
		}
		else
		{
			//default to light roast
			type = "light roast";
		}
		
		setFlavors(newFlavors);
		setDecaf(newDecaf);
		setSpoonsOfSugar(newSpoonsOfSugar);
	}
	
	//methods
	
	//we use "setters" to assign values to our fields
	public void setType(String newType)
	{
		if (!isValidType(newType))
		{
			return;
		}
		
		type = newType;
	}
	
	//determines if a type is valid or not
	private boolean isValidType(String newType)
	{
		if (newType == null)
		{
			return false;
		}
		
		newType = newType.toLowerCase();
		
		//don't assign our field if an empty value is given
		if (!newType.equals("light roast") &&
				 !newType.equals("medium roast") &&
				 !newType.equals("dark roast"))
		{
			return false;
		}
		
		return true;
	}
	
	public void setFlavors(String[] newFlavors)
	{
		if (newFlavors == null || newFlavors.length == 0)
		{
			return;
		}
		else
		{
			//verify that we only have valid flavors
			String[] validFlavors = {"cinnamon", "eggnog", "chocolate",
					                 "caramel", "mocha"};
			
			//for each input flavor
			for (int i = 0; i < newFlavors.length; i++)
			{
				String flavor = newFlavors[i];
				
				//compare the flavor against all valid flavors
				boolean found = false;
				for (int j = 0; j < validFlavors.length; j++)
				{
					if (validFlavors[j].equals(flavor))
					{
						found = true;
					}
				}
				
				//if there was no match
				if (!found)
				{
					return;
				}
			}
		}
		
		flavors = newFlavors;
	}
	
	public void setDecaf(boolean newDecaf)
	{
		decaf = newDecaf;
	}
	
	public void setSpoonsOfSugar(int newSpoonsOfSugar)
	{
		if (newSpoonsOfSugar < 0)
		{
			return;
		}
		
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
}






