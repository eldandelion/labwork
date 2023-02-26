package com.danielane.labwork.model;

import java.util.AbstractMap;
import java.util.Map;

public class ComPartyMember {

    public static final Map<Boolean, String> comPartyMember = Map.of(
            true, "Yes",
            false, "No"
    );

    private final Map.Entry<Boolean, String> myComPartyMember;

    private ComPartyMember(Map.Entry<Boolean, String> myComPartyMember) {
        this.myComPartyMember = myComPartyMember;
    }

    private ComPartyMember() {
        this.myComPartyMember = new AbstractMap.SimpleEntry<Boolean, String>(false, "null");
    }

    public static ComPartyMember newInstanceComPartyMember(Boolean comPartyMemberString){

        ComPartyMember comPartyMemberValue = new ComPartyMember();

        for (Map.Entry<Boolean, String> entry : comPartyMember.entrySet()){
            if (comPartyMemberString.equals(entry.getKey())){
                comPartyMemberValue = new ComPartyMember(entry);
                break;
            }
        }

        return comPartyMemberValue;

    }

    public Map.Entry<Boolean, String> getMyComPartyMember() {
        return myComPartyMember;
    }
}
