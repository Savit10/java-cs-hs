public class Fish extends Animal {
	
	private String finType;
	
	public Fish (String name, int yearOfBirth, String finType)
	{
		super(name, yearOfBirth);
		this.finType = finType;
	}
	
	public void setFinType (String finType)
	{
		this.finType = finType;
	}
	
	public String getFinType()
	{
		return this.finType;
	}
	
	public String toString()
	{
		return super.toString() + "fintype: " + getFinType();
	}
		
}

