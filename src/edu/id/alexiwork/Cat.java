package edu.id.alexiwork;

public class Cat extends Pet {

	
	public Cat(String petName, int petAge, String ownersName) 
	{
		super(petName, petAge, ownersName);
	}
	
	@Override
	public void play()
	{
		// TODO Auto-generated method stub
		System.out.println("Purrr");

	}

	@Override
	public void sleep()
	{
		// TODO Auto-generated method stub
		System.out.println("zzzzzzz");
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("Nomomomom");
	}

}
