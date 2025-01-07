package ExceptionHandling.CheckedException;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {

        //TODO : Description: Occurs when there is a database access error.
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Database connection error");
        }
    }
}
