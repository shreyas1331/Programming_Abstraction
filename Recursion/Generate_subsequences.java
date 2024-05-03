package Recursion;

import java.util.ArrayList;

public class Generate_subsequences {
	
//	public static void findSubsequence(int idx,ArrayList<Integer> list,int[] arr,int n) {
//		if(idx==n) {
//			for(Integer i:list) {
//				System.out.print(i+" ");
//			}
//			if(list.size()==0) {
//				System.out.print("{}");
//			}
//			System.out.println();
//			return;
//		}
//		list.add(arr[idx]);
//		findSubsequence(idx+1,list,arr,n);
//		list.remove(list.size()-1);
//		findSubsequence(idx+1,list,arr,n);
//		
//	}
//	public static void main(String args[]) {
//		int [] arr= {3,1,2};
//		int n=3;
//		ArrayList<Integer> list=new ArrayList<>();
//		findSubsequence(0,list,arr,n);
//	}
	public static void sol(int idx,int[] arr,String ans,int n) {
		if(idx==n) {
			System.out.print(ans);
			if(ans.length()==0) {
				System.out.print("{}");
				
			}
			System.out.println();
			return;
		}
		sol(idx+1,arr,ans+arr[idx]+" ",n);
		sol(idx+1,arr,ans,n);
	}
	public static void main(String args[]) {
		int [] arr= {1,2,3};
		int n=arr.length;
		sol(0,arr,"",n);
	}
}
