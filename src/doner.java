
import java.awt.Color;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class doner extends javax.swing.JFrame {

    /**
     * Creates new form doner
     */
    public doner() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtdonerid = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttp = new javax.swing.JTextField();
        lbladminid = new javax.swing.JLabel();
        lbladminid1 = new javax.swing.JLabel();
        lbladminid2 = new javax.swing.JLabel();
        lbladminid3 = new javax.swing.JLabel();
        lbladminid4 = new javax.swing.JLabel();
        lbladminid5 = new javax.swing.JLabel();
        lbladminid6 = new javax.swing.JLabel();
        lbladminid7 = new javax.swing.JLabel();
        lbladminid8 = new javax.swing.JLabel();
        lbladminid9 = new javax.swing.JLabel();
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
        btnRegister = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        cmbpackets = new javax.swing.JComboBox<>();
        cmbbloodtype = new javax.swing.JComboBox<>();
        rdbmale = new javax.swing.JRadioButton();
        rdbfemale = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doner Registration");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Blood Doner Registration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 630, 60));

        txtdonerid.setText("Enter Doner id here");
        txtdonerid.setName(""); // NOI18N
        txtdonerid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdoneridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdoneridFocusLost(evt);
            }
        });
        txtdonerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoneridActionPerformed(evt);
            }
        });
        getContentPane().add(txtdonerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 250, -1));

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
        getContentPane().add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 250, -1));

        txtname.setText("Enter name here");
        txtname.setName(""); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 250, -1));

        txtage.setText("Enter age here");
        txtage.setName(""); // NOI18N
        txtage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtageFocusLost(evt);
            }
        });
        getContentPane().add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 250, -1));

        txtaddress.setText("Enter address here");
        txtaddress.setName(""); // NOI18N
        txtaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaddressFocusLost(evt);
            }
        });
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 250, -1));

        txtemail.setText("Enter email here");
        txtemail.setName(""); // NOI18N
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 250, -1));

        txttp.setText("Enter phone here");
        txttp.setName(""); // NOI18N
        txttp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttpFocusLost(evt);
            }
        });
        getContentPane().add(txttp, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 250, -1));

        lbladminid.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid.setText("Donated Packets");
        getContentPane().add(lbladminid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        lbladminid1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid1.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid1.setText("Doner ID");
        getContentPane().add(lbladminid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        lbladminid2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid2.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid2.setText("Doner NIC");
        getContentPane().add(lbladminid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        lbladminid3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid3.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid3.setText("Name");
        getContentPane().add(lbladminid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        lbladminid4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid4.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid4.setText("Age");
        getContentPane().add(lbladminid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        lbladminid5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid5.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid5.setText("Address");
        getContentPane().add(lbladminid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        lbladminid6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid6.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid6.setText("Email");
        getContentPane().add(lbladminid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        lbladminid7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid7.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid7.setText("Phone");
        getContentPane().add(lbladminid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        lbladminid8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid8.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid8.setText("Gender");
        getContentPane().add(lbladminid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        lbladminid9.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lbladminid9.setForeground(new java.awt.Color(255, 255, 255));
        lbladminid9.setText("Blood Type");
        getContentPane().add(lbladminid9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(": ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 30, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(": ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 30, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(": ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 30, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(": ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 30, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(": ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 30, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(": ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 30, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(": ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 30, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(": ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 30, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(": ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 30, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(": ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 30, 20));

        btnRegister.setBackground(new java.awt.Color(153, 153, 153));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(null);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 210, 40));

        btnhome.setBackground(new java.awt.Color(153, 153, 153));
        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnhome.setText("Home");
        btnhome.setBorder(null);
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 210, 40));

        cmbpackets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Packet Amount--", "1", "2", "3", "4", "5" }));
        getContentPane().add(cmbpackets, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 250, -1));

        cmbbloodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Blood Type--", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(cmbbloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 250, -1));

        buttonGroup1.add(rdbmale);
        rdbmale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdbmale.setForeground(new java.awt.Color(255, 255, 255));
        rdbmale.setText("Male");
        getContentPane().add(rdbmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        buttonGroup1.add(rdbfemale);
        rdbfemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdbfemale.setForeground(new java.awt.Color(255, 255, 255));
        rdbfemale.setText("Female");
        getContentPane().add(rdbfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\doner.png")); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdoneridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdoneridFocusGained
        // TODO add your handling code here:
        if(txtdonerid.getText().equals("Enter Doner id here"))
        {
            txtdonerid.setText("");
            txtdonerid.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtdoneridFocusGained

    private void txtdoneridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdoneridFocusLost
        // TODO add your handling code here:
         if(txtdonerid.getText().equals(""))
        {
            txtdonerid.setText("Enter Doner id here");
            txtdonerid.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdoneridFocusLost

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

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        if(txtname.getText().equals("Enter name here"))
        {
            txtname.setText("");
            txtname.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        // TODO add your handling code here:
        if(txtname.getText().equals(""))
        {
            txtname.setText("Enter name here");
            txtname.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void txtageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusGained
        // TODO add your handling code here:
        if(txtage.getText().equals("Enter age here"))
        {
            txtage.setText("");
           txtage.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtageFocusGained

    private void txtageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtageFocusLost
        // TODO add your handling code here:
        if(txtage.getText().equals(""))
        {
            txtage.setText("Enter age here");
           txtage.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtageFocusLost

    private void txtaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusGained
        // TODO add your handling code here:
         if(txtaddress.getText().equals("Enter address here"))
        {
           txtaddress.setText("");
          txtaddress.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtaddressFocusGained

    private void txtaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaddressFocusLost
        // TODO add your handling code here:
         if(txtaddress.getText().equals(""))
        {
           txtaddress.setText("Enter address here");
          txtaddress.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtaddressFocusLost

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        // TODO add your handling code here:
         if(txtemail.getText().equals("Enter email here"))
        {
          txtemail.setText("");
          txtemail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtemailFocusGained

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        // TODO add your handling code here:
        if(txtemail.getText().equals(""))
        {
          txtemail.setText("Enter email here");
          txtemail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txttpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttpFocusGained
        // TODO add your handling code here:
        if(txttp.getText().equals("Enter phone here"))
        {
          txttp.setText("");
          txttp.setForeground(Color.black);
        }
    }//GEN-LAST:event_txttpFocusGained

    private void txttpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttpFocusLost
        // TODO add your handling code here:
         if(txttp.getText().equals(""))
        {
          txttp.setText("Enter phone here");
          txttp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txttpFocusLost

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try
        {
            String donerid,nic,name,email,address,tp,gender,bloodtype,packets;
            int age;
            donerid=txtdonerid.getText();
            nic=txtnic.getText();
            name=txtname.getText();
            age=Integer.parseInt(txtage.getText());
            address=txtaddress.getText();
            email=txtemail.getText();
            tp=txttp.getText();
            if(rdbmale.isSelected())
            {
                gender="Male";
            }
            else
            {
                gender="Female";
            }
            bloodtype=cmbbloodtype.getSelectedItem().toString();
            packets=cmbpackets.getSelectedItem().toString();
            
            String dbpath="jdbc:mysql://localhost/blood_donation_center";
            Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            Statement st=con.createStatement();
            st.executeUpdate("insert into doner Values('"+donerid+"','"+nic+"','"+name+"','"+age+"','"+address+"','"+email+"','"+tp+"','"+gender+"','"+bloodtype+"','"+packets+"')");
            JOptionPane.showMessageDialog(this,"Registration Successful !");
             clearfields();
            updateStock(bloodtype,Integer.parseInt(packets));
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnRegisterActionPerformed
     
    private void updateStock(String bloodGroup, int amount)throws SQLException {        
    String dbpath="jdbc:mysql://localhost/blood_donation_center";
            Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            Statement st=con.createStatement();
            st.executeUpdate("update bloodstock set stockcapacity=(stockcapacity+'"+amount+"') where blood_group='"+bloodGroup+"'");
    }
    
    
    
    
    private void clearfields()
        {
            txtdonerid.setText(null);
            txtname.setText(null);
            txtage.setText(null);
            txtemail.setText(null);
            txtnic.setText(null);
            txtaddress.setText(null);
            txttp.setText(null);
        }
    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void txtdoneridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoneridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoneridActionPerformed

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        // TODO add your handling code here:
        home fr1=new home();
        fr1.show();//display home frame here
        
        dispose();//close current frame after open home
    }//GEN-LAST:event_btnhomeMouseClicked

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
            java.util.logging.Logger.getLogger(doner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnhome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbbloodtype;
    private javax.swing.JComboBox<String> cmbpackets;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbladminid;
    private javax.swing.JLabel lbladminid1;
    private javax.swing.JLabel lbladminid2;
    private javax.swing.JLabel lbladminid3;
    private javax.swing.JLabel lbladminid4;
    private javax.swing.JLabel lbladminid5;
    private javax.swing.JLabel lbladminid6;
    private javax.swing.JLabel lbladminid7;
    private javax.swing.JLabel lbladminid8;
    private javax.swing.JLabel lbladminid9;
    private javax.swing.JRadioButton rdbfemale;
    private javax.swing.JRadioButton rdbmale;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtdonerid;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txttp;
    // End of variables declaration//GEN-END:variables
}
