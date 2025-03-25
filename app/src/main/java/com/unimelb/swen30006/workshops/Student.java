package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Student extends Person {

    private String email;
    private String studentID;

    public Student(String address, String name, Date birthDate, String email, String studentID) {
        super(address, name, birthDate);
        this.setEmail(email);
        this.setStudentID(studentID);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void sendEmailMsg(String emailContent) {
        return;
    }

    public float totalGrade() {
        return 0.0F;
    }

}
