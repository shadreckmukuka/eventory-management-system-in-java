package com.Presentation_Layer;
import com.Data_Layer.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Devices extends javax.swing.JFrame {
 Connection conn = null;
 ResultSet rs = null;
 PreparedStatement pst = null;
 int curRow = 0;
 /**
 * Creates new form Devices
 */
 public Devices() {
 initComponents();
 //refreshDevicetable();
 conn = DBConnect.ConnectDb();
 Toolkit toolkit = getToolkit();
 Dimension size = toolkit.getScreenSize();
 setLocation(size.width / 2 - getWidth() / 2,
 size.height / 2 - getHeight() / 2);
 refreshdevicetable();
 refreshdesForm();
 id_txt.setEditable(false);
 }
 /**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
 private void initComponents() {
 jPanel1 = new javax.swing.JPanel();
 jLabel1 = new javax.swing.JLabel();
 jScrollPane1 = new javax.swing.JScrollPane();
 tabledevice = new javax.swing.JTable();
 jPanel2 = new javax.swing.JPanel();
 port_txt = new javax.swing.JTextField();
 jLabel6 = new javax.swing.JLabel();
 name_txt = new javax.swing.JTextField();
 jScrollPane2 = new javax.swing.JScrollPane();
 des_txt = new javax.swing.JTextArea();
 jLabel5 = new javax.swing.JLabel();
 jLabel7 = new javax.swing.JLabel();
 jLabel4 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 mac_txt = new javax.swing.JTextField();
 jLabel3 = new javax.swing.JLabel();
 id_txt = new javax.swing.JTextField();
 ip_txt = new javax.swing.JTextField();
 add_cmd = new javax.swing.JButton();
 edit_cmd = new javax.swing.JButton();
 delete_cmd = new javax.swing.JButton();
 setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
 setResizable(false);
 jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
 jLabel1.setText("Manage Network Devices");
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel1Layout.createSequentialGroup()
 .addGap(278, 278, 278)
 .addComponent(jLabel1)
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel1Layout.createSequentialGroup()
 .addGap(0, 22, Short.MAX_VALUE)
 .addComponent(jLabel1))
 );
 tabledevice.setModel(new javax.swing.table.DefaultTableModel(
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
 tabledevice.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
 tabledeviceMouseClicked(evt);
 }
 });
 jScrollPane1.setViewportView(tabledevice);
 tabledevice.getColumnModel().getColumn(0).setHeaderValue("Title 1");
 tabledevice.getColumnModel().getColumn(1).setHeaderValue("Title 2");
 tabledevice.getColumnModel().getColumn(2).setHeaderValue("Title 3");
 tabledevice.getColumnModel().getColumn(3).setHeaderValue("Title 4");
 jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
 jLabel6.setText("Open Port:");
 name_txt.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 name_txtActionPerformed(evt);
 }
 });
 des_txt.setColumns(20);
 des_txt.setRows(5);
 jScrollPane2.setViewportView(des_txt);
 jLabel5.setText("Static IP:");
 jLabel7.setText("Description:");
 jLabel4.setText("Mac Address:");
 jLabel2.setText("Id:");
 jLabel3.setText("Name:");
 id_txt.setBackground(new java.awt.Color(240, 240, 240));
 id_txt.setForeground(new java.awt.Color(153, 0, 0));
 id_txt.setText("*Auto generate");
 add_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok1.png"))); // NOI18N
 add_cmd.setText("ok");
 add_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 add_cmdActionPerformed(evt);
 }
 });
 edit_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_edit.png"))); // 
NOI18N
 edit_cmd.setText("edit");
 edit_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 edit_cmdActionPerformed(evt);
 }
 });
 delete_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/b_drop.png"))); // 
NOI18N
 delete_cmd.setText("delete");
 delete_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 delete_cmdActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
 jPanel2.setLayout(jPanel2Layout);
 jPanel2Layout.setHorizontalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createSequentialGroup()
 .addGap(0, 23, Short.MAX_VALUE)
 
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createSequentialGroup()
 .addComponent(add_cmd)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(edit_cmd)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(delete_cmd)
 .addGap(18, 18, 18))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createSequentialGroup()
 
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel3)
 .addComponent(jLabel2))
 .addGap(18, 18, 18)
 
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(id_txt)
 .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(port_txt, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(ip_txt, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(mac_txt, javax.swing.GroupLayout.Alignment.TRAILING)
 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, 
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addGap(44, 44, 44))))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createSequentialGroup()
 
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel4)
 .addComponent(jLabel5)
 .addComponent(jLabel6)
 .addComponent(jLabel7))
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
 );
 jPanel2Layout.setVerticalGroup(
 jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addContainerGap()
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel2)
 .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(18, 18, 18)
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel3)
 .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(18, 18, 18)
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel4)
 .addComponent(mac_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(25, 25, 25)
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel5)
 .addComponent(ip_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(26, 26, 26)
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(jLabel6)
 .addComponent(port_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addGap(52, 52, 52)
 .addComponent(jLabel7))
 .addGroup(jPanel2Layout.createSequentialGroup()
 .addGap(26, 26, 26)
 .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, 
javax.swing.GroupLayout.PREFERRED_SIZE)))
 .addGap(18, 18, 18)
 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(delete_cmd)
 .addComponent(edit_cmd)
 .addComponent(add_cmd))
 .addContainerGap(22, Short.MAX_VALUE))
 );
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(layout.createSequentialGroup()
 .addContainerGap()
 .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, 
Short.MAX_VALUE)
 .addGap(18, 18, 18)
 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap())
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(18, 18, 18)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(0, 81, Short.MAX_VALUE))
 );
 pack();
 }// </editor-fold> 
 private void name_txtActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 } 
 private void add_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(name_txt.getText())) {
 JOptionPane.showMessageDialog(this, " Name is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 name_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(mac_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter mac address", "Error", 
JOptionPane.ERROR_MESSAGE);
 mac_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(ip_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter Device Static IP address", "Error", 
JOptionPane.ERROR_MESSAGE);
 ip_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(port_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter Port Open port or device", "Error", 
JOptionPane.ERROR_MESSAGE);
 port_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(des_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter description of Device, e.g <CISCO router 8000 
series>", "Error", JOptionPane.ERROR_MESSAGE);
 des_txt.requestFocus();
 return;
 }
 try {
 String sql = "Insert into 
Devices(Name,MAC_address,Static_IP,Port_Number,Description)values(?,?,?,?,?)";
 pst = conn.prepareStatement(sql);
 // pst.setString(1, taxiID_txt.getText());
 pst.setString(1, name_txt.getText());
 pst.setString(2, mac_txt.getText());
 pst.setString(3, ip_txt.getText());
 pst.setString(4, port_txt.getText());
 pst.setString(5, des_txt.getText());
 //pst.setString(4, (String) post_cbx.getSelectedItem());
 pst.execute();
 //JOptionPane.showMessageDialog(null, " User Account Has been Succesfully Created!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 refreshdevicetable();
 refreshdesForm();
 } 
 private void tabledeviceMouseClicked(java.awt.event.MouseEvent evt) { 
 add_cmd.setEnabled(false);
 int i = tabledevice.getSelectedRow();
 id_txt.setText(String.valueOf(tabledevice.getValueAt(i, 0)));
 name_txt.setText(String.valueOf(tabledevice.getValueAt(i, 1)));
 mac_txt.setText(String.valueOf(tabledevice.getValueAt(i, 2)));
 ip_txt.setText(String.valueOf(tabledevice.getValueAt(i, 3)));
 port_txt.setText(String.valueOf(tabledevice.getValueAt(i, 4)));
 des_txt.setText(String.valueOf(tabledevice.getValueAt(i, 5)));
 } 
 private void delete_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 add_cmd.setEnabled(true);
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(id_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Please First select device to be deleted from the list above! ", 
"Error", JOptionPane.ERROR_MESSAGE);
 //taxiID_txt.requestFocus();
 return;
 }
 int i = JOptionPane.showConfirmDialog(this, "Do you want to delete this Device");
 if (i == JOptionPane.YES_OPTION) {
 String sql = "delete from Devices where Id = ?";
 try {
 pst = conn.prepareStatement(sql);
 pst.setString(1, id_txt.getText());
 pst.execute();
 //JOptionPane.showMessageDialog(null, "Taxi has been deleted succesfully!!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 }
 refreshdevicetable();
 refreshdesForm();
 } 
 private void edit_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 add_cmd.setEnabled(true);
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(name_txt.getText())) {
 JOptionPane.showMessageDialog(this, " Name is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 name_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(mac_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Mac is Empty ", "Error", 
JOptionPane.ERROR_MESSAGE);
 mac_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(ip_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter Static IP address for device ", "Error", 
JOptionPane.ERROR_MESSAGE);
 ip_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(port_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter port number for device ", "Error", 
JOptionPane.ERROR_MESSAGE);
 port_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(des_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Enter description for Device ", "Error", 
JOptionPane.ERROR_MESSAGE);
 des_txt.requestFocus();
 return;
 }
 if (!com.evanssinkutwa.jnm.ValidateMe.isEmpty(id_txt.getText())) {
 JOptionPane.showMessageDialog(this, "Please select Device from list! ", "Required", 
JOptionPane.ERROR_MESSAGE);
 id_txt.requestFocus();
 return;
 }
 try {
 String value1 = id_txt.getText();
 String value2 = name_txt.getText();
 String value3 = mac_txt.getText();
 String value4 = ip_txt.getText();
 String value5 = port_txt.getText();
 String value6 = des_txt.getText();
 //String value4 = ip_txt.getText();
 
 String sql = "Update Devices set Id= '" + value1 + "' ,Name= '" + value2 + "', MAC_address= '" + 
value3 + "', Static_IP = '" + value4 + "',Port_Number= '" + value5 + "',Description ='" +value6+"' where Id= 
'" + value1 + "' ";
 pst = conn.prepareStatement(sql);
 pst.execute();
 //JOptionPane.showMessageDialog(null, "Drivers details Updated Succesfully!");
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 }
 refreshdevicetable();
 refreshdesForm();
 // refreshUserdetailstable();
 } 
 /**
 * @param args the command line arguments
 */
 /*public static void main(String args[]) {
 /* Set the Nimbus look and feel */
 //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
 /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
 */
 /* try {
 for (javax.swing.UIManager.LookAndFeelInfo info : 
javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (ClassNotFoundException ex) {
 java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(Devices.class.getName()).log(java.util.logging.Level.SEVERE, 
null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 //java.awt.EventQueue.invokeLater(new Runnable() {
 // public void run() {
 //new Devices().setVisible(true);
 // }
 //});
 // }
 private void refreshdevicetable() {
 try {
 String sql = "Select* from Devices";
 pst = conn.prepareStatement(sql);
 rs = pst.executeQuery();
 tabledevice.setModel(DbUtils.resultSetToTableModel(rs));
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
 //refreshUserdetailstable();
 }
 }
 private void refreshdesForm() {
 id_txt.setText("");
 name_txt.setText("");
 mac_txt.setText("");
 ip_txt.setText("");
 port_txt.setText("");
 des_txt.setText("");
 // mobile_txt.setText("");
 //taxi_cobx.setToolTipText(null);
 }
 // Variables declaration - do not modify 
 private javax.swing.JButton add_cmd;
 private javax.swing.JButton delete_cmd;
 private javax.swing.JTextArea des_txt;
 private javax.swing.JButton edit_cmd;
 private javax.swing.JTextField id_txt;
 private javax.swing.JTextField ip_txt;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JLabel jLabel4;
 private javax.swing.JLabel jLabel5;
 private javax.swing.JLabel jLabel6;
 private javax.swing.JLabel jLabel7;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JScrollPane jScrollPane2;
 private javax.swing.JTextField mac_txt;
 private javax.swing.JTextField name_txt;
 private javax.swing.JTextField port_txt;
 private javax.swing.JTable tabledevice;
 // End of variables declaration 
}
MAIN PROGRAM
package com.Presentation_Layer;
import com.Presentation_Layer.Login;
import com.evanssinkutwa.jnm.jnm.Action;
import com.evanssinkutwa.jnm.ActionDefinition;
import com.evanssinkutwa.jnm.Monitor;
import com.evanssinkutwa.jnm.MonitorDefinition;
import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Iterator;
import com.evanssinkutwa.jnm.lib.log.Logger;
import com.evanssinkutwa.jnm.lib.log.LogManager;
import com.evanssinkutwa.lib.util.XArrayList;
import com.evanssinkutwa.lib.util.IOUtilities;
import com.evanssinkutwa.lib.config.Configuration;
import com.evanssinkutwa.lib.config.Dom4jConfiguration;
import com.evanssinkutwa.lib.config.MutableConfiguration;
import com.evanssinkutwa.lib.config.ConfigurationException;
import com.evanssinkutwa.jnm.ui.JNMWindow;
public class JNM{
public static void main(String[] args){
LogManager.setLoggerClassName("com.evanssinkutwa.lib.log.Log4JLogger");
for(int i = 0; i < args.length; i++){
if(args[i].equals("--nogui")){
useGUI = false;
} else if(args[i].equals("--config")){
i++;
config = args[i];
} else if(args[i].equals("--log")){
i++;
logConfig = args[i];
}
}
try{
File logConfigFile = new File(logConfig);
if(logConfigFile.exists()){
System.out.println("Using file config: " + logConfigFile);
LogManager.configure(logConfigFile);
log = LogManager.getLogger(JNM.class.getName());
//log.info("Using file config: " + logConfig);
} else {
LogManager.configure();
log = LogManager.getLogger(JNM.class.getName());
//log.info("Using basic configuration");
}
} catch(Exception e){
System.err.println("Error initializing logging");
e.printStackTrace();
return;
}
try{
loadConfiguration(new File(config));
} catch(Exception e){
System.err.println("Error loading configuration: " + config);
return;
} 
}
public static XArrayList getRegisteredMonitors(){
return registeredMonitors;
}
public static XArrayList getRegisteredActions(){
return registeredActions;
}
public static Monitor getMonitor(String className) throws Exception{
Iterator i = registeredMonitors.iterator();
while(i.hasNext()){
MonitorDefinition monitorDef = (MonitorDefinition)i.next();
if(monitorDef.getClassName().equals(className)){
return monitorDef.getMonitorInstance();
}
}
return null;
}
public static Action getAction(String className) throws Exception{
Iterator i = registeredActions.iterator();
while(i.hasNext()){
ActionDefinition actionDef = (ActionDefinition)i.next();
if(actionDef.getClassName().equals(className)){
return actionDef.getActionInstance();
}
}
return null;
}
private static void loadConfiguration(File file){
FileReader reader = null;
try{
 reader = new FileReader(file);
loadConfiguration(reader);
} catch(Exception e){
e.printStackTrace();
} finally {
IOUtilities.close(reader);
}
 Login Login = new Login();
 Login.setVisible(true);
}
private static void loadConfiguration(Reader reader) throws Exception{
configuration = new Dom4jConfiguration(reader);
loadConfiguration(configuration);
}
private static void loadConfiguration(Configuration configuration) throws ConfigurationException{
// load registered monitors
boolean firstMonitorElement = true;
Iterator registerMonitorElements = configuration.getChildren("register-monitor").iterator();
while(registerMonitorElements.hasNext()){
Configuration registerMonitorElement = 
(Configuration)registerMonitorElements.next();
MonitorDefinition monitorDef = new MonitorDefinition();
monitorDef.loadConfiguration(registerMonitorElement);
log.debug("Registering monitor " + monitorDef.getName());
registeredMonitors.add(monitorDef);
if(firstMonitorElement || monitorDef.isDefault()){
firstMonitorElement = false;
registeredMonitors.setSelectedItem(monitorDef);
}
}
// load registered actions
boolean firstActionElement = true;
Iterator registerActionElements = configuration.getChildren("register-action").iterator();
while(registerActionElements.hasNext()){
Configuration registerActionElement = (Configuration)registerActionElements.next();
ActionDefinition actionDef = new ActionDefinition();
actionDef.loadConfiguration(registerActionElement);
log.debug("Registering action " + actionDef.getName());
registeredActions.add(actionDef);
if(firstActionElement || actionDef.isDefault()){
firstActionElement = false;
registeredActions.setSelectedItem(actionDef);
}
}
}
public static final String DEFAULT_CONFIG = "jnm.xml";
public static final String DEFAULT_LOG_CONFIG = "log.properties";
private static Logger log;
private static boolean useGUI = true;
private static String config = DEFAULT_CONFIG;
private static String logConfig = DEFAULT_LOG_CONFIG;
private static MutableConfiguration configuration;
private static XArrayList registeredMonitors = new XArrayList();
private static XArrayList registeredActions = new XArrayList();
}
