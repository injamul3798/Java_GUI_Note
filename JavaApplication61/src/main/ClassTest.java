
package main;


public class ClassTest {

    
    public static void main(String[] args) {
        try{
        int x,y,result;
        x=1000;
        y=0;
        result=x/y;
        System.out.println("Output "+result); 
        }
     	catch(ArithmeticException e)
		{
			System.out.println ("Divide by zero error");
                } 
        finally
		{
			System.out.println ("Inside the finally block");
		}
        
     }
}
