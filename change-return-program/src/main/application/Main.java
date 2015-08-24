package main.application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Set the variables for money give by customer and total price of product
		String moneyGiven = "24.42";
		String totalPrice = "15.99";
		
		//Use BigDecimal for better money storing object and round at 2 decimals with half_even
		BigDecimal moneyGiven_modelVal = new BigDecimal(moneyGiven);
		BigDecimal moneyGiven_displayVal = moneyGiven_modelVal.setScale(2, RoundingMode.HALF_EVEN);
		
		BigDecimal totalPrice_modelVal = new BigDecimal(totalPrice);
		BigDecimal totalPrice_displayVal = totalPrice_modelVal.setScale(2, RoundingMode.HALF_EVEN);
		
		//Store the BigDecimal return value of money
		BigDecimal sum_modelVal = moneyGiven_displayVal.subtract(totalPrice_displayVal);
		BigDecimal sum_displayVal = sum_modelVal.setScale(2, RoundingMode.HALF_EVEN);
		
		//Convert the money to german standaard (Euro)
		NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		usdCostFormat.setMinimumFractionDigits( 1 );
		usdCostFormat.setMaximumFractionDigits( 2 );
		
		//print it out
		System.out.println( usdCostFormat.format(sum_displayVal.doubleValue()));
		
	}

}
