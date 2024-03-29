
package view;

import controller.RequestController;
import javax.swing.JOptionPane;
import model.RequestInfo;
import util.StringUtil;


public class RequestInfoAdd extends javax.swing.JFrame {

    /**
     * Creates new form AddRequestInfo
     */
    public RequestInfoAdd() {
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

        IDCardLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        RequestTextField = new javax.swing.JTextField();
        ServiceAppLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        ResetInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Request service");
        setLocation(new java.awt.Point(480, 280));

        IDCardLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        IDCardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����֤����.png"))); // NOI18N
        IDCardLabel.setText("ID Card :");

        IDTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        NameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/������֤��.png"))); // NOI18N
        NameLabel.setText("Name :");

        RequestTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N

        ServiceAppLabel.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        ServiceAppLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        ServiceAppLabel.setText("Service Application");

        NameTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ResetInfoButton.setText("Reset Info");
        ResetInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetInfoButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ServiceAppLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(RequestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IDCardLabel)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(NameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RequestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServiceAppLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(ResetInfoButton))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
    
    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        //SubmitButton :Create service request;
        String Request = RequestTextField.getText().toString();
        String Name = NameTextField.getText().toString();
        String Id = IDTextField.getText().toString();
        

        if (StringUtil.isEmpty(Request)) {
            JOptionPane.showMessageDialog(this, "The request cannot be empty!");
            return;
        }
        if (StringUtil.isEmpty(Name)) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty!");
            return;
        }
        if (StringUtil.isEmpty(Id)) {
            JOptionPane.showMessageDialog(this, "ID number cannot be empty!");
            return;
        }
        

        RequestInfo requestInfo = new RequestInfo();
        requestInfo.setRequest(Request);
        requestInfo.setName(Name);
        requestInfo.setId(Id);
        

        RequestController requestDB = new RequestController();
        if (requestDB.addRequest(requestInfo)) {
            JOptionPane.showMessageDialog(this, "Service application information added successfully!");
            System.out.println("Service application information added successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Service application information added failed!");
        }
        requestDB.closeBaseDB();
        this.setVisible(true);

        RequestTextField.setText("");
        IDTextField.setText("");
        NameTextField.setText("");

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void ResetInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetInfoButtonActionPerformed
        // ResetButton:to clear up the TextField's information and rewrite it.
        RequestTextField.setText("");
        IDTextField.setText("");
        NameTextField.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ResetInfoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RequestInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestInfoAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDCardLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField RequestTextField;
    private javax.swing.JButton ResetInfoButton;
    private javax.swing.JLabel ServiceAppLabel;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables
}
