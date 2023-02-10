/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;


public class Add_dataDelete_data {

    public static void main(String[] args) {
        List<String> language=new ArrayList<>();//can use list insted of ArrayList
        ArrayList<Integer> num=new ArrayList<>();
        
        language.add("Java Programming");
        language.add("C programming");
        language.add("C++ programming");
        language.add("python");
        language.remove(2);
        num.add(5);
        num.add(7);
        num.add(8);
        num.add(1,6);
        num.remove(2);//positiion 
        num.add(2, 9);
        
         
        System.out.println("String : "+language);
        System.out.println("Element : "+num);
        
    }
    
}
