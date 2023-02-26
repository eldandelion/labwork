package com.danielane.labwork.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final ComPartyMember comPartyMember;
    private final Gender gender;
    private final Lecture lectures;
    private final ProfessionalPost professionalPost;
    private final Department department;
    private final String teachingMethod;
    public Teacher() {

        this.firstName = "null";
        this.lastName = "null";
        this.age = 0;
        this.comPartyMember = null;
        this.gender = null;
        this.lectures = null;
        this.professionalPost = null;
        this.department = null;
        this.teachingMethod = TeachingMethod.givingLessons;

    }

    public Teacher(String firstName, String lastName, int age, ComPartyMember comPartyMember, Gender gender, Lecture lectures, ProfessionalPost professionalPost, Department department, String teachingMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.comPartyMember = comPartyMember;
        this.gender = gender;
        this.lectures = lectures;
        this.professionalPost = professionalPost;
        this.department = department;
        this.teachingMethod = teachingMethod;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public ComPartyMember isComPartyMember() {
        return comPartyMember;
    }

    public Gender getGender() {
        return gender;
    }

    public Lecture getLectures() {
        return lectures;
    }

    public ProfessionalPost getProfessionalPost() {
        return professionalPost;
    }

    public Department getDepartment() {
        return department;
    }

    public String getTeachingMethod() {
        return teachingMethod;
    }
}
