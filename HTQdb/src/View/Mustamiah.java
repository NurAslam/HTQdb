/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import CRUD.Mustami;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Assalam
 */
public class Mustamiah extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    private ResultSet result;
    /**
     * Creates new form
     */
    Mustami aa = new Mustami();

    public Mustamiah() {
        initComponents();
        tampil_data();
        this.setLocationRelativeTo(null);
    }

    public void simpanData() {
        if (txt_idMustamiah.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ID Mustamiah belum terisi");
            txt_idMustamiah.requestFocus();
        } else if (txt_namaMustamiah.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama belum diisi!");
            txt_namaMustamiah.requestFocus();
        } else if (txt_nimMustamiah.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "NIM Mustamiah belum diisi!");
            txt_nimMustamiah.requestFocus();
        } else {
            try {
                aa.setId_mustami(txt_idMustamiah.getText());
                aa.setNama_mustami(txt_namaMustamiah.getText());
                aa.setNim_mustami(txt_nimMustamiah.getText());
                aa.setJenisK_mustami(CB_jenisK.getSelectedItem().toString());
                aa.setNoHp_mustami(txt_noHp.getText());
//                aa.setJmlHafalan_mustami(txt_juz.getText());
                aa.simpanData(aa.getId_mustami(), aa.getNama_mustami(), aa.getNim_mustami(), aa.getJenisK_mustami(), aa.getNoHp_mustami(), aa.getJmlHafalan_mustami());
                JOptionPane.showConfirmDialog(null, "Data berhasil disimpan");
                tampil_data();
            } catch (Exception e) {
                System.out.println("Data Gagal disimpan");
            }
        }
    }

    public void tampil_data() {
        Object[] data = {"Id Mustami'", "Nama Mustami", "NIM Mustami", "Jenis Kelamin", "No Hp", "Jumlah Hafalan Mustami",};
        tabmode = new DefaultTableModel(null, data);
        Tabel_Data.setModel(tabmode);
        try {
            result = aa.tampilData();
            while (result.next()) {
                aa.setId_mustami(result.getString("id_mustami"));
                aa.setNama_mustami(result.getString("nama_mustami"));
                aa.setNim_mustami(result.getString("nim_mustami"));
                aa.setJenisK_mustami(result.getString("jenis_kelamin_mustami"));
                aa.setNoHp_mustami(result.getString("no_hp_mustami"));
                aa.setJmlHafalan_mustami(result.getString("jumlah_hafalan_mustami"));
                String[] s = {aa.getId_mustami(), aa.getNama_mustami(), aa.getNim_mustami(), aa.getJenisK_mustami(), aa.getNoHp_mustami(), aa.getJmlHafalan_mustami()};
                tabmode.addRow(s);
            }
        } catch (Exception e) {
            System.out.println("On Tampil Data() : " + e);
        }
    }

    public void UpdateData() {
        if (txt_idMustamiah.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ID Mustamiah belum terisi");
            txt_idMustamiah.requestFocus();
        } else if (txt_namaMustamiah.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama belum diisi!");
            txt_namaMustamiah.requestFocus();
        } else if (txt_nimMustamiah.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "NIM Mustamiah belum diisi!");
            txt_nimMustamiah.requestFocus();
        } else {
            String id_mustami = "";
            try {
                aa.setId_mustami(txt_idMustamiah.getText());
                aa.setNama_mustami(txt_namaMustamiah.getText());
                aa.setNim_mustami(txt_nimMustamiah.getText());
                aa.setJenisK_mustami(CB_jenisK.getSelectedItem().toString());
                aa.setNoHp_mustami(txt_noHp.getText());
//                aa.setJmlHafalan_mustami(txt_juz.getText());
                aa.ubahData(aa.getId_mustami(), aa.getNama_mustami(), aa.getNim_mustami(), aa.getJenisK_mustami(), aa.getNoHp_mustami(), aa.getJmlHafalan_mustami());
                JOptionPane.showConfirmDialog(null, "Data berhasil disimpan");
                tampil_data();
            } catch (Exception e) {
                System.out.println("Data Gagal disimpan");
            }
        }

    }

    public void hapus() {
        if(txt_idMustamiah.getText().trim().equals("")){
        JOptionPane.showMessageDialog(null, "Maaf Id Mustamiah belum diisi !");
        txt_idMustamiah.requestFocus();
        }else {
            if (JOptionPane.showConfirmDialog(null, "Yakin Akan menghapus data ini ? ","warning",2)==JOptionPane.YES_OPTION);
            String id_mustami="";
            try{
                aa.setId_mustami(txt_idMustamiah.getText());
                aa.hapusData(aa.getId_mustami());
                tampil_data();
                
                JOptionPane.showMessageDialog(null, "Data Berhasil terhapus","Informasi", JOptionPane.INFORMATION_MESSAGE);
            }catch (Exception e){
                JOptionPane.showConfirmDialog(null, JOptionPane.INFORMATION_MESSAGE);
            }
}}
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_idMustamiah = new javax.swing.JTextField();
        txt_namaMustamiah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_nimMustamiah = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_noHp = new javax.swing.JTextField();
        txt_halaman = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CB_jenisK = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel_Data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jLabel5.setText("NAMA");

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jLabel6.setText("NIM");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jLabel7.setText("JENIS KELAMIN");

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("DAFTAR MUSTAMI'AH");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jLabel8.setText("NO HP.");

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 10)); // NOI18N
        jLabel13.setText("ID MUSTAMI'AH");

        txt_idMustamiah.setBackground(new java.awt.Color(236, 236, 250));

        jButton1.setBackground(new java.awt.Color(211, 192, 238));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(225, 216, 239));
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(227, 211, 250));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Juz");

        jLabel3.setText("JUMLAH HAFALAN");

        CB_jenisK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "L" }));

        Tabel_Data.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_DataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel_Data);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_idMustamiah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_namaMustamiah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt_nimMustamiah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CB_jenisK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_noHp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13))
                            .addComponent(txt_idMustamiah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_namaMustamiah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nimMustamiah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_jenisK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_noHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UpdateData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hapus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        simpanData();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void Tabel_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_DataMouseClicked
        try{
            int row = Tabel_Data.rowAtPoint(evt.getPoint());
            String id = Tabel_Data.getValueAt(row, 0).toString();
            String nama = Tabel_Data.getValueAt(row, 1).toString();
            String nim = Tabel_Data.getValueAt(row, 2).toString();
            String JenisK = Tabel_Data.getValueAt(row, 3).toString();
            String noHp = Tabel_Data.getValueAt(row, 4).toString();
            String jmlHafalan = Tabel_Data.getValueAt(row, 5).toString();
            txt_idMustamiah.setText(id);
            txt_namaMustamiah.setText(nama);
            txt_nimMustamiah.setText(nim);
            CB_jenisK.setSelectedItem(JenisK);
            txt_noHp.setText(noHp);
            txt_halaman.setText(jmlHafalan);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_Tabel_DataMouseClicked

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
            java.util.logging.Logger.getLogger(Mustamiah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mustamiah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mustamiah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mustamiah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mustamiah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_jenisK;
    private javax.swing.JTable Tabel_Data;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_halaman;
    private javax.swing.JTextField txt_idMustamiah;
    private javax.swing.JTextField txt_namaMustamiah;
    private javax.swing.JTextField txt_nimMustamiah;
    private javax.swing.JTextField txt_noHp;
    // End of variables declaration//GEN-END:variables
}
