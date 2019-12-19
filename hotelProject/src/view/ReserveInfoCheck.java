/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ReserveController;
import java.util.List;
import javax.swing.JOptionPane;
import model.ReserveInfo;
import util.StringUtil;

/**
 *
 * @author hasee
 */
public class ReserveInfoCheck extends javax.swing.JFrame {

    /**
     * Creates new form ReserveCheckFrm
     */
    public ReserveInfoCheck() {
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

        CheckButton = new javax.swing.JButton();
        SecondLabel = new javax.swing.JLabel();
        SearchIDTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check Booking Result");
        setLocation(new java.awt.Point(480, 280));

        CheckButton.setFont(new java.awt.Font("΢���ź�", 0, 14)); // NOI18N
        CheckButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        CheckButton.setText("Check");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        SecondLabel.setFont(new java.awt.Font("΢���ź�", 0, 14)); // NOI18N
        SecondLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/022-users-1.png"))); // NOI18N
        SecondLabel.setText("Input your ID number��");

        SearchIDTextField.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        SearchIDTextField.setForeground(new java.awt.Color(153, 153, 153));
        SearchIDTextField.setToolTipText("123");
        SearchIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(SearchIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(CheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(SecondLabel)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(SecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(CheckButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        // TODO add your handling code here: ��ѯԤ��������Ϣ
        ReserveController reserveDB = new ReserveController();
        ReserveInfo reserveInfo = new ReserveInfo();
        String ID =SearchIDTextField.getText();
        if(StringUtil.isEmpty(ID)){
            JOptionPane.showMessageDialog(this, "ID����Ϊ�գ�");
		return;
            }
        reserveInfo.setGuestIDnumber(SearchIDTextField.getText());
        if(reserveDB.getReserveResult(reserveInfo)){
            JOptionPane.showMessageDialog(this, "�ɹ�Ԥ��!");
        }else JOptionPane.showMessageDialog(this, "Ԥ�����ܾ�,��δ����!");
        SearchIDTextField.setText("");
        
        reserveDB.closeBaseDB();
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void SearchIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchIDTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ReserveInfoCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReserveInfoCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReserveInfoCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReserveInfoCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReserveInfoCheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckButton;
    private javax.swing.JTextField SearchIDTextField;
    private javax.swing.JLabel SecondLabel;
    // End of variables declaration//GEN-END:variables
}