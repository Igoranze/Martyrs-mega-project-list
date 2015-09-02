package main.application;

public class Player {

	private String playerNamer = "";
	
	public Player(String playerName){
		this.playerNamer = playerName;
	}
	
	public String getPlayerName(){
		return playerNamer;
	}
}
