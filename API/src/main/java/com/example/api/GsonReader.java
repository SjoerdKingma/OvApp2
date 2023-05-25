package com.example.api;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.api.Model.Station;
import com.example.api.Model.TrajectJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonReader {
    private List<TrajectJson> readTrajectenJson()throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Reader reader = Files.newBufferedReader(Paths.get("src/main/Trajecten.json"));
        List<TrajectJson> trajecten = new Gson().fromJson(reader, new TypeToken<List<TrajectJson>>() {}.getType()); //TODO: Change List to ArrayList

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
        reader.close();
        return trajecten;
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