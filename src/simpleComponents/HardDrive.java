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
public class HardDrive extends SimpleComponent{
    
    private final int capacity;
    
    public enum HDD_TYPE{
        IDE, SATA, SCSI, SAS
    }
    
    private final HDD_TYPE type;

    public HardDrive(double price, int capacity, HDD_TYPE type) {
        super(price);
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String name() {
        return "Hard Disk Drive, type " + this.type.toString() + " capacity " + this.capacity + " GB";
    }
    
    
    
}
