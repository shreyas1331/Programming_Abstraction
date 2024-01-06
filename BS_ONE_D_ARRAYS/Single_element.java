package BS_ONE_D_ARRAYS;

public class Single_element {
//	[1,1,2,3,3,4,4,8,8]    ans=2;
	public static int singleElement(int[]arr) {
		int n=arr.length;
		int xor=0;
		for(int i=0;i<n;i++) {
			xor=xor^arr[i];
		}
		return xor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,3,3,4,4,8,8};
		System.out.print(singleElement(arr));

	}

}
//class Solution {
//    public int singleNonDuplicate(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (mid % 2 == 1) {
//                mid--;
//            }
//            if (nums[mid] != nums[mid + 1]) {
//                right = mid;
//            } else {
//                left = mid + 2;
//            }
//        }
//        return nums[left];
//    }
//}