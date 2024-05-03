package practiceForSt2;

public class subset78 {
	
	public static int solve(int idx,int[]arr,String ans,int sum,int target) {
		if(sum==target) {
			System.out.print(ans+" ");
			return 1;
		}
		if(idx==arr.length || sum>target){
            return 0;
        }
		int cnt=0;
		cnt+=solve(idx+1,arr,ans+arr[idx],sum+arr[idx],target);
		cnt+=solve(idx+1,arr,ans,sum,target);
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3};
		int target=3;
		int res=solve(0,arr,"",0,target);
		
		System.out.println("count is :"+res);

	}

}
