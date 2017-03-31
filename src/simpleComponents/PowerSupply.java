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
public class PowerSupply extends SimpleComponent{

    public PowerSupply(double price) {
        super(price);
    }

    @Override
    public String name() {
        return "PowerSupply";
    }
    
}
