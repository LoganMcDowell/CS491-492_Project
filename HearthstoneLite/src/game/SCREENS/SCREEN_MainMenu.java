/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
ACTION
0: default
1: Start
2: Decks
3: Options
4: Quit
*/
package game.SCREENS;

import game.Database;

/**
 *
 * @author lmcdo
 */
public class SCREEN_MainMenu extends javax.swing.JFrame {
    
    //Menu choice thing
    private int action = 0;
    public boolean response = false;
    
    /**
     * Creates new form MainMenu
     */
    public SCREEN_MainMenu() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Menu = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Start_Button = new javax.swing.JButton();
        Deck_Button = new javax.swing.JButton();
        Options_Button = new javax.swing.JButton();
        Help_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Main Menu");
        Menu.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 260, 69));

        Start_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Start_Button.setText("START");
        Start_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_ButtonActionPerformed(evt);
            }
        });
        Menu.add(Start_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 320, 60));

        Deck_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deck_Button.setText("Deck Builder");
        Deck_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deck_ButtonActionPerformed(evt);
            }
        });
        Menu.add(Deck_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 320, 50));

        Options_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Options_Button.setText("Options");
        Options_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Options_ButtonActionPerformed(evt);
            }
        });
        Menu.add(Options_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 320, 50));

        Help_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Help_Button.setText("Help");
        Help_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_ButtonActionPerformed(evt);
            }
        });
        Menu.add(Help_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 320, 50));

        Exit_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit_Button.setText("EXIT");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        Menu.add(Exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 320, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/FantasyBackground_1.jpg"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Background, org.jdesktop.beansbinding.ELProperty.create("${horizontalAlignment}"), Background, org.jdesktop.beansbinding.BeanProperty.create("horizontalAlignment"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Background, org.jdesktop.beansbinding.ELProperty.create("${verticalAlignment}"), Background, org.jdesktop.beansbinding.BeanProperty.create("verticalAlignment"));
        bindingGroup.addBinding(binding);

        Menu.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 516, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_ButtonActionPerformed
        // TODO add your handling code here:
        SCREEN_StartGame sg = new SCREEN_StartGame();
        sg.setVisible(true);
        dispose();
        //setVisible(false);
    }//GEN-LAST:event_Start_ButtonActionPerformed

    private void Deck_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deck_ButtonActionPerformed
        // TODO add your handling code here:
        
        //SCREEN_Decks d = new SCREEN_Decks();
        //d.setVisible(true);
        
        action = 2;
        while(response==false){
            //wait
        }
        response = false;
        dispose();
        //setVisible(false);
    }//GEN-LAST:event_Deck_ButtonActionPerformed

    private void Options_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Options_ButtonActionPerformed
        // TODO add your handling code here:
        SCREEN_Options op = new SCREEN_Options();
        op.setVisible(true);
        dispose();
        //setVisible(false);
    }//GEN-LAST:event_Options_ButtonActionPerformed

    private void Help_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_ButtonActionPerformed
        // TODO add your handling code here:
        SCREEN_Help h = new SCREEN_Help();
        h.setVisible(true);
        dispose();
        //setVisible(false);
    }//GEN-LAST:event_Help_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    //Sends Menu Choice to Database
    public int getAction(){
        return action;
    }
    public void setAction(int set){
        action = set;
    }
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
            java.util.logging.Logger.getLogger(SCREEN_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCREEN_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCREEN_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCREEN_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCREEN_MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Deck_Button;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JButton Help_Button;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Options_Button;
    private javax.swing.JButton Start_Button;
    private javax.swing.JLabel Title;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
