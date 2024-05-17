
package management.views.categories.device;

import javax.swing.JOptionPane;
import management.controllers.categories.DeviceController;

public class UpdateDeviceJDialog extends javax.swing.JDialog {

    private boolean isView = false;
    private boolean firstPress = true;
    
    private final DeviceController deviceController = new DeviceController();
    
    public UpdateDeviceJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public UpdateDeviceJDialog(java.awt.Frame parent, boolean modal, String _deviceId) {
        super(parent, modal);
        initComponents();
        
        viewInit(_deviceId);
        isView = true;
    }
    
    private void viewInit(String _deviceId){
        tfDeviceId.setText(_deviceId);
        
        tfDeviceId.setEditable(false);
        tfDeviceName.setEditable(false);
        tfDeviceNote.setEditable(false);
        deviceController.showSingleDevice(tfDeviceId, tfDeviceName, tfDeviceNote);
        
        btnConfirm.setText("Sửa");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        tfDeviceId = new javax.swing.JTextField();
        tfDeviceName = new javax.swing.JTextField();
        tfDeviceNote = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setPreferredSize(new java.awt.Dimension(690, 750));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfDeviceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDeviceIdActionPerformed(evt);
            }
        });
        allPanel.add(tfDeviceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 113, -1));
        allPanel.add(tfDeviceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 180, 70));
        allPanel.add(tfDeviceNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 210, 80));

        jLabel1.setText("Mã thiết bị");
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jLabel2.setText("Tên thiết bị");
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jLabel3.setText("Ghi chú");
        allPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        btnConfirm.setText("Xác nhận");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        allPanel.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 683, -1, -1));

        btnCancel.setText("Hủy");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        allPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 683, -1, -1));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        if (isView){
            if (firstPress){
                firstPress = false;
                
                tfDeviceName.setEditable(true);
                tfDeviceNote.setEditable(true);
                
                btnConfirm.setText("Xác nhận");
            } else {
                boolean success = deviceController.updateDevice(tfDeviceId, tfDeviceName, tfDeviceNote);                
                if (success){
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                    dispose();
                } else {                    
                    JOptionPane.showMessageDialog(rootPane, "Sửa không thành công");
                }
            }
        }
        else{
            boolean success = deviceController.addDevice(tfDeviceId, tfDeviceName, tfDeviceNote);
            if (success){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                
                tfDeviceId.setText("");
                tfDeviceName.setText("");
                tfDeviceNote.setText("");
                
                tfDeviceId.requestFocus();
            } else {                
                JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
            }
        }
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void tfDeviceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDeviceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDeviceIdActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateDeviceJDialog dialog = new UpdateDeviceJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfDeviceId;
    private javax.swing.JTextField tfDeviceName;
    private javax.swing.JTextField tfDeviceNote;
    // End of variables declaration//GEN-END:variables
}