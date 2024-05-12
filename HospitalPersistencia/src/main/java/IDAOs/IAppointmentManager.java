package IDAOs;

import DAOs.AppointmentManager;
import DTOs.ExistentAppointmentDTO;
import DTOs.NewAppointmentDTO;
import POJOs.AppointmentPOJO;
import POJOs.PatientPOJO;
import POJOs.DoctorPOJO;
import java.util.Calendar;
import java.util.List;

public interface IAppointmentManager {

    public void createAppointment(AppointmentPOJO appointmentPOJO);

    public AppointmentPOJO DtoToEntity(NewAppointmentDTO newAppointmentDTO);

    public List<Calendar> findLimitDays(DoctorPOJO doctorPOJO);

    public List<Calendar> findLimitDays(PatientPOJO patientPOJO);

    // public List<AppointmentEntity> findAppointmentsByPatientId(Long patientId);
    public List<ExistentAppointmentDTO> findAppointmentsByPatientId(Long patientId);

    public ExistentAppointmentDTO convertToDTO(AppointmentPOJO appointmentPOJO);

    public List<ExistentAppointmentDTO> findAppointmentsByDoctorId(Long doctorId);

    public boolean cancelAppointment(Long id);

    public ExistentAppointmentDTO findAppointmentById(Long id);

}
