package edu.id.alexiwork;
import java.util.Scanner;


public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myNumber = new Scanner(System.in);
		int n = myNumber.nextInt();
		int numSpaces = (n*2-3);
		for (int i = 0; i < n; i++) {		
			for ( numSpaces < (n+3); numSpaces++) {
				System.out.print(" ");
				System.out.print("*");
			}
			for (int j = 0; j < i; j++){
				System.out.print(" "); 
			}
			
			
			System.out.println("*");
			
		}
		
		
		for (int l = n; l > 0; l--) {   
			for (int k = l; k > 0; k--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		

	}

}
