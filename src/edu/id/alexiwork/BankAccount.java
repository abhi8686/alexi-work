package edu.id.alexiwork;
import java.util.Scanner;


public class BankAccount {

	/**
	 * @param args
	 */
	
	private String firstName;
	private String lastName;
	private String myPassword;
	private double myBalance;
	
	
	//constructors
	
	public BankAccount()
	{
		myPassword = "";
		myBalance = 0.0;
		firstName = "";
		lastName = "";
	}
	
	
	  
	
	public BankAccount(String password, double balance, String userFirstName, String userLastName)
	{
		myPassword = password;
		myBalance = balance;
		firstName = userFirstName;
		lastName = userLastName;
	}
	
	
	
	public double getBalance()
	{
		return myBalance;
	}
	
	public String getName()
	{
		return lastName;
	}
	
	public void setBalance(double newBalance) 
	{
		myBalance = newBalance;
		
	}
	
	public void deposit(String password, double amount)
	{
		myBalance += amount;
	}
	
	public void deposit(int depositAmount) {
		// ask how much to deposit
		// use scanner to get input
		myBalance += depositAmount;
			
	}
	public void withdraw(String password, double amount)
	{
		myBalance -= amount;
	}
	
	public void withdraw(int withdrawAmount)
	{
		myBalance -= withdrawAmount;
	}
	
	public String getPassword(){
		return myPassword;
	}
	
	public String toString()
	{
		return ("Mr." + lastName + ", your account has "+ myBalance +"$ in it. Your password is " + myPassword + ".");
		
	}
	
	public boolean equals(Object other)
	{
		BankAccount a = (BankAccount)other;
		BankAccount b = (BankAccount)other;
		BankAccount c = (BankAccount)other;
		return getPassword().equals(a.getPassword()) && getBalance() == a.getBalance() && getName().equals(b.getName());
		
	}
}

	
