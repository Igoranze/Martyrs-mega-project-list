package main.application;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		BigDecimal big = new BigDecimal(1601);
		BigDecimal four =  new BigDecimal(4);
		BigDecimal three = new BigDecimal(3);

		DecimalFormat format = new DecimalFormat("0.###+0");
		
		for (int i = 0 ; i < 10000; i++){
			big = big.multiply(four);
			big = big.subtract(three);
			
			System.out.println(format.format(big));
			
		}
		
	}

}
