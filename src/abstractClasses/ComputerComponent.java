/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Alex
 */
public interface ComputerComponent {
    
    double getPrice();
    
    default void add(ComputerComponent c) throws OperationNotSupportedException{
        throw new OperationNotSupportedException("Operation not supported");
    }
    
    String name();
    
    void print(int n);
    
    default void print(){
       this.print(0);
    }  
    
    
    
}
