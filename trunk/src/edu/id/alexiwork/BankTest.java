package edu.id.alexiwork;

public class BankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount("qwe",56,"Bob","Smith");
		BankAccount c = new BankAccount("qwe",56,"Bob","Smith"); 
		System.out.println(b.equals(c));
		
		// TODO Auto-generated method stub

	}

}
