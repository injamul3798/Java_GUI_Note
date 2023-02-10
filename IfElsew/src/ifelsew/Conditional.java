
 
package ifelsew;

import java.util.Scanner;
public class Conditional {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        
       int num1,num2,num3;
        System.out.println("Enter three Numbers");
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Num1 is bigger Than others");
        }
        
        if(num1<num2 && num2>num3){
            System.out.println("Num2 is bigger Than others");
        }
         
        if(num1<num3 && num2<num3){
            System.out.println("Num3 is bigger Than others");
        }
       
    }
    
}
