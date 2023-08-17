package Strings1;

public class Reduce_outerParanthesis {
	
	public static String removeOuter(String s) {
		int open_count=0;
		int close_count=0;
		int start=0;
		String result="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='(') open_count++;
			else if(c==')') close_count++;
			
			if(open_count==close_count) {
				result+=s.substring(start+1, i);
				start=i+1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s="(()())(())";
		System.out.println(removeOuter(s));
	}

}
