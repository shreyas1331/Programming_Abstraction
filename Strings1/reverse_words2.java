package Strings1;

public class reverse_words2 {
	public static String result(String st) {
		int left=0;
		int right=st.length()-1;
		String temp = "";
		String ans = "";

		while(left<=right) {
			char c=st.charAt(left);
			if(c !=' ') {
				temp=temp+c;
			}
			else if (c == ' ')
			{
				if (!ans.equals(""))
				{
					ans = temp + " " + ans;
				}
				else
				{
					ans = temp;
				}
				temp = "";
			}
			left++;
		}
		if (!temp.equals(""))
		{
			if (!ans.equals(""))
			{
				ans = temp + " " + ans;
			}
			else
			{
				ans = temp;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String st = "my name is shreyas";
	    System.out.println("After reversing words: ");
		System.out.print(result(st));
	}

}
