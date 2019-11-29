package Conn;


import Controller.BaseController;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mz-hafizha
 */
public class koneksiDB extends BaseController{
    
    private static Connection mariakonek;

    public static Connection getConnection() {
        if (mariakonek == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                mariakonek = DriverManager.getConnection("jdbc:mariadb://localhost/HTQdb", "root", "");

            } catch (Exception e) {
                messageFailed("Koneksi Error");
            }
        }

        return mariakonek;
    }

}
