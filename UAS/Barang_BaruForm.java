/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author USER
 */
public class Barang_BaruForm extends javax.swing.JFrame {

    /**
     * Creates new form Barang_Baru
     */
    public Barang_BaruForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinuman = new javax.swing.JToggleButton();
        btnMakanan = new javax.swing.JToggleButton();
        btnPerlengkapanMandi = new javax.swing.JToggleButton();
        btnUtama = new javax.swing.JButton();
        btnBeliBarang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMinuman.setText("Minuman");
        btnMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinumanActionPerformed(evt);
            }
        });

        btnMakanan.setText("Makanan");
        btnMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakananActionPerformed(evt);
            }
        });

        btnPerlengkapanMandi.setText("Perlengkapan Mandi");
        btnPerlengkapanMandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerlengkapanMandiActionPerformed(evt);
            }
        });

        btnUtama.setText("Menu Utama");
        btnUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtamaActionPerformed(evt);
            }
        });

        btnBeliBarang.setText("Beli Barang");
        btnBeliBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnUtama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBeliBarang))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnPerlengkapanMandi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBeliBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPerlengkapanMandi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinumanActionPerformed
        MinumanForm x = new MinumanForm();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMinumanActionPerformed

    private void btnMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakananActionPerformed
        MakananForm x = new MakananForm();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMakananActionPerformed

    private void btnPerlengkapanMandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerlengkapanMandiActionPerformed
        Perlengkapan_MandiForm x = new Perlengkapan_MandiForm();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerlengkapanMandiActionPerformed

    private void btnUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtamaActionPerformed
        PenggunaForm x = new PenggunaForm();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUtamaActionPerformed

    private void btnBeliBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliBarangActionPerformed
        Beli_BarangForm x = new Beli_BarangForm();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBeliBarangActionPerformed

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
            java.util.logging.Logger.getLogger(Barang_BaruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang_BaruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang_BaruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang_BaruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang_BaruForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeliBarang;
    private javax.swing.JToggleButton btnMakanan;
    private javax.swing.JToggleButton btnMinuman;
    private javax.swing.JToggleButton btnPerlengkapanMandi;
    private javax.swing.JButton btnUtama;
    // End of variables declaration//GEN-END:variables
}