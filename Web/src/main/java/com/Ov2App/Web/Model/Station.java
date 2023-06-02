package com.Ov2App.Web.Model;
public class Station {
    public int id;
    public Double afstand;
    public Double reistijd;
    public Double prijs;

    public Station(int id, Double afstand, Double reistijd, Double prijs) {
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
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", prijs=" + prijs +
                '}';
    }
}