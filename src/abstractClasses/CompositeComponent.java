/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public abstract class CompositeComponent implements ComputerComponent{
    
    private final List<ComputerComponent> parts = new ArrayList<>();

    @Override
    public final double getPrice() {
        return this.parts.stream().mapToDouble(x->x.getPrice()).sum();
    }
    
    @Override
    public final void add(ComputerComponent part){
        this.parts.add(part);
    }
    
    @Override
    public final void print(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
        System.out.println(this.name() + ":");
        
        this.parts.stream().forEach((ComputerComponent part) -> {
            part.print(n+1);
        });
    } 
}
