
package Interface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CreatePanel extends javax.swing.JPanel {
    private JPanel bottomJPanel;
    private AccountDirectory list;
  
    //在StartPanel下createBtn处修改BUG自动生成，用init行替换throw行，删除上面的默认构造器。
    CreatePanel(JPanel bottomJPanel, AccountDirectory list) {
        initComponents(); 
        this.bottomJPanel = bottomJPanel;
        this.list = list;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        routingNumberTextField = new javax.swing.JTextField();
        accountNumberTextField = new javax.swing.JTextField();
        bankNameTextField = new javax.swing.JTextField();
        balanceTextField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Create Account");

        jLabel2.setText("Routing Number");

        jLabel3.setText("Account Number");

        jLabel4.setText("Bank Name");

        jLabel5.setText("Balance");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(routingNumberTextField)
                                .addComponent(accountNumberTextField)
                                .addComponent(bankNameTextField)
                                .addComponent(balanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(routingNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bankNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(createBtn)
                .addGap(52, 52, 52)
                .addComponent(backBtn)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        if(routingNumberTextField.getText().equals("")||accountNumberTextField.getText().equals("")||
                bankNameTextField.getText().equals("")||balanceTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"one or more fields are empty");
        }
        
        int accountNum; // accountNum必须是整数
        try{
            accountNum = Integer.parseInt(accountNumberTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a valid number for account number");
            return;
        }
        
        double balance ; //balance必须是double型，（如果报错，加上 = -1；）
        try{
            balance = Double.parseDouble(balanceTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a valid number for balance");
            return;
        }

        Account info = list.addMethod();
        
        info.setAccountNumber(String.valueOf(accountNum));
        info.setBalance(String.valueOf(balance));
        
        info.setRoutingNumber(routingNumberTextField.getText());
        //info.setAccountNumber(accountNumberTextField.getText());
        info.setBankName(bankNameTextField.getText());
        //info.setBalance(balanceTextField.getText());
        
        JOptionPane.showMessageDialog(null,"Added");
        
        routingNumberTextField.setText("");
        accountNumberTextField.setText("");
        bankNameTextField.setText("");
        balanceTextField.setText("");

    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //previous page
        bottomJPanel.remove(this);
        CardLayout layout = (CardLayout)bottomJPanel.getLayout();
        layout.previous(bottomJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JTextField bankNameTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField routingNumberTextField;
    // End of variables declaration//GEN-END:variables
}
