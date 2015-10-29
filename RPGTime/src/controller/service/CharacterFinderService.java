package controller.service;
import java.util.List;
import controller.models.Character;
import database.CharacterDAO;


public class CharacterFinderService {
	private CharacterDAO chars = new CharacterDAO();
	
	public List<Character> getCharacters(){
		return this.chars.getChars();
	}
	public void createCharacter(String name, int playerID, String playedBy){
		Character c = new Character(name, playedBy, playerID);
		this.chars.createCharacter(c);
	}
}
