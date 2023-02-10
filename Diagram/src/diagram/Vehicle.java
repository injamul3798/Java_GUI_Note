/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author MD INJAMUL HAQUE
 */
abstract class Vehicle {
    protected String model; 
    public Vehicle(String model){
        this.model=model;
    }
        
    public abstract void dispay();
    
   
    
}
