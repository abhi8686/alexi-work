package edu.id.alexiwork;

public class SavingsAccount extends BankAccount {

	
	private double interestRate;
	
	public SavingsAccount() {
		interestRate = 0.0;
		
	}

	public SavingsAccount(String password, double balance, String userFirstName, String userLastName, double Rate) 
	{
		super(password, balance, userFirstName, userLastName);
		interestRate = Rate;
	}
	
	public double computeInterest()
	{  
		 double interest = interestRate*getBalance();
		 return interest;
	}
	
	public double addInterest() 
	{
		double oldBalance = getBalance();
		double newBalance = computeInterest() + oldBalance;	
		setBalance(newBalance); 
		return newBalance; //Not necessary
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
