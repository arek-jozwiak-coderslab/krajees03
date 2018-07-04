package pl.coderslab.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

    public static void main(String[] args) {

        String query = "CREATE DATABASE `products_ex` DEFAULT CHARACTER SET utf8 COLLATE utf8_polish_ci ;";
        String query1 = "CREATE TABLE `products_ex`.`products` (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `name` VARCHAR(245) NULL,\n" +
                "  `description` VARCHAR(245) NULL,\n" +
                "  `price` DECIMAL(8,2) NULL,\n" +
                "  PRIMARY KEY (`id`));";
        String query2 ="CREATE TABLE `products_ex`.`orders` (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `description` VARCHAR(245) NULL,\n" +
                "  PRIMARY KEY (`id`));";
        String query3= "CREATE TABLE `products_ex`.`clients` (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `name` VARCHAR(45) NULL,\n" +
                "  `surname` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`id`));";

        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3366/products_ex"
                                     + "?useSSL=false",
                             "root", "root"); Statement stat = conn.createStatement()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
