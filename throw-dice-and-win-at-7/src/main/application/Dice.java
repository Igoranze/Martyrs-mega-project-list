package main.application;

public class Dice {

	private int diceSide = 0;
	
	public Dice(int diceSide){
		this.diceSide = diceSide;
	}
	
	public void roll(){
		Game.appendTotalsum((int)(Math.random()*diceSide) + 1);
	}
}
