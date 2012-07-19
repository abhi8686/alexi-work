package edu.id.alexiwork;

public abstract class Pet {
	
	private String petName;
	private int petAge;
	private String ownersName;
	
	public abstract void play();
	public abstract void sleep();
	public abstract void eat();
	
	public Pet(String name, int age, String ownerName) 
	{
		petName = name;
		petAge = age;
		ownersName = ownerName;
	}
	
	public String getName() 
	{
		return getPetName();
	}
	
	public int getAge()
	{
		return petAge;
	}

	public String getOwnerName()
	{
		return ownersName;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
}
