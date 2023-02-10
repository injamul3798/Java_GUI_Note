/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor2;

public class Test {
    String name;
    String varsityName;
    Test(String n,String v){
        name=n;
        varsityName=v;
        
    }
    void display(){
        System.out.println("Compiled Succesfully");
    }
    
     public static void main(String[] args) {
         Test obj=new Test("Injamul Haque","Daffodil");
         System.out.println("Name: "+obj.name+"\n"+"Varsity: "+obj.varsityName);
         obj.display();
         
         
     }
    
}
