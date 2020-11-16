package com.binni.ourvedic.Models;

public class PanditModel {
    int image;
    String name, religion, address, phone;

    public PanditModel(int image, String name, String religion, String address, String phone) {
        this.image = image;
        this.name = name;
        this.religion = religion;
        this.address = address;
        this.phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

