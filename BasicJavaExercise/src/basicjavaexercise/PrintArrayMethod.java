
package basicjavaexercise;

import java.util.Scanner;
public class PrintArrayMethod
{
    public static void arry(int[] a,int x){
        System.out.println("Array Elements are:");
        for(int i=0;i<x;i++){
	      System.out.println(a[i]);
	    }
    }
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter Number to take input:");
	    int num=input.nextInt();
	    int[] arr=new int[50];
	    for(int i=0;i<num;i++){
	        arr[i]=input.nextInt();
	    }
	    arry(arr,num);
	    
		
	}
}

