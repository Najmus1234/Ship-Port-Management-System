/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;

/**
 *
 * @author nafis
 */
public class PassengerShip extends Ship{
    private int passengerCapacity, passengerCount, lifeboatsCapacity, lifeboatsCount;   
    private int numberOfCabins;           
    private boolean hasLifeboats; 

    public PassengerShip(int passengerCapacity, int passengerCount, int lifeboatsCapacity, int lifeboatsCount, int numberOfCabins, boolean hasLifeboats, String shipName, String shipCompany, String registrationID, String captain, String country, String shipStatus, String dockAssigned, int totalCrew, double fuelCapacity, double fuelRemained, double weightCapacity, double currentWeight) {
        super(shipName, shipCompany, registrationID, captain, country, shipStatus, dockAssigned, totalCrew, fuelCapacity, fuelRemained, weightCapacity, currentWeight);
        this.passengerCapacity = passengerCapacity;
        this.passengerCount = passengerCount;
        this.lifeboatsCapacity = lifeboatsCapacity;
        this.lifeboatsCount = lifeboatsCount;
        this.numberOfCabins = numberOfCabins;
        this.hasLifeboats = hasLifeboats;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getLifeboatsCapacity() {
        return lifeboatsCapacity;
    }

    public void setLifeboatsCapacity(int lifeboatsCapacity) {
        this.lifeboatsCapacity = lifeboatsCapacity;
    }

    public int getLifeboatsCount() {
        return lifeboatsCount;
    }

    public void setLifeboatsCount(int lifeboatsCount) {
        this.lifeboatsCount = lifeboatsCount;
    }

    public int getNumberOfCabins() {
        return numberOfCabins;
    }

    public void setNumberOfCabins(int numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }

    public boolean isHasLifeboats() {
        return hasLifeboats;
    }

    public void setHasLifeboats(boolean hasLifeboats) {
        this.hasLifeboats = hasLifeboats;
    }
    
    
  
}
