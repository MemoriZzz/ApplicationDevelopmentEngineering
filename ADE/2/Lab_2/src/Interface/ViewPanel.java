
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewPanel extends javax.swing.JPanel {
    
    private VitalSignHistory vsh;
    public ViewPanel(VitalSignHistory vsh) { //同样，两个构造器的问题，已修改
        initComponents();
        this.vsh = vsh;
        displayTable(); //display-all-info Function
    }
    public void displayTable(){//把每一次输入的数据都储存在Table中
        DefaultTableModel dtm =  (DefaultTableModel) vitalTable.getModel();
        dtm.setRowCount(0); //清空数据
        
        for(VitalSigns vs : vsh.getVitalSignHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        temperatureTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        bloodPressureTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("View Vital Signs");

        vitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalTable);

        deleteBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewBtn.setText("View Details");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        temperatureTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        temperatureTextField.setEnabled(false);

        pulseTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        pulseTextField.setEnabled(false);

        dateTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        dateTextField.setEnabled(false);

        bloodPressureTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bloodPressureTextField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Temperature");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Blood Pressure");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Pulse");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(108, 108, 108)
                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(viewBtn))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(temperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = vitalTable.getSelectedRow();
        if (selectedRow >= 0){
            VitalSigns vs = (VitalSigns)vitalTable.getValueAt(selectedRow,0);
            vsh.deleteMethod(vs);
            JOptionPane.showMessageDialog(null,"deleted");
            displayTable();
        }
        else 
            JOptionPane.showMessageDialog(null,"please selected a row!");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = vitalTable.getSelectedRow();
        if (selectedRow >= 0){
            VitalSigns vs = (VitalSigns)vitalTable.getValueAt(selectedRow,0);
            temperatureTextField.setText(String.valueOf(vs.getTemperature()));
            bloodPressureTextField.setText(String.valueOf(vs.getBloodPressure()));
            pulseTextField.setText(String.valueOf(vs.getPulse()));
            dateTextField.setText(vs.getDate());
        }
        else 
            JOptionPane.showMessageDialog(null,"please selected a row!");
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField temperatureTextField;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTable vitalTable;
    // End of variables declaration//GEN-END:variables
}
