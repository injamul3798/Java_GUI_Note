/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;


public class Student {
    String name;
    String section;
    int id;
    Student(){
        System.out.println("Not found");
    }
    
    Student(String n,String s,int i){
        name=n;
        section=s;
        id=i;
    }
    
    void display(){
        System.out.println("Name: "+name+"\n"+"Section: "+section+"\n"+"ID: "+id);
    }
    

   
  
    
}
