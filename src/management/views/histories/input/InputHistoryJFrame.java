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
        viewInputDetailButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(690, 750));
        allPanel.setPreferredSize(new java.awt.Dimension(690, 750));
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

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 680, 410));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Thêm");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        allPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 50));

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteButton.setText("Xóa");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        allPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, 50));

        refreshButton.setBackground(new java.awt.Color(204, 204, 204));
        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshButton.setText("Làm mới");
        refreshButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        allPanel.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 50));

        viewInputDetailButton.setBackground(new java.awt.Color(204, 204, 204));
        viewInputDetailButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewInputDetailButton.setText("Xem");
        viewInputDetailButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewInputDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewInputDetailButtonMouseClicked(evt);
            }
        });
        allPanel.add(viewInputDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 46)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LỊCH SỬ NHẬP KHO");
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, -1));

        jButton4.setText("TÌM");
        allPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));
        allPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Input.Jframe/InputHistoryJFrame.png"))); // NOI18N
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        inputHistoryController.showAllInputHistory(inputHistoryTable);
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        AddInputHistoryJFrame frame = new AddInputHistoryJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton viewInputDetailButton;
    // End of variables declaration//GEN-END:variables
}
