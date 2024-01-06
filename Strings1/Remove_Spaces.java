package Strings1;
import java.util.*;
public class Remove_Spaces {

		public static String removeSpace(String str)
	    {
	        str = str.replaceAll("\\s","");
	        return str;
	    }

	    public static void main(String args[])
	    {
	        String str = "g eeks for ge eeks ";
	        System.out.println(removeSpace(str));
	    }	
}
