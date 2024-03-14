package com.wigellProjekt;

public class Addresses {
    private int id;
    private String street;
    private int houseNumber;
    private  int postalNumber;
    private String locality;

    public Addresses(int id, String street, int houseNumber, int postalNumber, String locality) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalNumber = postalNumber;
        this.locality = locality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPostalNumber() {
        return postalNumber;
    }

    public void setPostalNumber(int postalNumber) {
        this.postalNumber = postalNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
}
