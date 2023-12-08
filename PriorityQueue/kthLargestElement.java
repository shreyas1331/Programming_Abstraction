package PriorityQueue;
import java.util.*;
public class kthLargestElement {
	
	public static int kthLargest(int[]arr,int k) {
		PriorityQueue<Integer> p=new PriorityQueue<>();//min heap
		for(int i:arr) {
			p.offer(i);
			if(p.size()>k) {
				p.poll();
			}
		}
		return p.peek();
	}
	public static void main(String[] args) {
		int[] arr= {3,2,1,5,6,4};
		int k=2;
		int ans=kthLargest(arr,k);
		System.out.println(ans);
	}

}
