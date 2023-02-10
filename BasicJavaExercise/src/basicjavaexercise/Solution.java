/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaexercise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
           public static int display(String str,String x1,String x2,String x3,String x4){
                int count = 0,x=0,y=0,z=0;
                int x=str.length();
                for (int i = 0; i < x; i++) 
               {
              // if match found increase count
              if (x1.equals(str[i])){
              count++;
              }
              if (x2.equals(str[i])){
              x++;
              }
               if (x3.equals(str[i])){
               y++;
              }
               if (x4.equals(str[i])){
              z++;
              }
            }
            System.out.println(count+x+y+z);
  
   
}
               
           }
           public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           String str=input.nextLine();
           String x1="lol";
           String x2="rofl";
           String x3="imao";
           String x4="lel";
           display(str,x1,x2,x3,x4);
          
          
    
       
    }
}