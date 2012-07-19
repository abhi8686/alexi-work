package edu.id.alexiwork;
import java.util.Scanner;


public class StringsExt {

	public static void main(String[] args) {
		int x=0;
		int y = 0;
		while (y==0) {




			Scanner myScanner = new Scanner(System.in);
			System.out.print("Enter two strings.");
			String myString = myScanner.next();
			String myString2 = myScanner.next();
			while (x==0) {
				myString = removeString(myString, myString2);
				int location = myString.indexOf(myString2);

				if (location == -1) {
					x=1;
				}


				System.out.println("The letters you removed left your word looking like this: \n" + myString);

			}
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