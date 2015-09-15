package main.application;
/**
 * De schimmel F. ellipsoidea wordt erg groot. De fibonacci reeks bepaald het aantal 
 * centimeters dat de schimmel dagelijks in diameter toeneemt.
 * Bereken de omtrek van de schimmel na 1000 dagen groeien.
 * Antwoord in centimeters en gebruik de wetenschappelijke notatie, 
 * rond af op 4 cijfers achter de komma, bijvoorbeeld: 1.0903E+231
 */
public class VraagQuattro {


	public static void main(String[] args) {
		double a = 0;
		double b = 1;
		double c = 0;
		double d = 2;
		for (int i = 3; i <= 1000; i++) {
			c = a + b; 
			d += c;
			a = b;
			b = c; 
		}
		System.out.println(formatToString(d*Math.PI));
		//Answer is: 2.2094E+209
	}

	private static String formatToString(double d) {
		String num = Double.toString(d);
		
		String [] decimal = num.split("\\.");
		String [] eNum = num.split("E");
		String output = decimal[0] + ".";
		
		char c[] = decimal[1].toCharArray();
		
		for (int i = 0; i < 4; i++){
			output += c[i];
		}
		output += "E+" + eNum[1];
		return output;
	}
}