
package studentapp1;


public class Student {
    public String name;
    public String section;
    public int id;
    
    public void information(String n,String s,int roll){
        name=n;
        section=s;
        id=roll;
    }
        
    
    public void display(){
        System.out.println("Name:"+name+"\n"+"Section:"+section+"\n"+"ID:"+id);
    }  
    
}
