package main.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VraagUndici {

	private static int[] num = new int[50000];
	private static int count = 0;
	private static int countPrime = 0;
	
	public static boolean checkIfNumberIsPrime(int number) {
		if (number == 2 ) {
			
			return true;
		} else if (number % 2 == 0){
			
			return false;
		}
		
		for (int i = 3; i * i <= number; i += 2){
			if (number % i == 0){
				
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner fileIn = new Scanner(new File("~/Desktop/inFile.txt"));
		readFile(fileIn);
		fileIn.close();

		for (int i : num){
			
			if(checkIfNumberIsPrime(i)){
				countPrime++;
			}
		}

		System.out.println(countPrime);
		//Answer is: 4325

	}

	private static void readFile(Scanner fileIn) {
		while(fileIn.hasNextInt()){
			num[count] = fileIn.nextInt();
			count++;
		}		
	}


}
