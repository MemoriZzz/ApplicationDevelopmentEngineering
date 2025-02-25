/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainJFrame.java
 *
 * Created on Sep 28, 2012, 11:21:25 PM
 */

package UserInterface;

import Business.SupplierDirectory;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import UserInterface.SupplierRole.LoginSupplier;
import java.awt.CardLayout;

/**
 *
 * @author Rushabh
 */
public class MainJFrame extends javax.swing.JFrame {

    private SupplierDirectory supplierDirectory;
//    private MasterOrderCatalog moc;
    
    /** Creates new form MainJFrame */
    public MainJFrame() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        supplierDirectory = new SupplierDirectory();
//        moc = new MasterOrderCatalog();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        adminButton1 = new javax.swing.JButton();
        supplierManagerButton2 = new javax.swing.JButton();
        customerButton3 = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        adminButton1.setText("Administrator");
        adminButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton1ActionPerformed(evt);
            }
        });

        supplierManagerButton2.setText("Supplier Manager");
        supplierManagerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierManagerButton2ActionPerformed(evt);
            }
        });

        customerButton3.setText("Customer Role");
        customerButton3.setEnabled(false);
        customerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(supplierManagerButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(adminButton1)
                .addGap(18, 18, 18)
                .addComponent(supplierManagerButton2)
                .addGap(18, 18, 18)
                .addComponent(customerButton3)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton1ActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("AdminWordAreaJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_adminButton1ActionPerformed

    private void supplierManagerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierManagerButton2ActionPerformed
        // TODO add your handling code here:
        LoginSupplier ls = new LoginSupplier(userProcessContainer, supplierDirectory);
        userProcessContainer.add("LoginSupplierJPanel",ls);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_supplierManagerButton2ActionPerformed

    private void customerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButton3ActionPerformed
        // TODO add your handling code here:
       //CustomerWorkAreaJPanel cwajp = new CustomerWorkAreaJPanel(userProcessContainer, supplierDirectory, moc);
       //userProcessContainer.add("CustomerWorkAreaJPanel",cwajp);
       //CardLayout layout = (CardLayout)userProcessContainer.getLayout();
       //layout.next(userProcessContainer);
    }//GEN-LAST:event_customerButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton1;
    private javax.swing.JButton customerButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton supplierManagerButton2;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

}
