package management.views.main;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import management.views.categories.device.id.UniqueDeviceJFrame;

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    private void openMonitoring(){
        if (Desktop.isDesktopSupported()) {
      
         //making a desktop object
         Desktop desktop = Desktop.getDesktop();
         try {
            URI uri = new URI("https://nhankhdl2211012.grafana.net/");
            desktop.browse(uri);
         } catch (IOException excp) {
            excp.printStackTrace();
         } catch (URISyntaxException excp) {
            excp.printStackTrace();
         }
      }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnDeviceManagement = new javax.swing.JButton();
        btnOutputManagement = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnEmployeeManagement = new javax.swing.JButton();
        btnInputManagement = new javax.swing.JButton();
        btnProviderManagement = new javax.swing.JButton();
        btnStorageMonitoring = new javax.swing.JButton();
        lblVersion = new javax.swing.JLabel();
        lblUnit = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 750));
        setPreferredSize(new java.awt.Dimension(990, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 255, 255));
        lblTitle.setText("     ỨNG DỤNG QUẢN LÝ KHO ");
        lblTitle.setToolTipText("");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, -1));

        btnDeviceManagement.setBackground(new java.awt.Color(153, 255, 255));
        btnDeviceManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnDeviceManagement.setText("QUẢN LÝ THIẾT BỊ");
        btnDeviceManagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDeviceManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeviceManagementMouseClicked(evt);
            }
        });
        getContentPane().add(btnDeviceManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 310, 120));

        btnOutputManagement.setBackground(new java.awt.Color(255, 255, 153));
        btnOutputManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnOutputManagement.setText("QUẢN LÝ LỊCH SỬ XUẤT ");
        btnOutputManagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOutputManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputManagementActionPerformed(evt);
            }
        });
        getContentPane().add(btnOutputManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 310, 120));

        btnLogout.setBackground(new java.awt.Color(204, 255, 204));
        btnLogout.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLogout.setText("ĐĂNG XUẤT ");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 280, 50));

        btnEmployeeManagement.setBackground(new java.awt.Color(153, 204, 255));
        btnEmployeeManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnEmployeeManagement.setText("QUẢN LÝ NHÂN SỰ");
        btnEmployeeManagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(btnEmployeeManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 320, 120));

        btnInputManagement.setBackground(new java.awt.Color(255, 153, 153));
        btnInputManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnInputManagement.setText("QUẢN LÝ LỊCH SỬ NHẬP");
        btnInputManagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(btnInputManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 320, 120));

        btnProviderManagement.setBackground(new java.awt.Color(153, 153, 255));
        btnProviderManagement.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnProviderManagement.setText("QUẢN LÝ NHÀ CUNG ỨNG");
        btnProviderManagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(btnProviderManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 310, 120));

        btnStorageMonitoring.setBackground(new java.awt.Color(204, 204, 204));
        btnStorageMonitoring.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnStorageMonitoring.setText("GIÁM SÁT KHO");
        btnStorageMonitoring.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStorageMonitoring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStorageMonitoringMouseClicked(evt);
            }
        });
        getContentPane().add(btnStorageMonitoring, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 320, 120));

        lblVersion.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setText("VERSION : 1.0");
        getContentPane().add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        lblUnit.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        lblUnit.setForeground(new java.awt.Color(255, 255, 255));
        lblUnit.setText("CTUT");
        getContentPane().add(lblUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main.Jframe.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutputManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputManagementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOutputManagementActionPerformed

    private void btnStorageMonitoringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStorageMonitoringMouseClicked
        openMonitoring();
    }//GEN-LAST:event_btnStorageMonitoringMouseClicked

    private void btnDeviceManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeviceManagementMouseClicked
        UniqueDeviceJFrame frame = new UniqueDeviceJFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_btnDeviceManagementMouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeviceManagement;
    private javax.swing.JButton btnEmployeeManagement;
    private javax.swing.JButton btnInputManagement;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOutputManagement;
    private javax.swing.JButton btnProviderManagement;
    private javax.swing.JButton btnStorageMonitoring;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnit;
    private javax.swing.JLabel lblVersion;
    // End of variables declaration//GEN-END:variables
}