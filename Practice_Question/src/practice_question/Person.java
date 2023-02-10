/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_question;


public abstract class Person {
    protected String name;
    protected String phone;
    public Person(String name,String phone){
        this.name=name;
        this.phone=phone;  
    }
     public abstract void display();
    
}
