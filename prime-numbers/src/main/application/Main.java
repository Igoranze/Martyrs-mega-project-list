package main.application;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		BigDecimal big = new BigDecimal(1601);
		BigDecimal four =  new BigDecimal(4);
		BigDecimal three = new BigDecimal(3);

		for (int i = 0 ; i < 17425170; i++){
			big = big.multiply(four);
			big = big.subtract(three);
			System.out.println(big);
			
		}
	}

}
