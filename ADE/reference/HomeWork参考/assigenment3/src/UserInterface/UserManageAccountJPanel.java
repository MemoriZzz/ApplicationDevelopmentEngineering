/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Product;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yyneu
 */
public class UserManageAccountJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
     private ProductDirectory productDirectory;
     private String productCatalog;
     private boolean searchProductName;
     private boolean searchVendorName;
     private boolean searchKeyWord;
     private boolean sortFloorPrice;
     private String  search;
    /**
     * Creates new form ManageAccountJPanel
     */
    public UserManageAccountJPanel(JPanel userProcessContainer, ProductDirectory productDirectory) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.productDirectory=productDirectory;
       populateTable();
    }
    
     private void populateTable(){
         DefaultTableModel dtm = (DefaultTableModel) tblAccounts.getModel();
         dtm.setRowCount(0);
         for(Product account: productDirectory.getAccountlist()){
             Object[] row = new Object[4];
             row[0] = account;
             row[1] = account.getModelNumber();
             row[2] = account.getVendorName();
             row[3] = account.getProductCatalog();
             
             dtm.addRow(row);
         }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSearch = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccounts = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        productCatalogComboBox = new javax.swing.JComboBox<>();
        btnViewProductCatalog = new javax.swing.JButton();
        btnSearchProductName = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        productNameCheckBox = new javax.swing.JCheckBox();
        vendorNameCheckBox = new javax.swing.JCheckBox();
        keyWordCheckBox = new javax.swing.JCheckBox();
        floorPriceCheckBox = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(900, 600));

        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model Number", "Vendor Name", "Product Catalog"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAccounts);
        if (tblAccounts.getColumnModel().getColumnCount() > 0) {
            tblAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblAccounts.getColumnModel().getColumn(1).setResizable(false);
            tblAccounts.getColumnModel().getColumn(2).setResizable(false);
            tblAccounts.getColumnModel().getColumn(3).setResizable(false);
        }

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        productCatalogComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selected", "computer", "printer", "hardware parts", "software products" }));
        productCatalogComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCatalogComboBoxActionPerformed(evt);
            }
        });

        btnViewProductCatalog.setText("View This Prodcut Catalog");
        btnViewProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductCatalogActionPerformed(evt);
            }
        });

        btnSearchProductName.setText("Search By ");
        btnSearchProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductNameActionPerformed(evt);
            }
        });

        productNameCheckBox.setText("Product Name");
        productNameCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productNameCheckBoxStateChanged(evt);
            }
        });

        vendorNameCheckBox.setText("Vendor Name");
        vendorNameCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vendorNameCheckBoxStateChanged(evt);
            }
        });

        keyWordCheckBox.setText("key word");
        keyWordCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                keyWordCheckBoxStateChanged(evt);
            }
        });

        floorPriceCheckBox.setText(" Sort Floor Price");
        floorPriceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorPriceCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(productNameCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendorNameCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keyWordCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(floorPriceCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewProductCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearch)
                            .addComponent(productCatalogComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productCatalogComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewProductCatalog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchProductName)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameCheckBox)
                    .addComponent(vendorNameCheckBox)
                    .addComponent(keyWordCheckBox)
                    .addComponent(floorPriceCheckBox))
                .addContainerGap(309, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblAccounts.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from table to view details",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Product account = (Product) tblAccounts.getValueAt(selectedRow, 0);
            UserViewAccountJPanel panel = new UserViewAccountJPanel(userProcessContainer,account);
            userProcessContainer.add("UserViewAccountJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void productCatalogComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCatalogComboBoxActionPerformed
       
        productCatalog = productCatalogComboBox.getItemAt(productCatalogComboBox.getSelectedIndex());
    }//GEN-LAST:event_productCatalogComboBoxActionPerformed

    private void btnViewProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductCatalogActionPerformed
        if(productCatalog == null ||productCatalog.equals("selected")){
         JOptionPane.showMessageDialog(null,"Please select a specifc catalog!");
        }
           
        else{ 
            productCatalogJPanel panel = new productCatalogJPanel(userProcessContainer, productDirectory, productCatalog);
            userProcessContainer.add("productCatalogJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProductCatalogActionPerformed

    }
    private void btnSearchProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductNameActionPerformed
        // ArrayList<Product> result = accountDirectory.searchProductNameAccount(txtProductName.getText());
        search = txtSearch.getText();
        if(search == null||search.equals(""))JOptionPane.showMessageDialog(null," The search condition can not be empty!",
                    "Information", JOptionPane.WARNING_MESSAGE);
        //ArrayList<Product> result = accountDirectory.searchKeyWord(txtSearch.getText());
        else{
            if((productNameCheckBox.isSelected()==false)&&(vendorNameCheckBox.isSelected()==false)&&(keyWordCheckBox.isSelected()==false)&&(floorPriceCheckBox.isSelected()==false))
             JOptionPane.showMessageDialog(null," At least one search requirement must be selected ",
                    "Information", JOptionPane.WARNING_MESSAGE);
            else{
            ArrayList<Product> result = productDirectory.search(searchProductName, searchVendorName, searchKeyWord, sortFloorPrice, search);
        if(result.isEmpty()){
            JOptionPane.showMessageDialog(null," Relevant product you search does not exist",
                    "Information", JOptionPane.WARNING_MESSAGE);
        }
        else{
            SearchResultJPanel panel = new SearchResultJPanel(userProcessContainer,result);
            userProcessContainer.add("SearchResultJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
         }  
        }
       }
    }//GEN-LAST:event_btnSearchProductNameActionPerformed

    private void productNameCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productNameCheckBoxStateChanged
         if(productNameCheckBox.isSelected()) searchProductName = true; 
         else searchProductName = false;
    }//GEN-LAST:event_productNameCheckBoxStateChanged

    private void vendorNameCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vendorNameCheckBoxStateChanged
       if(vendorNameCheckBox.isSelected()) searchVendorName = true; 
         else searchVendorName = false; 
    }//GEN-LAST:event_vendorNameCheckBoxStateChanged

    private void keyWordCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_keyWordCheckBoxStateChanged
        if(keyWordCheckBox.isSelected()) searchKeyWord = true; 
         else searchKeyWord = false;
    }//GEN-LAST:event_keyWordCheckBoxStateChanged

    private void floorPriceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorPriceCheckBoxActionPerformed
        if(floorPriceCheckBox.isSelected()) sortFloorPrice = true; 
         else sortFloorPrice = false;
    }//GEN-LAST:event_floorPriceCheckBoxActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup btnGroupSearch;
    private javax.swing.JButton btnSearchProductName;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewProductCatalog;
    private javax.swing.JCheckBox floorPriceCheckBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox keyWordCheckBox;
    private javax.swing.JComboBox<String> productCatalogComboBox;
    private javax.swing.JCheckBox productNameCheckBox;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JCheckBox vendorNameCheckBox;
    // End of variables declaration//GEN-END:variables
}
