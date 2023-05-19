package com.example.api.Model;

public class Stationsdetails {
    public Integer id;
    public String naam;
    public Faciliteiten faciliteiten;

    public Stationsdetails(Integer id, String naam, Faciliteiten faciliteiten) {
        this.id = id;
        this.naam = naam;
        this.faciliteiten = faciliteiten;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Faciliteiten getFaciliteiten() {
        return faciliteiten;
    }

    public void setFaciliteiten(Faciliteiten faciliteiten) {
        this.faciliteiten = faciliteiten;
    }

    @Override
    public String toString() {
        return "Stationsdetails{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", faciliteiten=" + faciliteiten +
                '}';
    }
}