package DTOs;

import org.bson.types.ObjectId;

public class ExistentAdministratorDTO {

    private ObjectId id;
    private String name;

    public ExistentAdministratorDTO() {
    }

    public ExistentAdministratorDTO(ObjectId id, String name) {
        this.id = id;
        this.name = name;
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

}
