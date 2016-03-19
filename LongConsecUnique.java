/*

Searches for the longest consecutive string (with unique characters)  within a string

*/

import java.util.*;

public class LongConsecUnique {

    public static void main(String[] args) {
	String test = new String("aaabadabccac");
	System.out.println(solution(test));
    }

    public static int solution(String s) {
	int max = 0;
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
	    Set<Character> loopset = new HashSet<Character>();
	    while (loopset.add(s.charAt(i))) {
		count++;
	    }
	    if (count > max) {
		max = count;
		count = 0;
	    }
	}
	return max;
    }
}