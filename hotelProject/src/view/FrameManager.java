
package view;

import javax.swing.JOptionPane;


public class FrameManager extends javax.swing.JFrame {

    /**
     * Creates new form MainFrm
     */
    public FrameManager() {
        initComponents(); 
        this.setVisible(true);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ManagerHomePictureLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        CheckInMenu = new javax.swing.JMenu();
        CheckInMenuItem = new javax.swing.JMenuItem();
        CheckInSearchMenuItem = new javax.swing.JMenuItem();
        ReservationMenuItem = new javax.swing.JMenuItem();
        RoomInfoMenu = new javax.swing.JMenu();
        RoomInfoMenuItem = new javax.swing.JMenuItem();
        RoomInfoAddMenuItem = new javax.swing.JMenuItem();
        CustomerMenu = new javax.swing.JMenu();
        CustomerInfoMenuItem = new javax.swing.JMenuItem();
        RoomServerMenuItem = new javax.swing.JMenuItem();
        InvoicingMenuItem = new javax.swing.JMenuItem();
        SystemMenu = new javax.swing.JMenu();
        ExitMenuItem = new javax.swing.JMenuItem();
        HelpMenuItem = new javax.swing.JMenuItem();
        WelcomeMenu = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem7.setText("jMenuItem7");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Manage System Main Frame");
        setFont(new java.awt.Font("΢���ź�", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(400, 200));

        ManagerHomePictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/househotel.jpg"))); // NOI18N

        jMenuBar1.setPreferredSize(new java.awt.Dimension(543, 30));

        CheckInMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/042-folder.png"))); // NOI18N
        CheckInMenu.setText("Check-in");

        CheckInMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        CheckInMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        CheckInMenuItem.setText("Check-In");
        CheckInMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInMenuItemActionPerformed(evt);
            }
        });
        CheckInMenu.add(CheckInMenuItem);

        CheckInSearchMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        CheckInSearchMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        CheckInSearchMenuItem.setText("Query");
        CheckInSearchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInSearchMenuItemActionPerformed(evt);
            }
        });
        CheckInMenu.add(CheckInSearchMenuItem);

        ReservationMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        ReservationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/�ɹ�.png"))); // NOI18N
        ReservationMenuItem.setText("Rreservation");
        ReservationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationMenuItemActionPerformed(evt);
            }
        });
        CheckInMenu.add(ReservationMenuItem);

        jMenuBar1.add(CheckInMenu);

        RoomInfoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/050-home.png"))); // NOI18N
        RoomInfoMenu.setText("Room");

        RoomInfoMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        RoomInfoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/��ҳ.png"))); // NOI18N
        RoomInfoMenuItem.setText("Room Information Query");
        RoomInfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomInfoMenuItemActionPerformed(evt);
            }
        });
        RoomInfoMenu.add(RoomInfoMenuItem);

        RoomInfoAddMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/��ҳ.png"))); // NOI18N
        RoomInfoAddMenuItem.setText("Room Information Addition");
        RoomInfoAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomInfoAddMenuItemActionPerformed(evt);
            }
        });
        RoomInfoMenu.add(RoomInfoAddMenuItem);

        jMenuBar1.add(RoomInfoMenu);

        CustomerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/023-users.png"))); // NOI18N
        CustomerMenu.setText("Customer ");

        CustomerInfoMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        CustomerInfoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/022-users-1.png"))); // NOI18N
        CustomerInfoMenuItem.setText("Customer Information Query");
        CustomerInfoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerInfoMenuItemActionPerformed(evt);
            }
        });
        CustomerMenu.add(CustomerInfoMenuItem);

        RoomServerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        RoomServerMenuItem.setText("Room Service Management");
        RoomServerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomServerMenuItemActionPerformed(evt);
            }
        });
        CustomerMenu.add(RoomServerMenuItem);

        InvoicingMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        InvoicingMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/�Ż�ȯ.png"))); // NOI18N
        InvoicingMenuItem.setText("Customer Checkout");
        InvoicingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoicingMenuItemActionPerformed(evt);
            }
        });
        CustomerMenu.add(InvoicingMenuItem);

        jMenuBar1.add(CustomerMenu);

        SystemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/006-settings.png"))); // NOI18N
        SystemMenu.setText("System Settings");

        ExitMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        ExitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ʧ��.png"))); // NOI18N
        ExitMenuItem.setText("Log Out");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        SystemMenu.add(ExitMenuItem);

        HelpMenuItem.setFont(new java.awt.Font("΢���ź�", 0, 12)); // NOI18N
        HelpMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/����.png"))); // NOI18N
        HelpMenuItem.setText("Help Manual");
        HelpMenuItem.setToolTipText("");
        HelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuItemActionPerformed(evt);
            }
        });
        SystemMenu.add(HelpMenuItem);

        jMenuBar1.add(SystemMenu);

        WelcomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/��Ա.png"))); // NOI18N
        WelcomeMenu.setText("Welcome To The System!");
        jMenuBar1.add(WelcomeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ManagerHomePictureLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ManagerHomePictureLabel)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void CheckInMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInMenuItemActionPerformed
        // Go to addRentFrame function interface;
        RentInfoAdd addRentFrame=new RentInfoAdd();
        addRentFrame.setVisible(true);
    }//GEN-LAST:event_CheckInMenuItemActionPerformed

    private void HelpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuItemActionPerformed
        //Open the manual;
        String message="This is the manual!";
        JOptionPane.showMessageDialog(this,message);
    }//GEN-LAST:event_HelpMenuItemActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        //Verify whether to exit the system, and if so, exit;
        String message2="Are you sure you want to quit the system?";
        if(JOptionPane.showConfirmDialog(this,message2)==JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void CheckInSearchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInSearchMenuItemActionPerformed
        // Open RentInfoList and display the form
        RentInfoList rif=new RentInfoList();
        rif.setVisible(true);
        
    }//GEN-LAST:event_CheckInSearchMenuItemActionPerformed

    private void ReservationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationMenuItemActionPerformed
        // Open ReserveInfoList and display the form;
        ReserveInfoList rmf=new ReserveInfoList();
        rmf.setVisible(true);
    }//GEN-LAST:event_ReservationMenuItemActionPerformed

    private void CustomerInfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerInfoMenuItemActionPerformed
        // Open RentInfoList and display the form;
        RentInfoList rentInfoLsit=new RentInfoList();
        rentInfoLsit.setVisible(true);
    }//GEN-LAST:event_CustomerInfoMenuItemActionPerformed

    private void InvoicingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoicingMenuItemActionPerformed
        // Open PayingInfoList and display the form;
        PayingInfoList pmf=new PayingInfoList();
        pmf.setVisible(true);
        
    }//GEN-LAST:event_InvoicingMenuItemActionPerformed

    private void RoomInfoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomInfoMenuItemActionPerformed
        // Open RoomInfoList and display the form:
        RoomInfoList rif =new RoomInfoList();
        rif.setVisible(true);
    }//GEN-LAST:event_RoomInfoMenuItemActionPerformed

    private void RoomInfoAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomInfoAddMenuItemActionPerformed
        // Open RoomInfoAdd and display the form;
        RoomInfoAdd arf=new RoomInfoAdd();
        arf.setVisible(true);
    }//GEN-LAST:event_RoomInfoAddMenuItemActionPerformed

    private void RoomServerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomServerMenuItemActionPerformed
        // display the form of RequestInfoList:
        new RequestInfoList().setVisible(true);
    }//GEN-LAST:event_RoomServerMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CheckInMenu;
    private javax.swing.JMenuItem CheckInMenuItem;
    private javax.swing.JMenuItem CheckInSearchMenuItem;
    private javax.swing.JMenuItem CustomerInfoMenuItem;
    private javax.swing.JMenu CustomerMenu;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenuItem HelpMenuItem;
    private javax.swing.JMenuItem InvoicingMenuItem;
    private javax.swing.JLabel ManagerHomePictureLabel;
    private javax.swing.JMenuItem ReservationMenuItem;
    private javax.swing.JMenuItem RoomInfoAddMenuItem;
    private javax.swing.JMenu RoomInfoMenu;
    private javax.swing.JMenuItem RoomInfoMenuItem;
    private javax.swing.JMenuItem RoomServerMenuItem;
    private javax.swing.JMenu SystemMenu;
    private javax.swing.JMenu WelcomeMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
