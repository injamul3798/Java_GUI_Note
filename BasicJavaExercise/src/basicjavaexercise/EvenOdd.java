
package basicjavaexercise;
import java.util.Scanner;//
public class EvenOdd
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);//have to use
	    
	    int num=input.nextInt();
	    if(num%2==0){
	         System.out.println("Even Number");
	    }
	    else{
	    
		System.out.println("Odd Number");
	    }
	}
}
