package PriorityQueue;

import java.util.*;

public class streamOfIntegers {
//given a stream of integeres find the median of stream 
//	using two priority queues
//	calculate midian
	public static void add(PriorityQueue<Integer> leftPq,PriorityQueue<Integer> rightPq,int element) {
		if(leftPq.isEmpty()) {
			leftPq.add(element);
		}
		else if(rightPq.isEmpty()) {
			if(element>leftPq.peek()) {
				rightPq.add(element);
			}
			else {
				rightPq.add(leftPq.remove());
				leftPq.add(element);
			}
		}
		else {
		int leftMaximum=leftPq.peek();
		int rightMinimum=rightPq.peek();
		if(leftPq.size()==rightPq.size()) {
			if(element>rightMinimum) {
				leftPq.add(rightPq.remove());
				rightPq.add(element);
			}
			else {
				
			}
		}
		}
		
	}
	public static int findMedian(PriorityQueue<Integer> leftPq,PriorityQueue<Integer> rightPq) {
		
	}
	public static void main(String[] args) {
//		Left pq -max heap        and rght pq-min heap
//		Rpq-lpq<=1 else shifting
		List<Integer> arr=new ArrayList<>();
		PriorityQueue<Integer> leftPq=new PriorityQueue<>(Comparator.reverseOrder());//maxHeap
		PriorityQueue<Integer> rightPq=new PriorityQueue<>();//min heap
		
		
	}

}
