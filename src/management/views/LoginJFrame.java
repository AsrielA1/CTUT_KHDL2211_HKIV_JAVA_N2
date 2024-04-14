package management.views;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import management.controllers.main.LoginController;
import management.views.MainJFrame;

public class LoginJFrame extends javax.swing.JFrame {
    LoginController loginController = new LoginController();
 
    public LoginJFrame() {
        initComponents();
        loginFail.setVisible(false);
        loginButton.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        loginArea = new javax.swing.JPanel();
        loginPassword = new javax.swing.JTextField();
        loginUsername = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginFail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("Bạn đã có tài khoản chưa ?");

        jLabel6.setText("Tạo tài khoản");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginArea.setPreferredSize(new java.awt.Dimension(693, 328));
        loginArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        loginArea.add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 250, -1));
        loginArea.add(loginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 250, -1));

        loginButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 204, 255));
        loginButton.setText("Đăng nhập");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginArea.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 330, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Mật khẩu");
        loginArea.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setText("Tên đăng nhập");
        loginArea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 170, 20));

        loginFail.setText("Tên đăng nhập hoặc mật khẩu không đúng!");
        loginArea.add(loginFail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 250, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đăng Nhập ");
        loginArea.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 300, 60));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_____________________________________________________");
        loginArea.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_____________________________________________________");
        loginArea.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 20));

        jLabel10.setText("Bạn đã có tài khoản chưa ?");
        loginArea.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel11.setText("Tạo tài khoản");
        loginArea.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\icons8-body-24.png")); // NOI18N
        loginArea.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 60, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Ảnh\\icons8-hide-16.png")); // NOI18N
        loginArea.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\wk\\Downloads\\Ảnh\\Thêm tiêu đề.png")); // NOI18N
        loginArea.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(loginArea, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(loginArea, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        loginArea.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        boolean success = loginController.loginIsSuccess(loginUsername, loginPassword);
        if (success){
            disposeResources();
            new MainJFrame().setVisible(true);
        }

        MainJFrame frame = new MainJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_loginButtonMouseClicked
    private void disposeResources() {
        this.dispose();
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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJFrame frame = new LoginJFrame();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel loginArea;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginFail;
    private javax.swing.JTextField loginPassword;
    private javax.swing.JTextField loginUsername;
    // End of variables declaration//GEN-END:variables
}
