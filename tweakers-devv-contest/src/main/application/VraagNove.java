package main.application;

import java.math.BigInteger;

public class VraagNove {

	public static void main(String[] args) {
		System.out.println(BigInteger.valueOf(5).pow(128).bitCount());
		//Antwoord is: 150
	}
}