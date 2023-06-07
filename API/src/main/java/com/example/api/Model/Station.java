package com.example.api.Model;
public class Station {
    public int id;
    public String naam;
    public Float afstand;
    public Float reistijd;
    public Float uitstoot;
    public Float prijs;

    public Station(int id, String naam, Float afstand, Float reistijd, Float uitstoot, Float prijs) {
        this.id = id;
        this.naam = naam;
        this.afstand = afstand;
        this.reistijd = reistijd;
        this.uitstoot = uitstoot;
        this.prijs = prijs;
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

    public Float getUitstoot() {
        return uitstoot;
    }

    public void setUitstoot(Float uitstoot) {
        this.uitstoot = uitstoot;
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
                ", naam='" + naam + '\'' +
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", uitstoot=" + uitstoot +
                ", prijs=" + prijs +
                '}';
    }
}