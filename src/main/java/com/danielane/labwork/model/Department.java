package com.danielane.labwork.model;

import java.util.AbstractMap;
import java.util.Map;

import static java.util.Map.entry;

public class Department {
    //This project doesn't contain SQL database
    //Available values for field department in Teacher class are in this class
    public static final Map<String, String> departments = Map.ofEntries(
            entry("mathematical", "Mathematical, Physical & Life Sciences Division"),
            entry("medical", "Medical Sciences Division"),
            entry("social", "Social Sciences Division"),
            entry("humanities", "Humanities Division")
    );

    private Map.Entry<String, String> myDepartment;

    private Department() {
        this.myDepartment = new AbstractMap.SimpleEntry<String, String>("null", "null");
    }

    public Department(Map.Entry<String, String> myDepartment) {
        this.myDepartment = myDepartment;
    }

    public Map.Entry<String, String> getMyDepartment() {
        return myDepartment;
    }

    public static Department newInstanceDepartment(String departmentString){
        Department departmentValue = new Department();

        for (Map.Entry<String, String> entry: departments.entrySet()){
            if (departmentString.equals(entry.getKey())){
                departmentValue = new Department(entry);
                break;
            }
        }
        return departmentValue;
    }
}
