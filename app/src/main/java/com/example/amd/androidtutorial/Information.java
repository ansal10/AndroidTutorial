package com.example.amd.androidtutorial;

/**
 * Created by amd on 8/31/15.
 */
public class Information {

    String button;
    String title;
    String desc;

    public Information(String button, String title, String desc) {
        this.button = button;
        this.title = title;
        this.desc = desc;
    }

    public Information() {
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
