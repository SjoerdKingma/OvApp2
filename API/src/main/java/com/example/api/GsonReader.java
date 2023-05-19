package com.example.api;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.api.Model.Faciliteiten;
import com.example.api.Model.Station;
import com.example.api.Model.Stationsdetails;
import com.example.api.Model.TrajectJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonReader {
    private final ArrayList<TrajectJson> trajecten = new ArrayList<>();

    public ArrayList<TrajectJson> GsonReader ()throws IOException{
        readTrajectenJson();
        return trajecten;
    }


    private List<TrajectJson> readTrajectenJson()throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Reader trajectenreader = Files.newBufferedReader(Paths.get("src/main/Trajecten.json"));
        List<TrajectJson> trajecten = new Gson().fromJson(trajectenreader, new TypeToken<List<TrajectJson>>() {}.getType()); //TODO: Change List to ArrayList

        // convert JSON array to list of users

        // print users
        for (int i = 0; i < trajecten.size(); i++){
            List<Station> stations= List.of(trajecten.get(i).getStations());

            System.out.println(
                    "naam=" + trajecten.get(i).getNaam() + "\n" +
                            "Beginstation=" + trajecten.get(i).getBeginstation() + "\n" +
                            "afstand=" + trajecten.get(i).getAfstand() + "\n" +
                            "reistijd=" + trajecten.get(i).getReistijd() + "\n" +
                            "Reismethode=" + trajecten.get(i).getReismethode() + "\n" +
                            "prijs=" + trajecten.get(i).getPrijs() + "\n" +
                            "eindstation=" + trajecten.get(i).getEindstation() + "\n"+
                            "stations:");
            for (int a = 0; a < stations.size(); a++){
                System.out.println(
                        "Station " + stations.get(a).getId() + "\n" +
                                "id=" + stations.get(a).getId() + "\n" +
                                "afstand=" + stations.get(a).getAfstand() + "\n" +
                                "reistijd=" + stations.get(a).getReistijd() + "\n"+
                                "prijs=" + stations.get(a).getPrijs());
            }

            trajecten.forEach(System.out::println);}
        trajectenreader.close();
        return trajecten;
    }
    private List<Stationsdetails> readStationsdetails()throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Reader Stationsdetailsreader = Files.newBufferedReader(Paths.get("src/main/Stationsdetails.json"));
        List<Stationsdetails> Stationsdetails = new Gson().fromJson(Stationsdetailsreader, new TypeToken<List<Stationsdetails>>() {}.getType()); //TODO: Change List to ArrayList


        for (int i = 0; i < Stationsdetails.size(); i++){
            List<Faciliteiten> faciliteiten= List.of(Stationsdetails.get(i).getFaciliteiten());


            System.out.println(
                    "id"+Stationsdetails.get(i).getId() + "\n" +
                            "naam" + Stationsdetails.get(i).getNaam() + "\n" +
                            "faciliteiten:"
            );
            for (int a = 0; a < faciliteiten.size(); a++){
                System.out.println(
                        "toilet"+faciliteiten.get(a).getToilet() + "\n" +
                                "pinautomaat" + faciliteiten.get(a).getPinautomaat() + "\n" +
                                "restaurant:" + faciliteiten.get(a).getRestaurant()
                );
            }

        }


        return Stationsdetails;
    }


    public void printTrajecten(List<TrajectJson> trajecten){
        for (int i = 0; i < trajecten.size(); i++){
            System.out.println(
                    "naam=" + trajecten.get(i).getNaam() + "\n" +
                            "Beginstation=" + trajecten.get(i).getBeginstation() + "\n" +
                            "afstand=" + trajecten.get(i).getAfstand() + "\n" +
                            "reistijd=" + trajecten.get(i).getReistijd() + "\n" +
                            "Reismethode=" + trajecten.get(i).getReismethode() + "\n" +
                            "prijs=" + trajecten.get(i).getPrijs() + "\n" +
                            "eindstation=" + trajecten.get(i).getEindstation() + "\n" +
                            "stations=" + Arrays.toString(Arrays.stream(trajecten.get(i).getStations()).toArray())
            );
            trajecten.forEach(System.out::println);
        }
    }
}