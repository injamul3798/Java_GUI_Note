
package inheritenceoverride;

public class Person extends Override {
    //@Override
    @java.lang.Override
    public void display(){
       
        System.out.println(name); 
         super.display();//this is super keyword used call superclass method from subclass.
        System.out.println("I eat rice");   
    }
    
    public void display2(){
        System.out.println("I am doing programming");   
    }
          
  
    
}
