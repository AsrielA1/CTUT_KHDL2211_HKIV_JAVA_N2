package management.views.categories.employee;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import management.controllers.categories.EmployeeController;

public class UpdateEmployeeJFrame extends javax.swing.JFrame {
    
    private boolean firstPress = true;
    private boolean isView = false;
        
    private final EmployeeController employeeController = new EmployeeController();
    
    public UpdateEmployeeJFrame() {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);        
    }
    
    public UpdateEmployeeJFrame(String _employeeId) {
        initComponents();
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); 
        
        employeeController.showSingleEmployee(_employeeId, tfEmployeeId, tfEmployeeName, tfEmployeeNumber, tfEmployeeNote);
        viewFrameInit(_employeeId);
        isView = true;
    }
    
    private void viewFrameInit(String _employeeId){
        tfEmployeeId.setText(_employeeId);
        tfEmployeeId.setEditable(false);
        tfEmployeeName.setEditable(false);
        tfEmployeeNumber.setEditable(false);
        tfEmployeeNote.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfEmployeeId = new javax.swing.JTextField();
        tfEmployeeNumber = new javax.swing.JTextField();
        tfEmployeeNote = new javax.swing.JTextField();
        tfEmployeeName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 750));
        setMinimumSize(new java.awt.Dimension(680, 750));
        setPreferredSize(new java.awt.Dimension(680, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPanel.setMinimumSize(new java.awt.Dimension(680, 750));
        informationPanel.setPreferredSize(new java.awt.Dimension(680, 750));
        informationPanel.setRequestFocusEnabled(false);
        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Mã nhân viên");
        informationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Họ và Tên");
        informationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 170, 80));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Số điện thoại");
        informationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 170, 80));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Ghi chú");
        informationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 160, 50));
        informationPanel.add(tfEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 350, 40));

        tfEmployeeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmployeeNumberActionPerformed(evt);
            }
        });
        informationPanel.add(tfEmployeeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 350, 40));
        informationPanel.add(tfEmployeeNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 350, 100));
        informationPanel.add(tfEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 350, 40));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/thoát.png"))); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        informationPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 140, 40));

        btnConfirm.setBackground(new java.awt.Color(204, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/thêm.png"))); // NOI18N
        btnConfirm.setText("Sửa");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        informationPanel.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 140, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CHI TIẾT NHÂN VIÊN");
        informationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 520, -1));

        jLabel8.setText("__________________________________________________________________________________________________________________________________________________");
        jLabel8.setToolTipText("");
        informationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 700, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("__________________________________________________________________________");
        informationPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 360, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("__________________________________________________________________________");
        informationPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 360, 80));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("_________________________________________________________________________");
        informationPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 370, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thiết kế/Employee.Jframe/UpdateEmployee.png"))); // NOI18N
        informationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 720));

        getContentPane().add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        try {
            if(firstPress){            
                tfEmployeeName.setEditable(true);
                tfEmployeeNumber.setEditable(true);
                tfEmployeeNote.setEditable(true);

                btnConfirm.setText("Xác nhận");
                
                firstPress = false;
            } else {
                boolean success = employeeController.updateEmployeeData(tfEmployeeId, tfEmployeeName, tfEmployeeNumber, tfEmployeeNote);
                if (success){
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                }
            }  
        }
        catch (Exception e){
            System.out.println("Error in management.views.categories.employee.UpdateEmployeeJFrame.btnConfirmMouseClicked");
        }
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void tfEmployeeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmployeeNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmployeeNumberActionPerformed
    


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
            java.util.logging.Logger.getLogger(UpdateEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfEmployeeId;
    private javax.swing.JTextField tfEmployeeName;
    private javax.swing.JTextField tfEmployeeNote;
    private javax.swing.JTextField tfEmployeeNumber;
    // End of variables declaration//GEN-END:variables
}
