import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int count=0;
	    System.out.println("Enter any number:");
	    int num=input.nextInt();
	    
	    int n=num;
	    while(n>=10){
	        n=n%10;
	        count++;
	    }
	    
	    System.out.println("Total digit is is= "+count);
		//System.out.println("finished");
	}
}
