package controller.models;

public class Character {
	private String name, player;
	private int characterID;
		
	public Character(String name, int characterID, String playedBy){
		this.characterID = characterID;
		this.name = name;
		this.player = playedBy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCharacterID() {
		return characterID;
	}
	public void setCharacterID(int characterID) {
		this.characterID = characterID;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayerID(String player) {
		this.player = player;
	}
	
}
