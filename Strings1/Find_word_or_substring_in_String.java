package Strings1;
import java.util.*;
public class Find_word_or_substring_in_String {

	public static void main(String[] args) {
        String inputString = "abababababab";
        String targetSubstring = "ab";

        List<Integer> indexes = new ArrayList<>();
        int lastIndex = -1;

        while (true) {
            lastIndex = inputString.indexOf(targetSubstring, lastIndex + 1);
            if (lastIndex == -1) {
                break;
            }
            indexes.add(lastIndex);
        }

        // Convert the list of indexes to an array
        int[] indexesArray = new int[indexes.size()];
        for (int i=0; i<indexes.size(); i++) {
            indexesArray[i] = indexes.get(i);
        }

        // Print the indexes
        for (int index : indexesArray) {
            System.out.print(index+" ");
            
        }
    }

}
