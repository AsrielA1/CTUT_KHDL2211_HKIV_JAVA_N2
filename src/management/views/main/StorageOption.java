package management.views.main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import management.views.categories.storage.StorageJFrame;

public class StorageOption extends javax.swing.JDialog {

    public StorageOption(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        btnMonitoring = new javax.swing.JButton();
        btnManagment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnMonitoring.setBackground(new java.awt.Color(153, 255, 255));
        btnMonitoring.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnMonitoring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/icons8-monitor-100.png"))); // NOI18N
        btnMonitoring.setText("Giám sát kho");
        btnMonitoring.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMonitoring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMonitoringMouseClicked(evt);
            }
        });

        btnManagment.setBackground(new java.awt.Color(153, 153, 255));
        btnManagment.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnManagment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/icons8-manage-100.png"))); // NOI18N
        btnManagment.setText("Quản lý kho");
        btnManagment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManagmentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManagment, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(btnMonitoring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMonitoring, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManagment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitoringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonitoringMouseClicked
        openMonitoring();
        
        dispose();
    }//GEN-LAST:event_btnMonitoringMouseClicked

    private void btnManagmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManagmentMouseClicked
        StorageJFrame frame = new StorageJFrame();
        frame.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnManagmentMouseClicked

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
            java.util.logging.Logger.getLogger(StorageOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorageOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorageOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorageOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StorageOption dialog = new StorageOption(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagment;
    private javax.swing.JButton btnMonitoring;
    // End of variables declaration//GEN-END:variables
}
