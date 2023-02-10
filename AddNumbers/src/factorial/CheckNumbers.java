/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;
public class CheckNumbers {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            
        }
        System.out.println(fact);
            
        
    
    
    }
    
}
