/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.Component;


public class ViewPanel extends javax.swing.JPanel {    
    private JPanel bottomJPanel;
    private AccountDirectory list;
    //在StartPanel下viewBtn处修改BUG自动生成，用init行替换throw行，删除上面的默认构造器。
    ViewPanel(JPanel bottomJPanel, AccountDirectory list) {
        initComponents();
        this.bottomJPanel = bottomJPanel;
        this.list = list;
        display();
    }
    private void display(){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);//清空数据
        
        for(Account info : list.getList()){
            Object[] row = new Object[4];
            row[0] = info;
            row[1] = info.getRoutingNumber();
            row[2] = info.getAccountNumber();
            row[3] = info.getBalance();
            dtm.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        viewDetialsBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        viewDetialsBtn.setText("View Details");
        viewDetialsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetialsBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
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
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewDetialsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(backBtn)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetialsBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(105, 105, 105)
                .addComponent(backBtn)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //previous page
        bottomJPanel.remove(this);
        CardLayout layout = (CardLayout)bottomJPanel.getLayout();
        layout.previous(bottomJPanel);
        
        //点击back后刷新表格
        Component[] comps = bottomJPanel.getComponents();
        for(Component c: comps){
            if(c instanceof ViewDetailsPanel){
                ViewDetailsPanel viewDetailsPanel = (ViewDetailsPanel) c;
                viewDetailsPanel.display();
            }
        }
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewDetialsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetialsBtnActionPerformed
        
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0){
            Account info = (Account)table.getValueAt(selectedRow, 0);
            ViewDetailsPanel viewDetailsPanel = new ViewDetailsPanel(bottomJPanel,info);//新建ViewDetailsPanel
            //next page
            bottomJPanel.add("ViewDetailsPanel",viewDetailsPanel);
            CardLayout layout = (CardLayout)bottomJPanel.getLayout();
            layout.next(bottomJPanel);
        }else
            JOptionPane.showMessageDialog(null,"please select a row","WARNING",JOptionPane.WARNING_MESSAGE);     
    }//GEN-LAST:event_viewDetialsBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this information?","WARNING",dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION){
            Account info = (Account)table.getValueAt(selectedRow, 0);
            list.deleteMethod(info);
            JOptionPane.showMessageDialog(null,"deleted");
            display();
            }
        }else
            JOptionPane.showMessageDialog(null,"please select a row","WARNING",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        Account r = list.searchMethod(searchTextField.getText());//r is short for result
        if (r == null){
            JOptionPane.showMessageDialog(null,"This account number doesn't exsit","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            //新建ViewDetailsPanel
            ViewDetailsPanel viewDetailsPanel = new ViewDetailsPanel(bottomJPanel,r);
            //next page
            bottomJPanel.add("ViewDetailsPanel",viewDetailsPanel);
            CardLayout layout = (CardLayout)bottomJPanel.getLayout();
            layout.next(bottomJPanel);
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable table;
    private javax.swing.JButton viewDetialsBtn;
    // End of variables declaration//GEN-END:variables
}
