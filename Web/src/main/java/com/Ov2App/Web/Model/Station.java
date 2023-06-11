package com.Ov2App.Web.Model;
public class Station {
    private int id;
    private String naam;
    private Float afstand;
    private Float reistijd;
    private Float prijs;

    private Facilities facilities;

    public Station(int id, String naam, Float afstand, Float reistijd, Float prijs, Facilities facilities) {
        this.id = id;
        this.naam = naam;
        this.afstand = afstand;
        this.reistijd = reistijd;
        this.prijs = prijs;
        this.facilities = facilities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Float getAfstand() {
        return afstand;
    }

    public void setAfstand(Float afstand) {
        this.afstand = afstand;
    }

    public Float getReistijd() {
        return reistijd;
    }

    public void setReistijd(Float reistijd) {
        this.reistijd = reistijd;
    }

    public Float getPrijs() {
        return prijs;
    }

    public void setPrijs(Float prijs) {
        this.prijs = prijs;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", prijs=" + prijs +
                ", facilities=" + facilities +
                '}';
    }
}