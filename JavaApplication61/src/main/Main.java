/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n;
        float C,increment;
        float X;
        int count=0;
        int i;
         float F;
	     n=input.nextInt();
	    for(i=1;i<=n;i++){
	       C=input.nextFloat();
	       increment=input.nextFloat();
      

       F=((9*C)/5)+32;
       F=F+increment;
       C=((F-32)/9)*5;
       count++;
       //System.out.println("Case "+count+":"+C);
       System.out.format("Case %d: %.2f\n",count,C);
       
    }
	
	}
}
