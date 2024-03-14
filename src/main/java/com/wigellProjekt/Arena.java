package com.wigellProjekt;

public class Arena {
    private int id;
    private String name;
    private String address;
    private String insideOrOutside;

    public Arena(int id, String name, String address, String insideOrOutside) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.insideOrOutside = insideOrOutside;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInsideOrOutside() {
        return insideOrOutside;
    }

    public void setInsideOrOutside(String insideOrOutside) {
        this.insideOrOutside = insideOrOutside;
    }
}
