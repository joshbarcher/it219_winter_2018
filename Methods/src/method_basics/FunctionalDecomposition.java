package method_basics;

public class FunctionalDecomposition 
{
	//create a field that has "scope" among all of our methods
	private String message = "";
	
	//the "large" problem
	public void composeMessage()
	{
		addressLine("Johan", "Greetings");
		messageBody();
		signature("Linda", "Sincerely");
		printMessage();
	}
	
	public void addressLine(String recipient, String salutations)
	{
		message += salutations + " " + recipient + ",\n\n";
	}
	
	public void messageBody()
	{
		//leverage supporting functions...
		welcome();
		body();
		conclusion();
	}
	
	public void welcome()
	{
		message += "Hi how are you? ...\n";
	}
	
	public void body()
	{
		message += "The weather is nice today ...\n";
		message += "Can you grab some fruit at the store please ...\n";
		message += "Did you forget your ...\n";
	}
	
	public void conclusion()
	{
		message += "Please come home soon ...\n\n";
	}
	
	public void signature(String sender, String sendOff)
	{
		message += sendOff + ",\n" + sender;
	}
	
	public void printMessage()
	{
		System.out.println(message);
	}
}
