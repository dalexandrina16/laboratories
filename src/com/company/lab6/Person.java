package com.company.lab6;

import java.util.Date;
import java.util.List;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName fullName;
    private Date birthDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;
    private Hospital hospital;
    private List<OperationsStaff> operationsStaff;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public List<OperationsStaff> getOperationsStaff() {
        return operationsStaff;
    }

    public void setOperationsStaff(List<OperationsStaff> operationsStaff) {
        this.operationsStaff = operationsStaff;
    }

    public Person() {
        this.fullName = new FullName("undefined", "undefined", "undefined");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
