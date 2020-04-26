/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author lmcdo
 */
public class Field extends javax.swing.JFrame {

    /**
     * Creates new form Field
     */
    public Field() {
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
        Draw_Button = new javax.swing.JButton();
        Return_Button = new javax.swing.JButton();
        EndTurn_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Player_Hand = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AI_Hand = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Draw_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Draw_Button.setText("Draw Card");
        Draw_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Draw_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Draw_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, 20));

        Return_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Return_Button.setText("Return");
        Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Return_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 20));

        EndTurn_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EndTurn_Button.setText("End Turn");
        jPanel1.add(EndTurn_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 60, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Card).PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 60, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Card).PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Card).PNG"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 60, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Card).PNG"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 60, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Card).PNG"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 60, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 60, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 60, 80));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 60, 80));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 60, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Real(Deck).PNG"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 60, 80));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        Player_Hand.setViewportView(jTextArea1);

        jPanel1.add(Player_Hand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 520, 100));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        AI_Hand.setViewportView(jTextArea2);

        jPanel1.add(AI_Hand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/Field.jpg"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Draw_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Draw_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Draw_ButtonActionPerformed

    private void Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ButtonActionPerformed
        // TODO add your handling code here:
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
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
            java.util.logging.Logger.getLogger(Field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Field.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Field().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AI_Hand;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Draw_Button;
    private javax.swing.JButton EndTurn_Button;
    private javax.swing.JScrollPane Player_Hand;
    private javax.swing.JButton Return_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
