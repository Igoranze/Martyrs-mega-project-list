package main.application;

public class Main {

	public static void main(String[] args) {
		//Creates object to store the string in
		StringBuilder stringB = new StringBuilder(); 
		//Append a string to the stringobject (StringBuilder class)
		stringB.append("This string to reverse");
		//Print the reversed string to the console via the reverse() method
		System.out.println(stringB.reverse());
	}

}
