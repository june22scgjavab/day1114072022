package com.infosys.interfacedemo1;
public class TaxiCab extends Car implements IPublicTransport{
    public double calculateFare() {    // Implementing interface's method
        double billAmount = MIN_AMOUNT + (RATE * getTravelDistance());
        return billAmount;
    }
    public double getTravelDistance() {
        double distanceCovered=20;
        return distanceCovered;
    }
}