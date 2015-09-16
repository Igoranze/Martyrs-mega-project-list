package main.application;

import java.util.Scanner;

public class Main {
	
 
    public static void main(String[] args) {
        //Start up the calculator
    	Calculations calc = new Calculations();
    	while(true){
    		displayCalc(calc);
    	}
    }

	private static void displayCalc(Calculations calc) {
		//GUI INIT
		Scanner in = new Scanner(System.in);
		 

		System.out.println("Insert the first number\n");
		double a = Integer.parseInt(in.nextLine());
		System.out.println("Insert the second number\n");
		double b = Integer.parseInt(in.nextLine());
		
		calculate(calc, a, b, in);
				
	}

	private static void calculate(Calculations calc, double a, double b, Scanner in) {
		System.out.println("a:Add, s:Substract, d:Devide, m:Multiply, f:Factorial \nEntert now:\n");

		switch (in.nextLine()) {
		case "a":
			System.out.println(calc.add(a, b));
			break;
		case "s":
			System.out.println(calc.substract(a, b));
			break;
		case "d":
			System.out.println(calc.devide(a, b));
			break;
		case "m":
			System.out.println(calc.multiply(a, b));
			break;
		case "f":
			System.out.println(calc.factorial(a, b));
			break;

		default:
			break;
		}
		
	}
	

}
