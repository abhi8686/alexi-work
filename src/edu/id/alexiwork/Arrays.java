package edu.id.alexiwork;
import java.util.Scanner;


public class Arrays {



	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int i = 0;
		Scanner myScanner = new Scanner(System.in);

		System.out.println("How many names would you like to input?");

		int n = myScanner.nextInt();

		String [] names;
		names = new String[n];

		System.out.println("Okay you have chosen " + n + " names. Input the names you want.");

		for (i = 0; i < n; i++) {
			String nameInput = myScanner.next();
			names[i] = nameInput;	
		}
		printNamesReverse(names);
	}




	public static void printNamesReverse(String [] names)
	{
		for (int i = (names.length - 1); i >= 0; i--) {
			System.out.println(names[i]);
		}
	}


	public static void printNames(String [] names) 
	{

		for (int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
	}

}
