package pl.coderslab.sql2;

public class Main2 {


    /**
     * CREATE TABLE `products_ex`.`client_address` (
     *   `client_id` INT NOT NULL,
     *   `city` VARCHAR(45) NULL,
     *   `street` VARCHAR(45) NULL,
     *   `house_nr` VARCHAR(45) NULL,
     *   PRIMARY KEY (`client_id`),
     *   FOREIGN KEY(client_id) REFERENCES clients(id)
     *   ON DELETE CASCADE
     *   );
     */
}
