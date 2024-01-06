package Recursion2;
import java.util.*;
public class Lexographical {
	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc = new Scanner(System.in);
	        String str=sc.next();
	        ArrayList<String> list = new ArrayList<>();
	        sol(str,"",str,list);
	        System.out.println(String.join(" ",list));
	    }

	 public static void sol(String str,String ans,String og,ArrayList<String>list)
	    {
	        if(str.length()==0)
	        {
	            if(ans.compareTo(og)>0)
	            {
	                list.add(ans);
	                return;
	            }
	        }

	      
	        for(int i=0;i<str.length();i++)
	        {
	            char ch=str.charAt(i);
	            String remaining=str.substring(0,i)+str.substring(i+1);
	            sol(remaining,ans+ch,og,list);

	        }
	    }
}
