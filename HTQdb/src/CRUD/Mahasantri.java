/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import Conn.KoneksiMySql;
import java.sql.*;

/**
 *
 * @author Assalam
 */
public class Mahasantri {
private Connection con;
private ResultSet rs;
private Statement st;
private PreparedStatement psmt;
private String id, nama, nim, mabna, jenisK, noHp, jumlahHafalan, noKelompok, update;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getMabna() {
        return mabna;
    }

    public void setMabna(String mabna) {
        this.mabna = mabna;
    }

    public String getJenisK() {
        return jenisK;
    }

    public void setJenisK(String jenisK) {
        this.jenisK = jenisK;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getJumlahHafalan() {
        return jumlahHafalan;
    }

    public void setJumlahHafalan(String jumlahHafalan) {
        this.jumlahHafalan = jumlahHafalan;
    }

    public String getNoKelompok() {
        return noKelompok;
    }

    public void setNoKelompok(String noKelompok) {
        this.noKelompok = noKelompok;
    }
    public void update(String update){
        this.update = update;
        
    }
    public String getupdate(){
        return update;
    }

public Mahasantri(){
    try{
    KoneksiMySql connect = new KoneksiMySql();
    con = connect.getKoneksi();
}catch(SQLException e){
        System.out.println("koneksi " +e);
}
}
public ResultSet tampilData(){
    String query = "SELECT * FROM mahasantri ";
    try{
        st = con.createStatement();
        rs = st.executeQuery(query);
    }catch(Exception e){
        System.out.println("tampil Data : ");
    }
    return rs;
}


}
