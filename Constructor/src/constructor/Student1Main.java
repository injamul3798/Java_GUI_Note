//Constractor is one type method but dont need to return type
//When we use constructor then class name will be constructor name

package constructor;

public class Student1Main {
     public static void main(String[] args) {
        Student student1=new Student("Injamul Haque","PC-A",3798);//object declartion
        student1.display();
        System.out.println("\n\n");
        
        //Below, we create a default(without paramater) constructor
        Student student2=new Student();
        student2.display();
        
    
}
}