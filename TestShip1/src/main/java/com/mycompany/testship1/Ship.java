/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;
/**
 *
 * @author nafis
 */

public abstract class Ship implements FuelOperations{
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

    
    
    @Override
    public double getFuelPercentage(){
       return   (fuelRemained/fuelCapacity)*100;       
    }
    @Override
    public void showFuelPercentage(){
          System.out.println("Current Fuel Level: "+getFuelPercentage());
}
    @Override
    public void isFuelTankFull(){
        if(fuelCapacity==fuelRemained)
            System.out.println("Fuel tank is full. No need to add any fuel.");
        else
            System.out.println("Fuel tank is not full. You can add up to "+fuelRequiredToFill()+" liter");
    }
    
    @Override
    public void addFuel(double amount){
        if((amount+fuelRemained)<= fuelCapacity)
            fuelRemained+=amount;
        else System.out.println("Your amount exceeds the fuel capacity. You can add up to "+fuelRequiredToFill()+" liter");
    }
    @Override
    public double calculateFuelCost(double amount, double costPerLiter){
        return amount*costPerLiter;
    }
    @Override
    public void showFuelCost(double amount, double costPerLiter){
        System.out.println("Fuel Cost: "+calculateFuelCost(amount, costPerLiter));
        
    }
    
    @Override
    public void refilled()
    {
        fuelRemained=fuelCapacity;
    }
    @Override
    public double fuelRequiredToFill(){
        return fuelCapacity-fuelRemained;
    }

    /**
     *
     * @param distanceInKm
     * @param fuelPerKm
     */
    @Override
    public void findRequiredFuel(double distanceInKm, double fuelPerKm)
    {
        double need =fuelRemained - distanceInKm*fuelPerKm;
        if(need>0)
        System.out.println("You need to fill up "+need+ " liter fuel to reach your destination.");
        else
         System.out.println("You have enough fuel. Don't need to add any fuel for reaching your destination.");   
    }
}

