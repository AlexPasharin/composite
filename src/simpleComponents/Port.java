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
public class Port extends SimpleComponent{

    public enum PORT_TYPE{
        ETHERNET, USB, MONITOR, SERIAL, HDMI, MOUSE, KEYBOARD
    }
    
    private final PORT_TYPE type;
    
    public Port(double price, PORT_TYPE type){
        super(price);
        this.type = type;
    }
    
    @Override
    public String name() {
        return this.type.toString() + " Port";
    }
    
    
    
}
