package Model;

public class Accommodaties {
    public String HandicapToegankelijk;
    public String Vervoersmiddel;
    public String TreinDelen;
    public String Toilet;
    public String HandicapToilet;
    public String Wifi;

    public Accommodaties(String handicapToegankelijk, String vervoersmiddel, String treinDelen, String Toilet, String handicapToilet, String wifi) {
        this.HandicapToegankelijk = handicapToegankelijk;
        this.Vervoersmiddel       = vervoersmiddel;
        this.TreinDelen           = treinDelen;
        this.Toilet               = Toilet;
        this.HandicapToilet       = handicapToilet;
        this.Wifi                 = wifi;
    }

    public String getHandicapToegankelijk() {
        return HandicapToegankelijk;
    }

    public String getVervoersmiddel() {
        return Vervoersmiddel;
    }

    public String getTreinDelen() {
        return TreinDelen;
    }

    public String getToilet() {
        return Toilet;
    }

    public String getHandicapToilet() {
        return HandicapToilet;
    }

    public String getWifi() {
        return Wifi;
    }

    @Override
    public String toString() {
        return "Accommodaties{" +
                "HandicapToegankelijk='" + HandicapToegankelijk + '\'' +
                ", Vervoersmiddel='" + Vervoersmiddel + '\'' +
                ", TreinDelen='" + TreinDelen + '\'' +
                ", Toilet='" + Toilet + '\'' +
                ", HandicapToilet='" + HandicapToilet + '\'' +
                ", Wifi='" + Wifi + '\'' +
                '}';
    }
}