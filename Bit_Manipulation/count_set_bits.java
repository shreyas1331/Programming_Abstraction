package Bit_Manipulation;

public class count_set_bits {

static int []table = new int[256];
	
//	// recursive function to count set bits 
//	public static void initialize() { 
//      table[0] = 0;
//      for (int i = 0; i < 256; i++)
//      {
//          table[i] = (i & 1) + table[i / 2];
//      }
//	} 
//	
//	public static int countSetBits(int n)
//	{
//	    return table[n & 0xff] + 
//        table[(n >> 8) & 0xff] + 
//        table[(n >> 16) & 0xff] + 
//        table[n >> 24]; 
//	}
//	
//	// Driver function 
//	public static void main(String[] args) { 
//	    initialize();
//		int n = 4; 
//		System.out.println(countSetBits(n)); 
//	} 



static int countSetBits(int n) 
{ 
	int count = 0; 
	while (n > 0) { 
		n &= (n - 1); 
		count++; 
	} 
	return count; 
} 


public static void main(String args[]) 
{ 
	int i = 4; 
	System.out.println(countSetBits(i)); 
} 
}