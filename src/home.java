/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuhome = new javax.swing.JMenu();
        menulocation = new javax.swing.JMenu();
        menudoner = new javax.swing.JMenu();
        menubloodreciver = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuviewdetails = new javax.swing.JMenu();
        menuviewdoner = new javax.swing.JMenu();
        menuviewreciver = new javax.swing.JMenu();
        menureport = new javax.swing.JMenu();
        menusignout = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\home3.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 910, 560));

        label1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1000, 60));

        label2.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 50, 560));

        label3.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        label4.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 50, 560));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        menuhome.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\home.png")); // NOI18N
        menuhome.setText("Home");
        menuhome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menuhome.setMinimumSize(new java.awt.Dimension(156, 26));
        menuhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuhomeMouseClicked(evt);
            }
        });
        menuhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuhomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuhome);

        menulocation.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\location.png")); // NOI18N
        menulocation.setText("Add Location");
        menulocation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menulocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulocationMouseClicked(evt);
            }
        });
        menulocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulocationActionPerformed(evt);
            }
        });
        jMenuBar1.add(menulocation);

        menudoner.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\man-in-suit-and-tie.png")); // NOI18N
        menudoner.setText("Add Doner");
        menudoner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menudoner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudonerMouseClicked(evt);
            }
        });
        jMenuBar1.add(menudoner);

        menubloodreciver.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\man-silhouette.png")); // NOI18N
        menubloodreciver.setText("Add  Recipient");
        menubloodreciver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menubloodreciver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubloodreciverMouseClicked(evt);
            }
        });
        jMenuBar1.add(menubloodreciver);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\money-graph-with-up-arrow.png")); // NOI18N
        jMenu2.setText("Blood Stock");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        menuviewdetails.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\file.png")); // NOI18N
        menuviewdetails.setText("View ");
        menuviewdetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuviewdoner.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\information.png")); // NOI18N
        menuviewdoner.setText("Doner Details");
        menuviewdoner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuviewdonerMouseClicked(evt);
            }
        });
        menuviewdoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuviewdonerActionPerformed(evt);
            }
        });
        menuviewdetails.add(menuviewdoner);

        menuviewreciver.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\information.png")); // NOI18N
        menuviewreciver.setText("Recipient Details");
        menuviewreciver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuviewreciverMouseClicked(evt);
            }
        });
        menuviewdetails.add(menuviewreciver);

        jMenuBar1.add(menuviewdetails);

        menureport.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\report.png")); // NOI18N
        menureport.setText("Report");
        menureport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menureport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menureportMouseClicked(evt);
            }
        });
        jMenuBar1.add(menureport);

        menusignout.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinet\\Downloads\\logout.png")); // NOI18N
        menusignout.setText("Sign out");
        menusignout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menusignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menusignoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menusignout);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1014, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menulocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulocationActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menulocationActionPerformed

    private void menuviewdonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewdonerActionPerformed
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_menuviewdonerActionPerformed

    private void menuhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuhomeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuhomeActionPerformed

    private void menuhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuhomeMouseClicked
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_menuhomeMouseClicked

    private void menulocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulocationMouseClicked
        // TODO add your handling code here:
        Location fr1=new Location();
        fr1.show();//display Location frame here
        
        dispose();//close current frame after open Location
    }//GEN-LAST:event_menulocationMouseClicked

    private void menusignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusignoutMouseClicked
        // TODO add your handling code here:
        login fr1=new login();
        fr1.show();//display login here
        
        dispose();//close current frame after open login
    }//GEN-LAST:event_menusignoutMouseClicked

    private void menudonerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudonerMouseClicked
        // TODO add your handling code here:
        doner fr1=new doner();
        fr1.show();//display doner frame here
        
        dispose();//close current frame after open doner
    }//GEN-LAST:event_menudonerMouseClicked

    private void menuviewdonerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuviewdonerMouseClicked
        // TODO add your handling code here:
        donerview fr1=new donerview();
        fr1.show();//display login here
        
        dispose();//close current frame after open login
        
    }//GEN-LAST:event_menuviewdonerMouseClicked

    private void menubloodreciverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubloodreciverMouseClicked
        // TODO add your handling code here:
        recipient fr1=new recipient();
        fr1.show();//display login here
        
        dispose();//close current frame after open login
        
    }//GEN-LAST:event_menubloodreciverMouseClicked

    private void menuviewreciverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuviewreciverMouseClicked
        // TODO add your handling code here:
         recipientview fr1=new recipientview();
        fr1.show();//display login here
        
        dispose();//close current frame after open login
        
    }//GEN-LAST:event_menuviewreciverMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        bloodstock fr1=new bloodstock();
        fr1.show();
        
        dispose();
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void menureportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menureportMouseClicked
        // TODO add your handling code here:
         reportdetails fr1=new reportdetails();
        fr1.show();
        
        dispose();
        
    }//GEN-LAST:event_menureportMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JMenu menubloodreciver;
    private javax.swing.JMenu menudoner;
    private javax.swing.JMenu menuhome;
    private javax.swing.JMenu menulocation;
    private javax.swing.JMenu menureport;
    private javax.swing.JMenu menusignout;
    private javax.swing.JMenu menuviewdetails;
    private javax.swing.JMenu menuviewdoner;
    private javax.swing.JMenu menuviewreciver;
    // End of variables declaration//GEN-END:variables
}