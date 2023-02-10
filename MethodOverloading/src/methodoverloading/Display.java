/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;


public class Display {
    
    public void display(int x,int y){
        int sum=x+y;
        System.out.println("Sum is "+sum);
    }
    public void display(int x){
        int product=x*x;
        System.out.println("Product "+product);
        
    }
        
        
    
}
