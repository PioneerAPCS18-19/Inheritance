
public abstract class Animal
{
	private int numLegs;
	private String name;
	
	public Animal(int numLegs, String name)
	{
		this.numLegs = numLegs;
		this.name = name;
	}
	
	public int getNumLegs()
	{
		return numLegs;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void sleep()
	{
		// sleep
	}
	
	public abstract void makeNoise();
	
	public abstract void move();
}
