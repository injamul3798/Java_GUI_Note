/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaexercise;

public class Main1
{
	public static void main(String[] args) {
	    int[] arr={2,3,4,5,7};
	    int size=5;
	    int position=4;
	    int num=8,i;
	    if(position<=0 && position>size-1){
	        System.out.println("Invailed");
	    }
	    else{
	    for(i=size;i>=position;i--){
	        arr[i]=arr[i-1];
	    }
	    arr[i-1]=num;
	    size++;
	    for(i=0;i<size;i++){
	        System.out.println(arr[i]);
	    }
	    }
	    
	    
	    
	
	}
}
