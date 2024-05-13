/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

import java.util.Calendar;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author PC
 */
public class AppointmentPOJO {
    
    private ObjectId id;
    private String status;
    private Date date;
    private String note;
    private DoctorPOJO idDoctor;
    private PatientPOJO idPatient;

    public AppointmentPOJO() {
    }

    public AppointmentPOJO(ObjectId id, String status, Date date, String note, DoctorPOJO idDoctor, PatientPOJO idPatient) {
        this.id = id;
        this.status = status;
        this.date = date;
        this.note = note;
        this.idDoctor = idDoctor;
        this.idPatient = idPatient;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public DoctorPOJO getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(DoctorPOJO idDoctor) {
        this.idDoctor = idDoctor;
    }

    public PatientPOJO getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(PatientPOJO idPatient) {
        this.idPatient = idPatient;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppointmentPOJO{");
        sb.append("id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", date=").append(date);
        sb.append(", note=").append(note);
        sb.append(", idDoctor=").append(idDoctor);
        sb.append(", idPatient=").append(idPatient);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
