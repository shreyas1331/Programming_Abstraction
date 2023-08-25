package practiceForST;
import java.util.*;
public class number_palindrome {
//	hmm n ke sath operations krenge but number ke sath value check krenge
	public static void ispalindrome(int number) {
		int reverse=0;
		int n=number;
		while(n>0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		System.out.println(reverse);
		System.out.println(number);
		System.out.println(n);
		if(number==reverse) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();//87678
		ispalindrome(number);
	}

}
