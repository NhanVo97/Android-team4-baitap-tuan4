package com.example.bai4.Model;

public class Song {
    private String name;
    private int icon;
    private String description;
    private String time;
    public Song(String name, int icon, String description,String time) {
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
