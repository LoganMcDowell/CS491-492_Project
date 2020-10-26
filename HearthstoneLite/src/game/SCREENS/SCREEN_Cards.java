/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.SCREENS;

import OLD_pack.SCREEN_DeckBuilder;

/**
 *
 * @author lmcdo
 */
public class SCREEN_Cards extends javax.swing.JFrame {

    /**
     * Creates new form Cards
     */
    public SCREEN_Cards() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Inspect_Button = new javax.swing.JButton();
        Remove_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Return_Button = new javax.swing.JButton();
        Card_Icon_6 = new javax.swing.JLabel();
        Card_Icon_5 = new javax.swing.JLabel();
        Card_Icon_4 = new javax.swing.JLabel();
        Card_Icon_3 = new javax.swing.JLabel();
        Card_Icon_2 = new javax.swing.JLabel();
        Card_Icon_1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("    Cards");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 200, 50));

        Inspect_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Inspect_Button.setText("Inspect");
        Inspect_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inspect_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Inspect_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 20));

        Remove_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Remove_Button.setText("Remove");
        jPanel1.add(Remove_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 20));

        Add_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add_Button.setText("Add");
        jPanel1.add(Add_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 20));

        Return_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Return_Button.setText("Return");
        Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Return_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 20));

        Card_Icon_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/card(0).PNG"))); // NOI18N
        jPanel1.add(Card_Icon_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, 80));

        Card_Icon_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/card(0).PNG"))); // NOI18N
        jPanel1.add(Card_Icon_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 80));

        Card_Icon_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/card(0).PNG"))); // NOI18N
        jPanel1.add(Card_Icon_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, 80));

        Card_Icon_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/card(0).PNG"))); // NOI18N
        jPanel1.add(Card_Icon_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 80));

        Card_Icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/card(0).PNG"))); // NOI18N
        jPanel1.add(Card_Icon_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 80));

        Card_Icon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/card(0).PNG"))); // NOI18N
        jPanel1.add(Card_Icon_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, 80));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 350, 330));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/FantasyTabletop_2.jpg"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inspect_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inspect_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inspect_ButtonActionPerformed

    private void Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ButtonActionPerformed
        // TODO add your handling code here:
        SCREEN_DeckBuilder db = new SCREEN_DeckBuilder();
        db.setVisible(true);
        dispose();
    }//GEN-LAST:event_Return_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SCREEN_Cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCREEN_Cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCREEN_Cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCREEN_Cards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCREEN_Cards().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Card_Icon_1;
    private javax.swing.JLabel Card_Icon_2;
    private javax.swing.JLabel Card_Icon_3;
    private javax.swing.JLabel Card_Icon_4;
    private javax.swing.JLabel Card_Icon_5;
    private javax.swing.JLabel Card_Icon_6;
    private javax.swing.JButton Inspect_Button;
    private javax.swing.JButton Remove_Button;
    private javax.swing.JButton Return_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
