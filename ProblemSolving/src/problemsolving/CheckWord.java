
package problemsolving;

import java.util.Scanner;
public class CheckWord {

public static void main(String[] args)   
{   
Scanner sc = new Scanner(System.in);   
System.out.print("Input a character: ");  
// reading a character   
char ch = sc.next().charAt(0);   
 if(ch >= 'A' && ch <= 'Z')
    {
        System.out.println("uppercase alphabet");
    
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        System.out.println("lowercase");
    }
    else
    {
         System.out.println("is not an alphabet");
    }
}

    
}
