package Strings1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Helll";
		if(s1.length()==s2.length()) {
			char[] ss1=s1.toCharArray();
			char[] ss2=s2.toCharArray();
			
			Arrays.sort(ss1);
			Arrays.sort(ss2);
			boolean result=Arrays.equals(ss1, ss2);
			if(result==true) {
				System.out.println("equal");
			}
			else {
				System.out.println("not equal");
			}
		}
		System.out.println("false");
	}

}
