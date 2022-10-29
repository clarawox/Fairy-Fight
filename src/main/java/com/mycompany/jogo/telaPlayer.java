package com.mycompany.jogo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class telaPlayer extends javax.swing.JFrame {

    String player = "P1";
    String elementoPlayer1;
    String elementoPlayer2;
    conectar con = new conectar();
    
    

    public telaPlayer() {
        initComponents();

        //Centralizar e travar redimensionamento da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
        
        Player1.setVisible(true);
        Player2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fogo = new javax.swing.JButton();
        terra = new javax.swing.JButton();
        Ar = new javax.swing.JButton();
        raio = new javax.swing.JButton();
        Agua = new javax.swing.JButton();
        Player1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\Fogo.png")); // NOI18N
        Fogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FogoActionPerformed(evt);
            }
        });
        getContentPane().add(Fogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 160));

        terra.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\terra.png")); // NOI18N
        terra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terraActionPerformed(evt);
            }
        });
        getContentPane().add(terra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, 150));

        Ar.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\ar.png")); // NOI18N
        Ar.setActionCommand("");
        Ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArActionPerformed(evt);
            }
        });
        getContentPane().add(Ar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, 160));

        raio.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\eletro.png")); // NOI18N
        raio.setActionCommand("");
        raio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raioActionPerformed(evt);
            }
        });
        getContentPane().add(raio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 160, 150));

        Agua.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\agua.png")); // NOI18N
        Agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguaActionPerformed(evt);
            }
        });
        getContentPane().add(Agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 160, 160));

        Player1.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        Player1.setForeground(new java.awt.Color(255, 243, 255));
        Player1.setText("Player 1:");
        getContentPane().add(Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        Player2.setFont(new java.awt.Font("Kristen ITC", 1, 48)); // NOI18N
        Player2.setForeground(new java.awt.Color(255, 243, 255));
        Player2.setText("Player 2:");
        getContentPane().add(Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\22159743\\Documents\\NetBeansProjects\\Fairy-Fight-main\\src\\main\\Imagens\\TelaInicial.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resultado() {
        int resultado = con.brigaM(elementoPlayer1, elementoPlayer2);
        
        switch (resultado) {
            case 1:
                System.out.println("Venceu!");
                telaVenceu venceu = new telaVenceu();
                venceu.setVisible(true);
                dispose();
                break;
            case 2:
                System.out.println("Perdeu!");
                telaPerdeu perdeu = new telaPerdeu();
                perdeu.setVisible(true);
                dispose();
                break;
            case 3:
                System.out.println("Empate!");
                telaEmpate empate = new telaEmpate();
                empate.setVisible(true);
                dispose();
                break;

        }
    }
    
    private void FogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FogoActionPerformed
        
        
        
        if (player.equals("P1")) {
            elementoPlayer1 = "fogo";
            telaPlayer telaPlayer2 = new telaPlayer();
            telaPlayer2.player = "P2";
            telaPlayer2.elementoPlayer1 = elementoPlayer1;
            telaPlayer2.setVisible(true);
            telaPlayer2.Player2.setVisible(true);
            telaPlayer2.Player1.setVisible(false);
            dispose();
        } else if (player.equals("P2")) {
            elementoPlayer2 = "fogo";
            resultado();
        }

    }//GEN-LAST:event_FogoActionPerformed

    private void terraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terraActionPerformed
        
        Player1.setVisible(true);
        Player2.setVisible(false);
        
        if (player.equals("P1")) {
            elementoPlayer1 = "terra";
            telaPlayer telaPlayer2 = new telaPlayer();
            telaPlayer2.player = "P2";
            telaPlayer2.elementoPlayer1 = elementoPlayer1;
            telaPlayer2.setVisible(true);
            telaPlayer2.Player2.setVisible(true);
            telaPlayer2.Player1.setVisible(false);
            dispose();
        } else if (player.equals("P2")) {
            elementoPlayer2 = "terra";
            resultado();
        }
    }//GEN-LAST:event_terraActionPerformed

    private void ArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArActionPerformed
        
        Player1.setVisible(true);
        Player2.setVisible(false);
        
        if (player.equals("P1")) {
            elementoPlayer1 = "ar";
            telaPlayer telaPlayer2 = new telaPlayer();
            telaPlayer2.player = "P2";
            telaPlayer2.elementoPlayer1 = elementoPlayer1;
            telaPlayer2.setVisible(true);
            telaPlayer2.Player2.setVisible(true);
            telaPlayer2.Player1.setVisible(false);
            dispose();
        } else if (player.equals("P2")) {
            elementoPlayer2 = "ar";
            resultado();
        }
    }//GEN-LAST:event_ArActionPerformed

    private void raioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raioActionPerformed
        
        Player1.setVisible(true);
        Player2.setVisible(false);
        
        if (player.equals("P1")) {
            elementoPlayer1 = "raio";
            telaPlayer telaPlayer2 = new telaPlayer();
            telaPlayer2.player = "P2";
            telaPlayer2.elementoPlayer1 = elementoPlayer1;
            telaPlayer2.setVisible(true);
            telaPlayer2.Player2.setVisible(true);
            telaPlayer2.Player1.setVisible(false);
            dispose();
        } else if (player.equals("P2")) {
            elementoPlayer2 = "raio";
            resultado();
        }
    }//GEN-LAST:event_raioActionPerformed

    private void AguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguaActionPerformed
        
        Player1.setVisible(true);
        Player2.setVisible(false);
        
        if (player.equals("P1")) {
            elementoPlayer1 = "agua";
            telaPlayer telaPlayer2 = new telaPlayer();
            telaPlayer2.player = "P2";
            telaPlayer2.elementoPlayer1 = elementoPlayer1;
            telaPlayer2.setVisible(true);
            telaPlayer2.Player2.setVisible(true);
            telaPlayer2.Player1.setVisible(false);
            dispose();
        } else if (player.equals("P2")) {
            elementoPlayer2 = "agua";
            resultado();
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
            java.util.logging.Logger.getLogger(telaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agua;
    private javax.swing.JButton Ar;
    private javax.swing.JButton Fogo;
    private javax.swing.JLabel Player1;
    private javax.swing.JLabel Player2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton raio;
    private javax.swing.JButton terra;
    // End of variables declaration//GEN-END:variables
}
