ackage com.Presentation_Layer;
import com.Data_Layer.DBConnect;
import com.Presentation_Layer.Devices;
import com.Presentation_Layer.Login;
import com.evanssinkutwa.jnm.Reports;
import com.evanssinkutwa.jnm.User;
import com.evanssinkutwa.jnm.ui.JNMWindow;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
* @author Evans
*/
public class Home extends javax.swing.JFrame {
 Connection conn = null;
 ResultSet rs = null;
 PreparedStatement pst = null;
 int curRow = 0;

 /**
 * Creates new form Home
 */
 public Home() {
 initComponents();
 conn = DBConnect.ConnectDb();
 Toolkit toolkit = getToolkit();
 Dimension size = toolkit.getScreenSize();
 setLocation(size.width / 2- getWidth() / 2,
 size.height / 2 - getHeight() / 2);
 }
 /**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
 private void initComponents() {
 jLabel1 = new javax.swing.JLabel();
 jTabbedPane1 = new javax.swing.JTabbedPane();
 jPanel3 = new javax.swing.JPanel();
 monitoring_cmd = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 jButton4 = new javax.swing.JButton();
 jPanel6 = new javax.swing.JPanel();
 graph = new javax.swing.JButton();
 jPanel7 = new javax.swing.JPanel();
 jButton1 = new javax.swing.JButton();
 jPanel4 = new javax.swing.JPanel();
 jButton3 = new javax.swing.JButton();
 off_cmd = new javax.swing.JButton();
 logout = new javax.swing.JButton();
 jPanel1 = new javax.swing.JPanel();
 jLabel3 = new javax.swing.JLabel();
 jMenuBar1 = new javax.swing.JMenuBar();
 jMenu1 = new javax.swing.JMenu();
 jMenu3 = new javax.swing.JMenu();
 jMenu4 = new javax.swing.JMenu();
 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jLabel1.setBackground(new java.awt.Color(255, 255, 255));
 jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WAN 
Diagram_Full.png"))); // NOI18N
 monitoring_cmd.setIcon(new 
javax.swing.ImageIcon(getClass().getResource("/image/01.png"))); // NOI18N
 monitoring_cmd.setText("MONITOR NETWORK");
 monitoring_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 monitoring_cmdActionPerformed(evt);
 }
 });
 jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cog.png"))); // 
NOI18N
 jButton2.setText("NETWORK DEVICES");
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small.jpg"))); // 
NOI18N
 jButton4.setText("MANAGE INCIDENT ALERTS");
 jButton4.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton4ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
 jPanel3.setLayout(jPanel3Layout);
 jPanel3Layout.setHorizontalGroup(
 jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel3Layout.createSequentialGroup()
 
addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel3Layout.createSequentialGroup()
 .addGap(70, 70, 70)
 .addComponent(monitoring_cmd)
 .addGap(18, 18, 18)
 .addComponent(jButton2))
 .addGroup(jPanel3Layout.createSequentialGroup()
 .addGap(154, 154, 154)
 .addComponent(jButton4)))
 .addContainerGap(127, Short.MAX_VALUE))
 );
 jPanel3Layout.setVerticalGroup(
 jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel3Layout.createSequentialGroup()
 .addGap(119, 119, 119)
 
.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
 .addComponent(monitoring_cmd)
 .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGap(18, 18, 18)
 .addComponent(jButton4)
 .addContainerGap(130, Short.MAX_VALUE))
 );
 jTabbedPane1.addTab("HOME", new 
javax.swing.ImageIcon(getClass().getResource("/image/120.png")), jPanel3); // NOI18N
 graph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Line Chart.png"))); // 
NOI18N
 graph.setText("MONITOR DEVICE GRAPH");
 graph.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 graphActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
 jPanel6.setLayout(jPanel6Layout);
 jPanel6Layout.setHorizontalGroup(
 jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel6Layout.createSequentialGroup()
 .addGap(148, 148, 148)
 .addComponent(graph)
 .addContainerGap(190, Short.MAX_VALUE))
 );
 jPanel6Layout.setVerticalGroup(
 jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel6Layout.createSequentialGroup()
 .addGap(111, 111, 111)
 .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, 38, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap(198, Short.MAX_VALUE))
 );
 jTabbedPane1.addTab("GRAPHS", new 
javax.swing.ImageIcon(getClass().getResource("/image/81.png")), jPanel6); // NOI18N
 jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/posts.png"))); // 
NOI18N
 jButton1.setText("GENERATE REPORTS");
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
 jPanel7.setLayout(jPanel7Layout);
 jPanel7Layout.setHorizontalGroup(
 jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel7Layout.createSequentialGroup()
 .addContainerGap(244, Short.MAX_VALUE)
 .addComponent(jButton1)
 .addGap(134, 134, 134))
 );
 jPanel7Layout.setVerticalGroup(
 jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel7Layout.createSequentialGroup()
 .addGap(103, 103, 103)
 .addComponent(jButton1)
 .addContainerGap(203, Short.MAX_VALUE))
 );
 jTabbedPane1.addTab("REPORTS", new 
javax.swing.ImageIcon(getClass().getResource("/image/44.png")), jPanel7); // NOI18N
 jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user (2).png"))); // 
NOI18N
 jButton3.setText("USER DETAILS");
 jButton3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton3ActionPerformed(evt);
 }
 });
 off_cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-systemshutdown-icon.png"))); // NOI18N
 off_cmd.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 off_cmdActionPerformed(evt);
 }
 });
 logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/88.JPG"))); // 
NOI18N
 logout.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 logoutActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
 jPanel4.setLayout(jPanel4Layout);
 jPanel4Layout.setHorizontalGroup(
 jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel4Layout.createSequentialGroup()
 .addGap(170, 170, 170)
 
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addGroup(jPanel4Layout.createSequentialGroup()
 .addComponent(off_cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 54, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap(204, Short.MAX_VALUE))
 );
 jPanel4Layout.setVerticalGroup(
 jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel4Layout.createSequentialGroup()
 .addGap(115, 115, 115)
 .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(18, 18, 18)
 
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
 .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(off_cmd, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 .addContainerGap(117, Short.MAX_VALUE))
 );
 jTabbedPane1.addTab("TOOLS", new 
javax.swing.ImageIcon(getClass().getResource("/image/Administrative_Tools.png")), jPanel4); // NOI18N
 jPanel1.setBackground(new java.awt.Color(0, 102, 102));
 jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
 jLabel3.setForeground(new java.awt.Color(255, 255, 255));
 jLabel3.setText("BANK NETWORK MONITORING SYSTEM");
 javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
 jPanel1.setLayout(jPanel1Layout);
 jPanel1Layout.setHorizontalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel1Layout.createSequentialGroup()
 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 982, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addContainerGap())
 );
 jPanel1Layout.setVerticalGroup(
 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel1Layout.createSequentialGroup()
 .addContainerGap(53, Short.MAX_VALUE)
 .addComponent(jLabel3)
 .addGap(43, 43, 43))
 );
 jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
 jMenu1.setText("File");
 jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
 jMenu3.setText("Help");
 jMenu1.add(jMenu3);
 jMenu4.setText("Exit");
 jMenu1.add(jMenu4);
 jMenuBar1.add(jMenu1);
 setJMenuBar(jMenuBar1);
 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(jTabbedPane1))
 );
 layout.setVerticalGroup(
 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addGap(11, 11, 11)
 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
Short.MAX_VALUE)
 .addContainerGap())))
 );
 pack();
 }// </editor-fold> 
 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
 User user = new User();
 user.setVisible(true);
 } 
 private void monitoring_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
JNMWindow app = new JNMWindow();
app.setVisible(true);
app.startMonitor();
 } 
 private void graphActionPerformed(java.awt.event.ActionEvent evt) { 
 ProcessBuilder p = new ProcessBuilder("jConsole");
 try {
 p.start();// TODO add your handling code here:
 } catch (IOException ex) {
 Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
 }
 } 
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
 Devices dev = new Devices(); 
 dev.setVisible(true);
 // TODO add your handling code here:
 } 
 private void logoutActionPerformed(java.awt.event.ActionEvent evt) { 
 this.dispose();
 Login login = new Login();
 login.setVisible(true);
 } 
 private void off_cmdActionPerformed(java.awt.event.ActionEvent evt) { 
 this.dispose();
 } 
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
 Reports rep = new Reports();
 rep.setVisible(true);
 } 
 private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { 
 Incident_Alert inc = new Incident_Alert();
inc.setVisible(true);
 // TODO add your handling code here:
 // TODO add your handling code here:
 } 
 /**
 * @param args the command line arguments
 */
 // public static void main(String args[]) {
 /* Set the Nimbus look and feel */
 //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
 /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
 */
 // try {
 // for (javax.swing.UIManager.LookAndFeelInfo info : 
javax.swing.UIManager.getInstalledLookAndFeels()) {
 // if ("Nimbus".equals(info.getName())) {
 //javax.swing.UIManager.setLookAndFeel(info.getClassName());
 //break;
 //}
 // }
 // } catch (ClassNotFoundException ex) {
 // 
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // } catch (InstantiationException ex) {
 // 
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // } catch (IllegalAccessException ex) {
 // 
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 // 
java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 // }
 //</editor-fold>
 /* Create and display the form */
 // java.awt.EventQueue.invokeLater(new Runnable() {
 // public void run() {
 // new Home().setVisible(true);
 // }
 // });
 // }
 // Variables declaration - do not modify 
 private javax.swing.JButton graph;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JButton jButton4;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JMenu jMenu1;
 private javax.swing.JMenu jMenu3;
 private javax.swing.JMenu jMenu4;
 private javax.swing.JMenuBar jMenuBar1;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel3;
 private javax.swing.JPanel jPanel4;
 private javax.swing.JPanel jPanel6;
 private javax.swing.JPanel jPanel7;
 private javax.swing.JTabbedPane jTabbedPane1;
 private javax.swing.JButton logout;
 private javax.swing.JButton monitoring_cmd;
 private javax.swing.JButton off_cmd;
 // End of variables declaration 
}