package management.views.histories.input.details;

import management.controllers.histories.InputDetailController;

public class AddInputDetailJFrame extends javax.swing.JFrame {

    private final InputDetailController inputDetailController = new InputDetailController();
    public AddInputDetailJFrame() {
        initComponents();
        
        inputDetailController.addInputHistoryIdChooser(inputIdChooser);
        inputDetailController.addStorageIdChooser(storageIdChooser);
    }

    public AddInputDetailJFrame(String _inputId) {
        initComponents();
        
        inputDetailController.addInputHistoryIdChooser(inputIdChooser);
        inputDetailController.addStorageIdChooser(storageIdChooser);
        inputIdChooser.setSelectedItem(_inputId);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        storageIdChooser = new javax.swing.JComboBox<>();
        inputIdChooser = new javax.swing.JComboBox<>();
        costPerWeightTF = new javax.swing.JTextField();
        inputDetailNoteTF = new javax.swing.JTextField();
        inputWeightTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 630));
        setPreferredSize(new java.awt.Dimension(600, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        confirmButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-update-30.png")); // NOI18N
        confirmButton.setText("Xác nhận");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 140, 40));

        cancelButton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-cancel-30.png")); // NOI18N
        cancelButton.setText("Hủy");
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 140, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Ghi chú");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Khối Lượng");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Chi phí theo đơn vị");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mã kho");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mã nhập kho");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 20));

        storageIdChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(storageIdChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 350, 40));

        inputIdChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(inputIdChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 350, 40));
        getContentPane().add(costPerWeightTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 350, 30));
        getContentPane().add(inputDetailNoteTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 350, 110));
        getContentPane().add(inputWeightTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 350, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        jLabel7.setText("Chi Tiết ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        jLabel8.setText("Nhập Kho");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Thiết kế chưa có tên (7).png")); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        inputDetailController.addInputDetail(inputIdChooser, storageIdChooser, costPerWeightTF, inputWeightTF, inputDetailNoteTF);
    }//GEN-LAST:event_confirmButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AddInputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInputDetailJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField costPerWeightTF;
    private javax.swing.JTextField inputDetailNoteTF;
    private javax.swing.JComboBox<String> inputIdChooser;
    private javax.swing.JTextField inputWeightTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> storageIdChooser;
    // End of variables declaration//GEN-END:variables
}
