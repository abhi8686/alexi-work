package edu.id.alexiwork;

public class Dog extends Pet {
	
	
	
	public Dog(String petName, int petAge, String ownersName)
	{
		super(petName, petAge, ownersName);
	}
	
	

	@Override
	public void play() 
	{
		System.out.println("Ruff!");

	}

	@Override
	public void sleep() 
	{
		System.out.println("ZZZzzzzZZZ");

	}

	@Override
	public void eat() 
	{
		System.out.println("Slurrp!");

	}
	
	

}
