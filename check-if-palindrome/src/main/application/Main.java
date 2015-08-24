package main.application;

public class Main {

	//global boolean that can be accessed statically
	private static boolean palindrome = false;
	
	public static void main(String[] args) {
		String[] strings = {"This string is not palindrome",   //Not palindrome
		"A Man, A Plan, A Canal-Panama!"}; //Palindrome

		//loop trough the object containing all sentences
		for (String sentence : strings){
			//create a StrinbBuilder object to store all the data in
			StringBuilder cleanString = new StringBuilder();
			//first we remove all whitespaces and characters like ',./?! .etc
			cleanString.append(RemoveSpecialCharacters(sentence)); //returns amanaplanacanalpanama like strings
			//create an char array from the sentence the normal way
			char[] cleanChars = cleanString.toString().toCharArray();
			//create an char array from the sentence the reversed way
			char[] reverseChars = cleanString.reverse().toString().toCharArray();
			//loop for each character in the string
			for(int i = 0; i < cleanString.length(); i++){
				//compare the normal and reversed char array to each other
				//if they match then the boolean palindrome will be true and the loop will continue to the next character
				//if they dont match, the boolean palindrome will return false and the loop wil break because we now know that the string is not palindrome
				if(cleanChars[i] == reverseChars[i]){
					palindrome = true;
				} else {
					palindrome = false;
					break;
				}
			}
			//checks if the string is palindrome or not
			if(palindrome){
				System.out.println(sentence + " is palindrome ");
			} else {
				System.out.println(sentence + " is NOT palindrome ");
			}
		}		
	}

	public static String RemoveSpecialCharacters(String sentence) {
		//StringBuilder container to store all the data in
		StringBuilder stringB = new StringBuilder();
		//loop trough all the characters from the sentence
		for (char c : sentence.toCharArray()) {
			//only store characters that are equal to the below values
			if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ) {
				stringB.append(c);
			}
		}
		return stringB.toString().toLowerCase();
	}
}

