/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectop;


public class Test {
     String name,section;
    int id;
    void display(){
        System.out.println("Name:"+name+"Section:"+section+"ID:"+id); 
    }
    public static void main(String[] args) {
       Teacher teacher1=new Teacher();
       teacher1.name="Injamul Haque";
       teacher1.section="PC-A"
       teacher1.id=3798;
       teacher1.display();
    
}
