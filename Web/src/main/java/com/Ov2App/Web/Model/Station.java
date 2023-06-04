package com.Ov2App.Web.Model;
public class Station {

    public int id;
    public String naam;
    public Double afstand;
    public Double reistijd;
    public Double prijs;

    public Station(int id, String naam, Double afstand, Double reistijd, Double prijs) {

        this.id = id;
        this.naam = naam;
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

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Double getAfstand() {
        return afstand;
    }

    public void setAfstand(Double afstand) {
        this.afstand = afstand;
    }

    public Double getReistijd() {
        return reistijd;
    }

    public void setReistijd(Double reistijd) {
        this.reistijd = reistijd;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", prijs=" + prijs +
                '}';
    }
}