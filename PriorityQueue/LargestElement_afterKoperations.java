package PriorityQueue;
import java.util.*;
public class LargestElement_afterKoperations {
//given an array.supposed to perform k operations on it.at 
//	each operation the smallest 2elements of the array are removed 
//	multiplied by each other and the product is added back to array
//	RETURN THE LARGEST ELEMNT OF THE ARRAY
//	IT IS GUARRENTED THAT ONE ELEMENT WILL REMAIN
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(2);
		arr.add(4);
		arr.add(3);
		arr.add(1);
		arr.add(5);
		int k=3;
		PriorityQueue<Integer> p=new PriorityQueue<>(arr);
		for(int i=0;i<k;i++) {
			int a=p.remove();
			int b=p.remove();
			int c=a*b;
			p.add(c);
		}
		while(p.size()!=1) {
			p.remove();
		}
		System.out.println(p.peek());
	}

}
