/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_outerclass;


public class OuterClass {
    int x=5;
    public class InnerClass {
        int y=10; 
    }
    public class AnotherClass{
        int z=5;
        
    }
        
    //public abstract void injam();
    //public void
    public static void main(String[] args) {
        
        OuterClass o1=new OuterClass();
        OuterClass.InnerClass o2;
        o2 = o1.new InnerClass();
        OuterClass.AnotherClass o3=o1.new AnotherClass();
        int sum=o1.x+o2.y+o3.z;
        System.out.println("The sum is :"+sum);    
    }
    
}
