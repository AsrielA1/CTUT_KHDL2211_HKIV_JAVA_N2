package management.views.categories.device.device;

import management.controllers.categories.DeviceController;

import javax.swing.JOptionPane;

public class DeviceDetailJFrame extends javax.swing.JFrame {

    private boolean firstPress = true;
    private boolean isViewFrame = false;
    
    private final DeviceController deviceController = new DeviceController();
    
    public DeviceDetailJFrame() {
        initComponents();
    }
    
    public DeviceDetailJFrame(String _deviceId) {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        tfDeviceId.setText(_deviceId);
        tfDeviceId.setEditable(false);
        isViewFrame = true;
        viewFrameInit(_deviceId);
    }
    
    private void viewFrameInit(String _deviceId){
        tfDeviceId.setText(_deviceId);
        tblTag.getColumnModel().getColumn(0).setHeaderValue("Tag hiện có");
        deviceController.showDeviceTags(tfDeviceId, tblTag);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        tfDeviceId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTag = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 750));
        setPreferredSize(new java.awt.Dimension(700, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Mã thiết bị");
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("TAG");
        allPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 3, 54)); // NOI18N
        lblTitle.setText("THÊM TAG THIẾT BỊ ");
        allPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(153, 255, 153));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConfirm.setText("THÊM");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        allPanel.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 180, 50));
        allPanel.add(tfDeviceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 340, 60));

        tblTag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(tblTag);

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 340, 240));

        jButton2.setText("HỦY");
        allPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 150, 60));

        btnDelete.setText("Xóa");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        allPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 140, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/DeviceDetail.Jframe (1)/DeviceDetailJFrame.png"))); // NOI18N
        allPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (firstPress){            
            tblTag.getColumnModel().getColumn(0).setHeaderValue("Tag chưa có");
            deviceController.showUntagTags(tfDeviceId, tblTag);
            
            btnDelete.setVisible(false);
            btnConfirm.setText("XÁC NHẬN");
            firstPress = false;            
        } else {
            boolean success = deviceController.addTagsForDevice(tfDeviceId, tblTag);
            if (success){
                JOptionPane.showMessageDialog(rootPane, "Đã thêm các tag thành công");
                tblTag.getColumnModel().getColumn(0).setHeaderValue("Tag hiện có");
                deviceController.showDeviceTags(tfDeviceId, tblTag);
                
                btnConfirm.setText("THÊM");
                btnDelete.setVisible(true);
                firstPress = true;
                
                deviceController.showDeviceTags(tfDeviceId, tblTag);
            }
        }        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (firstPress){
            btnConfirm.setVisible(false);
            btnDelete.setText("Xác nhận");
            
            firstPress = false;
        } else {
            boolean success = deviceController.delTagsForDevice(tfDeviceId, tblTag);
            if (success){                
                JOptionPane.showMessageDialog(rootPane, "Đã xóa các tag thành công");
                
                btnDelete.setText("XÓA");
                btnConfirm.setVisible(true);
                firstPress = true;
                
                deviceController.showDeviceTags(tfDeviceId, tblTag);
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(DeviceDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeviceDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeviceDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeviceDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeviceDetailJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblTag;
    private javax.swing.JTextField tfDeviceId;
    // End of variables declaration//GEN-END:variables
}
