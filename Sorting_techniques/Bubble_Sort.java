package Sorting_techniques;

class Bubble_Sort {
	//n-1 iteration 
	static void bubble_sort(int[] arr, int n) {
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-i-1;j++) {
        		if(arr[j]>arr[j+1]) {
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        
    }
	public static void main(String[] args) {
		int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        bubble_sort(arr, n);
	}

}
