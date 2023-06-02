package com.Ov2App.Web.Model;
import java.util.Arrays;
public class TrajectJson {
    public Long id;
    public String naam;
    public String beginstation;
    public Double afstand;
    public Double reistijd;
    public String reismethode;
    public Double prijs;
    public String eindstation;
    public Accommodaties accommodaties;
    public Station[] stations;
    public String kaart;

    public TrajectJson(Long id, String naam, String beginstation, Double afstand, Double reistijd, String reismethode, Double prijs, String eindstation, Accommodaties accommodaties, Station[] stations, String kaart) {
        this.id = id;
        this.naam = naam;
        this.beginstation = beginstation;
        this.afstand = afstand;
        this.reistijd = reistijd;
        this.reismethode = reismethode;
        this.prijs = prijs;
        this.eindstation = eindstation;
        this.accommodaties = accommodaties;
        this.stations = stations;
        this.kaart = kaart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeginstation() {
        return beginstation;
    }

    public void setBeginstation(String beginstation) {
        this.beginstation = beginstation;
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

    public String getReismethode() {
        return reismethode;
    }

    public void setReismethode(String reismethode) {
        this.reismethode = reismethode;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public String getEindstation() {
        return eindstation;
    }

    public void setEindstation(String eindstation) {
        this.eindstation = eindstation;
    }

    public Accommodaties getAccommodaties() {
        return accommodaties;
    }

    public void setAccommodaties(Accommodaties accommodaties) {
        this.accommodaties = accommodaties;
    }

    public Station[] getStations() {
        return stations;
    }

    public void setStations(Station[] stations) {
        this.stations = stations;
    }

    public String getKaart() {
        return kaart;
    }

    public void setKaart(String kaart) {
        this.kaart = kaart;
    }

    @Override
    public String toString() {
        return "TrajectJson{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", beginstation='" + beginstation + '\'' +
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", Reismethode='" + reismethode + '\'' +
                ", prijs=" + prijs +
                ", eindstation='" + eindstation + '\'' +
                ", accommodaties=" + accommodaties +
                ", stations=" + Arrays.toString(stations) +
                ", kaart='" + kaart + '\'' +
                '}';
    }
}