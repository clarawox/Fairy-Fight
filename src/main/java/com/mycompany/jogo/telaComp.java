/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author Clara
 */
public class telaComp extends javax.swing.JFrame {

    /**
     * Creates new form tela2
     */
    String user;
    String elemento;
    conectar con = new conectar();

    public telaComp() {
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

        Fogo = new javax.swing.JButton();
        terra = new javax.swing.JButton();
        Ar = new javax.swing.JButton();
        raio = new javax.swing.JButton();
        Agua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fogo.setText("Fogo");
        Fogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FogoActionPerformed(evt);
            }
        });

        terra.setText("Terra");
        terra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terraActionPerformed(evt);
            }
        });

        Ar.setText("Ar");
        Ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArActionPerformed(evt);
            }
        });

        raio.setText("Raio");
        raio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raioActionPerformed(evt);
            }
        });

        Agua.setText("Água");
        Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 68, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Fogo)
                            .addGap(113, 113, 113)
                            .addComponent(Ar)
                            .addGap(117, 117, 117)
                            .addComponent(Agua))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(terra)
                            .addGap(121, 121, 121)
                            .addComponent(raio)))
                    .addGap(0, 69, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 120, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fogo)
                        .addComponent(Ar)
                        .addComponent(Agua))
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(terra)
                        .addComponent(raio))
                    .addGap(0, 120, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FogoActionPerformed
        elemento = "fogo";
        con.briga(elemento);

        if (con.venceu == 1) {
            telaVenceu cad = new telaVenceu();
            cad.setVisible(true);
            dispose();
        } else if (con.venceu == 2){
            telaPerdeu cad = new telaPerdeu();
            cad.setVisible(true);
            dispose();
        } else if (con.empate == 1){
            telaEmpate cad = new telaEmpate();
            cad.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_FogoActionPerformed

    private void terraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terraActionPerformed
        elemento = "terra";
        
        con.briga(elemento);

        if (con.venceu == 1) {
            telaVenceu cad = new telaVenceu();
            cad.setVisible(true);
            dispose();
        } else if (con.venceu == 2){
            telaPerdeu cad = new telaPerdeu();
            cad.setVisible(true);
            dispose();
        } else if (con.empate == 1){
            telaEmpate cad = new telaEmpate();
            cad.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_terraActionPerformed

    private void ArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArActionPerformed
        elemento = "ar";
        
        con.briga(elemento);

        if (con.venceu == 1) {
            telaVenceu cad = new telaVenceu();
            cad.setVisible(true);
            dispose();
        } else if (con.venceu == 2){
            telaPerdeu cad = new telaPerdeu();
            cad.setVisible(true);
            dispose();
        } else if (con.empate == 1){
            telaEmpate cad = new telaEmpate();
            cad.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_ArActionPerformed

    private void raioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raioActionPerformed
        elemento = "raio";
        con.briga(elemento);

        if (con.venceu == 1) {
            telaVenceu cad = new telaVenceu();
            cad.setVisible(true);
            dispose();
        } else if (con.venceu == 2){
            telaPerdeu cad = new telaPerdeu();
            cad.setVisible(true);
            dispose();
        } else if (con.empate == 1){
            telaEmpate cad = new telaEmpate();
            cad.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_raioActionPerformed

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
        elemento = "agua";
        con.briga(elemento);

        if (con.venceu == 1) {
            telaVenceu cad = new telaVenceu();
            cad.setVisible(true);
            dispose();
        } else if (con.venceu == 2){
            telaPerdeu cad = new telaPerdeu();
            cad.setVisible(true);
            dispose();
        } else if (con.empate == 1){
            telaEmpate cad = new telaEmpate();
            cad.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_AguaActionPerformed

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
            java.util.logging.Logger.getLogger(telaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agua;
    private javax.swing.JButton Ar;
    private javax.swing.JButton Fogo;
    private javax.swing.JButton raio;
    private javax.swing.JButton terra;
    // End of variables declaration//GEN-END:variables
}
