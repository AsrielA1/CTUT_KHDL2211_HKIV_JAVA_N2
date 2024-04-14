package management.views.histories.input;

import management.controllers.histories.InputHistoryController;
import management.views.histories.input.details.InputDetailJFrame;

import javax.swing.table.DefaultTableModel;

public class InputHistoryJFrame extends javax.swing.JFrame {
    
    private final InputHistoryController inputHistoryController = new InputHistoryController();

    public InputHistoryJFrame() {
        initComponents();
        
        inputHistoryController.showAllInputHistory(inputHistoryTable);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputHistoryTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        viewInputDetailButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhập kho", "Thời gian", "Mã nhà cung cấp", "Tổng khối lượng", "Tổng chi phí"
            }
        ));
        jScrollPane1.setViewportView(inputHistoryTable);

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 600, 403));

        jButton3.setText("Thêm");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        allPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 130, 50));

        deleteButton.setText("Xóa");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        allPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 130, 50));

        refreshButton.setText("Làm mới");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        allPanel.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 130, 50));

        jButton1.setText("Xác nhận");
        allPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 90, 40));

        jButton2.setText("Hủy");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        allPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 90, 40));

        viewInputDetailButton.setText("Xem chi tiết ");
        viewInputDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewInputDetailButtonMouseClicked(evt);
            }
        });
        allPanel.add(viewInputDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        jLabel1.setText("Lịch Sử ");
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        jLabel3.setText("Nhập Kho");
        allPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Thiết kế chưa có tên (5).png")); // NOI18N
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        inputHistoryController.showAllInputHistory(inputHistoryTable);
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        AddInputHistoryJFrame frame = new AddInputHistoryJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        inputHistoryController.hideInputHistory(inputHistoryTable);
        inputHistoryController.showAllInputHistory(inputHistoryTable);
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void viewInputDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewInputDetailButtonMouseClicked
        int row = inputHistoryTable.getSelectedRow();
        DefaultTableModel tModel = (DefaultTableModel)inputHistoryTable.getModel();
        
        String inputHistoryId = tModel.getValueAt(row, 0).toString();
        System.out.println(inputHistoryId);
        InputDetailJFrame frame = new InputDetailJFrame(inputHistoryId);
        frame.setVisible(true);
    }//GEN-LAST:event_viewInputDetailButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(InputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputHistoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputHistoryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable inputHistoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton viewInputDetailButton;
    // End of variables declaration//GEN-END:variables
}
