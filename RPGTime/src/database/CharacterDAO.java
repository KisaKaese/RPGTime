package database;

import java.util.LinkedList;
import java.util.List;
import controller.models.Character;

public class CharacterDAO {
	private List<Character> chars = new LinkedList<Character>();
	
	public CharacterDAO(){
		Character c = new Character("Steve", 1, "Jenni");
		chars.add(c);
		c = new Character("Daichi", 2, "Anja");
		chars.add(c);
	}

	public List<Character> getChars() {
		return chars;
	}

	public void setChars(List<Character> chars) {
		this.chars = chars;
	}
}
