package BS_ONE_D_ARRAYS;

public class last_occurrence {
	
	public static int lastOccurrence(int[] arr,int n, int k) {
		int res=-1;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==k) {
				res=i;
				break;
			}
		}
		return res;
	}
	public static int firstOccurrence(int[] arr,int n, int k) {
		int res=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				res=i;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {2,4,5,5,5,8,9};
		int n=7;
		int k=5;
		int last=lastOccurrence(arr,n,k);
		System.out.println(last);
		int first=firstOccurrence(arr,n,k);
		System.out.println(first);
		int[] ans=new int[2];
		ans[0]=first;
		ans[1]=last;
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
			
		}
		
	}

}
