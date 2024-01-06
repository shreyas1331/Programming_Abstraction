package Recursion2;
import java.util.*;
//input=1
//		1??0?101
public class Binary_strings {
	public static void print(String s,String ans,int i){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }

        if(s.charAt(i)=='?'){
            print(s,ans+'0',i+1);
            print(s,ans+'1',i+1);

        }
        else{
            print(s,ans+s.charAt(i),i+1);
        }
       
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();     //1
        while(t!=0){
            String s=sc.next();   //1??0
            print(s,"",0);
            t--;
        }

    }
}
