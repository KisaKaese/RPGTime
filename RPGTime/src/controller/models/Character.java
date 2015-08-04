package controller.models;

public class Character {
	private String name;
	private int characterID;
	
	public Character(String name, int characterID){
		this.characterID = characterID;
		this.name = name;
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
	
}
