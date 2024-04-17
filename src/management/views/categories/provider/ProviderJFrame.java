package management.views.categories.provider;

import management.controllers.categories.EmployeeController;
import management.controllers.categories.ProviderController;

public class ProviderJFrame extends javax.swing.JFrame {
    
    private final ProviderController providerController = new ProviderController();
 
    public ProviderJFrame() {
        initComponents();
        
        providerController.showAllProviderData(providerTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        allPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        providerTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 690));
        setPreferredSize(new java.awt.Dimension(690, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addButton.setText("Thêm");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        allPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 40));

        updateButton.setBackground(new java.awt.Color(204, 204, 204));
        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updateButton.setText("Sửa");
        updateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        allPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deleteButton.setText("Xóa");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        allPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 40));

        refreshButton.setBackground(new java.awt.Color(204, 204, 204));
        refreshButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshButton.setText("Làm mới");
        refreshButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        allPanel.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("QUẢN LÝ NHÀ CUNG ỨNG");
        allPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 590, -1));

        jScrollPane1.setForeground(new java.awt.Color(102, 204, 0));

        providerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(providerTable);

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 680, 400));

        jButton1.setText("Tìm");
        allPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 100, -1));

        jTextField1.setText(" ");
        allPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/provider.Jframe/Provider.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(680, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(680, 720));
        allPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 681, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        providerController.showAllProviderData(providerTable);
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        providerController.hideProviderData(providerTable);
        providerController.showAllProviderData(providerTable);
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        UpdateProviderJFrame frame = new UpdateProviderJFrame(false);
        providerController.showSingleProviderData(frame, providerTable);
        frame.setEditable(false);
        frame.setVisible(true);
    }//GEN-LAST:event_updateButtonMouseClicked

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        UpdateProviderJFrame frame = new UpdateProviderJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_addButtonMouseClicked

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
    private javax.swing.JButton addButton;
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable providerTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
