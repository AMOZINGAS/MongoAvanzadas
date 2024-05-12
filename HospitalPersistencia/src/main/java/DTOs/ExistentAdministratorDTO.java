package DTOs;

public class ExistentAdministratorDTO {

    private Object id;
    private String name;

    public ExistentAdministratorDTO() {
    }

    public ExistentAdministratorDTO(Object id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
