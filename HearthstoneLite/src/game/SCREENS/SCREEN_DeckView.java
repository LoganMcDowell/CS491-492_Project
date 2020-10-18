/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.SCREENS;

/**
 *
 * @author lmcdo
 */
public class SCREEN_DeckView extends javax.swing.JFrame {

    /**
     * Creates new form DeckView
     */
    public SCREEN_DeckView() {
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
        Title = new javax.swing.JLabel();
        Card_Button = new javax.swing.JButton();
        Name_Field = new javax.swing.JTextField();
        Save_Button = new javax.swing.JButton();
        Return_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(0, 0, 0));
        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Decks");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 50));

        Card_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Card_Button.setText("Select Card");
        Card_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Card_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 50));

        Name_Field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name_Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name_Field.setText("Name the Deck");
        Name_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_FieldActionPerformed(evt);
            }
        });
        jPanel1.add(Name_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 40));

        Save_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save_Button.setText("Save");
        Save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Save_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 50));

        Return_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Return_Button.setText("Cancel");
        Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Return_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 100, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 360, 330));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/FantasyTabletop_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

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

    private void Card_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card_ButtonActionPerformed
        // TODO add your handling code here:
        SCREEN_Cards c = new SCREEN_Cards();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_Card_ButtonActionPerformed

    private void Save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ButtonActionPerformed
        // TODO add your handling code here:
        //SCREEN_Decks d = new SCREEN_Decks();
        //d.setVisible(true);
        dispose();
    }//GEN-LAST:event_Save_ButtonActionPerformed

    private void Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ButtonActionPerformed
        // TODO add your handling code here:
        //SCREEN_Decks d = new SCREEN_Decks();
        //d.setVisible(true);
        dispose();
    }//GEN-LAST:event_Return_ButtonActionPerformed

    private void Name_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_FieldActionPerformed

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
            java.util.logging.Logger.getLogger(SCREEN_DeckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCREEN_DeckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCREEN_DeckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCREEN_DeckView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCREEN_DeckView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Card_Button;
    private javax.swing.JTextField Name_Field;
    private javax.swing.JButton Return_Button;
    private javax.swing.JButton Save_Button;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
