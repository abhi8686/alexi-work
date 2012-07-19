package edu.id.alexiwork;
import java.util.Scanner;


public class Strings {




	public static void main(String[] args) {
		int x=0;
		while (x==0) {
			Scanner myScanner = new Scanner(System.in);
			System.out.print("Enter two strings.");
			String myString = myScanner.next();
			String myString2 = myScanner.next();



			System.out.println("The letters you removed left your word looking like this: \n" + removeString(myString, myString2));

			//combined.indexOf(myString2);

		}
	}
	public static String removeString(String one, String two) 
	{
		int location = one.indexOf(two);
		String beginning = one.substring(0,location);
		int length = two.length();
		String end = one.substring(location + length);
		return beginning + end;
	}
}



