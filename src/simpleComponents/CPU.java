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
public class CPU extends SimpleComponent{
    
    private final double speed;

    public CPU(double price, double speed) {
        super(price);
        this.speed = speed;
    }

    @Override
    public String name() {
        return "CPU, speed: " + this.speed + " GHz";
    }
    
}
