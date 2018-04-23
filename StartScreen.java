/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millionaire;

import static Millionaire.DoYouWantToBeAMillionaire.loadQuestions;
import java.awt.Color;

/**
 *
 * @author ygao
 */
public class StartScreen extends javax.swing.JFrame {

    /**
     * Creates new form StartScreen
     */
    public StartScreen() {
        initComponents();
        System.out.println(loadQuestions());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        StartBtn = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        QuitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(690, 408));
        setMinimumSize(new java.awt.Dimension(690, 408));
        setResizable(false);
        setSize(new java.awt.Dimension(690, 408));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(690, 408));
        jPanel1.setMinimumSize(new java.awt.Dimension(690, 408));
        jPanel1.setLayout(null);

        StartBtn.setForeground(new java.awt.Color(0, 153, 255));
        StartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/startBtn.png"))); // NOI18N
        StartBtn.setBorder(null);
        StartBtn.setBorderPainted(false);
        StartBtn.setContentAreaFilled(false);
        StartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartBtnMouseExited(evt);
            }
        });
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });
        jPanel1.add(StartBtn);
        StartBtn.setBounds(62, 292, 189, 70);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(208, 25, 250, 250);

        QuitBtn.setBackground(new java.awt.Color(0, 153, 255));
        QuitBtn.setForeground(new java.awt.Color(0, 153, 255));
        QuitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/quitBtn.png"))); // NOI18N
        QuitBtn.setBorder(null);
        QuitBtn.setBorderPainted(false);
        QuitBtn.setContentAreaFilled(false);
        QuitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuitBtnMouseExited(evt);
            }
        });
        QuitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(QuitBtn);
        QuitBtn.setBounds(420, 290, 189, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/startBackground.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartBtnMouseEntered
        StartBtn.setOpaque(true);
        StartBtn.setContentAreaFilled(true);
        StartBtn.setBackground(Color.GREEN);
        StartBtn.setForeground(Color.GREEN);
    }//GEN-LAST:event_StartBtnMouseEntered

    private void StartBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartBtnMouseExited
        StartBtn.setOpaque(false);
        StartBtn.setContentAreaFilled(false); //to make the content area transparent
        StartBtn.setBorderPainted(false);
    }//GEN-LAST:event_StartBtnMouseExited

    private void QuitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitBtnActionPerformed

    private void QuitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitBtnMouseEntered
        QuitBtn.setOpaque(true);
        QuitBtn.setContentAreaFilled(true);
        QuitBtn.setBackground(Color.RED);
        QuitBtn.setForeground(Color.RED);
    }//GEN-LAST:event_QuitBtnMouseEntered

    private void QuitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitBtnMouseExited
        QuitBtn.setOpaque(false);
        QuitBtn.setContentAreaFilled(false); //to make the content area transparent
        QuitBtn.setBorderPainted(false);
    }//GEN-LAST:event_QuitBtnMouseExited

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        super.dispose(); // closes window after clicking start button
        Instructions howto = new Instructions();
        howto.setVisible(true);
        
    }//GEN-LAST:event_StartBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton QuitBtn;
    private javax.swing.JButton StartBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
