package Strings1;

public class Reverse_Words {
	
	public static void main(String[] args) {
		String s="  hello world  ";
		s=s.replaceAll("[ ]+"," ");
		
		String []arr=s.split(" ");
		for(int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		i
		System.out.print(" ");
	}

}
