package com.evanssinkutwa.jnm;
import com.Data_Layer.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
*
* @author Evans
*/
public class User extends javax.swing.JFrame {
 Connection conn = null;
 ResultSet rs = null;
 PreparedStatement pst = null;
 /**
 * Creates new form
 */
 public User() {
 //setIcon();
 initComponents();
 Toolkit toolkit = getToolkit();
 Dimension size = toolkit.getScreenSize();
 setLocation(size.width / 2 - getWidth() / 2,
 size.height / 2 - getHeight() / 2);
 conn = DBConnect.ConnectDb();
 //refreshUserdetailstable();
 refreshUsertable();
 id_txt.setEditable(false);
 } 
 private void initComponents() {
 jTabbedPane1 = new javax.swing.JTabbedPane();
 jPanel1 = new javax.swing.JPanel();
 jPanel12 = new javax.swing.JPanel();
 name_txt = new javax.swing.JTextField();
 username_txt = new javax.swing.JTextField();
 jLabel16 = new javax.swing.JLabel();
 id_txt = new javax.swing.JTextField();
 jLabel20 = new javax.swing.JLabel();
 jLabel21 = new javax.swing.JLabel();
 jLabel22 = new javax.swing.JLabel();
 jLabel23 = new javax.swing.JLabel();
 post_cbx = new javax.swing.JComboBox();
 password_txt = new javax.swing.JPasswordField();
 useradd_cmd = new javax.swing.JButton();
 userupdate_cmd = new javax.swing.JButton();
 userdelete_cmd = new javax.swing.JButton();
 userrefresh_cmd = new javax.swing.JButton();
 jScrollPane1 = new javax.swing.JScrollPane();
 User_tb = new javax.swing.JTable();
 canceluser_cmd = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
 jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
 jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage User Accounts", 
javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new 
java.awt.Color(0, 0, 153))); // NOI18N
 name_txt.setForeground(new java.awt.Color(0, 0, 153));
 username_txt.setForeground(new java.awt.Color(0, 0, 153));
 jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 jLabel16.setText("Username:");
 id_txt.setBackground(java.awt.SystemColor.control);
 id_txt.setForeground(new java.awt.Color(153, 0, 0));
 id_txt.setText("*Auto generate");
 id_txt.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 id_txtActionPerformed(evt);
 }
 });
 jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 jLabel20.setText("User ID:");
 jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 jLabel21.setText("Full Name:");
 jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 jLabel22.setText("Post:");
 jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 jLabel23.setText("Password:");
 post_cbx.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 post_cbx.setForeground(new java.awt.Color(0, 0, 153));
 post_cbx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Network 
Engineer", "Technician" }));
 post_cbx.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 post_cbxActionPerformed(evt);
 }
 });
 password_txt.setForeground(new java.awt.Color(0, 51, 255));
 useradd_cmd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 useradd_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok1.png"))); // 
NOI18N
 useradd_cmd.setText("ok");
 useradd_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 useradd_cmdActionPerformed(evt);
 }
 });
 userupdate_cmd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 userupdate_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_edit.png"))); // 
NOI18N
 userupdate_cmd.setText("edit");
 userupdate_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 userupdate_cmdActionPerformed(evt);
 }
 });
 userdelete_cmd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 userdelete_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_drop.png"))); // 
NOI18N
 userdelete_cmd.setText("del");
 userdelete_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 userdelete_cmdActionPerformed(evt);
 }
 });
 userrefresh_cmd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
 userrefresh_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_empty.png"))); 
// NOI18N
 userrefresh_cmd.setText("clear");
 userrefresh_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 userrefresh_cmdActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
 jPanel12.setLayout(jPanel12Layout);
 jPanel12Layout.setHorizontalGroup(
 jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel12Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, 
false)
 .addComponent(jLabel22)
 .addComponent(jLabel21)
 .addComponent(jLabel20)
 .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
false)
 .addComponent(post_cbx, javax.swing.GroupLayout.Alignment.LEADING, 0, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(password_txt, javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(username_txt, javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(name_txt, javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(id_txt, javax.swing.GroupLayout.Alignment.LEADING, 
javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
 .addGap(18, 34, Short.MAX_VALUE)
 .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, 
false)
 .addComponent(userdelete_cmd, javax.swing.GroupLayout.Alignment.TRAILING, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
Short.MAX_VALUE)
 .addComponent(userupdate_cmd, javax.swing.GroupLayout.Alignment.TRAILING, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
Short.MAX_VALUE)
 .addComponent(useradd_cmd, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(userrefresh_cmd, javax.swing.GroupLayout.DEFAULT_SIZE, 78, 
Short.MAX_VALUE))
 .addContainerGap())
 );
 jPanel12Layout.setVerticalGroup(
 jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel12Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, 
false)
 .addComponent(jLabel20)
 .addComponent(id_txt))
 .addGap(5, 5, 5)
 
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel21)
 .addComponent(useradd_cmd))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(userupdate_cmd)
 .addComponent(jLabel16))
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(userdelete_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, 
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addGap(18, 18, 18)
 .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(post_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addComponent(userrefresh_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 User_tb.setForeground(new java.awt.Color(0, 0, 204));
 User_tb.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
 User_tbMouseClicked(evt);
 }
 });
 jScrollPane1.setViewportView(User_tb);
 canceluser_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/error.gif"))); // 
NOI18N
 canceluser_cmd.setText("Cancel");
 canceluser_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 canceluser_cmdActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, 
