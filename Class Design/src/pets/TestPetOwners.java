package pets;

public class TestPetOwners 
{
	public static void main(String[] args) 
	{
		PetOwner jose = new PetOwner("Jose", "Boris the Iguana");
		PetOwner tyler = new PetOwner("Tyler", "Sally the Chinchilla");
		PetOwner lance = new PetOwner("Lance", "Soft the pet rock");
		
		System.out.println(jose.getNumOwners()); //non-static way (boo...)
		System.out.println(PetOwner.getNumOwners()); //static way
		
		//print out our owners
		System.out.println(jose);
		System.out.println(tyler);
		System.out.println(lance);
	}
}
