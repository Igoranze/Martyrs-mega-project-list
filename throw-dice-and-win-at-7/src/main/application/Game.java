package main.application;

public class Game {
	
	private static int totalsum;
	
	private static int diceSide;
	
	public static void main(String[] args) {
		//init the game
		//TODO create method for this part
		Player player = new Player("MyName");
		
		//Ask player what kind of dice he wants
		//TODO should have a check method, for example. what happens if the player wants to have only a 3 sided dice (3*2 = 6 totalsum)
		//witch is not enough for the winning number of seven (7)
		diceSide = 6;
		
		//Aks player to throw dice
		while(true){
			try{
				//Play a game every second
				Thread.sleep(800);
				throwDice(player);
				
				//check if player won the game
				//TODO create return method for this part
				System.out.println("player: "+player.getPlayerName()+" has rolled number "+totalsum+" and has "+ hasWon());
				
				//Clear the totalsum
				Game.setTotalsum(0);
			} catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
	private static void throwDice(Player player){
		Dice dice1 = new Dice(diceSide);
		Dice dice2 = new Dice(diceSide);
		dice1.roll();
		dice2.roll();
	}

	public static int getTotalsum() {
		return totalsum;
	}

	public static void appendTotalsum(int totalsum) {
		Game.totalsum += totalsum;
	}	
	
	public static void setTotalsum(int totalsum) {
		Game.totalsum = totalsum;
	}	
	
	private static String hasWon(){
		if(totalsum == 7){
			return "won";
		} else {
			return "lost";
		}
	}

}
