
package Interface;

import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class StartPanel extends javax.swing.JPanel {

    private JPanel bottomJPanel;
    private AccountDirectory list;
    
    //在MainJFrame下startBtn处修改BUG自动生成，用init行替换throw行，删除上面的默认构造器。
    StartPanel(AccountDirectory list, JPanel bottomJPanel) {
        initComponents();
        this.bottomJPanel = bottomJPanel;
        this.list = list;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 500));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(561, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(createBtn)
                .addGap(35, 35, 35)
                .addComponent(viewBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        
        //新建CreatePanel
        CreatePanel createPanel = new CreatePanel(bottomJPanel,list);
        //next page
        bottomJPanel.add("CreatePanel",createPanel);
        CardLayout layout = (CardLayout)bottomJPanel.getLayout();
        layout.next(bottomJPanel);
        
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        
        ViewPanel viewPanel = new ViewPanel(bottomJPanel,list);
        bottomJPanel.add("ViewPanel",viewPanel);
        CardLayout layout = (CardLayout)bottomJPanel.getLayout();
        layout.next(bottomJPanel);
        
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
