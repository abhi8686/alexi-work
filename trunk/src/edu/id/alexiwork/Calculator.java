package edu.id.alexiwork;
import java.util.ArrayList;
import java.util.Scanner;


public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int endList = -9999;
		Scanner myScanner = new Scanner(System.in);
		ArrayList<Double> myList = new ArrayList<Double>();
		System.out.println("Would you like to do math?");
		System.out.print("enter a number "); 
		double numberInput = myScanner.nextDouble();
		while (numberInput != endList) {
			System.out.print("enter a number "); 
			myList.add(numberInput);
			numberInput = myScanner.nextDouble();

		}

		System.out.println("addition: " + addition(myList));
		System.out.println("average: "+ average(myList)); 
	}

	public static double addition(ArrayList<Double> myList)
	{
		double temp = 0;
		for (int i = 0; i < myList.size(); i++){
			temp += myList.get(i);
		}
		return temp;
	}
	public static double average(ArrayList<Double> myList)
	{
	
		double answer = addition(myList)/ myList.size(); 
		return answer;
	}

}
