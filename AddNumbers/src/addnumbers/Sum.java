
package addnumbers;
import java.util.Scanner;
public class Sum {
    
    static int addNumber(int a,int b){
        return a+b;
        
    }

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        num1=input.nextInt();
        num2=input.nextInt();
        int result=addNumber(num1,num2);
        System.out.println(result);
        
        
        
    }
    
}
