/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeComponents;

import abstractClasses.CompositeComponent;
import java.util.List;
import simpleComponents.HardDrive;
import simpleComponents.Port;
import simpleComponents.PowerSupply;
import simpleComponents.VideoCard;

/**
 *
 * @author Alex
 */
public class Case extends CompositeComponent{
        
    public enum CASE_TYPE {
        DESKTOP, TOWER
    }    
    
    private final CASE_TYPE type;
    
    public Case(HardDrive hd, Motherboard mb, PowerSupply ps, List<Port> ports, VideoCard vc, CASE_TYPE type){
        super();
        this.type = type;
        this.add(hd);
        this.add(mb);
        this.add(ps);
        ports.stream().forEach((port) -> this.add(port));
        this.add(vc);
    }
    
    @Override
    public String name() {
        return "Case, type " + this.type.toString();
    }
    
}
