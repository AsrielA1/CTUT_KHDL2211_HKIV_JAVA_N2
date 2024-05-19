package management.views.histories.output;

import javax.swing.JOptionPane;
import management.controllers.histories.OutputHistoryController;

public class AddOutputHistoryJFrame extends javax.swing.JFrame {

    private final OutputHistoryController outputController = new OutputHistoryController();
    
    public AddOutputHistoryJFrame() {
        initComponents();        
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        allPanel = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        tfOutputNote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfOutputTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateOutput = new com.toedter.calendar.JDateChooser();
        tfOutputId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 750));
        setMinimumSize(new java.awt.Dimension(680, 750));
        setPreferredSize(new java.awt.Dimension(680, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(690, 750));
        allPanel.setPreferredSize(new java.awt.Dimension(690, 750));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        allPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 150, 50));

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
        allPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 150, 50));
        allPanel.add(tfOutputNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 330, 134));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Ghi chú");
        allPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 469, -1, 50));
        allPanel.add(tfOutputTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 330, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Thời gian xuất");
        allPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Ngày xuất");
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 50));
        allPanel.add(dateOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 330, 50));
        allPanel.add(tfOutputId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 330, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã xuất kho");
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 219, -1, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CHI TIẾT ");
        allPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LỊCH SỬ XUẤT KHO");
        allPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Output.Jframe/AddInputHistoryJFrame.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMinimumSize(new java.awt.Dimension(680, 720));
        jLabel5.setPreferredSize(new java.awt.Dimension(680, 720));
        allPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        boolean success = outputController.addOutputHistory(tfOutputId, dateOutput, tfOutputTime, tfOutputNote);
        if (success){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
        } else {            
            JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
        }
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
            java.util.logging.Logger.getLogger(AddOutputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOutputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOutputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOutputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOutputHistoryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private com.toedter.calendar.JDateChooser dateOutput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfOutputId;
    private javax.swing.JTextField tfOutputNote;
    private javax.swing.JTextField tfOutputTime;
    // End of variables declaration//GEN-END:variables
}
