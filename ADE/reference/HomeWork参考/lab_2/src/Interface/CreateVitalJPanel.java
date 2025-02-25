/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import javax.swing.JOptionPane;
import Business.VitalSigns;

/**
 *
 * @author yyneu
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalJPanel
     */
    private VitalSignHistory vsh;
    public CreateVitalJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh= vsh;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TempLabel3 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        TempLabel2 = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        TempLabel1 = new javax.swing.JLabel();
        TempLabel = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        bloodPressureTextField = new javax.swing.JTextField();

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.green);
        jLabel1.setText("Create Vital Signs");

        TempLabel3.setText("Date");

        TempLabel2.setText("Pulse");

        TempLabel1.setText("Blood Pressure");

        TempLabel.setText("Temperature");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TempLabel2)
                            .addComponent(TempLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(saveBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pulseTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                        .addComponent(bloodPressureTextField)
                                        .addComponent(tempTextField))))))
                    .addComponent(TempLabel1)
                    .addComponent(TempLabel))
                .addGap(0, 135, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempLabel)
                    .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempLabel1)
                    .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TempLabel2)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pulseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempLabel3)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveBtn)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        double temperature= Double.parseDouble(tempTextField.getText());
        double bp= Double.parseDouble(bloodPressureTextField.getText());
        int pulse= Integer.parseInt(pulseTextField.getText());
        String date = dateTextField.getText();
        VitalSigns v=vsh.addVitals();
        v.setTemperature(temperature);
        v.setBloodPressure(bp);
        v.setPulse(pulse);
        v.setDate(date);
        JOptionPane.showMessageDialog(null, "Vital Signs Added Successfully");

        bloodPressureTextField.setText("");
        pulseTextField.setText("");
        dateTextField.setText("");
        tempTextField.setText("");
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TempLabel;
    private javax.swing.JLabel TempLabel1;
    private javax.swing.JLabel TempLabel2;
    private javax.swing.JLabel TempLabel3;
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tempTextField;
    // End of variables declaration//GEN-END:variables
}
