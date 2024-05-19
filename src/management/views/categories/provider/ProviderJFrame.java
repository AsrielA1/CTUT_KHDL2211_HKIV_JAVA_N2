package management.views.categories.provider;

import management.controllers.categories.ProviderController;

public class ProviderJFrame extends javax.swing.JFrame {
    
    private final ProviderController providerController = new ProviderController();
 
    public ProviderJFrame() {
        initComponents();
        
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        providerController.showAllProvider(tblProvider);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        allPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvider = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 690));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/thêm.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setToolTipText("");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        allPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 40));

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
        allPanel.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 40));

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
        allPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 40));

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
        allPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("QUẢN LÝ NHÀ CUNG ỨNG");
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 590, -1));

        jScrollPane1.setForeground(new java.awt.Color(102, 204, 0));

        tblProvider.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên đơn vị", "Email", "Số điện thoại"
            }
        ));
        jScrollPane1.setViewportView(tblProvider);

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 690, 430));

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/làm mới.png"))); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        allPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 100, -1));

        tfSearchBar.setText(" ");
        allPanel.add(tfSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/provider.Jframe/Provider.png"))); // NOI18N
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 681, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        providerController.showAllProvider(tblProvider);
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        providerController.delProvider(tblProvider);
        providerController.showAllProvider(tblProvider);
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        UpdateProviderJFrame frame = new UpdateProviderJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        providerController.searchProvider(tfSearchBar, tblProvider);
    }//GEN-LAST:event_btnSearchMouseClicked

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
            java.util.logging.Logger.getLogger(ProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProviderJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProviderJFrame().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tblProvider;
    private javax.swing.JTextField tfSearchBar;
    // End of variables declaration//GEN-END:variables
}
