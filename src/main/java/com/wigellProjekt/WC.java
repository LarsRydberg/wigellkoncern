package com.wigellProjekt;

import java.util.ArrayList;

public class WC {
    private int id;
    private String name;
    private String concert;
    private ArrayList<String> customers;

    public WC () {

    }

    public WC(int id, String name, String concert, ArrayList<String> customers) {
        this.id = id;
        this.name = name;
        this.concert = concert;
        this.customers = customers;
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

    public String getConcert() {
        return concert;
    }

    public void setConcert(String concert) {
        this.concert = concert;
    }

    public ArrayList<String> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<String> customers) {
        this.customers = customers;
    }
}
