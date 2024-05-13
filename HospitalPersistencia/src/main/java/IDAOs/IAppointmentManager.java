package IDAOs;

import DAOs.AppointmentManager;
import DTOs.ExistentAppointmentDTO;
import DTOs.NewAppointmentDTO;
import POJOs.AppointmentPOJO;
import POJOs.PatientPOJO;
import POJOs.DoctorPOJO;
import java.util.Calendar;
import java.util.List;
import org.bson.types.ObjectId;

public interface IAppointmentManager {

    public void createAppointment(AppointmentPOJO appointmentPOJO);

    public AppointmentPOJO DtoToEntity(NewAppointmentDTO newAppointmentDTO);

    public List<Calendar> findLimitDays(DoctorPOJO doctorPOJO);

    public List<Calendar> findLimitDays(PatientPOJO patientPOJO);

    // public List<AppointmentEntity> findAppointmentsByPatientId(Long patientId);
    public List<ExistentAppointmentDTO> findAppointmentsByPatientId(ObjectId patientId);

    public ExistentAppointmentDTO convertToDTO(AppointmentPOJO appointmentPOJO);

    public List<ExistentAppointmentDTO> findAppointmentsByDoctorId(ObjectId doctorId);

    public boolean cancelAppointment(ObjectId id);

    public ExistentAppointmentDTO findAppointmentById(ObjectId id);

}
