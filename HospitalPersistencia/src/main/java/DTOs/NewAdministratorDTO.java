package DTOs;

public class NewAdministratorDTO {

    private String Name;

    public NewAdministratorDTO() {
    }

    public NewAdministratorDTO(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}
