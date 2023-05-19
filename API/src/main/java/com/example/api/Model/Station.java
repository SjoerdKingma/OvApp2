package com.example.api.Model;
public class Station {
    public int id;
    public Float afstand;
    public Float reistijd;
    public Float prijs;

    public Station(int id, Float afstand, Float reistijd, Float prijs) {
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
}