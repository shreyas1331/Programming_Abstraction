package practiceForST;

import java.util.Arrays;

public class duplicate_number {
	public static int duplicate(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,3};
		System.out.println(duplicate(arr));
	}

}
