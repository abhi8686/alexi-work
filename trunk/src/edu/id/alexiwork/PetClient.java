package edu.id.alexiwork;
import java.util.Scanner;


public class PetClient {
	static int x = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);

		System.out.println("What kind of pet do you want?");

		String choice1 = myScanner.next();

		if (choice1.equals("dog")) {

			System.out.println("You have chosen a dog! What type of dog do you want, a Husky, Labrador, or a Boxer?");
			String breedInput = myScanner.next();
			if(breedInput.equals("Husky")) {

				System.out.println("You have chosen a Husky! What would you like to name it?");
				String nameInput = myScanner.next();
				System.out.println("How old is " + nameInput + "?");
				int ageInput = myScanner.nextInt();
				System.out.println("What is your name?");
				String ownerNameInput = myScanner.next();

				Pet husky = new SiberianHusky (nameInput, ageInput, ownerNameInput);
				while (x == 0) {
					System.out.println("What do you want him to do " + nameInput + "? Play , eat, sleep?");
					String choice2 = myScanner.next();
					if (choice2.equals("play")) {
						husky.play();
						System.out.println("He is exhausted! He should sleep!");
					}
					if (choice2.equals("eat")) {
						husky.eat();
						System.out.println("He ate that food like a boss!");
					}

					if (choice2.equals("sleep")){
						husky.sleep();
						System.out.println("He is now refreshed! And Hungry!");
					}
				}

			}
		}
	}
}