package practiceForST;

public class Count_set_bits {
//	15.	Count the number of set bits the given integer.
	static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n > 0) { 
			n =n&(n - 1); 
			count++; 
		} 
		return count; 
	} 


	public static void main(String args[]) 
	{ 
		int i = 12; 
		System.out.println(countSetBits(i)); 
	} 

}
