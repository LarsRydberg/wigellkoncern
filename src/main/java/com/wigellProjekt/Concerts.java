package com.wigellProjekt;

import java.time.LocalDate;

public class Concerts {

    private  int id;
    private String artistName;
    private LocalDate date;
    private int ticketPrice;
    private String arena;
    private int ageLimit;

    public Concerts(int id, String artistName, LocalDate date, int ticketPrice, String arena, int ageLimit) {
        this.id = id;
        this.artistName = artistName;
        this.date = date;
        this.ticketPrice = ticketPrice;
        this.arena = arena;
        this.ageLimit = ageLimit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getArena() {
        return arena;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }
}
