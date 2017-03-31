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
public class Slot extends SimpleComponent{
    
    private final String type;

    public Slot(double price, String type) {
        super(price);
        this.type = type;
    }

    @Override
    public String name() {
        return this.type + " Slot";
    }
    
}
