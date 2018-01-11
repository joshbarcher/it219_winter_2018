/*
 * Josh Archer
 * 1/5/18
 * HelloWorld.java
 * This is our first Java program using the ACM
 * framework!
 */

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class HelloWorld extends GraphicsProgram
{
	public void run()
	{
		//create a label and show it to the user!
		GLabel label = new GLabel("Hello world!", 10, 10);
		add(label);
	}
}