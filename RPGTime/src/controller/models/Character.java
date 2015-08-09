package controller.models;

public class Character {
	private String name, player;
	private int characterID, playerID;
		
	public Character(String name, int characterID, String playedBy, int playerID){
		this.characterID = characterID;
		this.name = name;
		this.player = playedBy;
		this.playerID = playerID;
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
	public String toString(){
        try {
			return this.getName();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
}
