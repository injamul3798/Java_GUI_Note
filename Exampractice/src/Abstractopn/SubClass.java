/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractopn;

public class SubClass extends SuperClass {

    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
    public static void main(String[] args) {
        SubClass s1=new SubClass();
        s1.SuperClass();
        s1.a_method();
        
    }
    
    
}
