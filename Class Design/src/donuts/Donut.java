/*
 * Josh Archer
 * 3/14/18
 * Donut.java
 * This class represents a donut.
 */

package donuts;

/**
 * Represents a donut with a type and whether
 * it is glazed or not.
 * 
 * @author Josh Archer
 * @version 1.0
 */
public class Donut 
{
	//fields
	private String type;
	private boolean glazed;
	
	//constructors
	/**
	 * This constructor creates a new donut with
	 * a type and glazed status.
	 * 
	 * @param type a new type for the donut (old fashioned, 
	 * donut hole, bars, sprinkles, ...)
	 * 
	 * @param glazed sets the glazed status of the new
	 * donut
	 */
	public Donut(String type, boolean glazed)
	{
		this.type = type;
		this.glazed = glazed;
	}
	
	//getters/setters
	/**
	 * Returns whether the donut is glazed or not.
	 * @return true if the donut is glazed, otherwise returns
	 * false
	 */
	public boolean isGlazed()
	{
		return glazed;
	}
	
	/**
	 * Returns type type of the donut
	 * @return the type of the donut
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * Sets a new type for the donut
	 * @param type a new type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	 * Assigns a new glazed status to the donut
	 * @param glazed is the donut glazed or not?
	 */
	public void setGlazed(boolean glazed)
	{
		this.glazed = glazed;
	}
	
	//other methods
	/**
	 * Returns a string representation of the donut.
	 * 
	 * @return returns the type of the donut
	 */
	public String toString()
	{
		return type;
	}
}








