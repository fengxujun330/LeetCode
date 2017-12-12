package cn.xj.code;

/**
 * 
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1: Given s = "hello", return "holle".
 * 
 * Example 2: Given s = "leetcode", return "leotcede".
 * 
 * Note: The vowels does not include the letter "y".
 * 
 * @author alanfeng
 *
 */
public class ReverseVowelsString {
    private static char[] vowels = new char[] { 'A', 'a', 'E', 'e', 'O', 'o', 'I', 'i', 'U', 'u' };

    public static String reverseVowels(String s) {
        char[] strs = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() && j > i;) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            if (isVowel(start) && isVowel(end)) {
                char temp = strs[i];
                strs[i] = strs[j];
                strs[j] = temp;
                i++;
                j--;
            }
            if (!isVowel(start)) {
                i++;
            }
            if (!isVowel(end)) {
                j--;
            }
        }
        return String.valueOf(strs);
    }

    private static boolean isVowel(char ch) {
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsVowel(String s) {
        if (null == s || s.length() <= 0) {
            return false;
        }
        for (int i = 0; i < vowels.length; i++) {
            if (s.contains(String.valueOf(vowels[i]))) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
