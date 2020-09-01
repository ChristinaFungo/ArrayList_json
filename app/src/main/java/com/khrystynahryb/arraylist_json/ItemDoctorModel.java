package com.khrystynahryb.arraylist_json;

public class ItemDoctorModel {

    private String type;
    private String name;
    private String email;

    public ItemDoctorModel(String type, String name, String email) {
        this.type = type;
        this.name = name;
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
