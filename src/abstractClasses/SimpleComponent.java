/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

/**
 *
 * @author Alex
 */
public abstract class SimpleComponent implements ComputerComponent{
    
    private double price;
    
    public SimpleComponent(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
        System.out.println(this.name() + "\n");
    }      
}
