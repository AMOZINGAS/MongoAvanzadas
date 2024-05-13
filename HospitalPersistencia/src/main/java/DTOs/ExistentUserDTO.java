/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import org.bson.types.ObjectId;

/**
 *
 * @author PC
 */
public class ExistentUserDTO {
    
    private ObjectId id;
    private String curp;
    private String type;
    private String password;
    private ObjectId idOwner;

    public ExistentUserDTO() {
    }

    public ExistentUserDTO(ObjectId id, String user, String password, String type, ObjectId idOwner) {
        this.id = id;
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

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

