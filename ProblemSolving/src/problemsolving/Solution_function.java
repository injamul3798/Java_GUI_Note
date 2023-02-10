/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;
public class Solution_function {
    public static void plusMinus(int[] arr,int n) {
        float pos=0;
        float neg=0;
        float zer=0;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]<0){
            neg++;
            }
            if(arr[i]==0){
                zer++;
            }
        }
       System.out.printf("%.6f\n",pos/n);
        System.out.printf("%.6f\n",neg/n);
        System.out.printf("%.6f\n",zer/n);
        
    // Write your code here

    }

     public static void main(String[] args){ 
         Scanner input=new Scanner(System.in);
         int[] arr=new int[100];
         int n=input.nextInt();
         int i;
         for(i=0;i<n;i++){
             arr[i]=input.nextInt();
             
             
         }
          plusMinus(arr,n);  
         
        
        
        
        
    } 

   
    
}
