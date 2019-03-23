/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagementsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohit
 */
public class EventDetails extends javax.swing.JFrame {

    /**
     * Creates new form EventDetails
     */
    public EventDetails() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(190, 60));
        setMinimumSize(new java.awt.Dimension(969, 664));
        setPreferredSize(new java.awt.Dimension(969, 664));
        getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Event details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 0, 12))); // NOI18N
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(207, 23, 23));
        jLabel9.setText("Date:-");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 90, 60, 22);

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(207, 23, 23));
        jLabel8.setText("Event purpose:-");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 20, 130, 22);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(207, 23, 23));
        jLabel10.setText("Time:-");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 160, 70, 22);

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(207, 23, 23));
        jLabel11.setText("Duration:-");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 230, 90, 22);

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(207, 23, 23));
        jLabel12.setText("Reference:-");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 300, 100, 22);

        jTextField6.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jPanel3.add(jTextField6);
        jTextField6.setBounds(150, 20, 330, 40);

        jTextField7.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jPanel3.add(jTextField7);
        jTextField7.setBounds(150, 90, 330, 40);

        jTextField8.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jPanel3.add(jTextField8);
        jTextField8.setBounds(150, 160, 330, 40);

        jTextField9.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jPanel3.add(jTextField9);
        jTextField9.setBounds(150, 230, 330, 40);

        jTextField10.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel3.add(jTextField10);
        jTextField10.setBounds(150, 300, 330, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(250, 160, 495, 390);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventmanagementsystem/7d32c633-617e-4a38-ad07-84fccda5bc90.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 190, 160);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 14, 14));
        jLabel1.setText("Event details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 110, 138, 30);

        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(299, 590, 110, 30);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setText("Way to expense calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 590, 270, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\java images\\event-management-dubai.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               
                String a= jTextField6.getText();
                String b= jTextField7.getText();
                String c= jTextField8.getText();
                String d= jTextField9.getText();
                String e= jTextField10.getText();
               
        try{
                 
                 
              
               Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagement","root","13Mohit99!");
               String sql="insert into details values ('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"');";
               
               
               PreparedStatement pst=con.prepareStatement(sql);
               if(a!=null && b!=null && c!=null && d!=null && e!=null )
               {
                   
               
               pst.executeUpdate();
               JOptionPane.showMessageDialog(null,"CONGRATULATIONS..YOU HAVE SUCCESSFULLY REGISTERED YOUR EVENT DETAILS.YOU MAY PROCEED TO EXPENSE CALCULATOR TO GET AN ESTIMATED COST OF YOUR EVENT");
               }
               else
               {
                   
                   JOptionPane.showMessageDialog(null,"Error!!fill the form completely");
               }
                 
               
               con.close();
            
               
                   
                   
                 
                   
               
           }
           catch(SQLException | HeadlessException ex){
              
               JOptionPane.showMessageDialog(null,ex);
               
           }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     Expense a=new Expense();
     a.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}