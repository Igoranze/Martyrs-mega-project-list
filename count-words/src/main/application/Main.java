package main.application;

public class Main {

	public static void main(String[] args) {
		//Store sentence inside a string object
		String sentence = "Count the words of this string!";
		//Create a copy of the sentence
		String original = sentence;
		//remove any special characters like ,;!;? 
		//and replace all spaces with :
		sentence = RemoveSpecialCharacters(sentence);
		int total = 0;
		//loop trough the length of the array (each words is one loop)
		for (int i = 0; i < sentence.split(":").length; i++){
			//for each loop trough this array, add +1 to the integer object total
			total++; 
		}
		//print out the final result
		System.out.println("This sentence \"" + original + "\" contains a total of: \"" + total + "\" words");
	}

	public static String RemoveSpecialCharacters(String sentence) {
		//StringBuilder container to store all the data in
		StringBuilder stringB = new StringBuilder();
		//loop trough all the characters from the sentence
		for (char c : sentence.toCharArray()) {
			//only store characters that are equal to the below values
			if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ' ) {
				
				if(c == ' '){
					//replace space with :
					c = ':';
				}
				stringB.append(c);
			}
		}
		return stringB.toString().toLowerCase();
	}
}
