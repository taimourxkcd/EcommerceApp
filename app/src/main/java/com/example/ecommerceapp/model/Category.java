package com.example.ecommerceapp.model;

public class Category {
    private String name, icon, color, brief;
    private int id;

    public Category(String name, String icon, String color, String brief, int id) {
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.brief = brief;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getColor() {
        return color;
    }

    public String getBrief() {
        return brief;
    }

    public int getId() {
        return id;
    }
}
