package database;

import java.util.LinkedList;
import java.util.List;
import controller.models.Character;

public class CharacterDAO {
	private List<Character> chars = new LinkedList<Character>();
	
	public CharacterDAO(){
		Character c = new Character("Steve", 1, "Jenni", 1);
		chars.add(c);
		c = new Character("Daichi", 2, "Anja", 2);
		chars.add(c);
		c = new Character("Sasori", 3, "Anja", 2);
		chars.add(c);
		c = new Character("Deidara", 4, "Anja", 2);
		chars.add(c);
		c = new Character("Jan", 5, "Anja", 2);
		chars.add(c);
		c = new Character("Itachi", 6, "Anja", 2);
		chars.add(c);
		c = new Character("Izuna", 7, "Anja", 2);
		chars.add(c);
		c = new Character("Ryo", 8, "Anja", 2);
		chars.add(c);
		c = new Character("Yuna", 9, "Anja", 2);
		chars.add(c);
		c = new Character("Shusei", 10, "Anja", 2);
		chars.add(c);
		c = new Character("James", 11, "Jenni", 1);
		chars.add(c);
		c = new Character("Kakuzu", 12, "Jenni", 1);
		chars.add(c);
		c = new Character("Kisame", 13, "Jenni", 1);
		chars.add(c);
		c = new Character("Claire", 14, "Jenni", 1);
		chars.add(c);
		c = new Character("Takeru", 15, "Jenni", 1);
		chars.add(c);
		c = new Character("Sasuke", 16, "Jenni", 1);
		chars.add(c);
		c = new Character("Madara", 17, "Jenni", 1);
		chars.add(c);
		c = new Character("Devin", 17, "Anja", 2);
		chars.add(c);
	}

	public List<Character> getChars() {
		return chars;
	}

	public void setChars(List<Character> chars) {
		this.chars = chars;
	}
}
