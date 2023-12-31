/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;



public class reportdetails extends javax.swing.JFrame {

    /**
     * Creates new form reportdetails
     */
    public reportdetails() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btnadmindetails = new javax.swing.JButton();
        btndonerdetails = new javax.swing.JButton();
        btnstockdetails = new javax.swing.JButton();
        btnreceiverdetails = new javax.swing.JButton();
        btncampdeatils1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Report View");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(370, 0, 630, 55);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrator Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(489, 175, 200, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doner Details");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 250, 180, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Stock Details");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 340, 180, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Receiver Details");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 440, 200, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Blood Camp Details");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 540, 190, 25);

        btnhome.setBackground(new java.awt.Color(51, 51, 51));
        btnhome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setText("Home");
        btnhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome);
        btnhome.setBounds(590, 615, 190, 37);

        btnadmindetails.setBackground(new java.awt.Color(51, 51, 51));
        btnadmindetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnadmindetails.setForeground(new java.awt.Color(255, 255, 255));
        btnadmindetails.setText("Click");
        btnadmindetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmindetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnadmindetails);
        btnadmindetails.setBounds(757, 167, 132, 37);

        btndonerdetails.setBackground(new java.awt.Color(51, 51, 51));
        btndonerdetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btndonerdetails.setForeground(new java.awt.Color(255, 255, 255));
        btndonerdetails.setText("Click");
        btndonerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndonerdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btndonerdetails);
        btndonerdetails.setBounds(757, 244, 132, 37);

        btnstockdetails.setBackground(new java.awt.Color(51, 51, 51));
        btnstockdetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnstockdetails.setForeground(new java.awt.Color(255, 255, 255));
        btnstockdetails.setText("Click");
        btnstockdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstockdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnstockdetails);
        btnstockdetails.setBounds(757, 333, 132, 37);

        btnreceiverdetails.setBackground(new java.awt.Color(51, 51, 51));
        btnreceiverdetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnreceiverdetails.setForeground(new java.awt.Color(255, 255, 255));
        btnreceiverdetails.setText("Click");
        btnreceiverdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreceiverdetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnreceiverdetails);
        btnreceiverdetails.setBounds(757, 424, 132, 37);

        btncampdeatils1.setBackground(new java.awt.Color(51, 51, 51));
        btncampdeatils1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btncampdeatils1.setForeground(new java.awt.Color(255, 255, 255));
        btncampdeatils1.setText("Click");
        btncampdeatils1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncampdeatils1ActionPerformed(evt);
            }
        });
        getContentPane().add(btncampdeatils1);
        btncampdeatils1.setBounds(757, 525, 132, 37);

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\EAD Coursework\\photoes\\report.png")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1000, 698);

        setSize(new java.awt.Dimension(1014, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadmindetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmindetailsActionPerformed
        // TODO add your handling code here:
        try
        {
        String dbpath="jdbc:mysql://localhost/blood_donation_center";
            Connection con=DriverManager.getConnection(dbpath,"tashini","123");
           
            
            String path=("D:\\EAD Coursework\\Code\\Blood Donation Center Management System\\src\\report.jrxml");
            JasperReport jr;
            jr=JasperCompileManager.compileReport(path);
           JasperPrint print=JasperFillManager.fillReport(jr,null,con);
           
            JasperViewer.viewReport(print,false);
          
        }
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnadmindetailsActionPerformed

    private void btndonerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndonerdetailsActionPerformed
        // TODO add your handling code here:
        try
        {
             String dbpath="jdbc:mysql://localhost/blood_donation_center";
              Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            
             String path=("D:\\EAD Coursework\\Code\\Blood Donation Center Management System\\src\\reportdoner.jrxml");
            JasperReport jr;
            jr=JasperCompileManager.compileReport(path);
           JasperPrint print=JasperFillManager.fillReport(jr,null,con);
           
            JasperViewer.viewReport(print,false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btndonerdetailsActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
          home fr1=new home();
        fr1.show();
        
        dispose();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnstockdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstockdetailsActionPerformed
        // TODO add your handling code here:
        try
        {
          String dbpath="jdbc:mysql://localhost/blood_donation_center";
               Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            
            String path=("D:\\EAD Coursework\\Code\\Blood Donation Center Management System\\src\\bloodstock.jrxml");
            JasperReport jr;
            jr=JasperCompileManager.compileReport(path);
           JasperPrint print=JasperFillManager.fillReport(jr,null,con);
           
            JasperViewer.viewReport(print,false);
            
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnstockdetailsActionPerformed

    private void btnreceiverdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreceiverdetailsActionPerformed
        // TODO add your handling code here:
        try
        {
            String dbpath="jdbc:mysql://localhost/blood_donation_center";
             Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            
             String path=("D:\\EAD Coursework\\Code\\Blood Donation Center Management System\\src\\reciever.jrxml");
            JasperReport jr;
            jr=JasperCompileManager.compileReport(path);
           JasperPrint print=JasperFillManager.fillReport(jr,null,con);
           
            JasperViewer.viewReport(print,false);
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnreceiverdetailsActionPerformed

    private void btncampdeatils1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncampdeatils1ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String dbpath="jdbc:mysql://localhost/blood_donation_center";
              Connection con=DriverManager.getConnection(dbpath,"tashini","123");
            
            String path=("D:\\EAD Coursework\\Code\\Blood Donation Center Management System\\src\\campdeatils.jrxml");
            JasperReport jr;
            jr=JasperCompileManager.compileReport(path);
           JasperPrint print=JasperFillManager.fillReport(jr,null,con);
           
            JasperViewer.viewReport(print,false);
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_btncampdeatils1ActionPerformed

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
            java.util.logging.Logger.getLogger(reportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmindetails;
    private javax.swing.JButton btncampdeatils1;
    private javax.swing.JButton btndonerdetails;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnreceiverdetails;
    private javax.swing.JButton btnstockdetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
