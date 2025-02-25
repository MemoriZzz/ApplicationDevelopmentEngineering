/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Business;
import business.Person;
import business.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yyneu
 */
public class AddUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddUserAccountJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    public AddUserAccountJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business=business;
        populatePerson();
        populateRoles();
    }
    
    public void populatePerson(){
        personJComboBox.removeAll();
        for(Person person:business.getEmployeeDirectory().getEmployeeList())
        {
            personJComboBox.addItem(person);
        }
    }

     public void populateRoles(){
         roleJComboBox.removeAll();
         roleJComboBox.addItem(UserAccount.EMPOLYEE_ROLE);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        activeJRadioButton = new javax.swing.JRadioButton();
        inactiveJRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        personJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        createUserAccountJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        jLabel1.setText("Add New User Account");

        jLabel2.setText("User Name:");

        jLabel3.setText("Password:");

        jLabel4.setText("Is Active?");

        activeJRadioButton.setSelected(true);
        activeJRadioButton.setText("Yes");
        activeJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeJRadioButtonActionPerformed(evt);
            }
        });

        inactiveJRadioButton.setText("No");
        inactiveJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactiveJRadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Person:");

        jLabel6.setText("Role:");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        createUserAccountJButton.setText("Create User Account");
        createUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activeJRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inactiveJRadioButton))
                            .addComponent(personJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roleJComboBox, 0, 118, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createUserAccountJButton)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(activeJRadioButton)
                    .addComponent(inactiveJRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(personJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(createUserAccountJButton))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        String userName = userNameJTextField.getText().trim();
        String password = passwordJTextField.getText().trim();
        
        if(userName.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(this,"Invalid user name/password","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        UserAccount ua = business.getUserAccountDirectory().addUserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setPerson((Person)personJComboBox.getSelectedItem());
        ua.setRole(String.valueOf(roleJComboBox.getSelectedItem()));
        
        if(activeJRadioButton.isSelected()){
            ua.setIsActive(true);
            }
        else{
            ua.setIsActive(false);
        }
         JOptionPane.showMessageDialog(this,"User account has been created successfully","Info",JOptionPane.INFORMATION_MESSAGE);
         
         userNameJTextField.setText("");
         passwordJTextField.setText("");
    }//GEN-LAST:event_createUserAccountJButtonActionPerformed

    private void inactiveJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactiveJRadioButtonActionPerformed
        // TODO add your handling code here:
        if(inactiveJRadioButton.isSelected()){
            activeJRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_inactiveJRadioButtonActionPerformed

    private void activeJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeJRadioButtonActionPerformed
        // TODO add your handling code here:
           if(activeJRadioButton.isSelected()){
            inactiveJRadioButton.setSelected(false);
        }
      
    }//GEN-LAST:event_activeJRadioButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        
        Component[] componentArray=userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length -1];
        manageUserAccountsJPanel muajpanel=(manageUserAccountsJPanel) component;
        muajpanel.refreshTable();
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activeJRadioButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUserAccountJButton;
    private javax.swing.JRadioButton inactiveJRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox personJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
