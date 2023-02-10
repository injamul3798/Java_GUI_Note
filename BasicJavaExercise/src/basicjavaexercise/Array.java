

package basicjavaexercise;
import java.util.Scanner;
class Array {
 public static void main(String[] args) {
  
    Scanner input=new Scanner(System.in);

   int[] age = new int[50];
   System.out.println("Enter Size:");
   int n=input.nextInt();
   
   for(int i=0;i<n;i++){
     age[i]= input.nextInt();
   }
   System.out.println("Print all elements:");
   for(int i=0;i<n;i++){
       System.out.println("Array Elements: " + age[i]);
   }
   
 }
}

