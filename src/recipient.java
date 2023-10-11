/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class recipient extends javax.swing.JFrame {

    /**
     * Creates new form recipient
     */
    public recipient() {
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

        btnRegister = new javax.swing.JButton();
        pnllogin = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        lbladminid2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lbladminid3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        lbladminid4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lbladminid5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lbladminid6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        lbladminid7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbladminid8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        cmbbloodtype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        btnRegister.setBackground(new java.awt.Color(153, 153, 153));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(null);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recipient Registration");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnllogin.setBackground(new java.awt.Color(51, 51, 51));

        lblregister.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblregister.setForeground(new java.awt.Color(255, 255, 255));
        lblregister.setText("Recipient Register");
        pnllogin.add(lblregister);

        getContentPane().add(pnllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 630, 70));

        txtnic.setText("Enter NIC here");
        txtnic.setName(""); // NOI18N
        txtnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnicFocusLost(evt);
            }
        });
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        getContentPane().add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 250, -1));

        lbladminid2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid2.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid2.setText("NIC");
        getContentPane().add(lbladminid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(": ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 30, 20));

        txtname.setText("Enter Name here");
        txtname.setName(""); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 250, -1));

        lbladminid3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid3.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid3.setText("Name");
        getContentPane().add(lbladminid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(": ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 30, 20));

        txtage.setText("Enter Age here");
        txtage.setName(""); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtageFocusLost(evt);
            }
        });
        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        getContentPane().add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 250, -1));

        lbladminid4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid4.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid4.setText("Age");
        getContentPane().add(lbladminid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(": ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 30, 20));

        txtaddress.setText("Enter Address here");
        txtaddress.setName(""); // NOI18N
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddressFocusLost(evt);
            }
        });
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 250, -1));

        lbladminid5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid5.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid5.setText("Address");
        getContentPane().add(lbladminid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(": ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 30, 20));

        txtemail.setText("Enter Email here");
        txtemail.setName(""); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 250, -1));

        lbladminid6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid6.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid6.setText("E-mail");
        getContentPane().add(lbladminid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(": ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 30, 20));

        txtphone.setText("Enter Phone here");
        txtphone.setName(""); // NOI18N
        txtphone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtphoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtphoneFocusLost(evt);
            }
        });
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 250, -1));

        lbladminid7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid7.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid7.setText("Phone");
        getContentPane().add(lbladminid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(": ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 30, 20));

        lbladminid8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid8.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid8.setText("Blood group");
        getContentPane().add(lbladminid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(": ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 30, 20));

        btnhome.setBackground(new java.awt.Color(153, 153, 153));
        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnhome.setText("Home");
        btnhome.setBorder(null);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 210, 40));

        btnregister.setBackground(new java.awt.Color(153, 153, 153));
        btnregister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnregister.setText("Register");
        btnregister.setBorder(null);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 210, 40));

        cmbbloodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Blood Type--", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(cmbbloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 250, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\doner.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicFocusGained
        // TODO add your handling code here:
        if(txtnic.getText().equals("Enter NIC here"))
        {
            txtnic.setText("");
            txtnic.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtnicFocusGained

    private void txtnicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnicFocusLost
        // TODO add your handling code here:
         if(txtnic.getText().equals(""))
        {
            txtnic.setText("Enter NIC here");
            txtnic.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnicFocusLost

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        if(txtname.getText().equals("Enter Name here"))
        {
            txtname.setText("");
            txtname.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        // TODO add your handling code here:
         if(txtname.getText().equals(""))
        {
            txtname.setText("Enter Name here");
            txtname.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusGained
        // TODO add your handling code here:
        if(txtage.getText().equals("Enter Age here"))
        {
            txtage.setText("");
            txtage.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtageFocusGained

    private void txtageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusLost
        // TODO add your handling code here:
        if(txtage.getText().equals(""))
        {
            txtage.setText("Enter Age here");
            txtage.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtageFocusLost

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
        // TODO add your handling code here:
         if(txtaddress.getText().equals("Enter Address here"))
        {
           txtaddress.setText("");
           txtaddress.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusLost
        // TODO add your handling code here:
        if(txtaddress.getText().equals(""))
        {
           txtaddress.setText("Enter Address here");
           txtaddress.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtaddressFocusLost

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        // TODO add your handling code here:
         if(txtemail.getText().equals("Enter Email here"))
        {
           txtemail.setText("");
           txtemail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        // TODO add your handling code here:
        if(txtemail.getText().equals(""))
        {
           txtemail.setText("Enter Email here");
           txtemail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusGained
        // TODO add your handling code here:
        if(txtphone.getText().equals("Enter Phone here"))
        {
          txtphone.setText("");
          txtphone.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtphoneFocusGained

    private void txtphoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtphoneFocusLost
        // TODO add your handling code here:
         if(txtphone.getText().equals(""))
        {
          txtphone.setText("Enter Phone here");
          txtphone.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtphoneFocusLost

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
          home fr1=new home();
        fr1.show();
        dispose();
        
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        try
        {
        String nic,name,Address,email,tp,bloodgroup;
        int age;
        nic=txtnic.getText();
        name=txtname.getText();
        age=Integer.parseInt(txtage.getText());
        Address=txtaddress.getText();
        email=txtemail.getText();
        tp=txtphone.getText();
        bloodgroup=cmbbloodtype.getSelectedItem().toString();
          String dbpath="jdbc:mysql://localhost/blood_donation_center";
            Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            Statement st=con.createStatement();
            st.executeUpdate("insert into bloodreciever Values('"+nic+"','"+name+"','"+age+"','"+Address+"','"+ email+"','"+tp+"','"+ bloodgroup+"')");
            JOptionPane.showMessageDialog(this,"Registration Successful !");
            clearfields();
            
        }
       
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
         
    }//GEN-LAST:event_btnregisterActionPerformed
     private void clearfields()
        {
            
            txtname.setText(null);
            txtage.setText(null);
            txtemail.setText(null);
            txtnic.setText(null);
            txtaddress.setText(null);
            txtphone.setText(null);
           
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
            java.util.logging.Logger.getLogger(recipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recipient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recipient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> cmbbloodtype;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbladminid2;
    private javax.swing.JLabel lbladminid3;
    private javax.swing.JLabel lbladminid4;
    private javax.swing.JLabel lbladminid5;
    private javax.swing.JLabel lbladminid6;
    private javax.swing.JLabel lbladminid7;
    private javax.swing.JLabel lbladminid8;
    private javax.swing.JLabel lblregister;
    private javax.swing.JPanel pnllogin;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
