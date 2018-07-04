package pl.coderslab.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {


    public static void main(String[] args) {
        String sql = "INSERT INTO role  (name, role) values ('oooo', 'oooo');";
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/school"
                                     + "?useSSL=false",
                             "root", "root"); Statement stat = conn.createStatement()) {
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
