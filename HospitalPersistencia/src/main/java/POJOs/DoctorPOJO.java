/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

import org.bson.types.ObjectId;

/**
 *
 * @author PC
 */
public class DoctorPOJO {
    
    private ObjectId id;
    private String names;
    private String lastName;
    private String secondName;
    private String medicalLicense;
    private String specialization;

    public DoctorPOJO() {
    }

    public DoctorPOJO(ObjectId id, String names, String lastName, String secondName, String medicalLicense, String specialization) {
        this.id = id;
        this.names = names;
        this.lastName = lastName;
        this.secondName = secondName;
        this.medicalLicense = medicalLicense;
        this.specialization = specialization;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMedicalLicense() {
        return medicalLicense;
    }

    public void setMedicalLicense(String medicalLicense) {
        this.medicalLicense = medicalLicense;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DoctorPOJO{");
        sb.append("id=").append(id);
        sb.append(", names=").append(names);
        sb.append(", lastName=").append(lastName);
        sb.append(", secondName=").append(secondName);
        sb.append(", medicalLicense=").append(medicalLicense);
        sb.append(", specialization=").append(specialization);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
