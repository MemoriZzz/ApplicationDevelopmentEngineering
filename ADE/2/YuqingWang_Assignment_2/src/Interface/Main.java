
package Interface;
import Business.VitalSignsHistory;


public class Main extends javax.swing.JFrame {


    private VitalSignsHistory vsh;
    public Main() {
        initComponents();
        vsh= new VitalSignsHistory();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        viewbtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        maxbptxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        minbptxt = new javax.swing.JTextField();
        abnormalbtn = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewbtn.setText("View Vital Sign");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        createbtn.setText("Create Vital Sign");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("MAX_BP");

        jLabel2.setText("MIN_BP");

        abnormalbtn.setText("Abnormal");
        abnormalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abnormalbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(leftJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maxbptxt)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minbptxt)))
                .addContainerGap())
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(abnormalbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(createbtn)
                .addGap(84, 84, 84)
                .addComponent(viewbtn)
                .addGap(54, 54, 54)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maxbptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(minbptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(abnormalbtn)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(leftJPanel);

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        CreateVitalJPanel createJPanel =new CreateVitalJPanel(vsh);
        SplitPane.setRightComponent(createJPanel);
    }//GEN-LAST:event_createbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        ViewVitalsJPanel viewPanel = new ViewVitalsJPanel(vsh);
        SplitPane.setRightComponent(viewPanel);

    }//GEN-LAST:event_viewbtnActionPerformed

    private void abnormalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abnormalbtnActionPerformed
       String maxbpString =maxbptxt.getText();
       String minbpString =minbptxt.getText();
       double maxbp =maxbpString.equals("")? Double.MAX_VALUE :Double.parseDouble(maxbpString);
       double minbp =minbpString.equals("")? Double.MIN_VALUE :Double.parseDouble(minbpString);
       AbnormalPanel abnormalPanel =new AbnormalPanel(vsh,maxbp,minbp);
       SplitPane.setRightComponent(abnormalPanel);
       
    }//GEN-LAST:event_abnormalbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton abnormalbtn;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JTextField maxbptxt;
    private javax.swing.JTextField minbptxt;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
