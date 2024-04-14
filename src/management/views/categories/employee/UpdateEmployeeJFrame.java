package management.views.categories.employee;

import javax.swing.JTextField;
import management.controllers.categories.EmployeeController;

public class UpdateEmployeeJFrame extends javax.swing.JFrame {
    
    private boolean isAddJFrame;
    
    private final EmployeeController employeeController = new EmployeeController();
    
    public UpdateEmployeeJFrame() {
        initComponents();
        
        showConfirmButton(false);
    }
    
    public UpdateEmployeeJFrame(boolean addNewEmployee) {
        initComponents();
        
        if (addNewEmployee){
            showConfirmButton(true);
        } else {
            showConfirmButton(false);
        }
        
        isAddJFrame = addNewEmployee;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employeeIdTF = new javax.swing.JTextField();
        employeeNameTF = new javax.swing.JTextField();
        employeeNumberTF = new javax.swing.JTextField();
        employeeNoteTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 635));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPanel.setPreferredSize(new java.awt.Dimension(600, 700));
        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã nhân viên");
        informationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 30));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Mật khẩu");
        informationPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 170, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ tên");
        informationPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 170, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Số điện thoại");
        informationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ghi chú");
        informationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 160, 50));
        informationPanel.add(employeeIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 270, -1));

        employeeNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameTFActionPerformed(evt);
            }
        });
        informationPanel.add(employeeNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 270, -1));
        informationPanel.add(employeeNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 270, -1));
        informationPanel.add(employeeNoteTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 270, 90));
        informationPanel.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 270, -1));

        cancelButton.setText("Hủy");
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
        informationPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 90, 40));

        confirmButton.setText("Xác nhận");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        informationPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 110, 40));

        updateButton.setText("Cập nhật");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        informationPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 120, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("CHI TIẾT NHÂN VIÊN");
        informationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel8.setText("__________________________________________________________________________________________________________________________________________________");
        jLabel8.setToolTipText("");
        informationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 700, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("________________________________________________________");
        informationPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 270, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("________________________________________________________");
        informationPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 270, 140));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("________________________________________________________");
        informationPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 270, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("________________________________________________________");
        informationPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 270, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Thêm tiêu đề (900 x 500 px) (600 x 600 px).png")); // NOI18N
        informationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        if (isAddJFrame)
        employeeController.addEmployeeData(employeeIdTF, passwordTF, employeeNameTF, employeeNumberTF, employeeNoteTF);
        else
        employeeController.updateEmployeeData(employeeIdTF, employeeNameTF, employeeNumberTF, employeeNoteTF);

        dispose();
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        hideUpdateButton();
        setEditable(true, false);
        showConfirmButton(true);
    }//GEN-LAST:event_updateButtonMouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void employeeNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNameTFActionPerformed
    
    
    public void showSingleEmployee(String employeeId, String employeeName, String employeeNumber, String employeeNote){
        employeeIdTF.setText(employeeId);
        employeeNameTF.setText(employeeName);
        employeeNumberTF.setText(employeeNumber);
        employeeNoteTF.setText(employeeNote);
    }
    
    public void setEditable(boolean b, boolean isAddButton){
        employeeNameTF.setEditable(b);
        employeeNumberTF.setEditable(b);
        employeeNoteTF.setEditable(b);
        
        if (isAddButton){
            employeeIdTF.setEditable(true);
        } else {
            employeeIdTF.setEditable(false);
        }
        
    }
    
    public void showConfirmButton(boolean b){
        confirmButton.setVisible(b);
    }
    
    public void hideUpdateButton(){
        updateButton.setVisible(false);
    }
    
    public void hidePasswordTF(){
        passwordTF.setVisible(false);
        passwordLabel.setVisible(false);
    }
    
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
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField employeeIdTF;
    private javax.swing.JTextField employeeNameTF;
    private javax.swing.JTextField employeeNoteTF;
    private javax.swing.JTextField employeeNumberTF;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
