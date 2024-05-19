package management.views.categories.storage;

import management.controllers.categories.StorageController;

import javax.swing.JOptionPane;


public class UpdateStorageJFrame extends javax.swing.JFrame {
    
    private boolean firstPress = true;
    private boolean isViewFrame = false;
    
    private final StorageController storageController = new StorageController();

    public UpdateStorageJFrame() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    
    public UpdateStorageJFrame(String _storageId) {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        viewFrameInit(_storageId);
        isViewFrame = true;
    }
    
    private void viewFrameInit(String _storageId){
        tfStorageId.setText(_storageId);
        tfStorageId.setEditable(false);
        tfWeightMax.setEditable(false);
        tfStorageNote.setEditable(false);
        
        storageController.showSingleStorage(tfStorageId, tfWeightMax, tfStorageNote);
        
        btnConfirm.setText("Sửa");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfStorageId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfWeightMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfStorageNote = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(700, 730));
        allPanel.setPreferredSize(new java.awt.Dimension(700, 730));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(690, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tfStorageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 320, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã kho");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 160, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Sức chứa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
        jPanel1.add(tfWeightMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 320, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Ghi chú");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));
        jPanel1.add(tfStorageNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 320, 150));

        btnConfirm.setBackground(new java.awt.Color(204, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConfirm.setText("Xác nhận");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 150, 40));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 150, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel5.setText("CHI TIẾT KHO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 410, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/storage.Jframe/Updatestorage.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(680, 730));
        jLabel4.setMinimumSize(new java.awt.Dimension(680, 730));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        allPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 750));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        if (isViewFrame){
            if (firstPress){                
                tfWeightMax.setEditable(true);
                tfStorageNote.setEditable(true);
                
                btnConfirm.setText("Xác nhận");
                
                firstPress = false;
            } else {
                boolean success = storageController.updateStorage(tfStorageId, tfWeightMax, tfStorageNote);
                if (success){
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                    dispose();
                }
            }
        } else {
            boolean success = storageController.addStorage(tfStorageId, tfWeightMax, tfStorageNote);
            if (success){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                
                tfStorageId.setText("");
                tfWeightMax.setText("");
                tfStorageNote.setText("");
                
                tfStorageId.requestFocus();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStorageJFrame().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfStorageId;
    private javax.swing.JTextField tfStorageNote;
    private javax.swing.JTextField tfWeightMax;
    // End of variables declaration//GEN-END:variables
}
