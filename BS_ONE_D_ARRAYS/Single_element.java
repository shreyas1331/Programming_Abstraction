package BS_ONE_D_ARRAYS;

public class Single_element {
//	[1,1,2,3,3,4,4,8,8]    ans=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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