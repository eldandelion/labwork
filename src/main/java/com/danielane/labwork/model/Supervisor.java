package com.danielane.labwork.model;

import java.util.List;

public class Supervisor extends Teacher {

    private String researchPath;
    private String supervisorType;
    public void participatingInResearch(String projectName){};
    public void participatingInResearch(String subjectName, ProjectLevel projectLevel){};

    public Supervisor(String firstName, String lastName, int age, ComPartyMember comPartyMember, Gender gender, Lecture lectures, ProfessionalPost professionalPost, Department department) {
        super(firstName, lastName, age, comPartyMember, gender, lectures, professionalPost, department, TeachingMethod.givingLessons);
    }
}
