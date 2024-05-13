package DTOs;

import java.util.Objects;
import org.bson.types.ObjectId;

public class ExistentDoctorDTO {

    private ObjectId id;
    private String name;
    private String firstName;
    private String SecondName;
    private String specialization;
    private String medicalCart;

    public ExistentDoctorDTO() {
    }

    public ExistentDoctorDTO(ObjectId id, String name, String firstName, String SecondName, String specialization, String medicalCart) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.SecondName = SecondName;
        this.specialization = specialization;
        this.medicalCart = medicalCart;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String SecondName) {
        this.SecondName = SecondName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMedicalCart() {
        return medicalCart;
    }

    public void setMedicalCart(String medicalCart) {
        this.medicalCart = medicalCart;
    }

    @Override
    public String toString() {
        return name + ", " + medicalCart;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExistentDoctorDTO other = (ExistentDoctorDTO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.SecondName, other.SecondName)) {
            return false;
        }
        if (!Objects.equals(this.medicalCart, other.medicalCart)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return this.specialization == other.specialization;
    }

    
    
}
