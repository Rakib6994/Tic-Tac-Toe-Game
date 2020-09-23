
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teacher's
 */
public class page2 extends javax.swing.JFrame {

    int p1=1;
    int p2=0;
    public page2() {
        initComponents();
    }
    void check(){
 
        if(jButton1.getText()=="O" && jButton2.getText()=="O" &&
                jButton3.getText()=="O")
        {    
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset(); 
              p1=1;
            p2=0;
        }  
        if(jButton1.getText()=="X" && jButton2.getText()=="X" &&
                jButton3.getText()=="X")
        {
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
        if(jButton1.getText()=="O" && jButton4.getText()=="O" &&
                jButton7.getText()=="O")
        {        
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        
        }  
        if(jButton1.getText()=="X" && jButton4.getText()=="X" &&
                jButton7.getText()=="X")
        {
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
        if(jButton1.getText()=="O" && jButton5.getText()=="O" &&
                jButton9.getText()=="O")
        {
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        }
         if(jButton1.getText()=="X" && jButton5.getText()=="X" &&
                jButton9.getText()=="X")
        {
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
        if(jButton2.getText()=="O" && jButton5.getText()=="O" &&
                jButton8.getText()=="O")
        {         
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        
        }
         if(jButton2.getText()=="X" && jButton5.getText()=="X" &&
                jButton8.getText()=="X")
        { 
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
        if(jButton3.getText()=="O" && jButton6.getText()=="O" &&
                jButton9.getText()=="O")
        {
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        
        }
         if(jButton3.getText()=="X" && jButton6.getText()=="X" &&
                jButton9.getText()=="X"){
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
      
           if(jButton3.getText()=="O" && jButton5.getText()=="O" &&
                jButton7.getText()=="O"){
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        
        }
         if(jButton3.getText()=="X" && jButton5.getText()=="X" &&
                jButton7.getText()=="X"){
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
           if(jButton4.getText()=="O" && jButton5.getText()=="O" &&
                jButton6.getText()=="O")
        {
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        
        }
          if(jButton4.getText()=="X" && jButton5.getText()=="X" &&
                jButton6.getText()=="X")
        {
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
            if(jButton7.getText()=="O" && jButton8.getText()=="O" &&
                jButton9.getText()=="O")
        {
            JOptionPane.showMessageDialog(this, "Player 2 Wins");
             Reset();
              p1=1;
            p2=0;
        
        }
           if(jButton7.getText()=="X" && jButton8.getText()=="X" &&
                jButton9.getText()=="X")
           {
            JOptionPane.showMessageDialog(this, "Player 1 Wins");
             Reset();
              p1=1;
            p2=0;
        }
             
        if(jButton1.getText()!="" && jButton2.getText()!="" &&
                jButton3.getText()!=""&& jButton4.getText()!="" &&
                jButton5.getText()!=""&& jButton6.getText()!="" &&
                jButton7.getText()!=""&& jButton8.getText()!="" &&
                jButton9.getText()!="")
        
        {
            JOptionPane.showMessageDialog(this, " MATCH DRAW ");
            
            Reset();
            p1=1;
            p2=0;
        }
          
    }
    /* void Tiegame(){
       if(jButton1.getText()!="" && jButton2.getText()!="" &&
                jButton3.getText()!=""&& jButton4.getText()!="" &&
                jButton5.getText()!=""&& jButton6.getText()!="" &&
                jButton7.getText()!=""&& jButton8.getText()!="" &&
                jButton9.getText()!="")
        
        {
            JOptionPane.showMessageDialog(this, "MATCH DRAW");
            Reset();
        }
   }*/
    void Reset(){
       jButton1.setText("");
        
        jButton2.setText("");
        
        jButton3.setText("");
        
        jButton4.setText("");
        
        jButton5.setText("");
        
        jButton6.setText("");
        
        jButton7.setText("");
        
        jButton8.setText("");
       
        jButton9.setText("");
           }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(330, 350));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if(p1==1 && p2==0){
          jButton1.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton1.setText("X"); 
         p2=0;
         p1=1;
      }
      check();
       
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        if(p1==1 && p2==0){
          jButton2.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton2.setText("X"); 
         p2=0;
         p1=1;
      }
       check();
       
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        if(p1==1 && p2==0){
          jButton3.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton3.setText("X"); 
         p2=0;
         p1=1;
      }
        check();
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   
        if(p1==1 && p2==0){
          jButton5.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton5.setText("X"); 
         p2=0;
         p1=1;
      }
        check();
       
    
 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   
        if(p1==1 && p2==0){
          jButton4.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton4.setText("X"); 
         p2=0;
         p1=1;
      }
         check();
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   
        if(p1==1 && p2==0){
          jButton7.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton7.setText("X"); 
         p2=0;
         p1=1;
      }
      check();
       
     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   
        if(p1==1 && p2==0){
          jButton6.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton6.setText("X"); 
         p2=0;
         p1=1;
      }
      check();
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        if(p1==1 && p2==0){
          jButton8.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton8.setText("X"); 
         p2=0;
         p1=1;
      }
      check();
   
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      
        if(p1==1 && p2==0){
          jButton9.setText("O");
          p2=1;
          p1=0;
      }
      else{
         jButton9.setText("X"); 
         p2=0;
         p1=1;
      }
      check();
  
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
