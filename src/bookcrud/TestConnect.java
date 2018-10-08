/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcrud;

import java.sql.Connection;

/**
 *
 * @author Saleumsack
 */
public class TestConnect {

    public static void main(String[] args) {
        try {
            Connection c = DB.getConnection();

            if (c != null) {
                System.out.println("DB connected!");
            } else {
                System.out.println("DB failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
