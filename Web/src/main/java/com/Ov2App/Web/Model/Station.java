package com.Ov2App.Web.Model;
public class Station {
    private int id;
    private Float afstand;
    private Float reistijd;
    private Float prijs;

    private Facilities facilities;

    public Station(int id, Float afstand, Float reistijd, Float prijs, Facilities facilities) {
        this.id = id;
        this.afstand = afstand;
        this.reistijd = reistijd;
        this.prijs = prijs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", prijs=" + prijs +
                '}';
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}