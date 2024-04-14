package management.views.categories.employee;

import javax.swing.table.DefaultTableModel;

import management.controllers.categories.EmployeeController;

public class EmployeeJFrame extends javax.swing.JFrame {
    public final EmployeeController employeeController = new EmployeeController();
    public EmployeeJFrame() {
        initComponents();
        
        employeeController.showAllEmployee(employeeTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        allPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        functionPanel = new javax.swing.JPanel();
        addEmployeeButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        viewDetailButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MãNV", "Họ Tên", "Mật Khẩu", "Số Điện thoại", "Ghi Chú"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        allPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 800, 290));

        functionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEmployeeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-add-properties-24.png")); // NOI18N
        addEmployeeButton.setText("Thêm");
        addEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeButtonMouseClicked(evt);
            }
        });
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });
        functionPanel.add(addEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 90, 30));

        filterButton.setText("Bộ lọc");
        functionPanel.add(filterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        viewDetailButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-view-details-26.png")); // NOI18N
        viewDetailButton.setText("Xem chi tiết");
        viewDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDetailButtonMouseClicked(evt);
            }
        });
        functionPanel.add(viewDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, 30));

        delButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-delete-24.png")); // NOI18N
        delButton.setText("Xóa");
        delButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButtonMouseClicked(evt);
            }
        });
        functionPanel.add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 80, 30));

        refreshButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-reset-24.png")); // NOI18N
        refreshButton.setText("Làm mới");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        functionPanel.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setText("Nhân Viên");
        functionPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 280, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setText("Quản lý");
        functionPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 280, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Chức năng ");
        functionPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 110, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Thêm tiêu đề (900 x 500 px) (1).png")); // NOI18N
        functionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        allPanel.add(functionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void addEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMouseClicked
        UpdateEmployeeJFrame frame = new UpdateEmployeeJFrame(true);
        frame.hideUpdateButton();        
        frame.setEditable(true, true);
        frame.setVisible(true);
    }//GEN-LAST:event_addEmployeeButtonMouseClicked

    private void delButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButtonMouseClicked
        int row = employeeTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
        
        String employeeId = model.getValueAt(row, 0).toString();
        employeeController.hideEmployeeData(employeeId);
        employeeController.showAllEmployee(employeeTable);
    }//GEN-LAST:event_delButtonMouseClicked

    private void viewDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailButtonMouseClicked
        UpdateEmployeeJFrame frame = new UpdateEmployeeJFrame(false);
        frame.hidePasswordTF();
        frame.setEditable(false, false);
        
        int row = employeeTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
        String employeeId = model.getValueAt(row, 1).toString();
                
        employeeController.showSingleEmployee(frame, employeeId);
        frame.setVisible(true);
    }//GEN-LAST:event_viewDetailButtonMouseClicked

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        employeeController.showAllEmployee(employeeTable);
    }//GEN-LAST:event_refreshButtonMouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JPanel allPanel;
    private javax.swing.JButton delButton;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton filterButton;
    private javax.swing.JPanel functionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton viewDetailButton;
    // End of variables declaration//GEN-END:variables
}
