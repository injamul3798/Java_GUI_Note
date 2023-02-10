
package basicjavaexercise;


import java.util.Scanner;
public class CheckPrime
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int count=0;
	    int n=input.nextInt();
	    for(int i=2;i<=n/2;i++){
	        if(n%i==0){
	            count=1;
	            break;
	        }
                else{
                    
                }
	    }
	    if(count==1){
	        System.out.println("not prime");
	    }
	    else{
	        System.out.println("prime");
	    }
	}
}
	    




