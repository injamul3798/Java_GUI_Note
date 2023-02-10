
package basicjavaexercise;

import java.util.Scanner;
public class CountEvenOddFromLoop
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int even=0,odd=0;
	    System.out.println("Enter any number:");
	    int num=input.nextInt();
	    for(int i=1;i<num;++i){
	        if(i%2==0){
	              even++;
	            }
	         else{
	             odd++;
	         }
	        	
	    }
	    System.out.println("Even Number is="+even +" " +"Odd number is" +odd);
		//System.out.println("finished");
	}
}
