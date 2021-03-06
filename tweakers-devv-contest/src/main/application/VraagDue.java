package main.application;

import java.math.BigDecimal;

/**
 * De Fibonaccireeks is een rij van getallen die ten grondslag ligt aan vele processen in de natuur, 
 * van de structuur van zonnebloemen tot de explosieve groei van een konijnenpopulatie.
 * De reeks begint met de getallen 0 en 1, waarna ieder volgend getal de som is van zijn 2 voorgangers.
 * Het begin is dus: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, etc.
 * Stel dat je van alle Fibonaccigetallen tot 1.000.000.000.000.000.000 (1018) de afzonderlijke cijfers optelt,
 * hoe vaak komt daar een getal uit dat zelf het kwadraat is van een geheel getal?
 * Voorbeeldnotatie antwoord (schrijfwijze als positief integer): 15000
 */
public class VraagDue {

	private static int answer = 0;
	
	public static boolean checkNumber(Double number) {
		if ((number.intValue() - number) == 0){
			
			return true;
		} else {
			
			return false;
		}
	}

	public static boolean sQRT(BigDecimal number){
		
		String[] halfNumber = number.toString().split("");
		Integer sumSplit = 0;

		for(String num: halfNumber){
			
			if (!num.equals("")){
				
				sumSplit = sumSplit + Integer.parseInt(num);
			}
		}
		if (checkNumber(Math.sqrt(sumSplit))){
			answer++;
			
			return true;
		} else {
			
			return false;
		}
	}

	public static void main(String[] args) {
		BigDecimal number1 = new BigDecimal(0);
		BigDecimal number2 = new BigDecimal(1);

		for (int i = 0; i < 1000000000; i++){
			BigDecimal sum = number1.add(number2);
			number1 = number2;
			number2 = sum;

			if (sum.toString().length() > 18){
				break;
			}
			if (sQRT(sum)){
				
			}
		}
		
		System.out.println(++answer);//Add 1 to the answer for the first integer.
		//Answer is: 6
	}
}
