package cn.xj.code;

import java.util.Stack;

/**
 * 
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1: 
 * Input: "Let's take LeetCode contest" 
 * Output: "s'teL ekat edoCteeLtsetnoc" 
 * 
 * Note: In the string, each word is separated by single space and
 * there will not be any extra space in the string.
 * 
 * @author alanfeng
 *
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        if (null == s || 1 == s.length()) {
            return s;
        }
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        char[] tmp = s.toCharArray();
        int len = tmp.length;
        for (int i = 0; i < len; i++) {
            if (' ' == tmp[i]) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(tmp[i]);
            } else {
                stack.push(tmp[i]);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
