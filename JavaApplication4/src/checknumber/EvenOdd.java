
package checknumber;

import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number to Check:");
        int num=input.nextInt();
        if(num%2==0){
             System.out.println("Even Number");     
        }
        else{
          System.out.println("Odd number");   
        }
        
    }
    
}
