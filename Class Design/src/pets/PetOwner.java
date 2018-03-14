package pets;

public class PetOwner 
{
	private String owner;
	private String pet;
	
	//shared data across all objects
	private static int numOwners;
	
	public PetOwner(String owner, String pet)
	{
		this.owner = owner;
		this.pet = pet;
		
		numOwners++;
	}
	
	//readonly fields
	public String getOwner()
	{
		return owner;
	}
	
	public String getPet()
	{
		return pet;
	}
	
	public static int getNumOwners()
	{
		//rule: you cannot access non-static content in a static context
		//System.out.println(owner);
		
		//System.out.println(getPet());
		
		return numOwners;
	}
	
	public String toString()
	{
		return owner + " owns " + pet;
	}
}
