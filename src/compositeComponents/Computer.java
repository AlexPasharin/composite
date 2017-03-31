/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeComponents;

import abstractClasses.CompositeComponent;
import simpleComponents.Keyboard;
import simpleComponents.Monitor;
import simpleComponents.Mouse;
import simpleComponents.PowerCord;

/**
 *
 * @author Alex
 */
public class Computer extends CompositeComponent{
    
    public Computer(Case c, Keyboard kb, Mouse mouse, Monitor m, PowerCord pc){
        super();
        this.add(c);
        this.add(kb);
        this.add(mouse);
        this.add(m);
        this.add(pc);
    }

    @Override
    public String name() {
        return "Computer";
    }
    
}
