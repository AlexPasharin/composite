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
public class VideoCard extends SimpleComponent{
    
    private final int memoryAmount;

    public VideoCard(double price, int memoryAmount) {
        super(price);
        this.memoryAmount = memoryAmount;
    }

    @Override
    public String name() {
        return "Videocard, memory - " + this.memoryAmount + " Gt";
    }
    
}
