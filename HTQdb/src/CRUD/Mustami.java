/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.*;
import Conn.KoneksiMySql;

/**
 *
 * @author mz-hafizha
 */
public class Mustami {

    private String id_mustami, nama_mustami, nim_mustami, jenisK_mustami, noHp_mustami, jmlHafalan_mustami,halaman;
    private Connection connect;
    private PreparedStatement psmt;
    private Statement stat;
    private ResultSet rs;
    private String Query;

    public String getId_mustami() {
        return id_mustami;
    }

    public void setId_mustami(String id_mustami) {
        this.id_mustami = id_mustami;
    }

    public String getNama_mustami() {
        return nama_mustami;
    }

    public void setNama_mustami(String nama_mustami) {
        this.nama_mustami = nama_mustami;
    }

    public String getNim_mustami() {
        return nim_mustami;
    }

    public void setNim_mustami(String nim_mustami) {
        this.nim_mustami = nim_mustami;
    }

    public String getJenisK_mustami() {
        return jenisK_mustami;
    }

    public void setJenisK_mustami(String jenisK_mustami) {
        this.jenisK_mustami = jenisK_mustami;
    }

    public String getNoHp_mustami() {
        return noHp_mustami;
    }

    public void setNoHp_mustami(String noHp_mustami) {
        this.noHp_mustami = noHp_mustami;
    }

    public String getJmlHafalan_mustami() {
        return jmlHafalan_mustami;
    }

    public void setJmlHafalan_mustami(String jmlHafalan_mustami) {
        this.jmlHafalan_mustami = jmlHafalan_mustami;
    }
    
    public void setHalaman(String halaman){
        this.halaman = halaman;
    }
    public String Halaman(){
        return halaman;
    }

    public Mustami() {
        try {
            KoneksiMySql connection = new KoneksiMySql();
            connect = connection.getKoneksi();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ResultSet tampilData() {
        Query = "SELECT * FROM mustami";
        try {
            stat = connect.createStatement();
            rs = stat.executeQuery(Query);
        } catch (Exception e) {
        }
        return rs;
    }

    public void simpanData(String id, String nama, String nim, String jenisK, String noHp, String jmlHafalan) {
        Query = "INSERT INTO mustami values (?,?,?,?,?,?)";
        try {
            psmt = connect.prepareStatement(Query);
            psmt.setString(1, id);
            psmt.setString(2, nama);
            psmt.setString(3, nim);
            psmt.setString(4, jenisK);
            psmt.setString(5, noHp);
            psmt.setString(6, jmlHafalan);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println("ERRORnya berada di simpanData(), ini ERRORnya : " + e);
        }
    }

    public void ubahData(String id, String nama, String nim, String jenisK, String noHp, String jmlHafalan) {
        Query = "UPDATE mustami set nama_mustami=?, nim_mustami=?,jenis_kelamin_mustami=?, no_hp_mustami=?, jumlah_hafalan_mustami=? where id_mustami = ?";
        try {
            psmt = connect.prepareStatement(Query);
            psmt.setString(1, nama);
            psmt.setString(2, nim);
            psmt.setString(3, jenisK);
            psmt.setString(4, noHp);
            psmt.setString(5, jmlHafalan);
            psmt.setString(6, id);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println("ERRORnya berada di simpanData(), ini ERRORnya : " + e);

        }
    }
public void hapusData(String id){
    Query = "DELETE FROM mustami where id_mustami=?";
    try{
        psmt = connect.prepareStatement(Query);
        psmt.setString(1, id);
        psmt.executeUpdate();
        psmt.close();
    }catch(SQLException e){
        System.out.println(e);
    }
}
}


