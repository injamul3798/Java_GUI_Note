
package basicjavaexercise;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        

        int number, originalNumber, remainder, result = 0;
        number=input.nextInt();

        originalNumber = number;
        if(originalNumber<=99){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 2);
            originalNumber /= 10;
            
        }
            
       if(originalNumber>=100)
        {
            
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}