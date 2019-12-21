
package view;

import controller.ReserveController;
import javax.swing.JOptionPane;
import model.ReserveInfo;
import util.StringUtil;


public class ReserveInfoAdd extends javax.swing.JFrame {

    /**
     * Creates new form AddRentFrm
     */
    public ReserveInfoAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RentjLabel = new javax.swing.JLabel();
        RoomLabel = new javax.swing.JLabel();
        DaysLabel = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        RentTypeComboBox = new javax.swing.JComboBox<>();
        RoomTypeComboBox = new javax.swing.JComboBox<>();
        RemarkLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        IDNumberLabel = new javax.swing.JLabel();
        RentDaysTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        RemarkTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new housing information");
        setLocation(new java.awt.Point(450, 200));

        RentjLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        RentjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ԥ�����䱣֤.png"))); // NOI18N
        RentjLabel.setText("Rental Room");
        RentjLabel.setToolTipText("");

        RoomLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        RoomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        RoomLabel.setText("Room Type :");

        DaysLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        DaysLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/003-calendar.png"))); // NOI18N
        DaysLabel.setText("Housing Days :");

        ResetButton.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ʧ��.png"))); // NOI18N
        ResetButton.setText("Reset Info");
        ResetButton.setToolTipText("");
        ResetButton.setActionCommand("");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        RentTypeComboBox.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        RentTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "The hour room", "Standard room" }));

        RoomTypeComboBox.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        RoomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Family Room" }));
        RoomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTypeComboBoxActionPerformed(evt);
            }
        });

        RemarkLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        RemarkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        RemarkLabel.setText("Remark :");

        SubmitButton.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        SubmitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        NameTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N

        IDNumberLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        IDNumberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����֤����.png"))); // NOI18N
        IDNumberLabel.setText("ID Number :");

        RentDaysTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N

        IDTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        NameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/������֤��.png"))); // NOI18N
        NameLabel.setText("Name :");

        RemarkTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RentjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RoomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DaysLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RemarkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RentTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RoomTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemarkTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RentDaysTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RentjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RentDaysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DaysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemarkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemarkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // ResetButton :to clear up the TextField's information and rewrite it.
        IDTextField.setText("");
        NameTextField.setText("");
        RentDaysTextField.setText("");
        RemarkTextField.setText("");
        RentTypeComboBox.setSelectedIndex(0);
        RoomTypeComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_ResetButtonActionPerformed

    private void RoomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTypeComboBoxActionPerformed
        
    }//GEN-LAST:event_RoomTypeComboBoxActionPerformed

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
        
    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        // the submit button disappears after adding data to the database;
        String ID=IDTextField.getText().toString();
        String Name=NameTextField.getText().toString();
        String Rentdays=RentDaysTextField.getText().toString(); // Don't know if there's a problem here, it was an Int
        String Remark=RemarkTextField.getText().toString();
        String selectedRentItem = (String)RentTypeComboBox.getSelectedItem();
        String selectedRoomItem = (String)RoomTypeComboBox.getSelectedItem();
        if(StringUtil.isEmpty(ID)){
            JOptionPane.showMessageDialog(this, "ID cannot be empty!");
			return;
        }
        if(StringUtil.isEmpty(Name)){
            JOptionPane.showMessageDialog(this, "ID name cannot be empty!");
			return;
        }
        if(StringUtil.isEmpty(Rentdays)){
            JOptionPane.showMessageDialog(this, "Booking days cannot be empty!");
			return;
        }
        
        ReserveInfo reserveinfo =new ReserveInfo();
        reserveinfo.setGuestIDnumber(ID);
        reserveinfo.setGuestName(Name);
        reserveinfo.setRentDays(Integer.parseInt( Rentdays ));
        reserveinfo.setRentType(selectedRentItem);
        reserveinfo.setRoomType(selectedRoomItem);
        reserveinfo.setRemark(Remark);
        
        ReserveController reserveDB=new ReserveController();   
        if(reserveDB.addRent(reserveinfo)){
            JOptionPane.showMessageDialog(this, "Reservation information added successfully!");
            System.out.println("Reservation information was added successfully");
	}else{
            JOptionPane.showMessageDialog(this, "Appointment information added failed!");
	}
        reserveDB.closeBaseDB();
        this.setVisible(true);
        
        IDTextField.setText("");
        NameTextField.setText("");
        RentDaysTextField.setText("");
        RemarkTextField.setText("");
        RentTypeComboBox.setSelectedIndex(0);
        RoomTypeComboBox.setSelectedIndex(0);

//        this.dispose();
//        MainFrm main=new MainFrm();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ReserveInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveInfoAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DaysLabel;
    private javax.swing.JLabel IDNumberLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel RemarkLabel;
    private javax.swing.JTextField RemarkTextField;
    private javax.swing.JTextField RentDaysTextField;
    private javax.swing.JComboBox<String> RentTypeComboBox;
    private javax.swing.JLabel RentjLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel RoomLabel;
    private javax.swing.JComboBox<String> RoomTypeComboBox;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables
}
