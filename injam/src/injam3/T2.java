/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package injam3;

interface A 
{
    
}

class C { }

 

class D extends C { }

 

class B extends D implements A  { }

 

public class T2 {

        public static void main(String[] args){                 B b = new B();

                if (b instanceof A)

System.out.println("b is an instance of A");

 

        }

}