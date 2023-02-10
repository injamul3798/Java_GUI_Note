/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MD INJAMUL HAQUE
 */
public class Student {
    private String name;
    private String dept;
    private int id;
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }  
    public String getDept(){
        return dept;
    }
    public void SetDept(String dept){
        this.dept=dept;
    }
    
    public int getId(){
        return id;
    }
    public void SetId(int id){
        this.id=id;
    }  
}
