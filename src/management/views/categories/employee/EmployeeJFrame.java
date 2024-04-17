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
        filterButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        addEmployeeButton = new javax.swing.JButton();
        viewDetailButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 750));
        setPreferredSize(new java.awt.Dimension(690, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(allPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MãNV", "Họ Tên", "Số Điện thoại", "Ghi Chú"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 680, 420));

        filterButton.setBackground(new java.awt.Color(204, 204, 204));
        filterButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        filterButton.setText("Làm mới");
        filterButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(filterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 150, 50));

        delButton.setBackground(new java.awt.Color(204, 204, 204));
        delButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delButton.setText("Xóa");
        delButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        delButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delButtonMouseClicked(evt);
            }
        });
        getContentPane().add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 50));

        addEmployeeButton.setBackground(new java.awt.Color(204, 204, 204));
        addEmployeeButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addEmployeeButton.setText("Thêm");
        addEmployeeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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
        getContentPane().add(addEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 50));

        viewDetailButton.setBackground(new java.awt.Color(204, 204, 204));
        viewDetailButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewDetailButton.setText("Xem chi tiết");
        viewDetailButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        viewDetailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDetailButtonMouseClicked(evt);
            }
        });
        getContentPane().add(viewDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Tìm");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 110, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 260, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ NHÂN VIÊN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/Employee.Jframe/Employee.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void addEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMouseClicked

    }//GEN-LAST:event_addEmployeeButtonMouseClicked

    private void delButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delButtonMouseClicked

    }//GEN-LAST:event_delButtonMouseClicked

    private void viewDetailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailButtonMouseClicked

    }//GEN-LAST:event_viewDetailButtonMouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton viewDetailButton;
    // End of variables declaration//GEN-END:variables
}
