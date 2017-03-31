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
public class RAM extends SimpleComponent{

    private final int capacity;
    
    public RAM(double price, int capacity) {
        super(price);
        this.capacity = capacity;
    }

    @Override
    public String name() {
        return "RAM, " + this.capacity + " GB";
    }
    
}
