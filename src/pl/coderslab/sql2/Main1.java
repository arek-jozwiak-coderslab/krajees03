package pl.coderslab.sql2;

import java.sql.*;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        String sql = "SELECT * from clients;";
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3366/products_ex"
                                     + "?useSSL=false",
                             "root", "root");
             Statement stat = conn.createStatement();
             ResultSet rs = stat.executeQuery(sql)) {

            while (rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("id");
                System.out.println(id + " " + name + " ");
            }

            System.out.println("Podaj id usera do usunięcia");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
           String  deleteSql = "DELETE FROM clients where id = ?;";
            try(PreparedStatement preparedStatement = conn.prepareStatement(deleteSql)){
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            };



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
