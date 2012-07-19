package edu.id.alexiwork;
import java.util.Scanner;


public class BankClient {


	public static void main(String[] args) {
		int x = 0;
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Would you like to open an account?");

		String inputChoice = myScanner.next();

		if (inputChoice.equals("yes")){

			System.out.println("Would you like to setup a Savings account or a checking account?");

			System.out.println("What is your last name?");

			String inputLastName = myScanner.next();

			System.out.println("What is your first name?");

			String inputFirstName = myScanner.next();
			System.out.println("How much money will you put into the account?");

			int inputBalance = myScanner.nextInt();

			System.out.println("Make your password");

			String inputPassword = myScanner.next();

			BankAccount account = new BankAccount(inputPassword, inputBalance, inputFirstName, inputLastName); 
			BankAccount account2 = new BankAccount(inputPassword, inputBalance, inputFirstName, "Tom");
			BankAccount account3 = new BankAccount(inputPassword, inputBalance, inputFirstName, inputLastName); 
			while (x==0) {
				System.out.println("If you like to see your balance Mr." + inputLastName + ", type 'balance' for balance." +
						"If you would like to make a withdraw, type 'withdraw'." +
						" If you would like to make another deposit, type 'deposit'. If you would like to see a summary of your account, type 'y'.");
				String doChoice1 = myScanner.next();
				
				
				

				if (doChoice1.equals("y")) {
					System.out.println(account);
				}

				if (doChoice1.equals("balance")) {
					System.out.println(account.getBalance());
				} 

				if (doChoice1.equals("withdraw")){
					System.out.println("What is your password you thief!?");
					String myPin = myScanner.next();
					if (myPin.equals(account.getPassword())) {
						System.out.println("Oh, okay, my bad. How much would you like to withdraw?");
						int withdrawAmount = myScanner.nextInt();
						account.withdraw(withdrawAmount);
						System.out.println("You have withdrawn " + withdrawAmount + "$. Leaving your new account balance at " + account.getBalance() + "$.");
					} else {
						System.out.println("Wrong password you Liar!");
					}
				}


				if (doChoice1.equals("deposit")){

					System.out.println("What is your password?");
					String myPin = myScanner.next();
					if (myPin.equals(account.getPassword())) {
						System.out.println("How much would you like to deposit?");
						int depositAmount = myScanner.nextInt();
						account.deposit(depositAmount);
						System.out.println("You have deposited " + depositAmount + "$. Leaving your new account balance at " + account.getBalance() + "$");

					} else {
						System.out.println("Wrong password");
					}

				}
			}

		} else {
			System.out.println("Well then bye");

		}	
	} 
}


