package database;

import java.util.List;
import controller.models.Character;
import java.sql.*;


public class CharacterDAO {
	
	//create Connection
	private Connection connection = null;
	
	//preparedStatements
	PreparedStatement createCharacter;
	PreparedStatement getCharByID;
	PreparedStatement getChars;
	
	//SQL Querys 
	String sqlCreateCharacter;
	String sqlGetCharByID;
	String sqlGetChars;
	
	Statement stmt = null;
	ResultSet rs;
	
	public CharacterDAO(){
		connection = new DBConnection().getConnection();
		createPreparedStatement();
	}

	private void createPreparedStatement() {
		sqlCreateCharacter = "INSERT INTO characters(Name, PlayedBy) values (?,?)";
		sqlGetCharByID = "";
		sqlGetChars = "";
		try{
			this.getCharByID = this.connection.prepareStatement(sqlGetCharByID);
			this.getChars = this.connection.prepareStatement(sqlGetChars);
			this.createCharacter = this.connection.prepareStatement(sqlCreateCharacter);
		}catch (SQLException e){
			System.out.println("Error while creating prepared Statements");
			e.printStackTrace();
		}
	}

	public List<Character> getChars() {
		return null;
	}

	public void createCharacter(Character character) {
		System.out.println(character.getName());
		System.out.println(character.getPlayer());
		try {
			createCharacter.setString(1, character.getName());
			createCharacter.setInt(2, character.getPlayerID());
			createCharacter.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Character konnte nicht erstellt werden");
			e.printStackTrace();
		}
	}
}
