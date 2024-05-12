package DTOs;

import DTOs.NewAdministratorDTO;
import DTOs.NewDoctorDTO;
import DTOs.NewPatientDTO;

public class NewUserDTO {

    private String curp;
    private String type;
    private String password;
    public NewUserDTO() {
    }

    public NewUserDTO(String user, String password, String type) {
        this.curp = user;
        this.password = password;
        this.type = type;
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
