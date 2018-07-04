package pl.coderslab.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {

//    INSERT INTO products_ex.orders  (description) values ('asdasd');
//    INSERT INTO products_ex.orders  (description) values ('asdasd1');
//
//    INSERT INTO products_ex.products  (name,description, price) values ('asdasd', 'desc', 3.0);
//    INSERT INTO products_ex.products  (name,description, price) values ('asdasd1', 'desc1', 3.0);
//
//    INSERT INTO products_ex.clients  (name, surname) values ('arek', 'jozwiak');
//    INSERT INTO products_ex.clients  (name, surname) values ('arek1', 'jozwiak1');


    public static void main(String[] args) {
        String sql = "INSERT INTO products_ex.clients  (name, surname) values ('oooo', 'oooo');";
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3366/products_ex"
                                     + "?useSSL=false",
                             "root", "root"); Statement stat = conn.createStatement()) {
                stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
