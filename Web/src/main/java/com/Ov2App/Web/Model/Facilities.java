package com.Ov2App.Web.Model;

public class Facilities {
    public String toilet;
    public String pinautomaat;
    public String restaurant;

    public Facilities(String toilet, String pinautomaat, String restaurant) {
        this.toilet = toilet;
        this.pinautomaat = pinautomaat;
        this.restaurant = restaurant;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getPinautomaat() {
        return pinautomaat;
    }

    public void setPinautomaat(String pinautomaat) {
        this.pinautomaat = pinautomaat;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Faciliteiten{" +
                "toilet='" + toilet + '\'' +
                ", pinautomaat='" + pinautomaat + '\'' +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }
}
