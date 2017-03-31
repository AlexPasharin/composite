/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleComponents;

import abstractClasses.SimpleComponent;

/**
 *
 * @author Alex
 */
public class PowerCord extends SimpleComponent{
    
    private final double length;
    private final int voltage;

    public PowerCord(double price, double length, int voltage) {
        super(price);
        this.length = length;
        this.voltage = voltage;
    }

    @Override
    public String name() {
        return "Power Cord, length " + this.length + " m, voltage " + this.voltage + " V";
    }
    
    
    
}
