package practiceForST;

public class majority_element {
//	17.	Majority Element: Given an array of integers
//	, find the majority element (appears more than n/2 times), assuming it always exists.
	public static int majority(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int cnt=0;
			for(int j=0;j<n;j++) {
				if(arr[j]==arr[i]) {
					cnt++;
				}
			}
			if(cnt>n/2) {
				return arr[i];
			}
		}
		
		return -1;
	}	
	public static void main(String[] args) {
		int[] arr=  {2, 2, 1, 1, 1, 2, 2};
		int n=arr.length;
		System.out.println(majority(arr,n));
}
}
