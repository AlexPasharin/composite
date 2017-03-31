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
public class Monitor extends SimpleComponent{
    
    public enum MONITOR_TYPE{
        LCD, LED, CRT
    }
    
    private final MONITOR_TYPE type;
    
    public Monitor(double price, MONITOR_TYPE type){
        super(price);
        this.type = type;
    }

    @Override
    public String name() {
        return this.type.toString() + " Monitor";
    }
    
}
