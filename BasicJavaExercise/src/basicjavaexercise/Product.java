
package basicjavaexercise;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int product=1;
        int num=input.nextInt();
        
        
        while(num!=0){
            num=num%10;
            product=product*num;
            num=num%10;
            num--;
            
            
        }
        System.out.println("Ans: "+product);
            
        
        
        
    }
    
}
