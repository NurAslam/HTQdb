/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conn.koneksiDB;
import Implement.MusaidImplement;
import Model.MusaidModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mz-hafizha
 */
public class MusaidDAO implements MusaidImplement{

    @Override
    public boolean checkLogin(MusaidModel musaidModel) {
        try {
            PreparedStatement preparedStatement = koneksiDB
                    .getConnection().prepareStatement(""
                    + "SELECT * FROM musaid WHERE id_musaid = ? AND "
                            + "password = ?");
            
            preparedStatement.setString(1, musaidModel.getId_musaid());
            preparedStatement.setString(2, musaidModel.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {                
                return true;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return false;
    }
    
    
}
