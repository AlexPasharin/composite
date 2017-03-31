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
public class Mouse extends SimpleComponent{
    
    public enum MOUSE_TYPE{
        TRADITIONAL, TRACKBALL, TOUCHPAD
    }
    
    private final MOUSE_TYPE type;
    
    public Mouse(double price, MOUSE_TYPE type){
        super(price);
        this.type = type;
    }
    
    @Override
    public String name() {
        return "Mouse, " + this.type.toString();
    }
}
