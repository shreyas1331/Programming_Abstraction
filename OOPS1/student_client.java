package OOPS1;

//import OOPS1.student;

public class student_client{
    public static void main(String[] args){
        student s1=new student();
        // System.out.print(s1.name);
        s1.introduction();
        System.out.println(s1.getRoll_no());
 
        try{
        s1.setRoll_no(-1);
        }
        catch(Exception e){
            System.out.print(e);
            e.printStackTrace();
        }
        System.out.println(s1.getRoll_no());

        
    
    }
}
