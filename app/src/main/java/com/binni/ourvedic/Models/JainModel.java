package com.binni.ourvedic.Models;

public class JainModel {
    int image;
    String Text;

    public JainModel(int image, String text) {
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
