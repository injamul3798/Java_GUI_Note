//This program will describe basic calculetar & incremenet decrement
package simplecalculater;

import java.util.Scanner;
public class Calculater { 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1,num2;
        System.out.println("Enter First Number:");
        num1=input.nextDouble();
        System.out.println("Enter Second Number:");
        num2=input.nextDouble();
        
        double sum=num1+num2;
        double sub=num1-num2;
        double multplication=num1*num2;
        double div=num1/num2;
        
        System.out.println("The sum is= "+sum);
        System.out.println("The sub is= "+sub);
        System.out.println("The multiplication is= "+multplication);
        System.out.println("The division is= "+div);
        num1++;
        System.out.println(num1);
        
    }
    
}
