package Heap1;
import java.util.*;
public class Insertion_minHeap {
	public static void swap(List<Integer> heap,int i,int j) {
		int temp=heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	public static void push_up(List<Integer> heap,int i) {
		int parent_idx=(i-1)/2;
		//util root reached or correct position
		if(i==0 || heap.get(parent_idx)<heap.get(i)) {
			return;
		}
		//swap
		swap(heap,i,parent_idx);
		push_up(heap,parent_idx);
	}
	public static void insertion_in_minHeap(List<Integer> heap,int element) {
		heap.add(element);
		int idx=heap.size()-1;
		push_up(heap,idx);
	}
	public static void main(String[] args) {
		List<Integer> heap=new ArrayList<>();
		heap.add(10);
		heap.add(20);
		heap.add(30);
		heap.add(40);
		heap.add(50);
		System.out.println(heap);
		insertion_in_minHeap(heap,5);
		System.out.println(heap);
	}
//steps:
//1.i can insert in last
//2.new node ko thikane lgao
//	->compare with parent/swap
//	->until correct position is found
//	->root reached
}
