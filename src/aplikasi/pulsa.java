/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import java.text.DecimalFormat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Aditya Rizky F
 */
public class pulsa extends javax.swing.JFrame {
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql="";
    
    String pil = "";
    int harga_pulsa;
    int jml_harga;
    int bayar,beli,harga;       
    public pulsa() {
        initComponents();
        KoneksiDatabase();
    }
    
    private void KoneksiDatabase(){
        try{
        // menentukan driver database
            Class.forName("com.mysql.jdbc.Driver");
        // untuk mengkoneksikan DB ke Driver
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cobain", "root", "");
            // Pesan koneksi berhasil
            JOptionPane.showMessageDialog(null, "Koneksi berhasil"); 
        } catch(Exception e){
            System.out.println("Koneksi Gagal"+e.getMessage());
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        Tanggal = new javax.swing.JTextField();
        belipulsa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BAYAR = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        harganyapulsa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("Pembelian Pulsa");

        jLabel2.setText("Nama Pembeli");

        jLabel3.setText("Tanggal Pembelian");

        jLabel4.setText("Silahkan Pilih Transaksi");

        Tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalActionPerformed(evt);
            }
        });

        belipulsa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu", "Saldo 5.000", "Saldo 10.000", "Saldo 15.000", "Saldo 20.000", "Saldo 25.000", "Saldo 30.000", "Saldo 40.000", "Saldo 50.000", "Saldo 100.000", "Saldo 150.000", "Saldo 200.000", " " }));
        belipulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belipulsaActionPerformed(evt);
            }
        });

        jLabel5.setText("Uang Bayar");

        jLabel6.setText("Kembalian");

        BAYAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAYARActionPerformed(evt);
            }
        });

        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });

        jButton1.setText("Kembalian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Harga pulsa");

        harganyapulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harganyapulsaActionPerformed(evt);
            }
        });

        jButton3.setText("menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BAYAR)
                                    .addComponent(belipulsa, 0, 311, Short.MAX_VALUE)
                                    .addComponent(kembalian)
                                    .addComponent(harganyapulsa)
                                    .addComponent(Tanggal)
                                    .addComponent(nama)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(belipulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(harganyapulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BAYAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(Clear))
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void belipulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belipulsaActionPerformed
        pil = (String) belipulsa.getSelectedItem();
        switch (pil){
            case "Saldo 5.000":
                harga_pulsa = 7000;
                break;
            case "Saldo 10.000":
                harga_pulsa = 12000;
                break;
            case "Saldo 15.000":        
                harga_pulsa = 17000;
                break;
            case "Saldo 20.000":
                harga_pulsa = 22000;
                break;
            case "Saldo 25.000":
                harga_pulsa = 27000;
                break;
            case "Saldo 30.000":
                harga_pulsa = 32000;
                break;
            case "Saldo 40.000":
                harga_pulsa = 42000;
                break;
            case "Saldo 50.000":
                harga_pulsa = 52000;
                break;
            case "Saldo 100.000":
                harga_pulsa = 102000;
                break;
            case "Saldo 150.000":
                harga_pulsa = 152000;
                break;
            case "Saldo 200.000":
                harga_pulsa = 202000;
                break;
    }//GEN-LAST:event_belipulsaActionPerformed
        harganyapulsa.setText(""+Integer.toString (harga_pulsa));
    }
    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembalianActionPerformed

    private void BAYARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAYARActionPerformed

    }//GEN-LAST:event_BAYARActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        silahkan_pilih pilihan = new silahkan_pilih();
        pilihan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void harganyapulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harganyapulsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harganyapulsaActionPerformed

    private void TanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TanggalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            harga = Integer.parseInt(harganyapulsa.getText());

            int kembali = Integer.parseInt(BAYAR.getText());
            bayar = harga;
            int total = kembali - bayar;
            DecimalFormat angka = new DecimalFormat("###,###");
            kembalian.setText("Rp."+Integer.toString(total));//Kelompok 1
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage)
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        belipulsa.setSelectedIndex(0);
        nama.setText("");
        Tanggal.setText("");
        harganyapulsa.setText("");
        BAYAR.setText("");
        kembalian.setText("");
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(pulsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pulsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pulsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pulsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pulsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BAYAR;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JComboBox<String> belipulsa;
    private javax.swing.JTextField harganyapulsa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField nama;
    // End of variables declaration//GEN-END:variables
}
