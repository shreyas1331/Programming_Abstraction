package practiceForST;

import java.util.Scanner;

public class first_setBit_left {
//	13.	Find The first set bit of the given number from left.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		while(n>0) {
			n=n>>1;
			cnt++;
		}
		System.out.println(cnt);

	}

}
