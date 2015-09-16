package main.application;

public class Calculations {

	public double add(double a, double b){
		return a+b;
	}
	public double substract(double a, double b){
		return a-b;
	}
	public double devide(double a, double b){
		return a/b;
	}
	public double multiply(double a, double b){
		return a*b;
	}
	public double factorial(double a, double b){
		double temp_a = 1;
		double temp_b = 1;
		
		for (double i = a; i > 0; i--) {
			temp_a = temp_a * i;
		}
		
		for (double i = b; i > 0; i--) {
			temp_b = temp_b * i;
		}
	
		return temp_a + temp_b;
	}
}
