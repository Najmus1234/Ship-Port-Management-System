/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;

/**
 *
 * @author nafis
 */
public class CargoShip extends Ship{
    
private int containerCount, maxContainer;
private String cargoType;

    public CargoShip(int containerCount, int maxContainer, String cargoType, String shipName, String shipCompany, String registrationID, String captain, String country, String shipStatus, String dockAssigned, int totalCrew, double fuelCapacity, double fuelRemained, double weightCapacity, double currentWeight) {
        super(shipName, shipCompany, registrationID, captain, country, shipStatus, dockAssigned, totalCrew, fuelCapacity, fuelRemained, weightCapacity, currentWeight);
        this.containerCount = containerCount;
        this.maxContainer = maxContainer;
        this.cargoType=cargoType;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public void setContainerCount(int containerCount) {
        this.containerCount = containerCount;
    }

    public int getMaxContainer() {
        return maxContainer;
    }

    public void setMaxContainer(int maxContainer) {
        this.maxContainer = maxContainer;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}

    
   