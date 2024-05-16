package management.views.categories.provider;

import management.controllers.categories.ProviderController;

import javax.swing.JOptionPane;

public class UpdateProviderJFrame extends javax.swing.JFrame {
    
    private boolean firstPress = true;
    private boolean isViewFrame = false;
    
    private final ProviderController providerController = new ProviderController();

    public UpdateProviderJFrame() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    
    public UpdateProviderJFrame(String _providerId) {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        
        isViewFrame = true;
        viewFrameInit(_providerId);
    }
    
    private void viewFrameInit(String _providerId){
        tfProviderId.setText(_providerId);
        tfProviderId.setEditable(false);
        tfProviderName.setEditable(false);
        tfProviderEmail.setEditable(false);
        tfProviderNumber.setEditable(false);
        tfProviderNote.setEditable(false);
        
        btnConfirm.setText("Sửa");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        informationPanel = new javax.swing.JPanel();
        tfProviderId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfProviderEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfProviderName = new javax.swing.JTextField();
        tfProviderNote = new javax.swing.JTextField();
        tfProviderNumber = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(690, 750));
        allPanel.setPreferredSize(new java.awt.Dimension(690, 750));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        informationPanel.add(tfProviderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 320, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã nhà cung cấp");
        informationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Địa chỉ email");
        informationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Tên đơn vị");
        informationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));
        informationPanel.add(tfProviderEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 320, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Ghi chú");
        informationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 160, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Số điện thoại");
        informationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 220, -1));
        informationPanel.add(tfProviderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 320, 40));
        informationPanel.add(tfProviderNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 320, 80));
        informationPanel.add(tfProviderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 320, 40));

        btnConfirm.setBackground(new java.awt.Color(204, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConfirm.setText("Xác nhận");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        informationPanel.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 150, 50));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        informationPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 150, 50));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("____________________________________________________________________");
        informationPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 340, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("____________________________________________________________________");
        informationPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 340, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("____________________________________________________________________");
        informationPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 340, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("___________________________________________________________________");
        informationPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 340, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel6.setText("CHI TIẾT ");
        informationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel7.setText("NHÀ CUNG ỨNG  ");
        informationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/provider.Jframe/Update Provider.png"))); // NOI18N
        informationPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 720));

        allPanel.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        if (isViewFrame){
            if (firstPress){                
                tfProviderName.setEditable(true);
                tfProviderEmail.setEditable(true);
                tfProviderNumber.setEditable(true);
                tfProviderNote.setEditable(true);
                
                btnConfirm.setText("Xác nhận");
                
                firstPress = false;
            } else {
                boolean success = providerController.updateProvider(tfProviderId, tfProviderName, tfProviderEmail, tfProviderNumber, tfProviderNote);
                if (success){
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                    dispose();
                }
            }
        } else {
            boolean success = providerController.addProvider(tfProviderId, tfProviderName, tfProviderEmail, tfProviderNumber, tfProviderNote);
            if (success)
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");            
            
            tfProviderId.setText("");
            tfProviderName.setText("");
            tfProviderEmail.setText("");
            tfProviderNumber.setText("");
            tfProviderNote.setText("");
            
            tfProviderId.requestFocus();
        }
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProviderJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfProviderEmail;
    private javax.swing.JTextField tfProviderId;
    private javax.swing.JTextField tfProviderName;
    private javax.swing.JTextField tfProviderNote;
    private javax.swing.JTextField tfProviderNumber;
    // End of variables declaration//GEN-END:variables
}
