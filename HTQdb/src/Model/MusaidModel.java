/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mz-hafizha
 */
public class MusaidModel {
    protected static String id_musaid;
    protected static String nama_musaid;
    protected static int nim_musaid;
    protected static String password;

    public static String getId_musaid() {
        return id_musaid;
    }

    public static void setId_musaid(String id_musaid) {
        MusaidModel.id_musaid = id_musaid;
    }

    public static String getNama_musaid() {
        return nama_musaid;
    }

    public static void setNama_musaid(String nama_musaid) {
        MusaidModel.nama_musaid = nama_musaid;
    }

    public static int getNim_musaid() {
        return nim_musaid;
    }

    public static void setNim_musaid(int nim_musaid) {
        MusaidModel.nim_musaid = nim_musaid;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        MusaidModel.password = password;
    }
    
    
}
