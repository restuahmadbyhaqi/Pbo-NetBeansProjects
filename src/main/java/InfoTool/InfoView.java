package InfoTool;

import javax.swing.*;

public class InfoView extends javax.swing.JFrame {
    private InfoController infoController;
    
    public InfoView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWeather = new javax.swing.JLabel();
        txtWeather = new javax.swing.JTextField();
        btnWeather = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnMessage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWeather.setText("Weather");
        jPanel1.add(lblWeather);

        txtWeather.setPreferredSize(new java.awt.Dimension(120, 20));
        txtWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeatherActionPerformed(evt);
            }
        });
        jPanel1.add(txtWeather);

        btnWeather.setText("Update Weather");
        btnWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeatherActionPerformed(evt);
            }
        });
        jPanel1.add(btnWeather);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        lblMessage.setText("Message:");
        jPanel2.add(lblMessage);

        txtMessage.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel2.add(txtMessage);

        btnMessage.setText("Update Message");
        btnMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessageActionPerformed(evt);
            }
        });
        jPanel2.add(btnMessage);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeatherActionPerformed

    private void btnMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessageActionPerformed
        infoController.updateMessage(txtMessage.getText());
    }//GEN-LAST:event_btnMessageActionPerformed

    private void btnWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeatherActionPerformed
        infoController.updateWeather(txtWeather.getText());
    }//GEN-LAST:event_btnWeatherActionPerformed

    public void setInfoController(InfoController infoController) {
        this.infoController = infoController;
    }
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
            java.util.logging.Logger.getLogger(InfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoView().setVisible(true);
            }
        });
    }
    
    public JLabel getLblMessage() {
        return lblMessage;
    }
    
    public JLabel getLblWeather() {
        return lblWeather;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMessage;
    private javax.swing.JButton btnWeather;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblWeather;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtWeather;
    // End of variables declaration//GEN-END:variables

   
}
