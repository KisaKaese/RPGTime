package controller.models;

public class User {
	private String username, password;
	private int userID, level;

	public User(int userID, String username, String password, int level){
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.level = level;
	}
	public User(int userID, String username, String password){
		this.userID = userID;
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
