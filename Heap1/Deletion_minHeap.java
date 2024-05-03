package Heap1;

import java.util.ArrayList;
import java.util.List;

public class Deletion_minHeap {
	public static void swap(List<Integer> heap,int i,int j) {
		int temp=heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public static void deleteFromMinHeap(List<Integer> heap) {
		swap(heap,0,heap.size()-1);
		heap.remove(heap.size()-1);
		
		pushdown_inMinHeap(heap,0);
	}
	public static void pushdown_inMinHeap(List<Integer> heap,int index) {
		int n=heap.size()-1;
		if(index==n) {
			return;
		}
		int left=(2*index)+1;
		int right=(2*index)+2;
		int smallest=index;
		
		if(left<=n && heap.get(left)<heap.get(smallest)) {
			smallest=left;
		}
		if(right<=n && heap.get(right)<heap.get(smallest)) {
			smallest=right;
		}
		if(smallest==index) {  //parent hi smallest hai toh return kr jao
			return;
		}
		swap(heap,index,smallest);
		pushdown_inMinHeap(heap,smallest);
		
	}
	
	public static void main(String[] args) {
		List<Integer> heap=new ArrayList<>();
		heap.add(5);
		heap.add(20);
		heap.add(10);
		heap.add(40);
		heap.add(50);
		heap.add(30);
		heap.add(60);
		System.out.println(heap);
		deleteFromMinHeap(heap);
		System.out.println(heap);
	}
}
//steps
//1.delete first hoga
//2.swap 1st and last
//3.delete last
//4.theek karo
//->push dowm=n till correct posittion
//->swap with minimum

