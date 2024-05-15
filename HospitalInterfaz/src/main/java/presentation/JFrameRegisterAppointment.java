package presentation;

import Controlers.AppointmentStatus;
import DAOs.AppointmentManager;
import DAOs.DoctorDAO;
import DAOs.PatientDAO;
import IDAOs.IAppointmentManager;
import DTOs.NewAppointmentDTO;
import DTOs.ExistentDoctorDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import DTOs.ExistentPatientDTO;
import IDAOs.IDoctorDAO;
import com.toedter.calendar.JDateChooser;
import java.awt.Point;
import IDAOs.IPatientDAO;
import POJOs.DoctorPOJO;
import POJOs.PatientPOJO;
import Tools.Pintar;

public class JFrameRegisterAppointment extends javax.swing.JFrame {

    private ExistentPatientDTO paciente;
    private ExistentDoctorDTO doctorP1;
    private List<ExistentDoctorDTO> doctores;
    private ExistentDoctorDTO existentDoctorDTO;
    private ExistentPatientDTO existentPateintDTO;
    private JDateChooser dateChooser;
    private List<Calendar> limitDaysSelected;
    private List<Calendar> limitDaysParner;

    public JFrameRegisterAppointment(NewAppointmentDTO appointmentDTO, ExistentDoctorDTO doctorDTO) {

        this.doctorP1 = doctorDTO;
        initComponents();
        dateChooser();
        lblSpecilaization.setVisible(false);
        cbxSpecialization.setVisible(false);
        lblDate.setVisible(false);
        cmbDoctor.setVisible(false);
        lblDoctors1.setVisible(false);
        lblPatient.setText("Patients");
        limitDaysSelected = new ArrayList<>();
        patientList();
        for(int i = 0; i < cmbPatient.getItemCount(); i ++){
            cmbPatient.setSelectedIndex(i);
            if(appointmentDTO.getPatient().equals((ExistentPatientDTO)cmbPatient.getSelectedItem())){
                
                cmbPatient.setSelectedIndex(i);
                break;
            }
            
        }
        txtNota.setText(appointmentDTO.getNote());
        dateChooser.setCalendar(appointmentDTO.getAppointmentDate());
        cmbTime.setSelectedIndex(indexComboBox(dateChooser.getCalendar().get(Calendar.HOUR_OF_DAY)));
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(lblFondoPro, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
        imagen.PintarImagen(lblBlue, "src/main/java/Fotos/abstract-template-blue-background-white-squares-free-vector.jpg");
        imagen.PintarImagen(lblBackLogin, "src/main/java/Fotos/abstract-blue-gradient-curved-shapes-on-white-background-free-vector.jpg");

    }
    

    public JFrameRegisterAppointment(NewAppointmentDTO appointmentDTO, ExistentPatientDTO patientDTO) {
        this.paciente = patientDTO;
        initComponents();
        dateChooser();
//        limitarFecha();
        txtNota.setText(appointmentDTO.getNote());
        
        cbxSpecialization.setSelectedItem(appointmentDTO.getDoctor().getSpecialization());
        cmbDoctor.setSelectedItem(appointmentDTO.getDoctor());
        
        
        
        dateChooser.setCalendar(appointmentDTO.getAppointmentDate());
        
        lblDate.setVisible(false);
        cmbPatient.setVisible(false);
        lblPatient.setVisible(false);
        for(int i = 0; i < cbxSpecialization.getItemCount(); i ++){
            cbxSpecialization.setSelectedIndex(i);
            String specialization = (String)cbxSpecialization.getSelectedItem();
            if(appointmentDTO.getDoctor().getSpecialization().equals(specialization)){
                
                cbxSpecialization.setSelectedIndex(i);
                break;
            }
            
        }
        for(int i = 0; i < cmbDoctor.getItemCount(); i ++){
            cmbDoctor.setSelectedIndex(i);
            if(appointmentDTO.getDoctor().equals((ExistentDoctorDTO)cmbDoctor.getSelectedItem())){
                
                cmbDoctor.setSelectedIndex(i);
                break;
            }
            
        }
        cmbTime.setSelectedIndex(indexComboBox(dateChooser.getCalendar().get(Calendar.HOUR_OF_DAY)));
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(lblFondoPro, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
        imagen.PintarImagen(lblBlue, "src/main/java/Fotos/abstract-template-blue-background-white-squares-free-vector.jpg");
        imagen.PintarImagen(lblBackLogin, "src/main/java/Fotos/abstract-blue-gradient-curved-shapes-on-white-background-free-vector.jpg");

        
    }

    public JFrameRegisterAppointment(ExistentPatientDTO paciente) {
        this.paciente = paciente;
        initComponents();
        dateChooser();
//        limitarFecha();
        limitDaysSelected = new ArrayList<>();
        cmbPatient.setVisible(false);
        lblDate.setVisible(false);
        lblPatient.setVisible(false);
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(lblFondoPro, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
        imagen.PintarImagen(lblBlue, "src/main/java/Fotos/abstract-template-blue-background-white-squares-free-vector.jpg");
        imagen.PintarImagen(lblBackLogin, "src/main/java/Fotos/abstract-blue-gradient-curved-shapes-on-white-background-free-vector.jpg");

        
    }

    public JFrameRegisterAppointment(ExistentDoctorDTO doctor) {
        this.doctorP1 = doctor;
        initComponents();
        dateChooser();
//        limitarFecha();
        cmbDoctor.setVisible(false);
        lblSpecilaization.setVisible(false);
        cbxSpecialization.setVisible(false);
        lblDoctors1.setVisible(false);
        
        lblPatient.setText("Patients");
        limitDaysSelected = new ArrayList<>();
        patientList();
        lblDate.setVisible(false);
        Pintar imagen = new Pintar();
        imagen.PintarImagen(lblLogo, "src/main/java/Fotos/FondoLogin.jpg");
        imagen.PintarImagen(lblFondoPro, "src/main/java/Fotos/pngtree-image-of-futuristic-medical-hospital-room-picture-image_2736851.jpg");
        imagen.PintarImagen(lblBlue, "src/main/java/Fotos/abstract-template-blue-background-white-squares-free-vector.jpg");
        imagen.PintarImagen(lblBackLogin, "src/main/java/Fotos/abstract-blue-gradient-curved-shapes-on-white-background-free-vector.jpg");

    }

    public void patientList() {

        IPatientDAO patientDAO = new PatientDAO();
        List<ExistentPatientDTO> patientList = patientDAO.findAllPatient();
        cmbPatient.removeAllItems();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        cmbPatient.setModel(model);
        for (ExistentPatientDTO patient : patientList) {
            model.addElement(patient);
        }
        this.cmbPatient.setVisible(true);

    }

    public void dateChooser() {

        this.dateChooser = new JDateChooser();
        this.dateChooser.setBounds(this.lblDate.getBounds());
        this.jPanel1.add(dateChooser);

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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbDoctor = new javax.swing.JComboBox<>();
        lblPatient = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lblTime = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        cbxSpecialization = new javax.swing.JComboBox<>();
        lblSpecilaization = new javax.swing.JLabel();
        lblDoctors1 = new javax.swing.JLabel();
        cmbPatient = new javax.swing.JComboBox<>();
        cmbTime = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblBlue = new javax.swing.JLabel();
        lblBackLogin = new javax.swing.JLabel();
        lblFondoPro = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Register Appointment");
        FondoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 62, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 130, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 130, 50));

        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cmbDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDoctorMouseClicked(evt);
            }
        });
        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
            }
        });
        FondoPanel.add(cmbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 110, -1));

        lblPatient.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(51, 102, 255));
        lblPatient.setText("Patients");
        FondoPanel.add(lblPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));
        FondoPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        lblTime.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(51, 102, 255));
        lblTime.setText("Time");
        FondoPanel.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("Note...");
        FondoPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });
        FondoPanel.add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 320, 40));

        cbxSpecialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FAMILY",   "PEDIATRIC",
            "SURGERY",
            "PSYCHIATRY",
            "ANESTHIOLOGY",
            "CARDIOLOGY"}));
