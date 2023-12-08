package Arrays1;

public class consecutive_ones {
	static int findMaxConsecutiveOnes(int arr[]) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
