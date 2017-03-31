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
public class Keyboard extends SimpleComponent{

    private final String layout;
    
    public Keyboard(double price, String layout){
        super(price);
        this.layout = layout;
    }

    @Override
    public String name() {
        return this.layout + " Keyboard";
    }
    
}
