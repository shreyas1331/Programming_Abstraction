package BS_ONE_D_ARRAYS;
import java.util.*;
public class Search_In_Rotatedarray {
	public static int search(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (arr.get(mid) == k)
                return mid;

            // if left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k <= arr.get(mid)) {
                    // element exists
                    high = mid - 1;
                } else {
                    low = mid + 1;// element does not exist
                }
            } else { // if right part is sorted
                if (arr.get(mid) <= k && k <= arr.get(high)) {                   
                    low = mid + 1; // element exists
                } else {
                    high = mid - 1; // element does not exist
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = 9, k = 1;
        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}


//leetcode answer
//class Solution {
//    public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length-1;
//        int mid;
//        while(left<=right){
//            mid = left+(right-left)/2;
//            if(nums[mid] == target) return mid;
//            // condition for left side is sort
//            if(nums[left]<=nums[mid]){
//                if(target>=nums[left] && target <=nums[mid]){
//                    right = mid-1;
//                }else {
//                    left = mid+1;
//                }
//            }
//            else{
//                if(target>=nums[mid] && target <=nums[right]){
//                    left = mid+1;
//                }else{
//                    right = mid-1;
//                }
//            }
//    }
//     return -1;   
//    }
//    
//}