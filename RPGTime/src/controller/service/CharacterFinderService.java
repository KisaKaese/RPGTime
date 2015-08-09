package controller.service;
import java.util.List;
import controller.models.Character;
import database.CharacterDAO;


public class CharacterFinderService {
	private CharacterDAO chars = new CharacterDAO();
	
	public List<Character> getCharacters(){
		return this.chars.getChars();
	}
}
