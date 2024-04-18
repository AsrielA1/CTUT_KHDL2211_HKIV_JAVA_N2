package management.views.categories.device.device;

import javax.swing.JOptionPane;
import management.controllers.categories.DeviceController;

public class UpdateDeviceJframe extends javax.swing.JFrame {
    private boolean isViewFrame = false;
    private boolean firstPress = true;

    private final DeviceController deviceController = new DeviceController();
    
    public UpdateDeviceJframe() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    public UpdateDeviceJframe(String _deviceId) {
        initComponents();        
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        viewFrameInit(_deviceId);
        isViewFrame = true;
        deviceController.showSingleDevice(tfDeviceId, tfDeviceName, tfDeviceNote);
    }
    
    private void viewFrameInit(String _deviceId){
        btnConfirm.setText("Sửa");
        tfDeviceId.setText(_deviceId);
        tfDeviceId.setEditable(false);
        tfDeviceName.setEditable(false);
        tfDeviceNote.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfDeviceId = new javax.swing.JTextField();
        tfDeviceName = new javax.swing.JTextField();
        tfDeviceNote = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã thiết bị");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Tên thiết bị");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Ghi chú");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 489, 100, 40));
        getContentPane().add(tfDeviceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 330, 50));
        getContentPane().add(tfDeviceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 330, 50));
        getContentPane().add(tfDeviceNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 330, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("___________________________________________________________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 340, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("___________________________________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 340, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("___________________________________________________________________");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 340, -1));

        btnConfirm.setBackground(new java.awt.Color(51, 51, 51));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Xác nhận");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 150, 60));

        btnCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Hủy");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 150, 60));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel8.setText("CẬP NHẬT THIẾT BỊ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/DeviceDetail.Jframe (1)/UpdateDeviceJFrame.png"))); // NOI18N
        jLabel4.setRequestFocusEnabled(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        if (isViewFrame){
            if (firstPress){
                btnConfirm.setText("Xác nhận");
                tfDeviceName.setEditable(true);
                tfDeviceNote.setEditable(true);
                firstPress = false;
            } else{
                boolean success = deviceController.updateDevice(tfDeviceId, tfDeviceName, tfDeviceNote);
                if (success){
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                    dispose();
                }
            }
        } else {
            boolean success = deviceController.addDevice(tfDeviceId, tfDeviceName, tfDeviceNote);
            if (success){
                JOptionPane.showMessageDialog(rootPane, "Thêm thiết bị thành công");
            }
        }
    }//GEN-LAST:event_btnConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateDeviceJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeviceJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfDeviceId;
    private javax.swing.JTextField tfDeviceName;
    private javax.swing.JTextField tfDeviceNote;
    // End of variables declaration//GEN-END:variables
}
