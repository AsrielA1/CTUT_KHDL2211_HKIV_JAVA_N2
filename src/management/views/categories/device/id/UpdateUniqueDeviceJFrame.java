package management.views.categories.device.id;

import management.controllers.categories.DeviceController;

import javax.swing.JOptionPane;

public class UpdateUniqueDeviceJFrame extends javax.swing.JFrame {
    private boolean isViewFrame = false;
    private boolean firstPress = true;
    
    private final DeviceController deviceController = new DeviceController();
    
    public UpdateUniqueDeviceJFrame() {
        initComponents();
        
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    
    public UpdateUniqueDeviceJFrame(String _uniqueId) {
        initComponents();
        
        isViewFrame = true;
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        viewFrameInit(_uniqueId);
    }

    public void viewFrameInit(String _uniqueId){
        btnConfirm.setText("Sửa");        
        tfDeviceId.setText(_uniqueId);
        tfDeviceId.setEditable(false);
        tfStorageId.setEditable(false);
        tfUniqueNote.setEditable(false);
        
        deviceController.showSingleUniqueDevice(tfUniqueNote, tfStorageId, tfUniqueNote);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUniqueNote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDeviceId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfStorageId = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirm.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Xác nhận");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 150, 50));

        btnCancel.setBackground(new java.awt.Color(102, 102, 102));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Hủy");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 150, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Ghi chú");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Mã thiết bị");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, -1));
        getContentPane().add(tfUniqueNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 360, 130));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setText("CHI TIẾT THIẾT BỊ ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));
        getContentPane().add(tfDeviceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 360, 50));

        jLabel5.setText("Mã kho");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));
        getContentPane().add(tfStorageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 360, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/TypeDevice.Jframe/UpdateUniqueDeviceJFrame.png"))); // NOI18N
        lblBackground.setText("Chi");
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
       
        System.out.println("Count = " + String.valueOf(firstPress));
        if (isViewFrame){
            if (firstPress){                
                btnConfirm.setText("Xác nhận");
                tfStorageId.setEditable(true);
                tfUniqueNote.setEditable(true);
            } else {
                boolean success = deviceController.updateUniqueDevice(tfDeviceId, tfStorageId, tfUniqueNote);
                if (success){
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                    dispose();
                }
            }
            
        } else {
            boolean success = deviceController.addUniqueDevice(tfDeviceId, tfStorageId, tfUniqueNote);
            if (success){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
            }
        }
        
        firstPress = false;
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateUniqueDeviceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUniqueDeviceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUniqueDeviceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUniqueDeviceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUniqueDeviceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextField tfDeviceId;
    private javax.swing.JTextField tfStorageId;
    private javax.swing.JTextField tfUniqueNote;
    // End of variables declaration//GEN-END:variables
}
