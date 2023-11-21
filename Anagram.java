package Things;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove white spaces and punctuation from both strings
	        str1 = str1.replaceAll("[\\s\\p{Punct}]", "");
	        str2 = str2.replaceAll("[\\s\\p{Punct}]", "");

	        // Check if the lengths of the two cleaned strings are equal
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Count the occurrences of each character in both strings
	        Map<Character, Integer> charCountStr1 = new HashMap<>();
	        Map<Character, Integer> charCountStr2 = new HashMap<>();

	        for (char c : str1.toCharArray()) {
	            charCountStr1.put(c, charCountStr1.getOrDefault(c, 0) + 1);
	        }

	        for (char c : str2.toCharArray()) {
	            charCountStr2.put(c, charCountStr2.getOrDefault(c, 0) + 1);
	        }

	        // Compare the character counts
	        return charCountStr1.equals(charCountStr2);
	    }

	    public static void main(String[] args) {
	        String str1 = "parliament";
	        String str2 = "partial men";

	        if (areAnagrams(str1, str2)) {
	            System.out.println("\"" + str1 + "\" is an anagram of \"" + str2 + "\"");
	        } else {
	            System.out.println("\"" + str1 + "\" is not an anagram of \"" + str2 + "\"");
	        }
	    }
	    
}


