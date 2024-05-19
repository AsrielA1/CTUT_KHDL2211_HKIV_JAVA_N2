package management.views.histories.input;

import management.controllers.histories.InputHistoryController;
import management.views.histories.input.details.InputDetailJFrame;

import javax.swing.table.DefaultTableModel;

public class InputHistoryJFrame extends javax.swing.JFrame {
    
    private final InputHistoryController inputHistoryController = new InputHistoryController();

    public InputHistoryJFrame() {
        initComponents();
        
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        inputHistoryController.showAllInputHistory(tblHistory);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 750));
        setMinimumSize(new java.awt.Dimension(680, 750));
        setPreferredSize(new java.awt.Dimension(680, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setMinimumSize(new java.awt.Dimension(690, 750));
        allPanel.setPreferredSize(new java.awt.Dimension(690, 750));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHistory);

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 680, 410));

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/thêm.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        allPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 50));

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/xóa.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        allPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 50));

        btnRefresh.setBackground(new java.awt.Color(204, 204, 204));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/làm mới.png"))); // NOI18N
        btnRefresh.setText("Làm mới");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        allPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 50));

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/xem chi tiết.png"))); // NOI18N
        btnView.setText("Xem");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        allPanel.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 150, 50));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 3, 46)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("LỊCH SỬ NHẬP KHO");
        allPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, -1));

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/tìm.png"))); // NOI18N
        btnSearch.setText("TÌM");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        allPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));
        allPanel.add(tfSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 300, -1));

        lblBackground.setBackground(new java.awt.Color(204, 204, 204));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Input.Jframe/InputHistoryJFrame.png"))); // NOI18N
        allPanel.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        inputHistoryController.showAllInputHistory(tblHistory);
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        AddInputHistoryJFrame frame = new AddInputHistoryJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        inputHistoryController.hideInputHistory(tblHistory);
        inputHistoryController.showAllInputHistory(tblHistory);
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        int row = tblHistory.getSelectedRow();
        DefaultTableModel tModel = (DefaultTableModel)tblHistory.getModel();
        
        String inputHistoryId = tModel.getValueAt(row, 0).toString();
        System.out.println(inputHistoryId);
        InputDetailJFrame frame = new InputDetailJFrame(inputHistoryId);
        frame.setVisible(true);
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        
    }//GEN-LAST:event_btnSearchMouseClicked

    
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField tfSearchBar;
    // End of variables declaration//GEN-END:variables
}
