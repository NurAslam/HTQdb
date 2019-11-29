/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.MusaidDAO;
import View.FormLogin;
import Implement.MusaidImplement;
import Model.MusaidModel;
import View.DataMahasantri;

/**
 *
 * @author mz-hafizha
 */
public class MusaidController extends BaseController{
    private FormLogin formLogin;
    private MusaidImplement musaidlImplement;

    public MusaidController(FormLogin formLogin) {
        this.formLogin = formLogin;
        musaidlImplement = new MusaidDAO();
    }
    
    public void prosesLogin() {

        String id_musaid = formLogin.getUserText().getText();
        String password = formLogin.getPasswordText().getText();

        MusaidModel musaidModel = new MusaidModel();
        musaidModel.setId_musaid(id_musaid);
        musaidModel.setPassword(password);

        if (musaidlImplement.checkLogin(musaidModel)) {
            messageSuccess("Berhasil Login");
            formLogin.setVisible(false);
            new DataMahasantri().setVisible(true);
        } else {
            messageFailed("Username atau password anda salah !!");
        }

    }
    
    
    
}
