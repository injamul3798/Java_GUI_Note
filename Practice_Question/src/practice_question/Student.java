//nt //
package practice_question;

public class Student extends Person {

   
    private String Studentid;
    private double Cgpa;

    /*private Student(String wdf, double d) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Student(String name, double phone) {
        super(name, phone);
    }

    

    

    @Override
    public void display() {
       
    }
    public static void main(String[] args) {
        Student s1=new Student("wdf",3.5);
    }
    
    
    
    
}
