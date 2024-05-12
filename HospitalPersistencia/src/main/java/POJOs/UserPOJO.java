/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

/**
 *
 * @author PC
 */
public class UserPOJO {
    
    private Object id;
    private String type;
    private String password;
    private String curp;

    public UserPOJO() {
    }

    public UserPOJO(Object id, String type, String password, String curp) {
        this.id = id;
        this.type = type;
        this.password = password;
        this.curp = curp;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
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
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
