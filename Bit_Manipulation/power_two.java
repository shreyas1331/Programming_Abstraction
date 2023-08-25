package Bit_Manipulation;

public class power_two {
	static boolean isPow2(int n)
    {
        if(n == 0)
            return false;
        
        return ((n & (n - 1)) == 0);
    }
	public static void main (String[] args) {
	    
	    int n = 8;
		System.out.println(isPow2(n));
		System.out.println(isPoww2(n));
	}
	//or method
	static boolean isPoww2(int n)
    {
        if(n == 0)
            return true;
        
        while(n != 1)
        {
            if(n % 2 != 0)
                return false;
            
            n = n / 2;
        }
        
        return true;
    }
}
