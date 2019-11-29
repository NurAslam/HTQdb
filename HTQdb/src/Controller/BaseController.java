/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author mz-hafizha
 */
public class BaseController {
    Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
    
    public static void messageSuccess(String a) {
        JOptionPane.showMessageDialog(null, a, "Pesan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void messageFailed(String a) {
        JOptionPane.showMessageDialog(null, a, "Pesan", JOptionPane.ERROR_MESSAGE);
    }
}
