/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.testship1;

/**
 *
 * @author nafis
 */
public interface FuelOperations {
    boolean isFuelTankFull();
   // void refilled();
    void addFuel(double amount);
    double getFuelPercentage();
    void showFuelPercentage();
    double calculateFuelCost(double amount, double costPerLiter);
    void showFuelCost(double amount, double costPerLiter);
    double fuelRequired();
    void showfuelRequired();
    
    
}
