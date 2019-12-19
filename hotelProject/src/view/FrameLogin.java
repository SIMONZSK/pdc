/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserController;
import javax.swing.JOptionPane;
import model.UserInfo;
import util.StringUtil;

/**
 *
 * @author hasee
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login, I use AWT-swing to draw the JFrame
     */
    public FrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        UserTypeLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        RsetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel-Booking-System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 300));

        TitleLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 1, 18)); // NOI18N
        TitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/050-home.png"))); // NOI18N
        TitleLabel.setText("Hotel-System-Login-Form");

        UserLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        UserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/015-smile.png"))); // NOI18N
        UserLabel.setText("Username:");

        PasswordLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        PasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/014-shy.png"))); // NOI18N
        PasswordLabel.setText("Password:");

        userNameTextField.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 12)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 12)); // NOI18N

        LoginButton.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        LoginButton.setText("Login in");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        UserTypeLabel.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        UserTypeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/023-users.png"))); // NOI18N
        UserTypeLabel.setText("User Type:");

        userTypeComboBox.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14)); // NOI18N
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User", "Manager" }));

        RsetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ê§°Ü.png"))); // NOI18N
        RsetButton.setText("Reset");
        RsetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PasswordLabel)
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(UserTypeLabel)
                                    .addGap(44, 44, 44)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UserLabel)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTextField)
                            .addComponent(passwordTextField)
                            .addComponent(userTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(RsetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTypeLabel)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RsetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        //RegisterButton:clients need to register a new account when first login in the system
        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();
        String selectedItem = (String) userTypeComboBox.getSelectedItem();
        //Ensure the content of TextField is not empty
        if (StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(this, "Username should'nt be empty£¡");
            return;
        }
        if (StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(this, "Password should'nt be empty£¡");
            return;
        }
        //Transfer the info of user to user-database controller,call the login() method
        UserController userDB = new UserController();
        UserInfo userInfoTmp = new UserInfo();
        userInfoTmp.setUserName(userName);
        userInfoTmp.setPassword(password);
        if ("User".equals(selectedItem)) {
            userInfoTmp.setUserType(true);
        } else if ("Manager".equals(selectedItem)) {
            userInfoTmp.setUserType(false);
        }

        if (userDB.register(userInfoTmp)) {
            JOptionPane.showMessageDialog(this, "Register Suceessfully£¡");
        } else {
            JOptionPane.showMessageDialog(this, "Register Failure,please input right account£¡");
        }

        userDB.closeBaseDB();
        userNameTextField.setText("");
        passwordTextField.setText("");
        userTypeComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        //loginButton:System will check user's account in database,if it exist and with right password, it will login in hotel system Frmae
        String userName = userNameTextField.getText();
        String password = passwordTextField.getText();
        String selectedItem = (String) userTypeComboBox.getSelectedItem();
        if (StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(this, "Username should'nt be empty£¡");
            return;
        }
        if (StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(this, "Password should'nt be empty£¡");
            return;
        }
        if ("User".equals(selectedItem)) {
            UserController userDB = new UserController();
            UserInfo userInfoTmp = new UserInfo();
            userInfoTmp.setUserName(userName);
            userInfoTmp.setPassword(password);
            userInfoTmp.setUserType(true);
            boolean result = userDB.login(userInfoTmp);
            userDB.closeBaseDB();
            if (result) {
                JOptionPane.showMessageDialog(this, "Welcome User¡¾" + userName + "¡¿£º" + " Login in Hotel-Booking-System£¡");
                this.dispose();
                FrameUser userFrame = new FrameUser();

            } else {
                JOptionPane.showMessageDialog(this, "Unregistered or Account error, please re-enter!");
            }

        } else if ("Manager".equals(selectedItem)) {
            UserController userDB = new UserController();
            UserInfo userInfoTmp = new UserInfo();
            userInfoTmp.setUserName(userName);
            userInfoTmp.setPassword(password);
            userInfoTmp.setUserType(false);
            boolean result = userDB.login(userInfoTmp);
            userDB.closeBaseDB();
            if (result) {
                JOptionPane.showMessageDialog(this, "Welcome Manager¡¾" + userName + "¡¿£º" + " Login in Hotel-Booking-System£¡");
                this.dispose();
                FrameManager managerFrame = new FrameManager();

            } else {
                JOptionPane.showMessageDialog(this, "Unregistered or Account error, please re-enter!");
            }

        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void RsetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsetButtonActionPerformed
        // ResetButton:to clear up the JTextField's information and rewrite it.
        userNameTextField.setText("");
        passwordTextField.setText("");
        userTypeComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_RsetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameLogin login = new FrameLogin();
                login.initComponents();
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RsetButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserTypeLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField userNameTextField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
