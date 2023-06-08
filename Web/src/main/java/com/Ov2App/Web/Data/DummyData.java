package com.Ov2App.Web.Data;

import com.Ov2App.Web.Model.Accommodaties;
import com.Ov2App.Web.Model.Facilities;
import com.Ov2App.Web.Model.Station;
import com.Ov2App.Web.Model.TrajectJson;

import java.util.ArrayList;
import java.util.Arrays;

public class DummyData {
    public static ArrayList<TrajectJson> getDummyData(){
        ArrayList trips = new ArrayList();
        Accommodaties accomodaties = new Accommodaties("Ja", "Trein", "a, b, c", "Ja", "Ja", "Ja");
        Facilities facilities = new Facilities("Ja", "Nee", "Ja");
        Station[] stations = new Station[1];
        stations[0] = new Station(1, 3f, 2f, 3f, facilities);

        TrajectJson trip = new TrajectJson(1, "Amersfoort-Utrecht", "Amersfoort", 20.0, 30.0, "Trein", 18.50, "Utrecht", accomodaties, stations, "Amersfoort-Utrecht.png");
        trips.add(trip);

        trip = new TrajectJson(2, "Amersfoort-Amsterdam", "Amersfoort", 20.0, 30.0, "Trein", 18.50, "Utrecht", accomodaties, stations, "Amersfoort-Utrecht.png");
        trips.add(trip);

        return trips;
    }
}
