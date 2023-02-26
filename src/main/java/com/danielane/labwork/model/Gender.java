package com.danielane.labwork.model;

import java.util.AbstractMap;
import java.util.Map;

import static java.util.Map.entry;

public class Gender {
    //This project doesn't contain SQL database
    //Available values for field gender in Teacher class are in this class
    public static final Map<String, String> genders = Map.ofEntries(
            entry("male", "Male"),
            entry("female", "Female")
    );

    private Map.Entry<String, String> myGender;

    private Gender() {
        this.myGender = new AbstractMap.SimpleEntry<String, String>("null", "null");
    }

    private Gender(Map.Entry<String, String> myGender) {
        this.myGender = myGender;
    }

    public Map.Entry<String, String> getMyGender() {
        return myGender;
    }

    public static Gender newInstanceGender(String genderString){
        Gender genderValue = new Gender();
        for (Map.Entry<String, String> entry: genders.entrySet()){
            if (genderString.equals(entry.getKey())){
                genderValue = new Gender(entry);
                break;
            }
        }
        return genderValue;
    }
}
