package practiceForST;
import java.util.*;
public class twoSum {
	public static void twoSum(int[]arr, int n,int target) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		twoSum(arr,n,target);
		
	}

}
