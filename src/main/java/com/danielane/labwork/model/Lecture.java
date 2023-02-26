package com.danielane.labwork.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Map.entry;

public class Lecture {

    //This project doesn't contain SQL database
    //Available values for field "lectures" in Teacher.class are in this class

    public static final Map<String, String> lectures = Map.ofEntries(
            entry("mathematics", "Advanced Mathematics"),
            entry("english", "College English"),
            entry("physics", "Physics"),
            entry("ssd", "Software System Development")
    );

    private final Map<String, String> myLectures;

    private Lecture() {
        this.myLectures = new HashMap<>();
    }

    public Map<String, String> getMyLectures() {
        return myLectures;
    }

    public void setMyLectures(Map.Entry<String, String> myLecture) {
        myLectures.put(myLecture.getKey(), myLecture.getValue());
    }

    public static Lecture newInstanceLecture(String[] lecturesString){
        Lecture lecturesValue = new Lecture();

        if (lecturesString != null){

            for (String s : lecturesString) {
                for (Map.Entry<String, String> entry : lectures.entrySet()) {
                    if (s.equals(entry.getKey())) {
                        lecturesValue.setMyLectures(entry);
                    }
                }
            }
        }

        return lecturesValue;
    }
}
