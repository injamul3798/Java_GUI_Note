/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaexercise;
class box 
    {
        int width;
        int height;
        int length;
    } 
    class mainclass 
    {
        public static void main(String args[]) 
        {        
            box obj1 = new box();
            box obj2 = new box();
            obj1.height = 1;
            obj1.length = 2;
            obj1.width = 1;
            obj2 = obj1;
            System.out.println(obj2.height);
        } 
    }
