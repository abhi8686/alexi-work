package edu.id.alexiwork;
import java.util.Scanner;


public class PrimeGuesser {

	public static void main(String[] args) {
		Scanner numberScanner = new Scanner(System.in);
		int n = numberScanner.nextInt();
		boolean prime; 
		
		for (int i = 2; n == i ; i++) {
			if (n%i == 0 && n%i ){
				System.out.println("Your number is prime");
			} else {
				System.out.println("Your number is not prime");			
				}

		}


	}
}
