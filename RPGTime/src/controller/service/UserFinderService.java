package controller.service;

import database.UserDAO;

public class UserFinderService {
	private UserDAO users = new UserDAO();
	
	public boolean login(String username, String password){
		return users.login(username, password);
	}
}
