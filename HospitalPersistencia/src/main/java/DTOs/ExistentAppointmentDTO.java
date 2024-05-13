package DTOs;

import java.util.Calendar;
import org.bson.types.ObjectId;

public class ExistentAppointmentDTO {

    private ObjectId id;
    private ExistentDoctorDTO doctor;
    private ExistentPatientDTO patient;
    private Calendar appointmentDate;
    private String status;
    private String note;

    public ExistentAppointmentDTO() {
    }

    public ExistentAppointmentDTO(ExistentDoctorDTO doctor, ExistentPatientDTO patient, Calendar appointmentDate, String status, String note) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.status = status;
        this.note = note;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ExistentDoctorDTO getDoctor() {
        return doctor;
    }

    public void setDoctor(ExistentDoctorDTO doctor) {
        this.doctor = doctor;
    }

    public ExistentPatientDTO getPatient() {
        return patient;
    }

    public void setPatient(ExistentPatientDTO patient) {
        this.patient = patient;
    }

    public Calendar getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Calendar appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
