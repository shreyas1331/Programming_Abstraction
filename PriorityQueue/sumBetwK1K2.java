package PriorityQueue;

import java.util.*;

public class sumBetwK1K2 {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		int k1=3;
		int k2=6;
		arr.add(20);
		arr.add(8);
		arr.add(22);//
		arr.add(4);
		arr.add(12);
		arr.add(10);//
		arr.add(14);
		//brute
		Collections.sort(arr);
		int sum=0;
		for(int i=k1;i<k2-1;i++) {
			sum+=arr.get(i);//4+12+10
		}
		System.out.println(sum);
		
		//optimal
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//max heap
		for(int i=0;i<arr.size();i++) {
			pq.add(arr.get(i));
			if(pq.size()>k2) {
				pq.remove();
			}
		}
		//smallest k2elements
		pq.remove();
		//removed k2th element
		int sum1=0;
		while(pq.size()!=k1) {
			sum1+=pq.remove();
		}
		System.out.println(sum1);
	}

}
