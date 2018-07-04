package pl.coderslab.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

    public static void main(String[] args) {


        String sql = "CREATE TABLE users (user_id int AUTO_INCREMENT,"
                + " user_name varchar(255),"
                + " user_email varchar(255) UNIQUE, "
                + " PRIMARY KEY(user_id))";
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3366/krajees03"
                                     + "?useSSL=false",
                             "root", "root"); Statement stat = conn.createStatement()) {
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
