package Interface;
import Business.VitalSignsHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewVitalsJPanel extends javax.swing.JPanel {

    private VitalSignsHistory vsh;
    public ViewVitalsJPanel(VitalSignsHistory vsh) {
        initComponents();
        this.vsh= vsh;
        populateTable();
    }
   public void populateTable(){
       
       DefaultTableModel dtm =(DefaultTableModel)vitalsignstbl.getModel();
       dtm.setRowCount(0);
       for(VitalSigns vs : vsh.getVitalSignHistory())
       {
           Object row[]= new Object[2];
           row[0]= vs;
           row[1]=vs.getBloodPressure();
           dtm.addRow(row);
       }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalsignstbl = new javax.swing.JTable();
        viewdetailsbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        lbltemperature2 = new javax.swing.JLabel();
        bloodpressuretxt = new javax.swing.JTextField();
        pulsetxt = new javax.swing.JTextField();
        temperaturetxt1 = new javax.swing.JTextField();
        lbltemperature3 = new javax.swing.JLabel();
        lbltemperature4 = new javax.swing.JLabel();
        datetxt = new javax.swing.JTextField();
        lbltemperature1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("View Vital Signs");

        vitalsignstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane1.setViewportView(vitalsignstbl);

        viewdetailsbtn.setText("View Details");
        viewdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailsbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        lbltemperature2.setText("Blood Pressure:");

        bloodpressuretxt.setEnabled(false);
        bloodpressuretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodpressuretxtActionPerformed(evt);
            }
        });

        pulsetxt.setEnabled(false);
        pulsetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsetxtActionPerformed(evt);
            }
        });

        temperaturetxt1.setEnabled(false);
        temperaturetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturetxt1ActionPerformed(evt);
            }
        });

        lbltemperature3.setText("Pulse:");

        lbltemperature4.setText("Date:");

        datetxt.setEnabled(false);
        datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetxtActionPerformed(evt);
            }
        });

        lbltemperature1.setText("Temperature:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewdetailsbtn)
                        .addGap(35, 35, 35)
                        .addComponent(deletebtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(302, 302, 302)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbltemperature4)
                            .addGap(44, 44, 44)
                            .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbltemperature3)
                            .addGap(44, 44, 44)
                            .addComponent(pulsetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbltemperature2)
                            .addGap(44, 44, 44)
                            .addComponent(bloodpressuretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbltemperature1)
                            .addGap(44, 44, 44)
                            .addComponent(temperaturetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(225, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewdetailsbtn)
                    .addComponent(deletebtn))
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(temperaturetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltemperature1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bloodpressuretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltemperature2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pulsetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltemperature3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbltemperature4))
                    .addContainerGap(270, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bloodpressuretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodpressuretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodpressuretxtActionPerformed

    private void pulsetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pulsetxtActionPerformed

    private void temperaturetxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturetxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperaturetxt1ActionPerformed

    private void datetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetxtActionPerformed

    private void viewdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailsbtnActionPerformed

        int selectedrow=vitalsignstbl.getSelectedRow();
        if(selectedrow >=0)
        {
           VitalSigns vs =(VitalSigns)vitalsignstbl.getValueAt(selectedrow, 0);
           bloodpressuretxt.setText(String.valueOf(vs.getBloodPressure()));
           temperaturetxt1.setText(String.valueOf(vs.getTemperature()));
           pulsetxt.setText(String.valueOf(vs.getPulse()));
           datetxt.setText(vs.getDate());
        }
        else
            JOptionPane.showMessageDialog(null, "Please select any row");
                

    }//GEN-LAST:event_viewdetailsbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
    int selectedrow=vitalsignstbl.getSelectedRow();
        if(selectedrow >=0)
        {
                   VitalSigns vs =(VitalSigns)vitalsignstbl.getValueAt(selectedrow, 0);
                   vsh.deleteVitals(vs);
                   JOptionPane.showMessageDialog(null,"Vital Sign has been deleted");
                   populateTable();

        
        }
        else
            JOptionPane.showMessageDialog(null, "Please select any row");
        

    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodpressuretxt;
    private javax.swing.JTextField datetxt;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltemperature1;
    private javax.swing.JLabel lbltemperature2;
    private javax.swing.JLabel lbltemperature3;
    private javax.swing.JLabel lbltemperature4;
    private javax.swing.JTextField pulsetxt;
    private javax.swing.JTextField temperaturetxt1;
    private javax.swing.JButton viewdetailsbtn;
    private javax.swing.JTable vitalsignstbl;
    // End of variables declaration//GEN-END:variables
}
