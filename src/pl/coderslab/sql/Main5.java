package pl.coderslab.sql;

import java.sql.*;

public class Main5 {

    public static void main(String[] args) {


        String sql = "SELECT * from products";
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3366/products_ex"
                                     + "?useSSL=false",
                             "root", "root");
             Statement stat = conn.createStatement()) {

            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String desc = rs.getString("description");
                if(desc.length()>20){
                    desc = desc.substring(0,20) +"...";
                }
                int id = rs.getInt("id");
                System.out.println(id + " " + name + " " + desc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
