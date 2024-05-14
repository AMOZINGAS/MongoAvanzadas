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
public class UserPOJO {
    
    private ObjectId id;
    private String type;
    private String password;
    private String curp;
    private ObjectId idOwner;

    public UserPOJO() {
    }

    public UserPOJO(ObjectId id, String type, String password, String curp, ObjectId idOwner) {
        this.id = id;
        this.type = type;
        this.password = password;
        this.curp = curp;
        this.idOwner = idOwner;
    }

    public ObjectId getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(ObjectId idPatient) {
        this.idOwner = idPatient;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserPOJO{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", password=").append(password);
        sb.append(", curp=").append(curp);
        sb.append(", idOwner=").append(idOwner);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
