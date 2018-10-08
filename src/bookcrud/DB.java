/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcrud;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Saleumsack
 */
public class DB {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:8889/db_javagui";
            String user = "root";
            String pass = "root";
            String driver = "com.mysql.jdbc.Driver";

            Class.forName(driver);

            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
