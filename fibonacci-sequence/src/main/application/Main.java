package main.application;

import java.math.BigDecimal;

/**
 * Fibonacci Sequence - 
 * Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
 *
 */
public class Main {

	public static void main(String[] args) {
		generateFibonacci(100);

	}
	
	private static void generateFibonacci(int n){
		BigDecimal number1 = new BigDecimal(0);
		BigDecimal number2 = new BigDecimal(1);

		for (int i = 0; i < n; i++){

			
			BigDecimal sum = number1.add(number2);
			System.out.println(sum + ",");

			
			number1 = number2;
			number2 = sum;
			
			
		}
	}

}
