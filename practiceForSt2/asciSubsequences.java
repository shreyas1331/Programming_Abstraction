package practiceForSt2;

public class asciSubsequences {
	public static int solve(int idx,char[] arr,String ans) {
		if(idx==arr.length) {
			System.out.print(ans+" ");
			return 1;
		}
		int cnt=0;
		cnt+=solve(idx+1,arr,ans);
		cnt+=solve(idx+1,arr,ans+arr[idx]);
		cnt+=solve(idx+1,arr,ans+(int)arr[idx]);
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		char[] arr=s.toCharArray();
		int res=solve(0,arr,"");
		System.out.println(res);

	}

}
