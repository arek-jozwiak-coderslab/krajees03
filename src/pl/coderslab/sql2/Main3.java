package pl.coderslab.sql2;

import java.sql.*;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        String sql = "SELECT * from orders;";
        String productsSql = "SELECT * from products JOIN product_orders ON \n" +
                "products.id = product_orders.product_id \n" +
                "WHERE product_orders.order_id = ? ;";
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3366/products_ex"
                                     + "?useSSL=false",
                             "root", "root");
             Statement stat = conn.createStatement();
             ResultSet rs = stat.executeQuery(sql)) {

            while (rs.next()) {
                String description = rs.getString("description");
                int id = rs.getInt("id");
                System.out.println(description + " ");

                try (PreparedStatement preparedStatement = conn.prepareStatement(productsSql)) {
                    preparedStatement.setInt(1, id);
                    try (ResultSet rs2 = preparedStatement.executeQuery()) {
                        while (rs2.next()) {
                            String name = rs2.getString("name");
                            int productId = rs2.getInt("id");
                            System.out.println(productId + " " + name + " ");
                        }
                    }

                }


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
