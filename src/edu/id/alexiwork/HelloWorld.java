package edu.id.alexiwork;
import java.util.Scanner;


public class HelloWorld {



	public static void main (String[]args){
		/*System.out.println("What is your name?");

		Scanner myScanner = new Scanner(System.in);
		String name = myScanner.next();	

		System.out.println("Hello " + name); 

		System.out.println("Would you like to do math?");
		 */
		//System.out.println("Would you like to multiply or add?");

		System.out.println ("Would you like to find the mean of five numbers, or add two? Type your choice.");
		
		Scanner choice = new Scanner(System.in);
		String doAdd = choice.next();	
		String doMean = choice.next();
		
		
			
			
		Scanner math1Scanner = new Scanner(System.in);
		int number1 = math1Scanner.nextInt();	
		int number2 = math1Scanner.nextInt();
		int number3 = math1Scanner.nextInt();
		int number4 = math1Scanner.nextInt();
		int number5 = math1Scanner.nextInt();
		
		if (doAdd.equals("add"))
			System.out.println("You chose add, input your numbers.");
			System.out.print("The answer is " + number1 + number2);

		double mean = (number1 + number2 + number3 + number4 + number5)/(double) 5;
		System.out.println("The mean is " + mean);
	}

}
