package com.evanssinkutwa.jnm;
import com.Data_Layer.DBConnect;
import com.Presentation_Layer.Home;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
*
* @author Evans
*/
public class Reports extends javax.swing.JFrame {
 Connection conn = null;
 ResultSet rs = null;
 PreparedStatement pst = null;
 /**
 * Creates new form Reports
 */
 public Reports() {
 initComponents();
 
 Toolkit toolkit = getToolkit();
 Dimension size = toolkit.getScreenSize();
 setLocation(size.width / 2 - getWidth() / 2,
 size.height / 2 - getHeight() / 2);
 conn = DBConnect.ConnectDb();
 refreshreporttable();
 } 
 private void initComponents() {
 jScrollPane1 = new javax.swing.JScrollPane();
 report = new javax.swing.JTable();
 jLabel1 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 jComboBox1 = new javax.swing.JComboBox();
 print_cmd = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
 report.setModel(new javax.swing.table.DefaultTableModel(
 new Object [][] {
 {null, null, null, null},
 {null, null, null, null},
 {null, null, null, null},
 {null, null, null, null}
 },
 new String [] {
 "Title 1", "Title 2", "Title 3", "Title 4"
 }
 ));
 jScrollPane1.setViewportView(report);
 jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
 jLabel1.setText("GENERATE REPORTS");
 
 jLabel2.setText("Select Report:");
 jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Network devices", 
"Network Problems" }));
 jComboBox1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jComboBox1ActionPerformed(evt);
 }
 });
 print_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/print.png"))); // 
NOI18N
 print_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 print_cmdActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap(31, Short.MAX_VALUE)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap())
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(102, 102, 102)
 
.addComponent(jLabel2)
 .addGap(18, 18, 18)
 .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addComponent(jLabel1))
 .addGap(196, 196, 196))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 .addComponent(print_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(387, 387, 387))))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jLabel1)
 .addGap(18, 18, 18)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jLabel2))
 .addGap(34, 34, 34)
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(print_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold> 
 private void print_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 
MessageFormat header = new MessageFormat("BANK NETWORK MONITORING SYSTEM REPORT");
 try {
 report.print(JTable.PrintMode.NORMAL, header, header);
 } catch (java.awt.print.PrinterAbortException e) {
 System.err.format("Cannot Print %&%n", e.getMessage());
 } catch (PrinterException ex) {
 Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
 }
 } 
 private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) { 
 } 
 }
 } catch (ClassNotFoundException ex) {
 java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 }
 // new Reports().setVisible(true);
 // }
 // });
 // }
 
 private void refreshreporttable() {
 try {
 String sql = "Select* from Devices";
 pst = conn.prepareStatement(sql);
 rs = pst.executeQuery();
 report.setModel(DbUtils.resultSetToTableModel(rs));
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 //refreshUserdetailstable();
 }
 }
 // Variables declaration - do not modify 
 private javax.swing.JComboBox jComboBox1;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JButton print_cmd;
 private javax.swing.JTable report;
 // End of variables declaration 