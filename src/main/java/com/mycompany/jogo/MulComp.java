/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Clara
 */
public class MulComp extends javax.swing.JFrame {

    /**
     * Creates new form MulComp
     */
    public MulComp() {
        initComponents();
        
        //Centralizar e travar redimensionamento da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mult = new javax.swing.JButton();
        comp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mult.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\3.png")); // NOI18N
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        getContentPane().add(mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 210, 40));

        comp.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\4.png")); // NOI18N
        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });
        getContentPane().add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 220, 40));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 243, 255));
        jLabel2.setText("jogar?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 243, 255));
        jLabel3.setText("Como você quer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\TelaInicial.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        telaPlayer cad = new telaPlayer();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_multActionPerformed

    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        telaComp cad = new telaComp();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_compActionPerformed

    /*
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
            java.util.logging.Logger.getLogger(MulComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MulComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MulComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MulComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MulComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton mult;
    // End of variables declaration//GEN-END:variables
}
