package practiceForST;

import java.util.Scanner;

public class first_setBit_right {
//	14.	Find The first set bit of the given number from right.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=1;			// m variable is used to check the set bit
		int pos=1;			// Position variable initialized with 1 
		while((n&m)==0) {
			m=m<<1;	//Perform left shift
			pos++;
			
		}
		System.out.println(pos);

	}

}
