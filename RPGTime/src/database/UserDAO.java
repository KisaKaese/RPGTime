package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import controller.models.*;

public class UserDAO {
	//create Connection
	private Connection connection = null;
	
	//preparedStatements
	PreparedStatement login;
	PreparedStatement getUser;
	
	//SQL Querys 
	String sqlLogin;
	String sqlGetUser;
	
	Statement stmt = null;
	ResultSet rs;
	
	public UserDAO(){
		connection = new DBConnection().getConnection();
		createPreparedStatement();
	}
	
	private void createPreparedStatement() {
		sqlLogin = "SELECT * "+"FROM user WHERE Username=? AND Password=?";
		sqlGetUser = "SELECT * FROM user WHERE Username=?";
		try{
			this.login = this.connection.prepareStatement(sqlLogin);
			this.getUser = this.connection.prepareStatement(sqlGetUser);
		}catch (SQLException e){
			System.out.println("Error while creating prepared Statements");
			e.printStackTrace();
		}
	}

	public User login(String username, String password){
		User user = new User();
		ResultSet rs;
		int level,ID;
		try {
			this.login.setString(1, username);
			this.login.setString(2, password);
			final ResultSet resultSet = this.login.executeQuery();
			boolean success = resultSet.next();
			if(success){
				getUser.setString(1, username);
				rs = getUser.executeQuery();
				while(rs.next()){
					level = rs.getInt(4);
					ID = rs.getInt(1);
					user = new User(ID, username, null, level);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	public List<User> getUsers() {
		return null;
	}

	public void setUsers(List<User> users) {
	}
}
