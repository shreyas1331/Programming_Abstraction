package Recursion;
import java.util.*;
public class subset_recursion {
//	Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number

//a. Write a recursive function which prints subsets of the array which sum to target.

//b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.
//	ip=3
//	1 2 3  3
//	op=1 2  3
//	2
	public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=sol(0,arr,"",0,target);
        System.out.println();
        System.out.print(res);
    }
    public static int sol(int idx,int[] arr,String ans,int sum,int target){
        if(sum==target){
            System.out.print(ans+" ");
            return 1;
        }
        if(idx==arr.length || sum>target){
            return 0;
        }
        int cnt=0;
        cnt+=sol(idx+1,arr,ans+arr[idx]+" ",sum+arr[idx],target);
        cnt+=sol(idx+1,arr,ans,sum,target);
        return cnt;
    }
}
