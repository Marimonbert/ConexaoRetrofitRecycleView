package com.e.novotesteconexao;

import com.google.gson.annotations.SerializedName;

public class RetroUsers {

//Give the field a custom name//

    @SerializedName("name")
    private String name;

    public RetroUsers(String name) {
        this.name = name;

    }

//Retrieve the data using setter/getter methods//

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }

}