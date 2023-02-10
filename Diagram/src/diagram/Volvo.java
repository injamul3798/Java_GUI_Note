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
public class Volvo extends Vehicle implements Drive{
    private double price;
    public Volvo(double price){
        this.price=price;
}
    
    public void dispay(){
        System.out.println("Successfully");
        
    }
    public void startengine(){
        System.out.println("Start engine"); 
    }    
    
    public void stopengine(){
        System.out.println("Successfully"); 
    }      
    public static void main(String[] args) {
       Volvo obj=new Volvo(3.25);
    }

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stoptEngine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
