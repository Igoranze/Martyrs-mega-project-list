package main.application;

public class Main {

	private static int a,e,i,o,u = 0;
	public static void main(String[] args) {
		StringBuilder stringB = new StringBuilder();
		
		stringB.append("Count the vowels in this string");
		char [] chars = stringB.toString().toLowerCase().toCharArray();
		for (int j = 0; j < stringB.length(); j++){
			if(chars[j] == 'a'){
				a++;
			}
			if(chars[j] == 'e'){
				e++;
			}
			if(chars[j] == 'i'){
				i++;
			}
			if(chars[j] == 'o'){
				o++;
			}
			if(chars[j] == 'u'){
				u++;
			}
		}
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
	}

}
