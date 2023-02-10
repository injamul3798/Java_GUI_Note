/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class Test {
    public static void main(String[] args) {
        Student ob=new Student();
        ob.SetName("Karim");
        ob.SetDept("CSE");
        ob.SetId(232);
        System.out.println("Name: "+ob.getName());
        System.out.println("Department: "+ob.getDept());
        System.out.println("ID: "+ob.getId());
    } 
}
