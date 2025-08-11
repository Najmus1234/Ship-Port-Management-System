/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;

/**
 *
 * @author nafis
 */
public class TankerShip extends Ship {
private double liquidCapacity, currentLiquid;  
private String liquidType;        
private int numberOfTanks;           
private boolean hasPumpingSystem; 

    public TankerShip(double liquidCapacity, double currentLiquid, String liquidType, int numberOfTanks, boolean hasPumpingSystem, String shipName, String shipCompany, String registrationID, String captain, String country, String shipStatus, String dockAssigned, int totalCrew, double fuelCapacity, double fuelRemained, double weightCapacity, double currentWeight) {
        super(shipName, shipCompany, registrationID, captain, country, shipStatus, dockAssigned, totalCrew, fuelCapacity, fuelRemained, weightCapacity, currentWeight);
        this.liquidCapacity = liquidCapacity;
        this.currentLiquid = currentLiquid;
        this.liquidType = liquidType;
        this.numberOfTanks = numberOfTanks;
        this.hasPumpingSystem = hasPumpingSystem;
    }


    public double getLiquidCapacity() {
        return liquidCapacity;
    }

    public void setLiquidCapacity(double liquidCapacity) {
        this.liquidCapacity = liquidCapacity;
    }

    public double getCurrentLiquid() {
        return currentLiquid;
    }

    public void setCurrentLiquid(double currentLiquid) {
        this.currentLiquid = currentLiquid;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public int getNumberOfTanks() {
        return numberOfTanks;
    }

    public void setNumberOfTanks(int numberOfTanks) {
        this.numberOfTanks = numberOfTanks;
    }

    public boolean isHasPumpingSystem() {
        return hasPumpingSystem;
    }

    public void setHasPumpingSystem(boolean hasPumpingSystem) {
        this.hasPumpingSystem = hasPumpingSystem;
    }
    

}
