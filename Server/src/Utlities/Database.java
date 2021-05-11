package Utlities;
import java.sql.*;

public class Database {
    private Connection connection;

    public Database() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/cab302","root","root");
            System.out.print("Completed");
        }
        catch (SQLException sqle) {
            System.err.print(sqle);
        }
        //connection.close();
    }
    public void Writeto() throws SQLException {
        Statement statement = connection.createStatement();
        boolean result = statement.execute("INSERT INTO users VALUES('FrankW','12345','Admin','National Tiles');");
        System.out.print("Result of statement:" + result);
        connection.close();
    }

    public void ReadFrom() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * FROM users");
        while(rs.next()) {
            String username = rs.getString("username");
            System.out.println("Result of statement:" + username);
        }
        connection.close();
    }
}
