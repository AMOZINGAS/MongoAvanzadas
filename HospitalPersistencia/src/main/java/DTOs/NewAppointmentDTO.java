package DTOs;

import java.util.Calendar;

public class NewAppointmentDTO {

    private ExistentDoctorDTO doctor;
    private ExistentPatientDTO patient;
    private Calendar appointmentDate;
    private String status;
    private String note;

    public NewAppointmentDTO() {
    }

    public NewAppointmentDTO(ExistentDoctorDTO doctor, ExistentPatientDTO patient, Calendar appointmentDate, String status, String note) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.status = status;
        this.note = note;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NewAppointmentDTO{");
        sb.append("doctor=").append(doctor);
        sb.append(", patient=").append(patient);
        sb.append(", appointmentDate=").append(appointmentDate);
        sb.append(", status=").append(status);
        sb.append(", note=").append(note);
        sb.append('}');
        return sb.toString();
    }

    
    
}
