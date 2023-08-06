package Arrays2;

public class Rearrange_array_elements {
//optimal
	public static int[] reArrange(int[] arr) {
		int[] nums=new int[arr.length];
		int p=0;
		int n=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0) {
				nums[p]=arr[i];
				p+=2;
			}
			else {
				nums[n]=arr[i];
				n+=2;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] arr= {3,1,-2,-5,2,-4};
		int[] ans=reArrange(arr);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+",");
		}

	}

}
