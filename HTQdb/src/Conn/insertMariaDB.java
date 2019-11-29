package Conn;


import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mz-hafizha
 */
public class insertMariaDB {
    public static void main(String[] ar) throws SQLException 
    {
        Connection connect = null;
        Statement s = null;
        
        try
        {
            Class.forName("org.mariadb.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mariadb://localhost/HTQdb","root","");
            s = connect.createStatement();
            
            String sql = "INSERT INTO mahasantri" + "(id_mahasantri, nama, nim_mahasantri, id_mabna, jenis_kelamin, no_hp, jumlah_hafalan, id_extra, id_hafalan, no_kelompok)"+ "VALUES"+"(19002,'Qisthin',1865001,21,'P',081234567,10,1,21001,2)";
//            String sql2 = "INSERT INTO Kegiatan" + "(NamaKegiatan, Waktu, NamaPenanggungJawab) "+"VALUES"+" ('Rihlah2','02-January-2019','Hida') ";
            
            s.execute(sql);
//            s.execute(sql2);
            
            System.out.println("Record Inserted Successfully");             
            
        } catch(Exception e)
        {
          e.printStackTrace();
        }
        
        try {
            if (connect != null){
                s.close();
                connect.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
