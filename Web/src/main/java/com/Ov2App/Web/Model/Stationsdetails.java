package com.Ov2App.Web.Model;

public class Stationsdetails {
    public Integer id;
    public String naam;
    public Facilities facilities;

    public Stationsdetails(Integer id, String naam, Facilities facilities) {
        this.id = id;
        this.naam = naam;
        this.facilities = facilities;
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

    public Facilities getFaciliteiten() {
        return facilities;
    }

    public void setFaciliteiten(Facilities facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "Stationsdetails{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", faciliteiten=" + facilities +
                '}';
    }
}
