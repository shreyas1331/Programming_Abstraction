package practiceForST;

import java.util.Scanner;

public class reverse_k_positions {
	
	public static void reverseKpositions(int[] arr,int n,int k) {
		for(int i=0;i<k/2;i++) {
			int temp=arr[i];
			arr[i]=arr[k-i-1];
			arr[k-i-1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();					//6
		int[] arr=new int[n];//123456         op=432156
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		reverseKpositions(arr,n,k);
	}

}
