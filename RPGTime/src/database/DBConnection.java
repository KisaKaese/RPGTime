package database;
import java.sql.*;

public class DBConnection {

    String url = "jdbc:mysql://127.0.0.1:3306/rpg_time";
    String user = "root";
    String pass = "izHI9GZz78yJxc";
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