Short.MAX_VALUE)
 .addContainerGap())
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(226, 226, 226)
 .addComponent(canceluser_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(33, 33, 33)
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(18, 18, 18)
 .addComponent(canceluser_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(23, 23, 23)
 .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 jTabbedPane1.addTab("Manage Accounts", jPanel1);
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 );
 pack();
 }// </editor-fold> 
 private void post_cbxActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 } 
 private void userrefresh_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 useradd_cmd.setEnabled(true);
 refreshUsertable();
 refreshuserForm();
 // refreshUserdetailstable();
 } 
 
 private void userdelete_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 useradd_cmd.setEnabled(true);
 if (!com.evanssinkutwa.ValidateMe.isEmpty(id_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Please First select User Account to deleted from the list 
above! ", "Error", JOptionPane.ERROR_MESSAGE);
 //taxiID_txt.requestFocus();
 return;
 }
 int i = JOptionPane.showConfirmDialog(this, "Do you want to delete this User Account");
 if (i == JOptionPane.YES_OPTION) {
 String sql = "delete from User_tb where Id = ?";
 try {
 pst = conn.prepareStatement(sql);
 pst.setString(1, id_txt.getText());
 pst.execute();
 //JOptionPane.showMessageDialog(null, "Taxi has been deleted succesfully!!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 }
 refreshUsertable();
 refreshuserForm();
 // refreshUserdetailstable();
 } 
 private void userupdate_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 useradd_cmd.setEnabled(true);
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(name_txt.getText())) {
 JOptionPane.showMessageDialog(this, " Name is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 name_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(username_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Username is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 username_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(password_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Password is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 password_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(id_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Please select User Account to Update from list above! ", 
"Required", JOptionPane.ERROR_MESSAGE);
 id_txt.requestFocus();
 return;
 }
 try {
 String value1 = id_txt.getText();
 
String value2 = name_txt.getText();
 String value3 = username_txt.getText();
 String value4 = password_txt.getText();
 // String value5 = mobile_txt.getText();;
 String value5 = (String) post_cbx.getSelectedItem();
 String sql = "Update User_tb set Id= '" + value1 + "' ,Name= '" + value2 + "', username= '" + value3 + 
"', Password= '" + value4 + "', Position= '" + value5 + "'where Id= '" + value1 + "' ";
 pst = conn.prepareStatement(sql);
 pst.execute();
 //JOptionPane.showMessageDialog(null, "Drivers details Updated Succesfully!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 refreshUsertable();
 refreshuserForm();
 // refreshUserdetailstable();
 } 
 private void useradd_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(name_txt.getText())) {
 JOptionPane.showMessageDialog(this, " Name is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 name_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(username_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Username is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 username_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(password_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Password is required!! ", "Error", 
JOptionPane.ERROR_MESSAGE);
 
 password_txt.requestFocus();
 return;
 }
 try {
 String sql = "Insert into User_tb(Name,username,password,Position)values(?,?,?,?)";
 pst = conn.prepareStatement(sql);
 // pst.setString(1, taxiID_txt.getText());
 pst.setString(1, name_txt.getText());
 pst.setString(2, username_txt.getText());
 //pst.setString(3, mobile_txt.getText());
 pst.setString(3, password_txt.getText());
 pst.setString(4, (String) post_cbx.getSelectedItem());
 pst.execute();
 //JOptionPane.showMessageDialog(null, " User Account Has been Succesfully Created!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 refreshUsertable();
 refreshuserForm();
 //refreshUserdetailstable();
 } 
 private void User_tbMouseClicked(java.awt.event.MouseEvent evt) { 
 useradd_cmd.setEnabled(false);
 int i = User_tb.getSelectedRow();
 id_txt.setText(String.valueOf(User_tb.getValueAt(i, 0)));
 name_txt.setText(String.valueOf(User_tb.getValueAt(i, 1)));
 // mobile_txt.setText(String.valueOf(User_tb.getValueAt(i, 2)));
 username_txt.setText(String.valueOf(User_tb.getValueAt(i, 2)));
 post_cbx.setSelectedItem(User_tb.getValueAt(i, 3));
 } 
 private void id_txtActionPerformed(java.awt.event.ActionEvent evt) { 
 
 // TODO add your handling code here:
 } 
 private void canceluser_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 this.dispose();
 }
 
 /* Create and display the form */
 /* java.awt.EventQueue.invokeLater(new Runnable() {
 public void run() {
 new User().setVisible(true);
 }
 });
 }*/
 private void refreshUsertable() {
 try {
 String sql = "Select Id,Name,username,Position from User_tb";
 pst = conn.prepareStatement(sql);
 rs = pst.executeQuery();
 User_tb.setModel(DbUtils.resultSetToTableModel(rs));
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 //refreshUserdetailstable();
 }
 }
 private void refreshuserForm() {
 id_txt.setText("");
 name_txt.setText("");
 username_txt.setText("");
 password_txt.setText("");
 // mobile_txt.setText("");
 //taxi_cobx.setToolTipText(null);
 }
 // Variables declaration - do not modify 
 private javax.swing.JTable User_tb;
 private javax.swing.JButton canceluser_cmd;
 private javax.swing.JTextField id_txt;
 private javax.swing.JLabel jLabel16;
 private javax.swing.JLabel jLabel20;
 private javax.swing.JLabel jLabel21;
 private javax.swing.JLabel jLabel22;
 private javax.swing.JLabel jLabel23;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel12;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTabbedPane jTabbedPane1;
 private javax.swing.JTextField name_txt;
 private javax.swing.JPasswordField password_txt;
 private javax.swing.JComboBox post_cbx;
 private javax.swing.JButton useradd_cmd;
 private javax.swing.JButton userdelete_cmd;
 private javax.swing.JTextField username_txt;
 private javax.swing.JButton userrefresh_cmd;
 private javax.swing.JButton userupdate_cmd;
 // End of variables declaration 
//private void setIcon(){
 //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("jjj.png")));
 // }
}
