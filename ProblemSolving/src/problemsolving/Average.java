
package problemsolving;

import java.util.Scanner;
public class Average {
    public static void main(String[] args)   
{ 
   
	    Scanner input=new Scanner(System.in);
	    int num,sum=0;
	    
	    for(int i=1;i<=10;++i){
                num=input.nextInt();
                sum=sum+i;
                
            }
            System.out.println("Average="+sum/10);
    
}
    
}
