package com.binni.ourvedic.Models;

public class IslamModel {
    int image;
    String Text;

    public IslamModel(int image, String text) {
        this.image = image;
        Text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
