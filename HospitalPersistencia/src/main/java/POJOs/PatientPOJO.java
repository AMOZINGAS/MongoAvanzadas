/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJOs;

import java.util.Calendar;

/**
 *
 * @author PC
 */
public class PatientPOJO {
    
    private Object id;
    private String names; 
    private String lastName; 
    private String secondName; 
    private Calendar birthDate;
    private String phone;
    private String street;
    private int zipCode;
    private String colony;
    private String sex;
    private String curp;
    private String socialNumber;

    public PatientPOJO() {
    }

    public PatientPOJO(Object id, String names, String lastName, String secondName, Calendar birthDate, String phone, String street, int zipCode, String colony, String sex, String curp, String socialNumber) {
        this.id = id;
        this.names = names;
        this.lastName = lastName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.street = street;
        this.zipCode = zipCode;
        this.colony = colony;
        this.sex = sex;
        this.curp = curp;
        this.socialNumber = socialNumber;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
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

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatientPOJO{");
        sb.append("id=").append(id);
        sb.append(", names=").append(names);
        sb.append(", lastName=").append(lastName);
        sb.append(", secondName=").append(secondName);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", phone=").append(phone);
        sb.append(", street=").append(street);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", colony=").append(colony);
        sb.append(", sex=").append(sex);
        sb.append(", curp=").append(curp);
        sb.append(", socialNumber=").append(socialNumber);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
