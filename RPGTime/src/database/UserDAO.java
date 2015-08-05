package database;
import java.util.LinkedList;
import java.util.List;
import controller.models.*;

public class UserDAO {
	private List<User> users = new LinkedList<User>();

	public UserDAO(){
		User user = new User(1, "Jenni", "password");
		users.add(user);
		user = new User(2, "Anja", "password");
		users.add(user);
	}
	
	public User login(String username, String password){
		for(User u:users){
			if(u.getUsername().equals(username)&&
			u.getPassword().equals(password)){
				return u;
			}
		}
		return null;
	}
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
