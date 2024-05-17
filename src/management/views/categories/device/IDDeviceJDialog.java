package management.views.categories.device;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import management.controllers.categories.DeviceController;

public class IDDeviceJDialog extends javax.swing.JDialog {

    private final DeviceController deviceController = new DeviceController();
    
    public IDDeviceJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        deviceController.showAllIdDevice(tblIDevice, tfDeviceId);
    }
    
    public IDDeviceJDialog(java.awt.Frame parent, boolean modal, String _deviceId) {
        super(parent, modal);
        initComponents();
        
        tfDeviceId.setText(_deviceId);
        deviceController.showAllIdDevice(tblIDevice, tfDeviceId);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIDevice = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        tfDeviceId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(690, 750));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(690, 402));

        tblIDevice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã thiết bị", "Mã kho"
            }
        ));
        tblIDevice.setPreferredSize(new java.awt.Dimension(690, 402));
        jScrollPane1.setViewportView(tblIDevice);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 313, -1, 437));

        btnAdd.setText("Thêm");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 223, -1, -1));

        btnView.setText("Xem");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        getContentPane().add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 265, -1, -1));

        btnDel.setText("Xóa");
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 223, -1, -1));

        btnRefresh.setText("Làm mới");
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 265, -1, -1));

        btnSearch.setText("TÌm");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 265, -1, -1));
        getContentPane().add(tfSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 265, 207, -1));
        getContentPane().add(tfDeviceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 265, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        new UpdateIDDeviceJDialog(new JFrame(), rootPaneCheckingEnabled, tfDeviceId.getText()).setVisible(true);
        deviceController.showAllIdDevice(tblIDevice, tfDeviceId);
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        int row = tblIDevice.getSelectedRow();
        DefaultTableModel dtModel = (DefaultTableModel)tblIDevice.getModel();
        
        String _deviceId = tfDeviceId.getText();
        int _deviceNum = Integer.parseInt(dtModel.getValueAt(row, 0).toString());
        
        new UpdateIDDeviceJDialog(new JFrame(), rootPaneCheckingEnabled, _deviceId, _deviceNum).setVisible(true);
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseClicked
        deviceController.delIdDevice(tblIDevice, tfDeviceId);
        deviceController.showAllIdDevice(tblIDevice, tfDeviceId);
    }//GEN-LAST:event_btnDelMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        deviceController.searchIDDevice(tblIDevice, tfDeviceId, tfSearchBar);
    }//GEN-LAST:event_btnSearchMouseClicked

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
            java.util.logging.Logger.getLogger(IDDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDDeviceJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IDDeviceJDialog dialog = new IDDeviceJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIDevice;
    private javax.swing.JTextField tfDeviceId;
    private javax.swing.JTextField tfSearchBar;
    // End of variables declaration//GEN-END:variables
}