package management.views.histories.input;

import management.controllers.histories.InputHistoryController;

import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class AddInputHistoryJFrame extends javax.swing.JFrame {

    private final InputHistoryController inputHistoryController = new InputHistoryController();
    
    public AddInputHistoryJFrame() {
        initComponents();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputHistoryNoteTF = new javax.swing.JTextField();
        inputHistoryIdTF = new javax.swing.JTextField();
        providerIdTF = new javax.swing.JTextField();
        datePicker = new com.toedter.calendar.JDateChooser();
        inputTimeTF = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 750));
        setMinimumSize(new java.awt.Dimension(680, 750));
        setPreferredSize(new java.awt.Dimension(680, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(690, 750));
        allPanel.setPreferredSize(new java.awt.Dimension(690, 750));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã lô hàng");
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Ngày nhập");
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Thời gian nhập");
        allPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Nhà cung cấp");
        allPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Ghi chú");
        allPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 559, -1, 40));
        allPanel.add(inputHistoryNoteTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 330, 50));
        allPanel.add(inputHistoryIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 330, 40));
        allPanel.add(providerIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 330, 40));
        allPanel.add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 330, 40));
        allPanel.add(inputTimeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 330, 40));

        confirmButton.setBackground(new java.awt.Color(204, 204, 204));
        confirmButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/thêm.png"))); // NOI18N
        confirmButton.setText("Xác nhận");
        confirmButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        confirmButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmButtonKeyPressed(evt);
            }
        });
        allPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 150, 40));

        cancelButton.setBackground(new java.awt.Color(204, 204, 204));
        cancelButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/thoát.png"))); // NOI18N
        cancelButton.setText("Hủy");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        allPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 150, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CHI TIẾT LỊCH SỬ");
        allPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 430, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Input.Jframe/AddInputHistoryJFrame.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMinimumSize(new java.awt.Dimension(680, 720));
        jLabel6.setPreferredSize(new java.awt.Dimension(680, 720));
        allPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 730));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonKeyPressed

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        boolean success = inputHistoryController.addInputHistory(inputHistoryIdTF, datePicker, inputTimeTF, providerIdTF, inputHistoryNoteTF);
        if (success){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
            dispose();
        }
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddInputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInputHistoryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.JTextField inputHistoryIdTF;
    private javax.swing.JTextField inputHistoryNoteTF;
    private javax.swing.JTextField inputTimeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField providerIdTF;
    // End of variables declaration//GEN-END:variables
}
