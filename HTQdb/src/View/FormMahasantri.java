/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Conn.KoneksiMySql;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Assalam
 */
public class FormMahasantri extends javax.swing.JFrame {
private DefaultTableModel tabmode;
private ResultSet result;
    /**
     * Creates new form FormMahasantri
     */
    public FormMahasantri() throws SQLException {
        initComponents();
        tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_NIM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mabna = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Hp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_jumlah_hafalan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CBjenisK = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("FORM MAHASANTRI");

        jLabel3.setText("Nama");

        jLabel4.setText("NIM");

        jLabel5.setText("Mabna");

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("No Hp");

        jLabel8.setText("Jumlah Hafalan");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        CBjenisK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Akhi", "Ukhti" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mabna, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Hp, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_jumlah_hafalan, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBjenisK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 338, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(148, 148, 148))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mabna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(CBjenisK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jumlah_hafalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        

        String nama = txt_nama.getText();
        String NIM = txt_NIM.getText();
        String Mabna = txt_mabna.getText();
        String JenisK = CBjenisK.getSelectedItem().toString();
        String Hp = txt_Hp.getText();
        String Hafalan = txt_jumlah_hafalan.getText();
        try{
        
            Connection con = new KoneksiMySql().getKoneksi();
            String SQL = "INSERT into mahasantri(nama, nim_mahasantri, id_mabna, jenis_kelamin, no_hp, jumlah_hafalan) values (?,?,?,?,?,?)";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(SQL);
            
            stat.setString(1, nama);
            stat.setString(2, NIM);
            stat.setString(3, Mabna);
            stat.setString(4, JenisK);
            stat.setString(5, Hp);
            stat.setString(6, Hafalan);
            stat.executeUpdate();
            System.out.println("Menyimpan Data berhasil");
            JOptionPane.showMessageDialog(null, "Menyimpan Data berhasil");
            tampilData();
            
            
        }catch(Exception e){
            System.out.println("Menyimpan Data Gagal : " +e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        KlikTable();
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nama = txt_nama.getText();
        String NIM = txt_NIM.getText();
        String Mabna = txt_mabna.getText();
        String JenisK = CBjenisK.getSelectedItem().toString();
        String Hp = txt_Hp.getText();
        String Hafalan = txt_jumlah_hafalan.getText();
        
        try{
        
            Connection con = new KoneksiMySql().getKoneksi();
            String SQL = "UPDATE mahasantri set nama=?, id_mabna=?, jenis_kelamin=?, no_hp=?,jumlah_hafalan=? where nim_mahasantri=?";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(SQL);
            stat.setString(1, nama);
            stat.setString(2, Mabna);
            stat.setString(3, JenisK);
            stat.setString(4, Hp);
            stat.setString(5, Hafalan);
            stat.setString(6, NIM);
            stat.executeUpdate();
            System.out.println("Mengubah Data berhasil");
            JOptionPane.showMessageDialog(null, "Menyimpan Data berhasil");
            tampilData();
            
            
        }catch(Exception e){
            System.out.println("Mengubah Data Gagal : " +e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     int baris = tabel.getSelectedRow();
        String no_bp = tabmode.getValueAt(baris, 2).toString();        
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Anda yakin ingin menghapus data Mahasiswa BP : "+no_bp+"?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok==0){
            try{
                //panggil method koneksi
                Connection con = new KoneksiMySql().getKoneksi();
                String sql="delete from mahasantri where nim_mahasantri='"+no_bp+"'";
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
                tampilData();
//                reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal di hapus");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
public void tampilData() throws SQLException{
    Object[] baris = {"ID", "Nama", "NIM", "Mabna", "JenisKelamin", "No. Hp", "Jumlah Hafalan","UPDATE"};
    tabmode = new DefaultTableModel(null, baris);
    tabel.setModel(tabmode);
    Connection con = new KoneksiMySql().getKoneksi();
    try{
        
        java.sql.Statement stat =  con.createStatement();
        String SQL = "select id_mahasantri, nama, nim_mahasantri, id_mabna, jenis_kelamin, no_hp, jumlah_hafalan, tgl_sekarang from mahasantri";
        java.sql.ResultSet hasil = stat.executeQuery(SQL);
        while(hasil.next()){
        String id_Mahasantri = hasil.getString("id_mahasantri");
        String nama = hasil.getString("nama");
        String NIM = hasil.getString("nim_mahasantri");
        String Mabna = hasil.getString("id_mabna");
        String JenisK = hasil.getString("jenis_kelamin");
        String Hp = hasil.getString("no_hp");
        String Hafalan = hasil.getString("jumlah_hafalan");
        String Update = hasil.getString("tgl_sekarang");
        String[] data = {id_Mahasantri, nama, NIM, Mabna, JenisK, Hp, Hafalan, Update};
        tabmode.addRow(data);
        }
    }catch(Exception e){
        System.out.println("Menampilkan Data gagal" + e);
    }
}
private void KlikTable(){
    int row = tabel.getSelectedRow();
    txt_nama.setText((String) tabel.getValueAt(row, 1));
    txt_NIM.setText((String) tabel.getValueAt(row, 2));
    txt_mabna.setText((String) tabel.getValueAt(row, 3));
    CBjenisK.setSelectedItem((String) tabel.getValueAt(row, 4));
    txt_Hp.setText((String) tabel.getValueAt(row, 5));
    txt_jumlah_hafalan.setText((String) tabel.getValueAt(row, 6));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormMahasantri().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormMahasantri.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBjenisK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txt_Hp;
    private javax.swing.JTextField txt_NIM;
    private javax.swing.JTextField txt_jumlah_hafalan;
    private javax.swing.JTextField txt_mabna;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
