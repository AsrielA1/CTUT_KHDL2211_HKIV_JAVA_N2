
package management.views.histories.output.details;

import javax.swing.JOptionPane;
import management.controllers.histories.OutputDetailController;

public class AddOutputDetailJFrame extends javax.swing.JFrame {

    private final OutputDetailController odController = new OutputDetailController();
    
    public AddOutputDetailJFrame() {
        initComponents();
    }
    
    public AddOutputDetailJFrame(String _outputId) {
        initComponents();
        
        tfOutputId.setText(_outputId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfOutputId = new javax.swing.JTextField();
        tfStorageId = new javax.swing.JTextField();
        tfWeight = new javax.swing.JTextField();
        tfIncomPerCost = new javax.swing.JTextField();
        tfOutputDetailNote = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("XUẤT KHO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 480, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setText("CHI TIẾT ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 480, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Mã xuất kho");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 229, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Mã kho");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 309, -1, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Khối lượng");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Doanh thu theo đơn vị");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Ghi Chú");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 549, -1, 50));

        tfOutputId.setText(" ");
        getContentPane().add(tfOutputId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 330, 40));

        tfStorageId.setText(" ");
        tfStorageId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStorageIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfStorageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 330, 40));

        tfWeight.setText(" ");
        getContentPane().add(tfWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 330, 40));

        tfIncomPerCost.setText(" ");
        getContentPane().add(tfIncomPerCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 330, 40));

        tfOutputDetailNote.setText(" ");
        tfOutputDetailNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOutputDetailNoteActionPerformed(evt);
            }
        });
        getContentPane().add(tfOutputDetailNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 330, 40));

        btnConfirm.setBackground(new java.awt.Color(204, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
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
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 150, 40));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Output.Jframe/AddOutputDetailJFrame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfStorageIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStorageIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStorageIdActionPerformed

    private void tfOutputDetailNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOutputDetailNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOutputDetailNoteActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        boolean success = odController.addOutputDetail(tfOutputId, tfStorageId, tfIncomPerCost, tfWeight, tfOutputDetailNote);
        if (success){
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
            
            tfOutputId.setText("");
            tfStorageId.setText("");
            tfStorageId.setText("");
            tfIncomPerCost.setText("");
            tfWeight.setText("");
            tfOutputDetailNote.setText("");
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
            java.util.logging.Logger.getLogger(AddOutputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOutputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOutputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOutputDetailJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOutputDetailJFrame().setVisible(true);
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
    private javax.swing.JTextField tfIncomPerCost;
    private javax.swing.JTextField tfOutputDetailNote;
    private javax.swing.JTextField tfOutputId;
    private javax.swing.JTextField tfStorageId;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables
}
