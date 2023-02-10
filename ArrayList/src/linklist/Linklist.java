/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templae file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> language=new LinkedList<>();//can use list insted of ArrayList
        LinkedList<Integer> num=new LinkedList<>();
        language.add("java Programming");
        language.add("C programming");
        num.add(5);
        num.add(7);
        num.remove(0);
        num.add(0, 4);
        System.out.println("String : "+language);
        System.out.println("Element : "+num);
                
    
}
}
