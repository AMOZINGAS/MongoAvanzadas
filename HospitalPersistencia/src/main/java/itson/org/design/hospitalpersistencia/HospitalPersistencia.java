package itson.org.design.hospitalpersistencia;

import DAOs.AdministratorDAO;
import IDAOs.IAdministratorDAO;
import POJOs.AdministratorPOJO;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class HospitalPersistencia {

    public static void main(String[] args) {
//
//        IAdministratorDAO administrator = new AdministratorDAO();
//        AdministratorPOJO administratorPOJO = new AdministratorPOJO();
//        administratorPOJO.setName("ADMIN");
//        administrator.registerAdministrator(administratorPOJO);
        
//        Calendar calendar = Calendar.getInstance();
//        calendar.getTime();
//        Date date = new Date();
//        calendar.setTime(date);
        
        /*
        //Probando que guarde adecuadamente
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connectionPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(2002, 06, 06);

        PatientEntity patient = new PatientEntity("Gabino ",
                "Pom",
                "Gerac",
                birthDate,
                "M",
                "IIIII",
                "66789417",
                "644168",
                "Pto. Cabos San Lucas",
                "Oeste",
                85900);

        em.persist(patient);
        em.getTransaction().commit();
        em.close();
         */
        // Agrega Persona y Usuario
        /*
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1980, 04, 15);

        NewPatientDTO patientDTO = new NewPatientDTO(
                "Teresa ",
                "Vazquez",
                "Montoya",
                birthDate,
                "M",
                "EEEEEE",
                "984841",
                "66475126",
                "Nuevo Leon",
                "Centro",
                85900);

        IPatientDAO patientDAO = PatientDAO.getInstance();
        patientDAO.registerPatient(patientDTO);

        NewUserDTO userDTO = new NewUserDTO();
        userDTO.setPassword("PANA");
        userDTO.setUser("pana");
        userDTO.setPatientDTO(patientDTO);

        IUserDAO userDAO = UserDAO.getInstance();
        userDAO.registerUser(userDTO);
         */
 /*
        
        //Agregar Doctor
        NewDoctorDTO doctorDTO = new NewDoctorDTO(
                "Carlos",
                "Perez",
                "Lopez",
                "Cardiologia",
                "1231312"
        );

        
        
        IDoctorDAO doctorDAO = DoctorDAO.getInstance();
        doctorDAO.registerDoctor(doctorDTO);
         */
 /*
        IPatientDAO patientD = Factory.getPatientDAO();
        PatientEntity patient = patientD.searchPatientByCurp("DDDDD");

        ExistentPatientDTO patientDTO = new ExistentPatientDTO();
        patientDTO = patientD.EntityToDto(patient);

        IDoctorDAO doctorD = Factory.getDoctorDAO();
        String medicart = "1231312";
        DoctorEntity doctor = doctorD.searchByMedicart(medicart);

        /*
        DoctorEntity doctor = doctorD.serachById(Long.MIN_VALUE);
         */
 /*
        ExistentDoctorDTO doctorDTO = new ExistentDoctorDTO();
        doctorDTO.setId(doctor.getId());
        doctorDTO.setFirstName(doctor.getNames());
        doctorDTO.setFirstName(doctor.getFirstLastName());
        doctorDTO.setSecondName(doctor.getSecondLastName());
        doctorDTO.setMedicalCart(doctor.getMedicalCart());

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(1980, 04, 15);

        NewAppointmentDTO appointment = new NewAppointmentDTO(
                doctorDTO,
                patientDTO,
                birthDate,
                AppointmentStatus.ACTIVE
        );

        IAppointmentManager appointmentManager = Factory.getAppointmentManager();

        appointmentManager.createAppointment(appointment);
         */
//        newAdministratorDTO administrator = new newAdministratorDTO();
//        administrator.setName("Jullian");
//
//        IAdministratorDAO admin = Factory.getAdministratorDAO();
//        admin.registerAdministrator(administrator);
//
//        IUserDAO user = Factory.getUserDAO();
//
//        NewUserDTO newUserDTO = new NewUserDTO("Jullian", "Jullian", administrator);
//        user.registerAdminUser(administrator, newUserDTO);

        /*
        //Agregar Doctores para pruebas
        NewDoctorDTO doctorDTO = new NewDoctorDTO(
                "Carlos",
                "Perez",
                "Lopez",
                "Cardiologia",
                "AAA"
        );

        NewDoctorDTO doctorDTO2 = new NewDoctorDTO(
                "Ana",
                "López",
                "Sánchez",
                "Dermatologia",
                "BBB"
        );

        NewDoctorDTO doctorDTO3 = new NewDoctorDTO(
                "Ana",
                "López",
                "Sánchez",
                "Dermatología",
                "CCC"
        );

        NewDoctorDTO doctorDTO4 = new NewDoctorDTO(
                "Juan",
                "Martín",
                "Pérez",
                "Oftalmología",
                "DDD"
        );
        NewDoctorDTO doctorDTO5 = new NewDoctorDTO(
                "Carla",
                "Ruiz",
                "Gómez",
                "Psiquiatría",
                "EEE"
        );

        IDoctorDAO doctorDAO = DoctorDAO.getInstance();
        doctorDAO.registerDoctor(doctorDTO);
        doctorDAO.registerDoctor(doctorDTO2);
        doctorDAO.registerDoctor(doctorDTO3);
        doctorDAO.registerDoctor(doctorDTO4);
        doctorDAO.registerDoctor(doctorDTO5);

         */
 /*
        IDoctorDAO doctorDAO = Factory.getDoctorDAO();
        List<ExistentDoctorDTO> doctores;
        doctores = doctorDAO.searchBySpecialization(Specialization.FAMILY); // Pasar la enumeración Specialization en lugar de una cadena de texto

        for (ExistentDoctorDTO doctor : doctores) {
            System.out.println("ID: " + doctor.getId());
            System.out.println("Nombre: " + doctor.getName());
            System.out.println("Primer Apellido: " + doctor.getFirstName());
            System.out.println("Segundo Apellido: " + doctor.getSecondName());
            System.out.println("Especialización: " + doctor.getSpecialization());
            System.out.println("Carta Médica: " + doctor.getMedicalCart());
            System.out.println("----------------------------------");
        }

         */
//        AppointmentManager appointmentManager = AppointmentManager.getInstance();

        /*
        // Supongamos que tienes el ID del paciente
        Long patientId = 1L; // Reemplaza con el ID del paciente deseado
        
        List<ExistentAppointmentDTO> appointments = appointmentManager.findAppointmentsByPatientId(patientId);
        
        // Mostrar citas encontradas
        System.out.println("Citas asociadas al paciente con ID " + patientId + ":");
        for (ExistentAppointmentDTO appointment : appointments) {
            System.out.println(appointment);
        }

         */
        // Assuming you have a patient ID
//        Long patientId = 1L; // Replace 123L with the actual patient ID
//
//        // Retrieve appointments for the specified patient ID
//        List<ExistentAppointmentDTO> appointments = appointmentManager.findAppointmentsByPatientId(patientId);
//
//        // Print the retrieved appointments
//        for (ExistentAppointmentDTO appointment : appointments) {
//
//            ExistentDoctorDTO doctor = appointment.getDoctor();
//            System.out.println("Appointment ID: " + appointment.getId());
//            System.out.println("Doctor: " + doctor.getName()); // Assuming getNames() returns doctor's name
//            System.out.println("Patient: " + appointment.getPatient().getName()); // Assuming getNames() returns patient's name
//            System.out.println("Appointment Date: " + appointment.getAppointmentDate());
//            System.out.println("Status: " + appointment.getStatus());
//            System.out.println("Note: " + appointment.getNote());
//            System.out.println("----------------------------------");
//        }
    }
}
