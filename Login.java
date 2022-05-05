package com.Presentation_Layer;

import com.Data_Layer.DBConnect;
import com.evanssinkutwa.jnm.ValidateMe;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * @author Evans
 */
public class Login extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int curRow = 0;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        conn = DBConnect.ConnectDb();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
    }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 jLabel1 = new javax.swing.JLabel();
 username_txt = new javax.swing.JTextField();
 jLabel2 = new javax.swing.JLabel();
 login_cmd = new javax.swing.JButton();
 cancel_cmd = new javax.swing.JButton();
 jLabel5 = new javax.swing.JLabel();
 password_txt = new javax.swing.JPasswordField();
 jLabel7 = new javax.swing.JLabel();
 jLabel8 = new javax.swing.JLabel();
 error_lb = new javax.swing.JLabel();
 jLabel4 = new javax.swing.JLabel();
 jLabel3 = new javax.swing.JLabel();
 jLabel6 = new javax.swing.JLabel();
 setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
 setIconImages(null);
 jPanel1.setBackground(new java.awt.Color(255, 255, 255));
 jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 jLabel1.setText("Username:");
 jLabel2.setText("Password:");

 login_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok1.png"))); // 
NOI18N
 login_cmd.setText("Signin");
 login_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 login_cmdActionPerformed(evt);
 }
 });
 cancel_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.jpg"))); // 
NOI18N
 cancel_cmd.setText("Cancel");
 cancel_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 cancel_cmdActionPerformed(evt);
 }
 });
 jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LAN-networkdiagram-vector-1.jpg"))); // NOI18N
 password_txt.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 password_txtActionPerformed(evt);
 }
 });
 jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Security.png"))); // 
NOI18N
 jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
 jLabel8.setText(" Login Page Here");
 error_lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
 error_lb.setForeground(new java.awt.Color(153, 0, 0));
 jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N

 jLabel4.setForeground(new java.awt.Color(0, 0, 153));
 jLabel4.setText("( BNMS)");
 jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
 jLabel3.setForeground(new java.awt.Color(204, 0, 0));
 jLabel3.setText("Bank Network Monitoring System");
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(239, 239, 239)
 
addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(jLabel2)
 .addComponent(jLabel1))
 .addGap(40, 40, 40)
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(username_txt)
 .addComponent(password_txt)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addComponent(login_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
27, Short.MAX_VALUE)
 .addComponent(cancel_cmd))))

 .addGroup(jPanel1Layout.createSequentialGroup()
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(216, 216, 216)
 .addComponent(jLabel3)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
18, Short.MAX_VALUE))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel4))
 .addGap(187, 187, 187)))
 .addComponent(jLabel7)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(279, 279, 279)
 .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 423, 
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addContainerGap(21, Short.MAX_VALUE))
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(2, 2, 2)
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(error_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel3))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, 
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addGap(18, 18, 18)
 .addComponent(jLabel8)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel1)
 .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel2)
 .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

 .addComponent(login_cmd)
 .addComponent(cancel_cmd))
 .addGap(18, 18, 18)
 .addComponent(jLabel5)
 .addGap(15, 15, 15))
 );
 jLabel6.setText("Project by Evans 2016");
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap(140, Short.MAX_VALUE)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
layout.createSequentialGroup()
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(102, 102, 102))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
layout.createSequentialGroup()
 .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(491, 491, 491))))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(107, 107, 107)

 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, 
Short.MAX_VALUE))
 );
 pack();
 }

    // </editor-fold>
 private void cancel_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to Close Network 
Management System??");
 if (i == JOptionPane.YES_OPTION) {
 this.dispose(); 
 try {
 JOptionPane.showMessageDialog(null, "System Closing.............");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 }
 }

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void login_cmdActionPerformed(java.awt.event.ActionEvent evt) {
        if (!ValidateMe.isEmpty(username_txt.getText())) {
            JOptionPane.showMessageDialog(this, "Username can't be Empty! ", "Error",
                    JOptionPane.ERROR_MESSAGE);
            username_txt.requestFocus();
            return;
        }

        if (!ValidateMe.isEmpty(password_txt.getText())) {
            JOptionPane.showMessageDialog(this, "Password can't be Empty! ", "Error",
                    JOptionPane.ERROR_MESSAGE);
            password_txt.requestFocus();
            return;
        }
        String sql = "select * from user_tb where username=? and password=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username_txt.getText());
            pst.setString(2, password_txt.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String Str = username_txt.getText();
                this.dispose();
                Home home = new Home();
                home.setVisible(true);
            } else {
                error_lb.setText("Error! User not found!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        username_txt.setText("");
        password_txt.setText("");
    }
    /**
     * @param args the command line arguments
     * 
     */
    // public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    javax.swing.UIManager.getInstalledLookAndFeels())

    {
 // if ("Metal".equals(info.getName())) {
 // javax.swing.UIManager.setLookAndFeel(info.getClassName());
 // break;
 //}
 /// }
 //} catch (ClassNotFoundException ex) {
 // 
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // } catch (InstantiationException ex) {
 // 
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // } catch (IllegalAccessException ex) {
 // 
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 // 
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // }
 //</editor-fold>
 /* Create and display the form */

 // java.awt.EventQueue.invokeLater(new Runnable() {
 // public void run() {
 // new Login().setVisible(true);
 // }
 // });
// }
 // Variables declaration - do not modify 
    private javax.swing.JButton cancel_cmd;
    private javax.swing.JLabel error_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_cmd;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JTextField username_txt;

    // End of variables declaration
private void setIcon(){
 setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("network.png")));
 }
}
