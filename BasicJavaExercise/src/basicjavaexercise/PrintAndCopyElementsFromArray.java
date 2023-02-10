
package basicjavaexercise;   
import java.util.Scanner;
public class PrintAndCopyElementsFromArray
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int[] arr1=new int[50];
	    System.out.println("Enter any number:");
	    int num=input.nextInt();
	    int[] arr=new int[50];
	    System.out.println("Take input from user:");
	    for(int i=0;i<num;++i){
	       arr[i]=input.nextInt();
	    }
	    System.out.println("Array elements are:");
	    for(int i=0;i<num;++i){
	       System.out.println(arr[i]);
	    }
	    for(int i=0;i<num;++i){
	       arr1[i]=arr[i];
	    }
	    System.out.println("Copy  elements are:");
	    for(int i=0;i<num;++i){
	       System.out.println(arr1[i]);
	    }
	}
}

