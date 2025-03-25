package com.unimelb.swen30006.workshops;

import java.util.Date;

public abstract class Person {

    private String address;
    private String name;
    private Date birthDate;

    public Person(String address, String name, Date birthDate) {
        this.address = address;
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
