package presentation;

import DAOs.UserDAO;
import javax.swing.JOptionPane;
import IDAOs.IUserDAO;
import DTOs.NewUserDTO;
import Tools.Pintar;

public class JFrameCreateUser extends javax.swing.JFrame {

    private NewUserDTO userDTOAdmin;

    /**
     * Creates new form JFrameCreateUser
     */
    public JFrameCreateUser() {
        initComponents();
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(jLabel2, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
        
        imagen.PintarImagen(lblBlue, "src/main/java/Fotos/abstract-template-blue-background-white-squares-free-vector.jpg");
        imagen.PintarImagen(lblBackLogin, "src/main/java/Fotos/abstract-blue-gradient-curved-shapes-on-white-background-free-vector.jpg");


    }

    public JFrameCreateUser(NewUserDTO userDTOAdmin) {

        initComponents();
        this.userDTOAdmin = userDTOAdmin;
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(jLabel2, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
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
        Iniciar_Sesion = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        Usuario4 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();
        lblBackLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar_Sesion.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Iniciar_Sesion.setForeground(new java.awt.Color(51, 102, 255));
        Iniciar_Sesion.setText("Register User");
        FondoPanel.add(Iniciar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 284, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(51, 102, 255));
        btnAceptar.setText("REGISTER");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        FondoPanel.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 150, 50));

        Usuario4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        Usuario4.setForeground(new java.awt.Color(51, 102, 255));
        Usuario4.setText("Password");
        FondoPanel.add(Usuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));
        FondoPanel.add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 220, 40));

        Usuario.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        Usuario.setForeground(new java.awt.Color(51, 102, 255));
        Usuario.setText("Curp");
        FondoPanel.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        FondoPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 220, 40));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(51, 102, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        FondoPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 90, 40));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("General Hospital");
        FondoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 249, 36));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        lblBlue.setBackground(new java.awt.Color(51, 102, 255));
        lblBlue.setForeground(new java.awt.Color(51, 102, 255));
        FondoPanel.add(lblBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));
        FondoPanel.add(lblBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 310, 390));
        FondoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 840, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

        NewUserDTO userDTO = new NewUserDTO();
        userDTO.setCurp(txtCurp.getText());
        userDTO.setPassword(txtPassword.getText());

        IUserDAO userDAO = new UserDAO();
        if(txtCurp.getText().isBlank()|| txtPassword.getText().isBlank()){
            
            JOptionPane.showMessageDialog(this, "Please, add information in the emptys fiels");
            
        }else{
            
            if (userDAO.existUser(userDTO.getCurp())) {

                JOptionPane.showMessageDialog(this, "The username is already in use");

            } else {

                if (userDTOAdmin == null) {

                    JFrameRegisterPatient frameRegisterPatient = new JFrameRegisterPatient(userDTO);
                    frameRegisterPatient.setVisible(true);
                    this.dispose();

                } else {
                    JFrameRegisterPatient frameRegisterPatient = new JFrameRegisterPatient(userDTO, userDTOAdmin);
                    frameRegisterPatient.setVisible(true);
                    this.dispose();
                }
            }
            
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        if (userDTOAdmin == null) {
            JFrameLogin login = new JFrameLogin();
            login.setVisible(true);
            this.dispose();
        } else {
            JFrameAdministrator frameAdministrator = new JFrameAdministrator(userDTOAdmin.getCurp(), userDTOAdmin.getPassword());
            frameAdministrator.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFrameCreateUser().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JLabel Iniciar_Sesion;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario4;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBackLogin;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
