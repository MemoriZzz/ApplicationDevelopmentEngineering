
package Interface;
import Business.AccountDirectory;
import java.awt.CardLayout;

public class MainJFrame extends javax.swing.JFrame {

    private AccountDirectory list;
    
    public MainJFrame() {
        initComponents();
        list = new AccountDirectory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        bottomJPanel = new javax.swing.JPanel();
        topJPanel = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        bottomJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomJPanel);

        topJPanel.setBackground(new java.awt.Color(204, 204, 204));

        startBtn.setBackground(new java.awt.Color(153, 153, 153));
        startBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        startBtn.setText("Account Manager");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topJPanelLayout.createSequentialGroup()
                .addContainerGap(544, Short.MAX_VALUE)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(topJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        
        //新建StartPanel
        StartPanel startPanel = new StartPanel(list,bottomJPanel);
        //next page
        bottomJPanel.add("StartPanel",startPanel);
        CardLayout layout = (CardLayout)bottomJPanel.getLayout();
        layout.next(bottomJPanel);
    }//GEN-LAST:event_startBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomJPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton startBtn;
    private javax.swing.JPanel topJPanel;
    // End of variables declaration//GEN-END:variables
}
