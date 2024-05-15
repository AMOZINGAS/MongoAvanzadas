package presentation;

import DAOs.AdministratorDAO;
import DAOs.UserDAO;
import IDAOs.IAdministratorDAO;
import DTOs.NewAdministratorDTO;
import IDAOs.IUserDAO;
import DTOs.NewUserDTO;
import POJOs.AdministratorPOJO;
import POJOs.UserPOJO;
import Tools.Pintar;


public class JFrameAdministrator extends javax.swing.JFrame {

    private NewUserDTO userDTOAdmin;

    /**
     * Creates new form JFrameAdministrator
     */
    public JFrameAdministrator(String user, String password) {
        initComponents();
        NewAdministratorDTO newAdministratorDTO = new NewAdministratorDTO();
        IUserDAO userDAO = new UserDAO();
        UserPOJO userPOJO = userDAO.findUserByUserPassword(user, password);
        IAdministratorDAO administratorDAO = new AdministratorDAO();
        System.out.println(userPOJO);
        AdministratorPOJO userAdministrator = administratorDAO.findAdministratorById(userPOJO.getIdOwner());
        newAdministratorDTO.setName(userAdministrator.getName());
        this.userDTOAdmin = new NewUserDTO(user, password, "ADMINISTRATOR", userAdministrator.getId());
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(lblFondo, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
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

        FondoPanel5 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblBackLogin = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPanel5.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(51, 102, 255));
        jToggleButton1.setText("REGISTER PATIENT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        FondoPanel5.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 180, 46));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Administrator");
        FondoPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 44));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("REGISTER DOCTOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 46));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("SIGNOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        FondoPanel5.add(lblBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 290, 320));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoPanel5.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("General Hospital");
        FondoPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 249, 36));

        lblBlue.setBackground(new java.awt.Color(51, 102, 255));
        lblBlue.setForeground(new java.awt.Color(51, 102, 255));
        FondoPanel5.add(lblBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));
        FondoPanel5.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 860, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrameRegisterDoctor frameRegisterDoctor = new JFrameRegisterDoctor(userDTOAdmin);
        frameRegisterDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        JFrameCreateUser createUser = new JFrameCreateUser(userDTOAdmin);
        createUser.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrameLogin frameLogin = new JFrameLogin();
        frameLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
//            java.util.logging.Logger.getLogger(JFrameAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFrameAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFrameAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFrameAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFrameAdministrator().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPanel5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblBackLogin;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
