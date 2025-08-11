/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testship1;

/**
 *
 * @author 603.16.IP207
 */
public class PortEmployee extends Person{
   private String shift, workPlace;

    public PortEmployee(String shift, String workPlace, String name, String id, String role, int age, double salary) {
        super(name, id, role, age, salary);
        this.shift = shift;
        this.workPlace = workPlace;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }
   
}
