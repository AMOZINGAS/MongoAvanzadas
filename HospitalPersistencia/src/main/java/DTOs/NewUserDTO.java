package DTOs;

import DTOs.NewAdministratorDTO;
import DTOs.NewDoctorDTO;
import DTOs.NewPatientDTO;
import org.bson.types.ObjectId;

public class NewUserDTO {

    private String curp;
    private String type;
    private String password;
    private ObjectId idOwner;

    public NewUserDTO() {
    }

    public NewUserDTO(String user, String password, String type, ObjectId idOwner) {
        this.curp = user;
        this.password = password;
        this.type = type;
        this.idOwner = idOwner;
    }

    public ObjectId getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(ObjectId idOwner) {
        this.idOwner = idOwner;
    }

    
    
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
