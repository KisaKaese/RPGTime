package database;
import java.sql.*;

public class DBConnection {

    String url = "jdbc:mysql://195.37.176.178:11336/dbwebanw_sose15_07";
    String user = "dbweb_user_07";
    String pass = "LPtCLVYnSh";
    Connection connection = null;
    Statement stmt = null;

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Connection getConnection() {
        return connection;
    }

    public void close() {
        if (connection != null) {
            try {
                this.connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("Logout not successfull");
            }
        }
    }
}