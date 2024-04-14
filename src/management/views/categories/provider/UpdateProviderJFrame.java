package management.views.categories.provider;

import management.controllers.categories.ProviderController;

import javax.swing.JOptionPane;

public class UpdateProviderJFrame extends javax.swing.JFrame {
    
    private final ProviderController providerController = new ProviderController();
    private int pressUpdateCount = 0;
    
    private boolean isAddJFrame;

    public UpdateProviderJFrame() {
        initComponents();
    }
    
    public UpdateProviderJFrame(boolean addNewProvider) {
        initComponents();
        
        isAddJFrame = addNewProvider;
        if (!isAddJFrame){
            setEditable(false);
        }
    }
    
    public void resetTxtField(){
        providerIdTF.setText("");
        providerNameTF.setText("");
        providerMailTF.setText("");
        providerNumberTF.setText("");
        providerNoteTF.setText("");
    }
    
    public void setFocus(){
        providerIdTF.requestFocus();
    }
    
    public void setEditable(boolean b){
        providerNameTF.setEditable(b);
        providerMailTF.setEditable(b);
        providerNumberTF.setEditable(b);
        providerNoteTF.setEditable(b);
    }
    
    public void showSingleProvider(String providerId, String providerName, String providerMail, String providerNumber, String providerNote){
        providerIdTF.setText(providerId);
        providerNameTF.setText(providerName);
        providerMailTF.setText(providerMail);
        providerNumberTF.setText(providerNumber);
        providerNoteTF.setText(providerNote);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        informationPanel = new javax.swing.JPanel();
        providerIdTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        providerMailTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        providerNameTF = new javax.swing.JTextField();
        providerNoteTF = new javax.swing.JTextField();
        providerNumberTF = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        informationPanel.add(providerIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 240, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã nhà cung cấp");
        informationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Địa chỉ email");
        informationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên đơn vị");
        informationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 87, -1));
        informationPanel.add(providerMailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 240, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ghi chú");
        informationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số điện thoại");
        informationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));
        informationPanel.add(providerNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 240, -1));
        informationPanel.add(providerNoteTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 240, 110));
        informationPanel.add(providerNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 240, -1));

        confirmButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-update-30.png")); // NOI18N
        confirmButton.setText("Cập nhật");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        informationPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 130, 30));

        cancelButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-cancel-30.png")); // NOI18N
        cancelButton.setText("Hủy");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        informationPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 130, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("_________________________________________________");
        informationPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 270, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("_________________________________________________");
        informationPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 270, 20));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("_________________________________________________");
        informationPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 270, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_________________________________________________");
        informationPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 270, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Chi Tiết ");
        informationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Nhà Cung Ứng ");
        informationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 270, 70));

        jLabel9.setText("_________________________");
        informationPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 140, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Thiết kế chưa có tên (2).png")); // NOI18N
        informationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 640));

        allPanel.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 622, 642));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        pressUpdateCount++;
        if (isAddJFrame){
            providerController.addProviderData(providerIdTF, providerNameTF, providerMailTF, providerNumberTF, providerNoteTF);
            resetTxtField();
            setFocus();
            JOptionPane.showMessageDialog(rootPane, "Đã thêm nhà cung cấp thành công");
        } else {
            setEditable(true);
            if (pressUpdateCount >= 2){
                providerController.updateProviderData(providerIdTF, providerNameTF, providerMailTF, providerNumberTF, providerNoteTF);
                JOptionPane.showMessageDialog(rootPane, "Đã cập nhật nhà cung cấp thành công");
            }
        }
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

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
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField providerIdTF;
    private javax.swing.JTextField providerMailTF;
    private javax.swing.JTextField providerNameTF;
    private javax.swing.JTextField providerNoteTF;
    private javax.swing.JTextField providerNumberTF;
    // End of variables declaration//GEN-END:variables
}
