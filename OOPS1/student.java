package OOPS1;
import java.util.*;
public class student {
    String name="shreyas";
    int roll_no=0;
    int group=26;
    int  knowledge=124;
    student(){

    }
    student(String name, int roll_no,int group,int knowledge){
        this.name=name;
        this.roll_no=roll_no;
        this.group=group;
        this.knowledge=knowledge;

    }
    public int getRoll_no(){
        return roll_no;
    }
    public void setRoll_no(int roll_no) throws Exception{
        if(roll_no>0){
            this.roll_no=roll_no;
        }
        else{
            throw new Exception("rollno can't be negative");
        }
    }
    public void introduction(){
        System.out.println("my name is "+this.name+" Rollno "+this.roll_no+" group "+this.group+" knowledge "+this.knowledge);
    }
    

}