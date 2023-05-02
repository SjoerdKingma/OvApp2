package com.example.api.Model;
import java.util.Arrays;
public class TrajectJson {
    public int id;
    public String naam;
    public String beginstation;
    public Double afstand;
    public Double reistijd;
    public String Reismethode;
    public Double prijs;
    public String eindstation;
    public Station[] stations;
    public String[] vertrektijden;
    public String[] terugvertrektijden;
    public Accommodaties accommodaties;

    public TrajectJson(int id, String naam, String beginstation, Double afstand, Double reistijd, String Reismethode, Double prijs, String eindstation, Accommodaties accommodaties,Station[] stations, String[] vertrektijden, String[] terugvertrektijden) {
        this.id = id;
        this.naam = naam;
        this.beginstation = beginstation;
        this.afstand = afstand;
        this.reistijd = reistijd;
        this.Reismethode = Reismethode;
        this.prijs = prijs;
        this.eindstation = eindstation;
        this.stations = stations;
        this.vertrektijden = vertrektijden;
        this.terugvertrektijden = terugvertrektijden;
        this.accommodaties=accommodaties;}

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

    public String getBeginstation() {
        return beginstation;
    }

    public Double getAfstand() {
        return afstand;
    }

    public Double getReistijd() {
        return reistijd;
    }

    public String getReismethode() {
        return Reismethode;
    }

    public Double getPrijs() {
        return prijs;
    }

    public String getEindstation() {
        return eindstation;
    }

    public Station[] getStations() {
        return stations;
    }

    public String[] getVertrektijden() {
        return vertrektijden;
    }

    public String[] getTerugvertrektijden() {
        return terugvertrektijden;
    }
    public Accommodaties getAccommodaties() {
        return accommodaties;
    }


    @Override
    public String toString() {
        return "TrajectJson{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", beginstation='" + beginstation + '\'' +
                ", afstand=" + afstand +
                ", reistijd=" + reistijd +
                ", reismethode='" + Reismethode + '\'' +
                ", prijs=" + prijs +
                ", eindstation='" + eindstation + '\'' +
                ", stations=" + Arrays.toString(stations) +
                ", vertrektijden=" + Arrays.toString(vertrektijden) +
                ", terugvertrektijden=" + Arrays.toString(terugvertrektijden) +
                '}';
    }}