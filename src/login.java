

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * 
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
   
    public login() {
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

        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnsignin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        pnllogin = new javax.swing.JPanel();
        lbllogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setName("Loginframe"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\padlock (1).png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 50, 50));

        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtusername.setText("Enter Username here");
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 290, 30));

        btnsignin.setBackground(new java.awt.Color(153, 153, 153));
        btnsignin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsignin.setText("Sign In");
        btnsignin.setBorder(null);
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Don't have an Account ?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 160, 20));

        btnsignup.setBackground(new java.awt.Color(153, 153, 153));
        btnsignup.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsignup.setBorderPainted(false);
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 150, 40));

        pnllogin.setBackground(new java.awt.Color(51, 51, 51));

        lbllogin.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(255, 255, 255));
        lbllogin.setText("Login");
        pnllogin.add(lbllogin);

        getContentPane().add(pnllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 620, 70));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\profile-user.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 50, 50));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 290, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\jjjjj.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 1000, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\jjjjj.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        setSize(new java.awt.Dimension(1000, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
        // TODO add your handling code here:
            String username=txtusername.getText();
            String password=txtpassword.getText();
            
        try
        {
            
            String dbpath="jdbc:mysql://localhost/blood_donation_center";
            Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            Statement st=con.createStatement();
            String sql="select * from administrator where username='"+username+"'and password='"+password+"'";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login Successful !");
                home fr1=new home();
                fr1.show();//display home here
        
                dispose();//close current frame after open home
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Something went Wrong please cheak your Username & password !");
            }
           
            
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        

    }//GEN-LAST:event_btnsigninActionPerformed

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        //TODO add your handling code here:
        if(txtusername.getText().equals(""))
        {
            txtusername.setText("Enter Username here");
            txtusername.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtusernameFocusLost

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        // TODO add your handling code here:
       if(txtusername.getText().equals("Enter Username here"))
        {
            txtusername.setText("");
           txtusername.setForeground(Color.black);
        }

    }//GEN-LAST:event_txtusernameFocusGained

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        Register frm2 = new Register();
        frm2.show();//display registration here
        
        dispose(); //close current form after open registration
        
        
    }//GEN-LAST:event_btnsignupActionPerformed

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtpasswordFocusLost

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JPanel pnllogin;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private static class JOptionpane {

        private static int ERROR_MESSAGE;

        public JOptionpane() {
        }
    }

}
