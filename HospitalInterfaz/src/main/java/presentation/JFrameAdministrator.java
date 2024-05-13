package presentation;

import DAOs.AdministratorDAO;
import DAOs.UserDAO;
import IDAOs.IAdministratorDAO;
import DTOs.NewAdministratorDTO;
import IDAOs.IUserDAO;
import DTOs.NewUserDTO;
import POJOs.AdministratorPOJO;
import POJOs.UserPOJO;


public class JFrameAdministrator extends javax.swing.JFrame {

    private NewUserDTO userDTOAdmin;

    /**
     * Creates new form JFrameAdministrator
     */
    public JFrameAdministrator(String user, String password) {
        initComponents();
        NewAdministratorDTO newAdministratorDTO = new NewAdministratorDTO();
        IUserDAO userDAO = new UserDAO();
        UserPOJO userEntity = userDAO.findUserByUserPassword(user, password);
        IAdministratorDAO administratorDAO = new AdministratorDAO();
        
        AdministratorPOJO userAdministrator = administratorDAO.findAdministratorById(userEntity.getId());
        newAdministratorDTO.setName(userAdministrator.getName());
        this.userDTOAdmin = new NewUserDTO(user, password, "ADMINISTRATOR", userAdministrator.getId());

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
        FondoAzul5 = new javax.swing.JPanel();
        Hospital_General5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPanel5.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoAzul5.setBackground(new java.awt.Color(0, 153, 255));
        FondoAzul5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Hospital_General5.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Hospital_General5.setText("Hospital General");

        javax.swing.GroupLayout FondoAzul5Layout = new javax.swing.GroupLayout(FondoAzul5);
        FondoAzul5.setLayout(FondoAzul5Layout);
        FondoAzul5Layout.setHorizontalGroup(
            FondoAzul5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzul5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Hospital_General5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
        );
        FondoAzul5Layout.setVerticalGroup(
            FondoAzul5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzul5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Hospital_General5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FondoPanel5.add(FondoAzul5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton1.setText("Register Pacient");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        FondoPanel5.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 136, 46));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administrator");
        FondoPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 44));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Register Doctors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 46));

        jButton2.setText("Signout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FondoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FondoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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
    private javax.swing.JPanel FondoAzul5;
    private javax.swing.JPanel FondoPanel5;
    private javax.swing.JLabel Hospital_General5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
