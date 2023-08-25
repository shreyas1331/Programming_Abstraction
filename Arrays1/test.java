package Arrays1;
public class test {
	
	public static boolean issorted(int[] arr) {
		boolean flag=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		
		System.out.println(issorted(arr));

	}

}
