package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person {

    private ArrayList<String> roles;
    private String staffID;

    public Staff(String address, String name, Date birthDate, ArrayList<String> roles, String staffID) {
        super(address, name, birthDate);
        this.setRoles(roles);
        this.setStaffID(staffID);
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }

}
