package main.application;

public class Main {

	//Global private String object to store the pigLatin sentence in
	private static String pigLatin = "";
	
	public static void main(String[] args) {
		//String builder object for the input string
		StringBuilder stringB = new StringBuilder();
		
		//Append a sentence to the StirngBuilder object
		stringB.append("Create a pig latin sentence from this sentence");
		
		//For each word inside the String Builder object loop trough this code, split on space
		for (String word: stringB.toString().split(" ")){
			//Create a char array from the word
			char[] c = word.toString().toLowerCase().toCharArray();
			//If the first letter from the word is a vowel AND the word is longer than or equal to 2 letters
			//The add the word, the first letter of the word moved to the back of the word and append "way"
			if((c[0] == 'a' || c[0] == 'e' || c[0] == 'i' || c[0] == 'o' || c[0] == 'u' ) && word.length() > 1){
				pigLatin += " " + word.substring(1) + "-" + c[0]+"way";
			} else if( word.length() > 1){
				//If the first letter from the word is NOT vowel AND the word is longer than or equal to 2 letters
				//The add the word, the first letter of the word moved to the back of the word and append "way"
				pigLatin += " " + word.substring(1) + "-" + c[0]+"ay";
			} else {
				//If the word exists only of one letter than add way to the end of the word
				pigLatin += " " + word + "-" + "way";
			}
		}
		
		//Print the whole pigLatin sentence out
		System.out.println(pigLatin);
	}
}
