package Arrays1;

public class product_of_array_except_self {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int n=arr.length;
		int product[]=new int[n];
		findproduct(arr,product,n);
		System.out.println("the product is:");
		for(int i=0;i<n;i++) {
			System.out.println(product[i]);
		}
		
	}
	public static void findproduct(int[] arr,int product[],int n) {
		int prefix[]=new int[n];
		prefix[0]=1;
		for(int i=1;i<n;i++) {
			prefix[i]=prefix[i-1]*arr[i-1];
		}
		int suffix[]=new int[n];
		suffix[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			suffix[i]=suffix[i+1]*arr[i+1];
		}
		//building product array
		for(int i=0;i<n;i++) {
			product[i]=prefix[i]*suffix[i];
		}
	}

}
