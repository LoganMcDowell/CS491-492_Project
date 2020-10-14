/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.SCREENS;

import game.Card;
import game.Database;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author lmcdo
 */
public class SCREEN_Cards extends javax.swing.JFrame {

    /**
     * Creates new form Cards
     */
    
    private ArrayList<Card>cardList=new ArrayList<>();
    public SCREEN_Cards() {
        initComponents();
        customizeLayout();
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
        Inspect_Button = new javax.swing.JButton();
        Remove_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Return_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/FantasyTabletop_2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 180, 450));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 72, 420, 320));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setText("Cards");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JButton Inspect_Button;
    private javax.swing.JButton Remove_Button;
    private javax.swing.JButton Return_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void customizeLayout() {
        
        
        //customization of the layout
         
        cardList=Database.getInstance().getCardList();
        System.out.println(cardList.size());
        
        String[]cardListTitles=new String[cardList.size()];
        
        for(int i=0;i<cardList.size();i++){
            
            cardListTitles[i]=cardList.get(i).getName();
        }
        
        
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = cardListTitles;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
        
    }
}