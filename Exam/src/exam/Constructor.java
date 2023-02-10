/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author MD INJAMUL HAQUE
 */
public class Constructor
{
    String name;
    int id;
    
    Constructor(String name,int id){
        this.name=name;
        this.id=id;
    }
	public static void main(String[] args) {
	    Constructor obj=new Constructor("injam",3798);
	    System.out.println(obj.name+" "+obj.id);
		
	}
}
