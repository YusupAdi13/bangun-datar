
import jdk.jfr.Percentage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 
/**
 *
 * @author MyBook Hype
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jLabel1 = new javax.swing.JLabel();
        jPersegi = new javax.swing.JButton();
        jPersegiPanjang = new javax.swing.JButton();
        jLingkaran = new javax.swing.JButton();
        jSegitiga = new javax.swing.JButton();
        yclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("APLIKASI BANGUN DATAR");

        jPersegi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPersegi.setText("PERSEGI");
        jPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPersegiActionPerformed(evt);
            }
        });

        jPersegiPanjang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPersegiPanjang.setText("PERSEGI PANJANG");
        jPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPersegiPanjangActionPerformed(evt);
            }
        });

        jLingkaran.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLingkaran.setText("LINGKARAN");
        jLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLingkaranActionPerformed(evt);
            }
        });

        jSegitiga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSegitiga.setText("SEGITIGA");
        jSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSegitigaActionPerformed(evt);
            }
        });

        yclose.setText("close");
        yclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ycloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSegitiga)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLingkaran, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jPersegi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPersegiPanjang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yclose)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPersegiPanjang)
                .addGap(18, 18, 18)
                .addComponent(jPersegi)
                .addGap(12, 12, 12)
                .addComponent(jLingkaran)
                .addGap(18, 18, 18)
                .addComponent(jSegitiga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(yclose)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPersegiPanjangActionPerformed
        // TODO add your handling code here:
        new PersegiPanjang(). setVisible(true);
    }//GEN-LAST:event_jPersegiPanjangActionPerformed

    private void jPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPersegiActionPerformed
        // TODO add your handling code here:
        new Persegi().setVisible(true);
    }//GEN-LAST:event_jPersegiActionPerformed

    private void jLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLingkaranActionPerformed
        // TODO add your handling code here:
        new Lingkaran().setVisible(true);
    }//GEN-LAST:event_jLingkaranActionPerformed

    private void jSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSegitigaActionPerformed
        // TODO add your handling code here:
        new Segitiga().setVisible(true);
    }//GEN-LAST:event_jSegitigaActionPerformed

    private void ycloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ycloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ycloseActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLingkaran;
    private javax.swing.JButton jPersegi;
    private javax.swing.JButton jPersegiPanjang;
    private javax.swing.JButton jSegitiga;
    private javax.swing.JButton yclose;
    // End of variables declaration//GEN-END:variables
}
