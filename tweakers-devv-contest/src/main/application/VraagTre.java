package main.application;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Een object zweeft met een vaste snelheid van 20 punten p/s door de ruimte. 
 * Op het moment van schrijven bevindt het object zich op positie x: 30, y: 50 en z: 90. 
 * Het object beweegt naar x: 46, y: 48 en z: 9.
 * Wat zijn de coördinaten van het object na 25 minuten. Afgerond op 2 decimalen
 * Voorbeeldnotatie antwoord: x:1.200,12 y:24.150,00 z:160,98
 */
public class VraagTre {

	static double x = 30;
	static double y = 50;
	static double z = 90;
	
	static double mvX = 4066;
	static double mvY = 65486;
	static double mvZ = -81;
	
	static double time = 60*25+1;
	
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		
		result.append(calculate());

		System.out.println(result);
		//Answer is:
		/*
		 * X: 1.889,11
		 * Y: 29.992,32
		 * Z: 52,96
		 * 
		 */
	}
	
	private static String calculate() {
		double X = 0;
		double Y = 0;
		double Z = 0;
		for (double i = 0; i < time; i++) {
			double part = i*20 / 65612.156747054;
			X = (part*mvX) + x;
			Y = (part*mvY) + y;
			Z = (part*mvZ) + z;
		}		
		
		return "X: " + formatToString(X) + "\n"+
			   "Y: " + formatToString(Y) + "\n"+
			   "Z: " + formatToString(Z);
	}

	private static String formatToString(double Number){
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
		otherSymbols.setDecimalSeparator(',');
		otherSymbols.setGroupingSeparator('.'); 

		DecimalFormat newFormat = new DecimalFormat("##,###.##", otherSymbols);

		return newFormat.format(Number);
	}
}