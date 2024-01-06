package Recursion2;

public class CombinationSum {
	public static void sol(int idx,int target,int[] arr,String ans) {
		int n=arr.length;
		if(idx==n) {
			if(target==0) {
				System.out.println(ans+" ");
			}
			return;
		}
		if(arr[idx]<=target) {
			sol(idx,target-arr[idx],arr,ans+arr[idx]+" ");
		}
		sol(idx+1,target,arr,ans);
	}
	public static void main(String[] args) {
		int [] arr= {2,3,6,7};
		int target=7;
		sol(0,target,arr,"");
	}

}
