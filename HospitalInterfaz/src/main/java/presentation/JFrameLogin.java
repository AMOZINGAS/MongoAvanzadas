package presentation;

import Tools.Pintar;
import factory.Factory;
import java.awt.Color;
import javax.swing.JOptionPane;
import IDAOs.ILogIn;
import IDAOs.IUserDAO;

public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public JFrameLogin() {
        initComponents();
        this.setTitle("Login");
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(lblFondoPro, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
        imagen.PintarImagen(lblBlue, "src/main/java/Fotos/abstract-template-blue-background-white-squares-free-vector.jpg");
        imagen.PintarImagen(lblBackLogin, "src/main/java/Fotos/abstract-blue-gradient-curved-shapes-on-white-background-free-vector.jpg");

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        FondoInicio = new javax.swing.JPanel();
        Iniciar_Sesion = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        No_Tienes_Cuenta = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jlbCreateAccount = new javax.swing.JButton();
        lblBackLogin = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();
        lblFondoPro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel.setMaximumSize(new java.awt.Dimension(900, 600));
        FondoPanel.setMinimumSize(new java.awt.Dimension(900, 600));
        FondoPanel.setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoInicio.setBackground(new java.awt.Color(51, 204, 255));
        FondoInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FondoInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar_Sesion.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Iniciar_Sesion.setForeground(new java.awt.Color(0, 0, 255));
        Iniciar_Sesion.setText("LogIn");
        FondoInicio.add(Iniciar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 39));

        txtUser.setToolTipText("username");
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        FondoInicio.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, 40));

        Usuario.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 51, 255));
        Usuario.setText("Username");
        FondoInicio.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 120, -1));

        Contraseña.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 51, 204));
        Contraseña.setText("Password");
        FondoInicio.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 17));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Stencil", 1, 16)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 51, 255));
        btnAceptar.setText("Login");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        FondoInicio.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, 50));

        No_Tienes_Cuenta.setFont(new java.awt.Font("Stencil", 1, 16)); // NOI18N
        No_Tienes_Cuenta.setForeground(new java.awt.Color(0, 51, 255));
        No_Tienes_Cuenta.setText("New?");
        FondoInicio.add(No_Tienes_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, 20));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        FondoInicio.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 160, 40));

        jlbCreateAccount.setBackground(new java.awt.Color(0, 0, 255));
        jlbCreateAccount.setFont(new java.awt.Font("Stencil", 1, 16)); // NOI18N
        jlbCreateAccount.setForeground(new java.awt.Color(102, 204, 255));
        jlbCreateAccount.setText("Register");
        jlbCreateAccount.setBorder(null);
        jlbCreateAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlbCreateAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jlbCreateAccountFocusLost(evt);
            }
        });
        jlbCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlbCreateAccountActionPerformed(evt);
            }
        });
        FondoInicio.add(jlbCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 20));

        lblBackLogin.setText("jLabel2");
        FondoInicio.add(lblBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 390));

        jPanel1.add(FondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 81, -1, 390));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, 40));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("General Hospital");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 25, 249, 36));

        lblBlue.setBackground(new java.awt.Color(51, 102, 255));
        lblBlue.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(lblBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 730, 60));
        jPanel1.add(lblFondoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        javax.swing.GroupLayout FondoPanelLayout = new javax.swing.GroupLayout(FondoPanel);
        FondoPanel.setLayout(FondoPanelLayout);
        FondoPanelLayout.setHorizontalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        FondoPanelLayout.setVerticalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jlbCreateAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbCreateAccountFocusGained
        // TODO add your handling code here:

        jlbCreateAccount.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_jlbCreateAccountFocusGained

    private void jlbCreateAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbCreateAccountFocusLost
        // TODO add your handling code here:

        Color color = new Color(51, 204, 255);
        jlbCreateAccount.setForeground(color);
    }//GEN-LAST:event_jlbCreateAccountFocusLost

    private void jlbCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlbCreateAccountActionPerformed
        // TODO add your handling code here:

        JFrameCreateUser user = new JFrameCreateUser();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlbCreateAccountActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String user = txtUser.getText();
        String password = txtPassword.getText();

        IUserDAO userSystem = Factory.getUserDAO();
        ILogIn loginSystem = Factory.getLogIn();

        String userType = userSystem.getUserTypeByUserAndPassword(user, password);

        if (userType != null) {
            switch (userType) {
                case "admin":

                    JFrameAdministrator frameAdministrator = new JFrameAdministrator(user, password);
                    frameAdministrator.setVisible(true);
                    this.dispose();
                    break;
                case "patient":
                    Long idPatient = loginSystem.validateUser(user, password);
                    JFrameInitialPatient frameInitialPatient = new JFrameInitialPatient(idPatient);
                    frameInitialPatient.setVisible(true);
                    this.dispose();
                    break;

                case "doctor":

                    Long idDoctor = loginSystem.validateUser(user, password);
                    JFrameInitialMedicos frameInitialMedicos = new JFrameInitialMedicos(idDoctor);
                    frameInitialMedicos.setVisible(true);
                    this.dispose();
                    break;

                default:

                    break;
            }
        } else {

            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPanel FondoInicio;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JLabel Iniciar_Sesion;
    private javax.swing.JLabel No_Tienes_Cuenta;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jlbCreateAccount;
    private javax.swing.JLabel lblBackLogin;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblFondoPro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}