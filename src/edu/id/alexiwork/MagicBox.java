package edu.id.alexiwork;
import java.util.Scanner;


public class MagicBox {


	public static void main(String[] args){



		int[][] one = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		int[][] two = {{37, 78, 29,	70,	21,	62,	13,	54,	5},
				{6,	38,	79,	30,	71,	22,	63,	14,	46},
				{47, 7,	39,	80,	31,	72,	23,	55,	15},
				{16, 48, 8,	40,	81,	32,	64,	24,	56},
				{57, 17, 49, 9,	41,	73,	33,	65,	25},
				{26, 58, 18, 50, 1,	42,	74,	34,	66},
				{67, 27, 59, 10, 51, 2,	43,	75,	35},
				{36, 68, 19, 60, 11, 52, 3,	44,	76},
				{77, 28, 69, 20, 61, 12, 53, 4,	45}};
		int[][] three = {{4, 14, 15, 1},
				{9,	7, 6, 13},
				{5,	11,	10,	8},
				{16, 2,	3, 13}};

		int[][] four = {{1  ,1,1},{1,1,1},{1,1,1}};
		
		int[][] five = {{1, 2, 3}, {3, 2, 1}, {2, 1, 3}};

		System.out.println("Test one: " + (isMagicSquare(one) == true ? "Correct" : "Incorrect"));
		System.out.println("Test two: " + (isMagicSquare(two) == true ? "Correct" : "Incorrect"));
		System.out.println("Test three: " + (isMagicSquare(three) == false ? "Correct" : "Incorrect"));
		System.out.println("Test four: " + (isMagicSquare(four) == true ? "Correct" : "Incorrect"));
		System.out.println("Test five: " + (isMagicSquare(five) == false ? "Correct" : "Incorrect"));


	}
	public static boolean isMagicSquare(int[][] nums) {


		int magicNum = 0;
		int temp = 0;
		
		


		for (int r = 0; r < nums.length; r++) {
			for (int c = 0; c < nums[0].length; c++) {
				temp += nums[r][c]; //going accross the rows
				if (r == 0) {
					magicNum = temp;
					
				}	
			}
			//System.out.println(temp);
			if (magicNum != temp){  //always checking
				return false;
			}
			temp = 0;
		}
		
		return isMagicSquareCol(nums); 
	}
	
	
	public static boolean isMagicSquareCol(int[][]nums) {
		int magicNum = 0;
		int temp = 0;


		for (int r = 0; r < nums.length; r++) {
			for (int c = 0; c < nums[0].length; c++) {
				temp += nums[c][r]; //going accross the cols

				if (r == 0) {
					magicNum = temp; //set everytime
				}	
			}
			//System.out.println(temp);
			if (magicNum != temp){  //always checking the set
				return false;
			}
			temp = 0; //reset for next set
		}
		return true; 
	}
}




