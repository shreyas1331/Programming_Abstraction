package Arrays3;

public class count_subarray_xor {
	public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int cnt = 0;
        // Step 1: Generating subarrays:
        for (int i = 0; i < n; i++) {
        	int xorr = 0;
            for (int j = i; j < n; j++) {
            	xorr=xorr^a[j];
            	
                if (xorr == k) cnt++;
            }
        }
       return cnt;
	}
	public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }

}
