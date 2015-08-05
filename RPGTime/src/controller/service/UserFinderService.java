package controller.service;

import controller.models.User;
import database.UserDAO;

public class UserFinderService {
	private UserDAO users = new UserDAO();
	
	public User login(String username, String password){
		return users.login(username, password);
	}
}
