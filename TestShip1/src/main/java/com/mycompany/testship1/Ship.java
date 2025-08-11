/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;


public abstract class Ship{
    private String shipName, shipCompany, registrationID, captain, country, shipStatus, dockAssigned;
    private int totalCrew;
    private double fuelCapacity, fuelRemained, weightCapacity, currentWeight;
    
    /**
     *
     * @param shipName
     * @param shipCompany
     * @param registrationID
     * @param captain
     * @param country
     * @param shipStatus
     * @param dockAssigned
     * @param totalCrew
     * @param fuelCapacity
     * @param fuelRemained
     * @param weightCapacity
     * @param currentWeight
     */
    public Ship(String shipName, String shipCompany, String registrationID, String captain, String country, String shipStatus, String dockAssigned, int totalCrew, double fuelCapacity, double fuelRemained, double weightCapacity, double currentWeight) {
        this.shipName = shipName;
        this.shipCompany = shipCompany;
        this.registrationID = registrationID;
        this.captain = captain;
        this.country = country;
        this.shipStatus = shipStatus;
        this.dockAssigned = dockAssigned;
        this.totalCrew = totalCrew;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemained = fuelRemained;
        this.weightCapacity = weightCapacity;
        this.currentWeight = currentWeight;
    }

    public String getShipCompany() {
        return shipCompany;
    }

    public void setShipCompany(String shipCompany) {
        this.shipCompany = shipCompany;
    }

    public String getsShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }

    public String getDockAssigned() {
        return dockAssigned;
    }

    public void setDockAssigned(String dockAssigned) {
        this.dockAssigned = dockAssigned;
    }

    public int getTotalCrew() {
        return totalCrew;
    }

    public void setTotalCrew(int totalCrew) {
        this.totalCrew = totalCrew;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelRemained() {
        return fuelRemained;
    }

    public void setFuelRemained(double fuelRemained) {
        this.fuelRemained = fuelRemained;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    
}