cbxSpecialization.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbxSpecializationActionPerformed(evt);
    }
    });
    FondoPanel.add(cbxSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 110, -1));

    lblSpecilaization.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    lblSpecilaization.setForeground(new java.awt.Color(51, 102, 255));
    lblSpecilaization.setText("Specialization");
    FondoPanel.add(lblSpecilaization, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

    lblDoctors1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    lblDoctors1.setForeground(new java.awt.Color(51, 102, 255));
    lblDoctors1.setText("Doctors");
    FondoPanel.add(lblDoctors1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

    cmbPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
    cmbPatient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbPatientActionPerformed(evt);
        }
    });
    FondoPanel.add(cmbPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 110, -1));

    cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
    FondoPanel.add(cmbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 117, 30));

    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(51, 102, 255));
    jLabel14.setText("Date ");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jLabel14)
            .addGap(4, 4, 4)
            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    FondoPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 160, 80));

    lblBlue.setBackground(new java.awt.Color(51, 102, 255));
    lblBlue.setForeground(new java.awt.Color(51, 102, 255));
    FondoPanel.add(lblBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 60));
    FondoPanel.add(lblBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 400, 300));
    FondoPanel.add(lblFondoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 840, 520));

    lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    FondoPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

    jLabel3.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 51, 255));
    jLabel3.setText("General Hospital");
    FondoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 249, 36));

    getContentPane().add(FondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int hour(){
        
        int index = cmbTime.getSelectedIndex();
        
        return switch (index) {
            case 0 -> 10;
            case 1 -> 11;
            case 2 -> 12;
            case 3 -> 13;
            case 4 -> 14;
            case 5 -> 15;
            case 6 -> 16;
            case 7 -> 17;
            case 8 -> 18;
            case 9 -> 19;
            case 10 -> 20;
            case 11 -> 21;
            case 12 -> 22;
            case 13 -> 23;
            default -> 4444;
        };
        
    }
    
    public int indexComboBox(int hour){
        
        return switch (hour) {
            case 10 -> 0;
            case 11 -> 1;
            case 12 -> 2;
            case 13 -> 3;
            case 14 -> 4;
            case 15 -> 5;
            case 16 -> 6;
            case 17 -> 7;
            case 18 -> 8;
            case 19 -> 9;
            case 20 -> 10;
            case 21 -> 11;
            case 22 -> 12;
            case 23 -> 13;
            default -> 4554;
        };
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        
        limitDaysSelected();
        
        Calendar dateWithTime = dateChooser.getCalendar();
        
        int date = dateWithTime.get(Calendar.DATE);
        dateWithTime.set(Calendar.HOUR_OF_DAY, hour());
        dateWithTime.set(Calendar.MINUTE, 0);
        dateWithTime.set(Calendar.SECOND, 0);
        dateWithTime.set(Calendar.DATE, date);
        dateChooser.setCalendar(dateWithTime);
        
        
        for (Calendar calendar : limitDaysSelected) {

            if (dateChooser.getCalendar().get(Calendar.MONTH) == calendar.get(Calendar.MONTH)) {

                if (dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)) {

                    if (dateChooser.getCalendar().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)) {
                        
                        if(dateChooser.getCalendar().get(Calendar.HOUR) == calendar.get(Calendar.HOUR)){
                            
                            JOptionPane.showMessageDialog(this, "This date has already been set aside");
                            return;
                        }
                    }
                }
            }
            
        }
        limitDaysParner();
        for (Calendar calendar : limitDaysParner) {

            if (dateChooser.getCalendar().get(Calendar.MONTH) == calendar.get(Calendar.MONTH)) {

                if (dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)) {

                    if (dateChooser.getCalendar().get(Calendar.YEAR) == calendar.get(Calendar.YEAR)) {
                        
                        if(dateChooser.getCalendar().get(Calendar.HOUR) == calendar.get(Calendar.HOUR)){
                            
                            JOptionPane.showMessageDialog(this, "You already have an appointment that day");
                            return;
                        }
                    }
                }
            }
            
        }
        if (doctorP1 == null) {

            createUser();
            System.out.println("Doctor: " + existentDoctorDTO);
            NewAppointmentDTO appointmentDTO = new NewAppointmentDTO(existentDoctorDTO, paciente, dateChooser.getCalendar(), "ACTIVE", txtNota.getText());
//            NewAppointmentDTO newAppointmentDTO = new NewAppointmentDTO();
//            newAppointmentDTO.setDoctor(existentDoctorDTO);
//            newAppointmentDTO.setPatient(paciente);
//            newAppointmentDTO.setStatus("ACTIVE");
//            newAppointmentDTO.setAppointmentDate(dateChooser.getCalendar());
//            newAppointmentDTO.setNote(txtNota.getText());
            
            JFrameConfirmAppointment confirm = new JFrameConfirmAppointment(appointmentDTO, paciente);
            confirm.setVisible(true);
            this.dispose();

        } else {

            createUser();
            NewAppointmentDTO newAppointmentDTO = new NewAppointmentDTO();
            newAppointmentDTO.setDoctor(doctorP1);
            newAppointmentDTO.setPatient(existentPateintDTO);
            newAppointmentDTO.setStatus("ACTIVE");
            newAppointmentDTO.setAppointmentDate(dateChooser.getCalendar());
            newAppointmentDTO.setNote(txtNota.getText());

            JFrameConfirmAppointment confirm = new JFrameConfirmAppointment(newAppointmentDTO, doctorP1);
            confirm.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (doctorP1 == null) {

            JFrameInitialPatient pat = new JFrameInitialPatient(paciente.getId());
            pat.setVisible(true);
            this.dispose();

        } else {

            JFrameInitialMedicos medic = new JFrameInitialMedicos(doctorP1.getId());
            medic.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void createUser(){
        
        if (doctorP1 == null) {
            existentDoctorDTO = (ExistentDoctorDTO) cmbDoctor.getSelectedItem();
        } else {
            existentPateintDTO = (ExistentPatientDTO) cmbPatient.getSelectedItem();
        }
        
    }
    
    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed

        createUser();
    }//GEN-LAST:event_cmbDoctorActionPerformed

    private void cbxSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSpecializationActionPerformed

        if (doctorP1 == null) {
            
            IDoctorDAO doctorDAO = new DoctorDAO();

            String selectedSpecialization = (String) cbxSpecialization.getSelectedItem();
            doctores = doctorDAO.searchBySpecialization(selectedSpecialization);
            cmbDoctor.removeAllItems();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            cmbDoctor.setModel(model);
            for (ExistentDoctorDTO doctor : doctores) {
                model.addElement(doctor);
            }
            this.cmbDoctor.setVisible(true);
        }
    }//GEN-LAST:event_cbxSpecializationActionPerformed

    public void limitDaysParner(){
        
        IAppointmentManager appointmentManager = new AppointmentManager();
        
        if(doctorP1 == null){
            
            IPatientDAO patientDAO = new PatientDAO();
            PatientPOJO patientEntity = patientDAO.ExistentDtoToEntity(paciente);
            if(appointmentManager.findLimitDays(patientEntity) != null){
                
                limitDaysParner = appointmentManager.findLimitDays(patientEntity);
                
            }
            
        }else{
            
            IDoctorDAO doctorDAO = new DoctorDAO();
            DoctorPOJO doctorEntity = doctorDAO.ExistentDtoToEntity(doctorP1);
            if(appointmentManager.findLimitDays(doctorEntity) != null){
                
                limitDaysParner = appointmentManager.findLimitDays(doctorEntity);
                
            }
            
        }
        
    }
    
    public void limitDaysSelected() {

        IAppointmentManager appointmentManager = new AppointmentManager();
        if (doctorP1 == null) {
            IDoctorDAO doctorDAO = new DoctorDAO();
            ExistentDoctorDTO existentDoctor = (ExistentDoctorDTO) cmbDoctor.getSelectedItem();
            DoctorPOJO doctorEntity = doctorDAO.ExistentDtoToEntity(existentDoctor);
            if (appointmentManager.findLimitDays(doctorEntity) != null) {
                limitDaysSelected = appointmentManager.findLimitDays(doctorEntity);
            }
        } else {
            IPatientDAO patientDAO = new PatientDAO();
            ExistentPatientDTO existentPatientDTO = (ExistentPatientDTO) cmbPatient.getSelectedItem();
            PatientPOJO patientEntity = patientDAO.findPatient(existentPatientDTO.getId());
            if (appointmentManager.findLimitDays(patientEntity) != null) {
                limitDaysSelected = appointmentManager.findLimitDays(patientEntity);
            }
        }
    }

    private void cmbDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDoctorMouseClicked
        // TODO add your handling code 
        if (doctorP1 == null) {
            if (cmbDoctor.getSize() != null) {
                limitDaysSelected();
            }
        }
    }//GEN-LAST:event_cmbDoctorMouseClicked

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaActionPerformed

    private void cmbPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPatientActionPerformed

//    public void limitarFecha() {
//        Calendar fechaMinima = Calendar.getInstance();
//        fechaMinima.set(Calendar.DATE, 1);
//        Date minimo = fechaMinima.getTime();
//
//        Calendar fechaMaxima = Calendar.getInstance();
//        fechaMaxima.add(Calendar.YEAR, 2);
//        Date maximo = fechaMaxima.getTime();
//
//        dateChooser.setSelectableDateRange(minimo, maximo);
//
//    }

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
//            java.util.logging.Logger.getLogger(JFrameConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFrameConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFrameConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFrameConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFrameConfirmAppointment().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JComboBox<String> cbxSpecialization;
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JComboBox<String> cmbPatient;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblBackLogin;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctors1;
    private javax.swing.JLabel lblFondoPro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblSpecilaization;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
