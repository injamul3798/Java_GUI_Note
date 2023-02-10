/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statickeyword;

public class Test {
    String name;
    static void sumNumbers(int a,int b){
        int sum=a+b;
        System.out.println("Sum of between Two number is: "+sum); 
    }

    
    
    void product(int n1,int n2){
        System.out.println("Product of between Two number is: "+(n1*n2)); 
    }
    Test(String name){
        this.name=name;
       // System.out.println("Compiled Succesfully");
        
    }

    
   
    public static void main(String[] args) {
        
       Test obj=new Test("Run Succesfully");
       System.out.println(obj.name);
        sumNumbers(5,7);
       
        obj.product(4,5);
       
        System.out.println("Compiled Succesfully");
        
        
    }
    
}
