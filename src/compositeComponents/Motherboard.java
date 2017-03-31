/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeComponents;

import abstractClasses.CompositeComponent;
import java.util.List;
import simpleComponents.BIOS;
import simpleComponents.CPU;
import simpleComponents.RAM;
import simpleComponents.Slot;

/**
 *
 * @author Alex
 */
public class Motherboard extends CompositeComponent{
   
    public Motherboard(CPU cpu, RAM ram, BIOS bios, List<Slot> slots) {
        super();
        this.add(cpu);
        this.add(ram);
        this.add(bios);
        slots.stream().forEach((part) -> this.add(part));
    }

    @Override
    public String name() {
        return "Motherboard";
    }

   
    
}
