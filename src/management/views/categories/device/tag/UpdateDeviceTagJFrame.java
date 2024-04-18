package management.views.categories.device.tag;

import management.controllers.categories.DeviceController;

import javax.swing.JOptionPane;

public class UpdateDeviceTagJFrame extends javax.swing.JFrame {
    private boolean firstPress = true;
    private boolean isViewFrame = false;
    
    private final DeviceController deviceController = new DeviceController();

    public UpdateDeviceTagJFrame() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    
    public UpdateDeviceTagJFrame(String _tagId){        
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        viewFrameInit(_tagId);
        isViewFrame = true;
        deviceController.showSingleTag(tfTagId, tfTagName, tfTagNote);
    }
    
    private void viewFrameInit(String _tagId){
        btnConfirm.setText("Sửa");
        
        tfTagId.setText(_tagId);
        tfTagId.setEditable(false);
        tfTagName.setEditable(false);
        tfTagNote.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTagId = new javax.swing.JTextField();
        tfTagName = new javax.swing.JTextField();
        tfTagNote = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã loại");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 133, 23));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Tên loại thiết bị");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Ghi chú");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));
        getContentPane().add(tfTagId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 380, 40));
        getContentPane().add(tfTagName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 380, 40));

        tfTagNote.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTagNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTagNoteActionPerformed(evt);
            }
        });
        getContentPane().add(tfTagNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 380, 140));

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
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 150, 50));

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
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 150, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel5.setText("LOẠI THIẾT BỊ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 380, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/TypeDevice.Jframe/UpdateDeviceTypeJFrame.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTagNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTagNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTagNoteActionPerformed

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        if (isViewFrame){
            if (firstPress){                
                btnConfirm.setText("Xác nhận");
                
                tfTagName.setEditable(true);
                tfTagNote.setEditable(true);
                firstPress = false;
            } else {
                boolean success = deviceController.updateTag(tfTagId, tfTagName, tfTagNote);
                dispose();
            }
        }
        else {
            boolean success = deviceController.addTag(tfTagId, tfTagName, tfTagNote);
            if (success){
                JOptionPane.showMessageDialog(rootPane, "Thêm tag thành công");

                tfTagId.setText("");
                tfTagName.setText("");
                tfTagNote.setText("");
            }
        }
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
            java.util.logging.Logger.getLogger(UpdateDeviceTagJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceTagJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceTagJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceTagJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeviceTagJFrame().setVisible(true);
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
    private javax.swing.JTextField tfTagId;
    private javax.swing.JTextField tfTagName;
    private javax.swing.JTextField tfTagNote;
    // End of variables declaration//GEN-END:variables
}
