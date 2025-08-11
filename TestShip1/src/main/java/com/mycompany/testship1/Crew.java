/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;

/**
 *
 * @author User
 */
public class Crew extends Person{

    private String shipAssigned;  
    private boolean onDuty;          

    public Crew(String shipAssigned, boolean onDuty, String name, String id, String role, int age, double salary) {
        super(name, id, role, age, salary);
        this.shipAssigned = shipAssigned;
        this.onDuty = onDuty;
    }

    public String getShipAssigned() {
        return shipAssigned;
    }

    public void setShipAssigned(String shipAssigned) {
        this.shipAssigned = shipAssigned;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    
    

}
