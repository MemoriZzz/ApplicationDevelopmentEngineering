package Interface;

import Business.VitalSignsHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;

public class CreateVitalJPanel extends javax.swing.JPanel {

    private VitalSignsHistory vsh;
    public CreateVitalJPanel(VitalSignsHistory vsh) {
        initComponents();
        this.vsh =vsh;
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltemperature1 = new javax.swing.JLabel();
        temperaturetxt1 = new javax.swing.JTextField();
        lbltemperature2 = new javax.swing.JLabel();
        bloodpressuretxt = new javax.swing.JTextField();
        pulsetxt = new javax.swing.JTextField();
        lbltemperature3 = new javax.swing.JLabel();
        lbltemperature4 = new javax.swing.JLabel();
        datetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();

        lbltemperature1.setText("Temperature:");

        temperaturetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturetxt1ActionPerformed(evt);
            }
        });

        lbltemperature2.setText("Blood Pressure:");

        bloodpressuretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodpressuretxtActionPerformed(evt);
            }
        });

        pulsetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsetxtActionPerformed(evt);
            }
        });

        lbltemperature3.setText("Pulse:");

        lbltemperature4.setText("Date:");

        datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Create Vital Signs");

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltemperature4)
                                .addGap(44, 44, 44)
                                .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltemperature3)
                                .addGap(44, 44, 44)
                                .addComponent(pulsetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltemperature2)
                                .addGap(44, 44, 44)
                                .addComponent(bloodpressuretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltemperature1)
                                .addGap(44, 44, 44)
                                .addComponent(temperaturetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(savebtn)))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temperaturetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltemperature1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodpressuretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltemperature2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pulsetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltemperature3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltemperature4))
                .addGap(55, 55, 55)
                .addComponent(savebtn)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void temperaturetxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturetxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperaturetxt1ActionPerformed

    private void bloodpressuretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodpressuretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodpressuretxtActionPerformed

    private void pulsetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulsetxtActionPerformed

    private void datetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetxtActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
         double temperature = Double.parseDouble(temperaturetxt1.getText());
         double bp= Double.parseDouble(bloodpressuretxt.getText());
         int pulse=Integer.parseInt(pulsetxt.getText());
         String date=datetxt.getText();
         VitalSigns v= vsh.addVitals();
         v.setTemperature(temperature);
         v.setBloodPressure(bp);
         v.setPulse(pulse);
         v.setDate(date);
         JOptionPane.showMessageDialog(null,"Vital Signs Added Successfully!");
         
         temperaturetxt1.setText("");
         bloodpressuretxt.setText("");
         pulsetxt.setText("");
         datetxt.setText("");
         
         
        // TODO add your handling code here:
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodpressuretxt;
    private javax.swing.JTextField datetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbltemperature1;
    private javax.swing.JLabel lbltemperature2;
    private javax.swing.JLabel lbltemperature3;
    private javax.swing.JLabel lbltemperature4;
    private javax.swing.JTextField pulsetxt;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField temperaturetxt1;
    // End of variables declaration//GEN-END:variables
}
