package Arrays3;
import java.util.*;
public class Majority_element {
//by hashing
	public static List<Integer> majorityElement(int []v) {
        int n = v.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        // least occurrence of the majority element:
        int mini = (int)(n / 3) + 1;
        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);

            //checking if v[i] is
            // the majority element:
            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break;
        }
        return ls;
    }
	public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

}
//static int majorityElement(int a[], int size)
//{
//    // your code here
//      HashMap<Integer,Integer> hm=new HashMap<>();
//  for(int i=0;i<a.length;i++)
//  {
//      if(hm.containsKey(a[i]))
//      {hm.put(a[i],hm.get(a[i])+1);}
//      else
//      hm.put(a[i],1);
//  }
//  for(int x:hm.keySet())
//  {
//      if(hm.get(x)>(a.length/2))
//      return x;
//      
//  }
//  return -1;
//}

