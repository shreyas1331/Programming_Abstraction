package Arrays2;
import java.util.*;
public class learders_in_an_array {
	public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n){
		ArrayList<Integer> ans=new ArrayList<>();
		int max=arr[n-1];
		ans.add(arr[n-1]);
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=max) {
				ans.add(arr[i]);
				max=arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int n = 6;
		int arr[]=  {16,17,4,3,5,2};
		ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(ans);
			break;
		}
	}

}
