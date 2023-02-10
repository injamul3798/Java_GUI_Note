
package pkginstanceof;

public class Main {

    public static void main(String[] args) {
        String name="Md injamul haque";
        boolean result1=name instanceof String;
        System.out.println(result1);
        Main obj=new Main();
        boolean result2=obj instanceof Main;
        System.out.println("Resul2: "+result2); 
        
    }
    
}
