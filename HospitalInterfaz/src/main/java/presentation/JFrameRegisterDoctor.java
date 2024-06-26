package presentation;

import DAOs.DoctorDAO;
import DAOs.UserDAO;
import DTOs.NewDoctorDTO;
import javax.swing.JOptionPane;
import IDAOs.IUserDAO;
import DTOs.NewUserDTO;
import IDAOs.IDoctorDAO;
import POJOs.DoctorPOJO;
import POJOs.UserPOJO;
import Tools.Pintar;

public class JFrameRegisterDoctor extends javax.swing.JFrame {

    private NewUserDTO userDTOAdmin;

    /**
     * Creates new form JFrameRegisterDoctor
     */
    public JFrameRegisterDoctor(NewUserDTO userDTOAdmin) {
        initComponents();
        this.userDTOAdmin = userDTOAdmin;
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

        FondoPanel = new javax.swing.JPanel();
        FondoAzul = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSeconName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnConfirm1 = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtMedicalCart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        lblBackLogin = new javax.swing.JLabel();
        lblWithe = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoAzul.setBackground(new java.awt.Color(0, 153, 255));
        FondoAzul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FondoAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        FondoPanel.add(FondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Register Doctor");
        FondoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtNames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNames.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamesActionPerformed(evt);
            }
        });
        txtNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamesKeyReleased(evt);
            }
        });
        FondoPanel.add(txtNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("Names");
        FondoPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("First Last Name");
        FondoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("Second Last Name");
        FondoPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        txtSeconName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSeconName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtSeconName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeconNameActionPerformed(evt);
            }
        });
        txtSeconName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeconNameKeyReleased(evt);
            }
        });
        FondoPanel.add(txtSeconName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 110, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Medicalcart");
        FondoPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(51, 102, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        FondoPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 120, 40));

        btnConfirm1.setBackground(new java.awt.Color(255, 255, 255));
        btnConfirm1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnConfirm1.setForeground(new java.awt.Color(51, 102, 255));
        btnConfirm1.setText("ACCEPT");
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });
        FondoPanel.add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 120, 40));

        txtFirstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFirstName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        FondoPanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, -1));

        txtMedicalCart.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMedicalCart.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtMedicalCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalCartActionPerformed(evt);
            }
        });
        FondoPanel.add(txtMedicalCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 160, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Password");
        FondoPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("User");
        FondoPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        txtUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUser.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        FondoPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 140, 40));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("Specialization");
        FondoPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" NONE",
            "SURGERY",
            "PSYCHIATRY",
            "ANESTHIOLOGY",
            "FAMILY",
            "CARDIOLOGY",
            "PEDIATRIC"}));
comboBox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboBoxActionPerformed(evt);
    }
    });
    FondoPanel.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, -1));
    FondoPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 140, 40));
    FondoPanel.add(lblBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 200, 180));
    FondoPanel.add(lblWithe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 610, 160));
    FondoPanel.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 850, 520));

    lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    FondoPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

    jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 255));
    jLabel1.setText("General Hospital");
    FondoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 249, 36));

    lblBlue.setBackground(new java.awt.Color(51, 102, 255));
    lblBlue.setForeground(new java.awt.Color(51, 102, 255));
    FondoPanel.add(lblBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamesActionPerformed

    private void txtSeconNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeconNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeconNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:

        JFrameAdministrator frameAdministrator = new JFrameAdministrator(userDTOAdmin.getCurp(), userDTOAdmin.getPassword());
        frameAdministrator.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        // TODO add your handling code here:

        String names = txtNames.getText();
        String firstName = txtFirstName.getText();
        String secondName = txtSeconName.getText();
        String medicalCart = txtMedicalCart.getText();
        String specialization = (String) comboBox.getSelectedItem();
        String user = txtUser.getText();
        String password = txtPassword.getText();

        if (names.isEmpty() || firstName.isEmpty() || secondName.isEmpty()
                || medicalCart.isEmpty() || user.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please, add information in the empty fields", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        if (!names.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+") || !firstName.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ]+") || !secondName.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ]+")) {
            JOptionPane.showMessageDialog(null, "Names can only contain leters", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {

            NewDoctorDTO doctorDTO = new NewDoctorDTO(
                    names,
                    firstName,
                    secondName,
                    specialization,
                    medicalCart);

            doctorDTO.setSpecialization(specialization);

            IDoctorDAO doctorDAO = new DoctorDAO();

            IUserDAO userDAO = new UserDAO();

            if (userDAO.existUser(user)) {

                JOptionPane.showMessageDialog(this, "The username is already in use");

            } else {

                if (doctorDAO.searchByMedicart(doctorDTO.getMedicalCart()) == null) {
                    doctorDAO.registerDoctor(doctorDAO.DtoToEntity(doctorDTO));
                    DoctorPOJO doctorPOJO = doctorDAO.searchByMedicart(doctorDTO.getMedicalCart());
                    NewUserDTO userDTO = new NewUserDTO(user, password, "DOCTOR", doctorPOJO.getId());
                    UserPOJO usuarioPOJO = userDAO.DtoToEntity(userDTO);
                    userDAO.registerUser(usuarioPOJO);
                    JFrameAdministrator frameAdministrator = new JFrameAdministrator(userDTOAdmin.getCurp(), userDTOAdmin.getPassword());
                    frameAdministrator.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "The medicalCart is already in use");
                }

            }

        }

    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtMedicalCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalCartActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed

    }//GEN-LAST:event_comboBoxActionPerformed

    private void txtNamesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamesKeyReleased
        // TODO add your handling code here:
        if (!txtNames.getText().matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Names can only contain leters", "Error", JOptionPane.INFORMATION_MESSAGE);
            txtNames.setText("");
        }
        
    }//GEN-LAST:event_txtNamesKeyReleased

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        // TODO add your handling code here:
        if(!txtFirstName.getText().matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+")){
            JOptionPane.showMessageDialog(null, "First name can only contain leters", "Error", JOptionPane.INFORMATION_MESSAGE);
            txtFirstName.setText("");
        }
        
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtSeconNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeconNameKeyReleased
        // TODO add your handling code here:
        
        if(!txtSeconName.getText().matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+")){
            JOptionPane.showMessageDialog(null, "Second name can only contain leters", "Error", JOptionPane.INFORMATION_MESSAGE);
            txtSeconName.setText("");
        }
        
    }//GEN-LAST:event_txtSeconNameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBackLogin;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblWithe;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtMedicalCart;
    private javax.swing.JTextField txtNames;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSeconName;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
