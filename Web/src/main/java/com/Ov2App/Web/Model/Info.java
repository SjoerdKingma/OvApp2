package com.Ov2App.Web.Model;

public class Info {

    public String inputA;
    public String inputB;

    public String test;

    private TrajectJson trip;

    public String getInputA() {
        return inputA;
    }

    public void setInputA(String inputA) {
        this.inputA = inputA;
    }

    public String getInputB() {
        return inputB;
    }

    public void setInputB(String inputB) {
        this.inputB = inputB;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public TrajectJson getTrip() {
        return trip;
    }

    public void setTrip(TrajectJson trip) {
        this.trip = trip;
    }
}
