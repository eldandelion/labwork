package com.danielane.labwork.model;

import java.util.*;

public class ProfessionalPost {
    //This project doesn't contain SQL database
    //Available values for field "professionalPost" in Teacher.class are in this class
    public static final Map<String, String> professionalPosts = Map.of(
            "professor", "Professor",
            "lecturer", "Lecturer",
            "supervisor", "Supervisor",
            "teacher", "Teacher"
    );

    private Map.Entry<String, String> myPost;

    private ProfessionalPost() {
        this.myPost = new AbstractMap.SimpleEntry<>("null", "null");
    }

    public Map.Entry<String, String> getMyPost() {
        return myPost;
    }

    public void setMyPost(Map.Entry<String, String> myPost) {
        this.myPost = myPost;
    }

    public static ProfessionalPost newInstanceProfessionalPost(String professionalPostString){

        ProfessionalPost postValue = new ProfessionalPost();
        for (Map.Entry<String, String> entry : professionalPosts.entrySet()){
            if (professionalPostString.equals(entry.getKey())){
                postValue.setMyPost(entry);
                break;
            }
        }
        return postValue;
    }
}
