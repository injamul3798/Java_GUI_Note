/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
           int n=input.nextInt();
            int a,b;
            int sum,count=0;
            int i;
            for(i=1;i<=n;i++){
	       a=input.nextInt();
	       b=input.nextInt();
               
               sum=a+b;
               count++;
               System.out.format("Case %d: %d\n",count,sum);
            
            
    }
    
    
}
}
