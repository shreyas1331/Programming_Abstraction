package Heap1;
import java.util.*;
public class heapify_orBuildHeap {
	public static void swap(List<Integer> heap,int i,int j) {
		int temp=heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public static void deleteFromMinHeap(List<Integer> heap) {
		swap(heap,0,heap.size()-1);
		heap.remove(heap.size()-1);
		int n=heap.size()-1;
		pushdown_inMinHeap(heap,0,n);
	}
	public static void pushdown_inMinHeap(List<Integer> heap,int index,int n) {
		
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
		if(smallest==index) {
			return;
		}
		swap(heap,index,smallest);
		pushdown_inMinHeap(heap,smallest,n);
		
	}
	public static void heapify(List<Integer> arr) {
		int first_non_leaf_node=((arr.size()-1)-1)/2;  //last element ka parent
		for(int i=first_non_leaf_node;i>=0;i--) {
			pushdown_inMinHeap(arr,i,arr.size()-1);
		}
	}
	public static void main(String[] args) {
		List<Integer> heap=new ArrayList<>();
		heap.add(90);
		heap.add(80);
		heap.add(70);
		heap.add(20);
		heap.add(10);
		heap.add(50);
		heap.add(60);
		System.out.println(heap);
//		deleteFromMinHeap(heap);
		heapify(heap);
		System.out.println(heap);
	}}
//from top to down pushdown 
